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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public class gy0 extends org.telegram.ui.Components.tk0 {
    public String D;
    public TLRPC.WebPage E;
    public boolean F;
    public fy0[] f37586c;
    public final org.telegram.ui.ActionBar.k2 e;
    public final int f37587f;
    public final Context h;
    public boolean f37592x;
    public hr0 f37593y;
    public final ArrayList d = new ArrayList();
    public ArrayList f37588n = new ArrayList();
    public ArrayList f37589r = new ArrayList();
    public ArrayList f37590s = new ArrayList();
    public final ArrayList f37591w = new ArrayList();

    public gy0(Context context, org.telegram.ui.ActionBar.k2 k2Var) {
        this.e = k2Var;
        this.f37587f = k2Var.getCurrentAccount();
        this.h = context;
        this.f37586c = H(k2Var);
        J();
    }

    public static boolean F(int i10, int i11) {
        if (org.telegram.messenger.wp.r1(i10).A3() && !org.telegram.messenger.e20.i(i10).q()) {
            return false;
        }
        if (i11 != -1 && org.telegram.messenger.wp.r1(i10).N0.get(i11, -1) == -1) {
            return false;
        }
        return true;
    }

    public static fy0[] H(final org.telegram.ui.ActionBar.k2 k2Var) {
        fy0 fy0Var;
        fy0 fy0Var2;
        fy0 fy0Var3;
        fy0 fy0Var4;
        fy0 fy0Var5;
        fy0 fy0Var6;
        fy0 fy0Var7;
        fy0 fy0Var8;
        fy0 fy0Var9;
        fy0 fy0Var10;
        fy0 fy0Var11;
        fy0 fy0Var12;
        fy0 fy0Var13;
        fy0 fy0Var14;
        fy0 fy0Var15;
        fy0 fy0Var16;
        fy0 fy0Var17;
        fy0 fy0Var18;
        fy0 fy0Var19;
        fy0 fy0Var20;
        fy0 fy0Var21;
        fy0 fy0Var22;
        fy0 fy0Var23;
        final int currentAccount = k2Var.getCurrentAccount();
        fy0 fy0Var24 = new fy0(500, org.telegram.messenger.dd.K0(2131751265), 0, new hr0(20, k2Var, k2Var.getResourceProvider()));
        fy0 fy0Var25 = new fy0(501, org.telegram.messenger.dd.K0(2131752537), 0, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        return;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        return;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        return;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        return;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        return;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.f35741s;
                            if (i11 < arrayList.size()) {
                                if (((va0) arrayList.get(i11)).f42465f == 1) {
                                    ab0Var8.f35736b.e1(new i2.q(ab0Var8, i11, 14), 700, true);
                                    return;
                                }
                                i11++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        return;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        return;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        return;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        return;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        return;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        fy0Var25.a("tg://settings/edit/change-number");
        fy0 fy0Var26 = new fy0(502, org.telegram.messenger.dd.K0(2131754468), 0, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (org.telegram.messenger.e20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new gf0(i10));
                            return;
                        }
                        return;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        k2Var.presentFragment(new y6());
                        return;
                    case 24:
                        k2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 26:
                        k2Var.presentFragment(new y6());
                        return;
                    case 27:
                        k2Var.presentFragment(new y6());
                        return;
                    case 28:
                        k2Var.presentFragment(new lu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        fy0Var26.a("tg://settings/edit/add-account");
        fy0 fy0Var27 = new fy0(1, org.telegram.messenger.dd.K0(2131747938), 2131232261, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (org.telegram.messenger.e20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new gf0(i10));
                            return;
                        }
                        return;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        k2Var.presentFragment(new y6());
                        return;
                    case 24:
                        k2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 26:
                        k2Var.presentFragment(new y6());
                        return;
                    case 27:
                        k2Var.presentFragment(new y6());
                        return;
                    case 28:
                        k2Var.presentFragment(new lu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        fy0Var27.a("tg://settings/notifications");
        fy0 fy0Var28 = new fy0(2, org.telegram.messenger.dd.K0(2131747894), org.telegram.messenger.dd.K0(2131747938), 2131232261, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (org.telegram.messenger.e20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new gf0(i10));
                            return;
                        }
                        return;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        k2Var.presentFragment(new y6());
                        return;
                    case 24:
                        k2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 26:
                        k2Var.presentFragment(new y6());
                        return;
                    case 27:
                        k2Var.presentFragment(new y6());
                        return;
                    case 28:
                        k2Var.presentFragment(new lu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        fy0Var28.a("tg://settings/notifications/private-chats");
        fy0 fy0Var29 = new fy0(3, org.telegram.messenger.dd.K0(2131747923), org.telegram.messenger.dd.K0(2131747938), 2131232261, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                }
            }
        });
        fy0Var29.a("tg://settings/notifications/groups");
        fy0 fy0Var30 = new fy0(4, org.telegram.messenger.dd.K0(2131747937), org.telegram.messenger.dd.K0(2131747938), 2131232261, new ah0(7, k2Var));
        fy0Var30.a("tg://settings/notifications/channels");
        fy0 fy0Var31 = new fy0(5, org.telegram.messenger.dd.K0(2131743305), "callsSectionRow", org.telegram.messenger.dd.K0(2131747938), 2131232261, new ah0(19, k2Var));
        fy0 fy0Var32 = new fy0(6, org.telegram.messenger.dd.K0(2131753733), "badgeNumberSection", org.telegram.messenger.dd.K0(2131747938), 2131232261, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        return;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        return;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        return;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        return;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        return;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        return;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        return;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        return;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        return;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        return;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        return;
                }
            }
        });
        fy0 fy0Var33 = new fy0(7, org.telegram.messenger.dd.K0(2131749228), "inappSectionRow", org.telegram.messenger.dd.K0(2131747938), 2131232261, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        return;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        return;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        return;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        return;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        return;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        return;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        return;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        return;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        return;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        return;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        return;
                }
            }
        });
        fy0 fy0Var34 = new fy0(8, org.telegram.messenger.dd.K0(2131751790), "contactJoinedRow", org.telegram.messenger.dd.K0(2131747938), 2131232261, new ah0(23, k2Var));
        fy0Var34.a("tg://settings/notifications/new-contacts");
        fy0 fy0Var35 = new fy0(9, org.telegram.messenger.dd.K0(2131747244), "pinnedMessageRow", org.telegram.messenger.dd.K0(2131747938), 2131232261, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        return;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        return;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        return;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        return;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        return;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        return;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        return;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        return;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        return;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        return;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        return;
                }
            }
        });
        fy0Var35.a("tg://settings/notifications/pinned-messages");
        fy0 fy0Var36 = new fy0(10, org.telegram.messenger.dd.K0(2131746129), "resetNotificationsRow", org.telegram.messenger.dd.K0(2131747938), 2131232261, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        return;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        return;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        return;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        return;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        return;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.f35741s;
                            if (i11 < arrayList.size()) {
                                if (((va0) arrayList.get(i11)).f42465f == 1) {
                                    ab0Var8.f35736b.e1(new i2.q(ab0Var8, i11, 14), 700, true);
                                    return;
                                }
                                i11++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        return;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        return;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        return;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        return;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        return;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        fy0Var36.a("tg://settings/notifications/reset");
        fy0 fy0Var37 = new fy0(11, org.telegram.messenger.dd.K0(2131747892), "notificationsServiceRow", org.telegram.messenger.dd.K0(2131747938), 2131232261, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        return;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        return;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        return;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        return;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        return;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.f35741s;
                            if (i11 < arrayList.size()) {
                                if (((va0) arrayList.get(i11)).f42465f == 1) {
                                    ab0Var8.f35736b.e1(new i2.q(ab0Var8, i11, 14), 700, true);
                                    return;
                                }
                                i11++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        return;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        return;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        return;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        return;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        return;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        fy0 fy0Var38 = new fy0(12, org.telegram.messenger.dd.K0(2131747891), "notificationsServiceConnectionRow", org.telegram.messenger.dd.K0(2131747938), 2131232261, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        return;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        return;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        return;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        return;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        return;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.f35741s;
                            if (i11 < arrayList.size()) {
                                if (((va0) arrayList.get(i11)).f42465f == 1) {
                                    ab0Var8.f35736b.e1(new i2.q(ab0Var8, i11, 14), 700, true);
                                    return;
                                }
                                i11++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        return;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        return;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        return;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        return;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        return;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        fy0 fy0Var39 = new fy0(13, org.telegram.messenger.dd.K0(2131746290), "repeatRow", org.telegram.messenger.dd.K0(2131747938), 2131232261, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        return;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        return;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        return;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        return;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        return;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.f35741s;
                            if (i11 < arrayList.size()) {
                                if (((va0) arrayList.get(i11)).f42465f == 1) {
                                    ab0Var8.f35736b.e1(new i2.q(ab0Var8, i11, 14), 700, true);
                                    return;
                                }
                                i11++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        return;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        return;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        return;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        return;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        return;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        fy0 fy0Var40 = new fy0(100, org.telegram.messenger.dd.K0(2131746786), 2131232354, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        return;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        return;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        return;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        return;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        return;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.f35741s;
                            if (i11 < arrayList.size()) {
                                if (((va0) arrayList.get(i11)).f42465f == 1) {
                                    ab0Var8.f35736b.e1(new i2.q(ab0Var8, i11, 14), 700, true);
                                    return;
                                }
                                i11++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        return;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        return;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        return;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        return;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        return;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        fy0Var40.a("tg://settings/privacy");
        fy0 fy0Var41 = new fy0(109, org.telegram.messenger.dd.K0(2131743963), org.telegram.messenger.dd.K0(2131746786), 2131232035, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        return;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        return;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        return;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        return;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        return;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.f35741s;
                            if (i11 < arrayList.size()) {
                                if (((va0) arrayList.get(i11)).f42465f == 1) {
                                    ab0Var8.f35736b.e1(new i2.q(ab0Var8, i11, 14), 700, true);
                                    return;
                                }
                                i11++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        return;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        return;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        return;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        return;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        return;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        fy0Var41.a("tg://settings/privacy/2sv");
        fy0 fy0Var42 = new fy0(124, org.telegram.messenger.dd.K0(2131753850), org.telegram.messenger.dd.K0(2131746786), 2131232035, new Runnable() {
            @Override
            public final void run() {
                int i10 = r2;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                int i11 = currentAccount;
                switch (i10) {
                    case 0:
                        if (org.telegram.messenger.e20.i(i11).f15527p0 >= 0) {
                            k2Var2.presentFragment(new p4());
                            return;
                        }
                        return;
                    default:
                        if (!org.telegram.messenger.e20.i(i11).q()) {
                            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(k2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.eb ebVar = new org.telegram.ui.Components.eb(a02.W(), null);
                            ebVar.d(2131624344, new String[0]);
                            String L0 = org.telegram.messenger.dd.L0(2131746770, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(L0);
                            int indexOf = L0.indexOf(42);
                            int lastIndexOf = L0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) L0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new dh.a(a02, 6), indexOf, lastIndexOf - 1, 33);
                            }
                            ebVar.f25779b.setText(spannableStringBuilder);
                            ebVar.f25779b.setSingleLine(false);
                            ebVar.f25779b.setMaxLines(2);
                            a02.b(ebVar, 2750).j();
                            return;
                        }
                        k2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        fy0Var42.a("tg://settings/privacy/auto-delete");
        fy0 fy0Var43 = new fy0(108, org.telegram.messenger.dd.K0(2131747673), org.telegram.messenger.dd.K0(2131746786), 2131232035, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        return;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        return;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        return;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        return;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        return;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.f35741s;
                            if (i11 < arrayList.size()) {
                                if (((va0) arrayList.get(i11)).f42465f == 1) {
                                    ab0Var8.f35736b.e1(new i2.q(ab0Var8, i11, 14), 700, true);
                                    return;
                                }
                                i11++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        return;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        return;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        return;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        return;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        return;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        fy0Var43.a("tg://settings/privacy/passcode");
        fy0 fy0Var44 = null;
        if (org.telegram.messenger.uz.f18533m1) {
            fy0Var = fy0Var41;
            fy0Var2 = new fy0(125, org.telegram.messenger.dd.K0(2131751203), "emailLoginRow", org.telegram.messenger.dd.K0(2131746786), 2131232035, new Runnable() {
                @Override
                public final void run() {
                    int i10 = r1;
                    int i11 = 0;
                    org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                    switch (i10) {
                        case 0:
                            ab0 ab0Var = new ab0();
                            k2Var2.presentFragment(ab0Var);
                            ab0Var.b0(360928);
                            ab0Var.a0(64);
                            return;
                        case 1:
                            ab0 ab0Var2 = new ab0();
                            k2Var2.presentFragment(ab0Var2);
                            ab0Var2.b0(360928);
                            ab0Var2.a0(128);
                            return;
                        case 2:
                            k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            ab0 ab0Var3 = new ab0();
                            k2Var2.presentFragment(ab0Var3);
                            ab0Var3.b0(360928);
                            ab0Var3.a0(256);
                            return;
                        case 4:
                            ab0 ab0Var4 = new ab0();
                            k2Var2.presentFragment(ab0Var4);
                            ab0Var4.b0(360928);
                            ab0Var4.a0(32768);
                            return;
                        case 5:
                            ab0 ab0Var5 = new ab0();
                            k2Var2.presentFragment(ab0Var5);
                            ab0Var5.a0(512);
                            return;
                        case 6:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            ab0 ab0Var6 = new ab0();
                            k2Var2.presentFragment(ab0Var6);
                            ab0Var6.a0(1024);
                            return;
                        case 8:
                            ab0 ab0Var7 = new ab0();
                            k2Var2.presentFragment(ab0Var7);
                            ab0Var7.a0(2048);
                            return;
                        case 9:
                            ab0 ab0Var8 = new ab0();
                            k2Var2.presentFragment(ab0Var8);
                            while (true) {
                                ArrayList arrayList = ab0Var8.f35741s;
                                if (i11 < arrayList.size()) {
                                    if (((va0) arrayList.get(i11)).f42465f == 1) {
                                        ab0Var8.f35736b.e1(new i2.q(ab0Var8, i11, 14), 700, true);
                                        return;
                                    }
                                    i11++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            return;
                        case 14:
                            k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                            return;
                        case 15:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                            return;
                        case 16:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                            return;
                        case 17:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            k2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            k2Var2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            k2Var2.presentFragment(PasscodeActivity.p0());
                            return;
                        case 23:
                            kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                            i1Var2.K0();
                            k2Var2.showDialog(i1Var2);
                            return;
                        case 24:
                            k2Var2.presentFragment(new f(3));
                            return;
                        case 25:
                            k2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            zu0 zu0Var = new zu0();
                            zu0Var.getMessagesController().F0(true);
                            k2Var2.presentFragment(zu0Var);
                            return;
                        case 27:
                            k2Var2.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
            fy0Var2.a("tg://settings/privacy/login-email");
        } else {
            fy0Var = fy0Var41;
            fy0Var2 = null;
        }
        fy0 fy0Var45 = new fy0(101, org.telegram.messenger.dd.K0(2131753681), org.telegram.messenger.dd.K0(2131746786), 2131232354, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        return;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        return;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        return;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        return;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        return;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.f35741s;
                            if (i11 < arrayList.size()) {
                                if (((va0) arrayList.get(i11)).f42465f == 1) {
                                    ab0Var8.f35736b.e1(new i2.q(ab0Var8, i11, 14), 700, true);
                                    return;
                                }
                                i11++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        return;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        return;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        return;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        return;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        return;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        fy0Var45.a("tg://settings/privacy/blocked");
        fy0 fy0Var46 = new fy0(110, org.telegram.messenger.dd.K0(2131745568), 2131232035, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        return;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        return;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        return;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        return;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        return;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.f35741s;
                            if (i11 < arrayList.size()) {
                                if (((va0) arrayList.get(i11)).f42465f == 1) {
                                    ab0Var8.f35736b.e1(new i2.q(ab0Var8, i11, 14), 700, true);
                                    return;
                                }
                                i11++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        return;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        return;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        return;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        return;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        return;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        fy0Var46.a("tg://settings/devices");
        fy0 fy0Var47 = new fy0(105, org.telegram.messenger.dd.K0(2131746805), org.telegram.messenger.dd.K0(2131746786), 2131232354, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        return;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        return;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        return;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        return;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        return;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.f35741s;
                            if (i11 < arrayList.size()) {
                                if (((va0) arrayList.get(i11)).f42465f == 1) {
                                    ab0Var8.f35736b.e1(new i2.q(ab0Var8, i11, 14), 700, true);
                                    return;
                                }
                                i11++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        return;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        return;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        return;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        return;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        return;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        fy0Var47.a("tg://settings/privacy/phone-number/");
        fy0 fy0Var48 = new fy0(102, org.telegram.messenger.dd.K0(2131746830), org.telegram.messenger.dd.K0(2131746786), 2131232354, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        return;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        return;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        return;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        return;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        return;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.f35741s;
                            if (i11 < arrayList.size()) {
                                if (((va0) arrayList.get(i11)).f42465f == 1) {
                                    ab0Var8.f35736b.e1(new i2.q(ab0Var8, i11, 14), 700, true);
                                    return;
                                }
                                i11++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        return;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        return;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        return;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        return;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        return;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        fy0Var48.a("tg://settings/privacy/last-seen");
        fy0 fy0Var49 = new fy0(103, org.telegram.messenger.dd.K0(2131746792), org.telegram.messenger.dd.K0(2131746786), 2131232354, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (org.telegram.messenger.e20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new gf0(i10));
                            return;
                        }
                        return;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        k2Var.presentFragment(new y6());
                        return;
                    case 24:
                        k2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 26:
                        k2Var.presentFragment(new y6());
                        return;
                    case 27:
                        k2Var.presentFragment(new y6());
                        return;
                    case 28:
                        k2Var.presentFragment(new lu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        fy0Var49.a("tg://settings/privacy/profile-photos");
        fy0 fy0Var50 = new fy0(104, org.telegram.messenger.dd.K0(2131746852), org.telegram.messenger.dd.K0(2131746786), 2131232354, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (org.telegram.messenger.e20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new gf0(i10));
                            return;
                        }
                        return;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        k2Var.presentFragment(new y6());
                        return;
                    case 24:
                        k2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 26:
                        k2Var.presentFragment(new y6());
                        return;
                    case 27:
                        k2Var.presentFragment(new y6());
                        return;
                    case 28:
                        k2Var.presentFragment(new lu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        fy0Var50.a("tg://settings/privacy/forwards");
        fy0 fy0Var51 = new fy0(122, org.telegram.messenger.dd.K0(2131746815), org.telegram.messenger.dd.K0(2131746786), 2131232354, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (org.telegram.messenger.e20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new gf0(i10));
                            return;
                        }
                        return;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        k2Var.presentFragment(new y6());
                        return;
                    case 24:
                        k2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 26:
                        k2Var.presentFragment(new y6());
                        return;
                    case 27:
                        k2Var.presentFragment(new y6());
                        return;
                    case 28:
                        k2Var.presentFragment(new lu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        fy0Var51.a("tg://settings/privacy/calls/p2p");
        fy0 fy0Var52 = new fy0(106, org.telegram.messenger.dd.K0(2131752596), org.telegram.messenger.dd.K0(2131746786), 2131232354, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (org.telegram.messenger.e20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new gf0(i10));
                            return;
                        }
                        return;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        k2Var.presentFragment(new y6());
                        return;
                    case 24:
                        k2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 26:
                        k2Var.presentFragment(new y6());
                        return;
                    case 27:
                        k2Var.presentFragment(new y6());
                        return;
                    case 28:
                        k2Var.presentFragment(new lu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        fy0Var52.a("tg://settings/privacy/calls");
        fy0 fy0Var53 = new fy0(107, org.telegram.messenger.dd.K0(2131746832), org.telegram.messenger.dd.K0(2131746786), 2131232354, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (org.telegram.messenger.e20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new gf0(i10));
                            return;
                        }
                        return;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        k2Var.presentFragment(new y6());
                        return;
                    case 24:
                        k2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 26:
                        k2Var.presentFragment(new y6());
                        return;
                    case 27:
                        k2Var.presentFragment(new y6());
                        return;
                    case 28:
                        k2Var.presentFragment(new lu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        fy0Var53.a("tg://settings/privacy/invites");
        fy0 fy0Var54 = new fy0(123, org.telegram.messenger.dd.K0(2131746773), org.telegram.messenger.dd.K0(2131746786), 2131232354, new Runnable() {
            @Override
            public final void run() {
                int i10 = r2;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                int i11 = currentAccount;
                switch (i10) {
                    case 0:
                        if (org.telegram.messenger.e20.i(i11).f15527p0 >= 0) {
                            k2Var2.presentFragment(new p4());
                            return;
                        }
                        return;
                    default:
                        if (!org.telegram.messenger.e20.i(i11).q()) {
                            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(k2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.eb ebVar = new org.telegram.ui.Components.eb(a02.W(), null);
                            ebVar.d(2131624344, new String[0]);
                            String L0 = org.telegram.messenger.dd.L0(2131746770, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(L0);
                            int indexOf = L0.indexOf(42);
                            int lastIndexOf = L0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) L0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new dh.a(a02, 6), indexOf, lastIndexOf - 1, 33);
                            }
                            ebVar.f25779b.setText(spannableStringBuilder);
                            ebVar.f25779b.setSingleLine(false);
                            ebVar.f25779b.setMaxLines(2);
                            a02.b(ebVar, 2750).j();
                            return;
                        }
                        k2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        fy0Var54.a("tg://settings/privacy/voice");
        if (org.telegram.messenger.wp.r1(currentAccount).f19080a4) {
            fy0Var3 = fy0Var54;
            fy0Var4 = new fy0(121, org.telegram.messenger.dd.K0(2131754171), "newChatsRow", org.telegram.messenger.dd.K0(2131746786), 2131232035, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            k2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            k2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            k2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            k2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                            kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            return;
                        case 5:
                            k2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 6:
                            int i10 = 0;
                            while (true) {
                                if (i10 < 4) {
                                    if (org.telegram.messenger.e20.i(i10).p()) {
                                        i10++;
                                    }
                                } else {
                                    i10 = -1;
                                }
                            }
                            if (i10 >= 0) {
                                k2Var.presentFragment(new gf0(i10));
                                return;
                            }
                            return;
                        case 7:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            k2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                            kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                            i1Var2.K0();
                            k2Var3.showDialog(i1Var2);
                            return;
                        case 15:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            k2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            k2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            k2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            k2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            k2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            k2Var.presentFragment(new y6());
                            return;
                        case 24:
                            k2Var.presentFragment(new y6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                            kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                            i1Var3.K0();
                            k2Var4.showDialog(i1Var3);
                            return;
                        case 26:
                            k2Var.presentFragment(new y6());
                            return;
                        case 27:
                            k2Var.presentFragment(new y6());
                            return;
                        case 28:
                            k2Var.presentFragment(new lu());
                            return;
                        default:
                            k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
            fy0Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            fy0Var3 = fy0Var54;
            fy0Var4 = null;
        }
        fy0 fy0Var55 = new fy0(112, org.telegram.messenger.dd.K0(2131751597), "deleteAccountRow", org.telegram.messenger.dd.K0(2131746786), 2131232035, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (org.telegram.messenger.e20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new gf0(i10));
                            return;
                        }
                        return;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        k2Var.presentFragment(new y6());
                        return;
                    case 24:
                        k2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 26:
                        k2Var.presentFragment(new y6());
                        return;
                    case 27:
                        k2Var.presentFragment(new y6());
                        return;
                    case 28:
                        k2Var.presentFragment(new lu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        fy0Var55.a("tg://settings/privacy/self-destruct");
        fy0 fy0Var56 = new fy0(113, org.telegram.messenger.dd.K0(2131746812), "paymentsClearRow", org.telegram.messenger.dd.K0(2131746786), 2131232035, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (org.telegram.messenger.e20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new gf0(i10));
                            return;
                        }
                        return;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        k2Var.presentFragment(new y6());
                        return;
                    case 24:
                        k2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 26:
                        k2Var.presentFragment(new y6());
                        return;
                    case 27:
                        k2Var.presentFragment(new y6());
                        return;
                    case 28:
                        k2Var.presentFragment(new lu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        fy0Var56.a("tg://settings/privacy/data-settings/clear-payment-info");
        fy0 fy0Var57 = new fy0(114, org.telegram.messenger.dd.K0(2131742937), org.telegram.messenger.dd.K0(2131746786), 2131232035, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (org.telegram.messenger.e20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new gf0(i10));
                            return;
                        }
                        return;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        k2Var.presentFragment(new y6());
                        return;
                    case 24:
                        k2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 26:
                        k2Var.presentFragment(new y6());
                        return;
                    case 27:
                        k2Var.presentFragment(new y6());
                        return;
                    case 28:
                        k2Var.presentFragment(new lu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        fy0Var57.a("tg://settings/privacy/active-websites");
        fy0 fy0Var58 = new fy0(115, org.telegram.messenger.dd.K0(2131744322), "contactsDeleteRow", org.telegram.messenger.dd.K0(2131746786), 2131232035, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (org.telegram.messenger.e20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new gf0(i10));
                            return;
                        }
                        return;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        k2Var.presentFragment(new y6());
                        return;
                    case 24:
                        k2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 26:
                        k2Var.presentFragment(new y6());
                        return;
                    case 27:
                        k2Var.presentFragment(new y6());
                        return;
                    case 28:
                        k2Var.presentFragment(new lu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        fy0Var58.a("tg://settings/privacy/data-settings/delete-synced");
        fy0 fy0Var59 = new fy0(116, org.telegram.messenger.dd.K0(2131744324), "contactsSyncRow", org.telegram.messenger.dd.K0(2131746786), 2131232035, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (org.telegram.messenger.e20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new gf0(i10));
                            return;
                        }
                        return;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        k2Var.presentFragment(new y6());
                        return;
                    case 24:
                        k2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 26:
                        k2Var.presentFragment(new y6());
                        return;
                    case 27:
                        k2Var.presentFragment(new y6());
                        return;
                    case 28:
                        k2Var.presentFragment(new lu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        fy0Var59.a("tg://settings/privacy/data-settings/sync-contacts");
        fy0 fy0Var60 = new fy0(117, org.telegram.messenger.dd.K0(2131744438), "contactsSuggestRow", org.telegram.messenger.dd.K0(2131746786), 2131232035, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (org.telegram.messenger.e20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new gf0(i10));
                            return;
                        }
                        return;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        k2Var.presentFragment(new y6());
                        return;
                    case 24:
                        k2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 26:
                        k2Var.presentFragment(new y6());
                        return;
                    case 27:
                        k2Var.presentFragment(new y6());
                        return;
                    case 28:
                        k2Var.presentFragment(new lu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        fy0Var60.a("tg://settings/privacy/data-settings/suggest-contacts");
        fy0 fy0Var61 = new fy0(118, org.telegram.messenger.dd.K0(2131748704), "secretMapRow", org.telegram.messenger.dd.K0(2131746786), 2131232035, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (org.telegram.messenger.e20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new gf0(i10));
                            return;
                        }
                        return;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        k2Var.presentFragment(new y6());
                        return;
                    case 24:
                        k2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 26:
                        k2Var.presentFragment(new y6());
                        return;
                    case 27:
                        k2Var.presentFragment(new y6());
                        return;
                    case 28:
                        k2Var.presentFragment(new lu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        fy0Var61.a("tg://settings/privacy/data-settings/map-provider");
        fy0 fy0Var62 = new fy0(119, org.telegram.messenger.dd.K0(2131745701), "secretWebpageRow", org.telegram.messenger.dd.K0(2131746786), 2131232035, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (org.telegram.messenger.e20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new gf0(i10));
                            return;
                        }
                        return;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        k2Var.presentFragment(new y6());
                        return;
                    case 24:
                        k2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 26:
                        k2Var.presentFragment(new y6());
                        return;
                    case 27:
                        k2Var.presentFragment(new y6());
                        return;
                    case 28:
                        k2Var.presentFragment(new lu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        fy0Var62.a("tg://settings/privacy/data-settings/link-previews");
        fy0 fy0Var63 = new fy0(120, org.telegram.messenger.dd.K0(2131751456), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (org.telegram.messenger.e20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new gf0(i10));
                            return;
                        }
                        return;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        k2Var.presentFragment(new y6());
                        return;
                    case 24:
                        k2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 26:
                        k2Var.presentFragment(new y6());
                        return;
                    case 27:
                        k2Var.presentFragment(new y6());
                        return;
                    case 28:
                        k2Var.presentFragment(new lu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        fy0Var63.a("tg://settings/devices");
        fy0 fy0Var64 = new fy0(121, org.telegram.messenger.dd.K0(2131744233), "terminateAllSessionsRow", org.telegram.messenger.dd.K0(2131751456), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (org.telegram.messenger.e20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new gf0(i10));
                            return;
                        }
                        return;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        k2Var.presentFragment(new y6());
                        return;
                    case 24:
                        k2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 26:
                        k2Var.presentFragment(new y6());
                        return;
                    case 27:
                        k2Var.presentFragment(new y6());
                        return;
                    case 28:
                        k2Var.presentFragment(new lu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        fy0Var64.a("tg://settings/devices/terminate-sessions");
        fy0 fy0Var65 = new fy0(122, org.telegram.messenger.dd.K0(2131748927), org.telegram.messenger.dd.K0(2131751456), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (org.telegram.messenger.e20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new gf0(i10));
                            return;
                        }
                        return;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        k2Var.presentFragment(new y6());
                        return;
                    case 24:
                        k2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 26:
                        k2Var.presentFragment(new y6());
                        return;
                    case 27:
                        k2Var.presentFragment(new y6());
                        return;
                    case 28:
                        k2Var.presentFragment(new lu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        fy0Var65.a("tg://settings/devices/link-desktop");
        fy0 fy0Var66 = new fy0(200, org.telegram.messenger.dd.K0(2131751678), 2131232022, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (org.telegram.messenger.e20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new gf0(i10));
                            return;
                        }
                        return;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        k2Var.presentFragment(new y6());
                        return;
                    case 24:
                        k2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 26:
                        k2Var.presentFragment(new y6());
                        return;
                    case 27:
                        k2Var.presentFragment(new y6());
                        return;
                    case 28:
                        k2Var.presentFragment(new lu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        fy0Var66.a("tg://settings/privacy/data-settings");
        fy0 fy0Var67 = new fy0(201, org.telegram.messenger.dd.K0(2131751677), "usageSectionRow", org.telegram.messenger.dd.K0(2131751678), 2131232022, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (org.telegram.messenger.e20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new gf0(i10));
                            return;
                        }
                        return;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        k2Var.presentFragment(new y6());
                        return;
                    case 24:
                        k2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 26:
                        k2Var.presentFragment(new y6());
                        return;
                    case 27:
                        k2Var.presentFragment(new y6());
                        return;
                    case 28:
                        k2Var.presentFragment(new lu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        fy0 fy0Var68 = new fy0(202, org.telegram.messenger.dd.K0(2131744834), org.telegram.messenger.dd.K0(2131751678), 2131232022, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (org.telegram.messenger.e20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new gf0(i10));
                            return;
                        }
                        return;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        k2Var.presentFragment(new y6());
                        return;
                    case 24:
                        k2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 26:
                        k2Var.presentFragment(new y6());
                        return;
                    case 27:
                        k2Var.presentFragment(new y6());
                        return;
                    case 28:
                        k2Var.presentFragment(new lu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        fy0Var68.a("tg://settings/data/storage");
        fy0 fy0Var69 = new fy0(203, org.telegram.messenger.dd.K0(2131749070), "keepMediaRow", org.telegram.messenger.dd.K0(2131751678), org.telegram.messenger.dd.K0(2131744834), 2131232022, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (org.telegram.messenger.e20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new gf0(i10));
                            return;
                        }
                        return;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        k2Var.presentFragment(new y6());
                        return;
                    case 24:
                        k2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 26:
                        k2Var.presentFragment(new y6());
                        return;
                    case 27:
                        k2Var.presentFragment(new y6());
                        return;
                    case 28:
                        k2Var.presentFragment(new lu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        fy0 fy0Var70 = new fy0(204, org.telegram.messenger.dd.K0(2131752075), "cacheRow", org.telegram.messenger.dd.K0(2131751678), org.telegram.messenger.dd.K0(2131744834), 2131232022, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (org.telegram.messenger.e20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new gf0(i10));
                            return;
                        }
                        return;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        k2Var.presentFragment(new y6());
                        return;
                    case 24:
                        k2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 26:
                        k2Var.presentFragment(new y6());
                        return;
                    case 27:
                        k2Var.presentFragment(new y6());
                        return;
                    case 28:
                        k2Var.presentFragment(new lu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        fy0 fy0Var71 = new fy0(205, org.telegram.messenger.dd.K0(2131748784), "databaseRow", org.telegram.messenger.dd.K0(2131751678), org.telegram.messenger.dd.K0(2131744834), 2131232022, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (org.telegram.messenger.e20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new gf0(i10));
                            return;
                        }
                        return;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        k2Var.presentFragment(new y6());
                        return;
                    case 24:
                        k2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 26:
                        k2Var.presentFragment(new y6());
                        return;
                    case 27:
                        k2Var.presentFragment(new y6());
                        return;
                    case 28:
                        k2Var.presentFragment(new lu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        fy0 fy0Var72 = new fy0(206, org.telegram.messenger.dd.K0(2131748312), org.telegram.messenger.dd.K0(2131751678), 2131232022, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (org.telegram.messenger.e20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new gf0(i10));
                            return;
                        }
                        return;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        k2Var.presentFragment(new y6());
                        return;
                    case 24:
                        k2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 26:
                        k2Var.presentFragment(new y6());
                        return;
                    case 27:
                        k2Var.presentFragment(new y6());
                        return;
                    case 28:
                        k2Var.presentFragment(new lu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        fy0Var72.a("tg://settings/data/usage");
        fy0 fy0Var73 = new fy0(207, org.telegram.messenger.dd.K0(2131753767), "mediaDownloadSectionRow", org.telegram.messenger.dd.K0(2131751678), 2131232022, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                }
            }
        });
        fy0 fy0Var74 = new fy0(208, org.telegram.messenger.dd.K0(2131742910), org.telegram.messenger.dd.K0(2131751678), 2131232022, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                }
            }
        });
        fy0 fy0Var75 = new fy0(209, org.telegram.messenger.dd.K0(2131742912), org.telegram.messenger.dd.K0(2131751678), 2131232022, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                }
            }
        });
        fy0 fy0Var76 = new fy0(210, org.telegram.messenger.dd.K0(2131742911), org.telegram.messenger.dd.K0(2131751678), 2131232022, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                }
            }
        });
        fy0 fy0Var77 = new fy0(211, org.telegram.messenger.dd.K0(2131746128), "resetDownloadRow", org.telegram.messenger.dd.K0(2131751678), 2131232022, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                }
            }
        });
        fy0Var77.a("tg://settings/data/auto-download/reset");
        fy0 fy0Var78 = new fy0(215, org.telegram.messenger.dd.K0(2131744464), "streamSectionRow", org.telegram.messenger.dd.K0(2131751678), 2131232022, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                }
            }
        });
        fy0 fy0Var79 = new fy0(216, org.telegram.messenger.dd.K0(2131751145), "enableStreamRow", org.telegram.messenger.dd.K0(2131751678), 2131232022, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                }
            }
        });
        fy0 fy0Var80 = new fy0(217, org.telegram.messenger.dd.K0(2131752596), "callsSectionRow", org.telegram.messenger.dd.K0(2131751678), 2131232022, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                }
            }
        });
        fy0 fy0Var81 = new fy0(218, org.telegram.messenger.dd.K0(2131743255), "useLessDataForCallsRow", org.telegram.messenger.dd.K0(2131751678), 2131232022, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                }
            }
        });
        fy0Var81.a("tg://settings/data/use-less-data");
        fy0 fy0Var82 = new fy0(219, org.telegram.messenger.dd.K0(2131743284), "quickRepliesRow", org.telegram.messenger.dd.K0(2131751678), 2131232022, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                }
            }
        });
        fy0 fy0Var83 = new fy0(220, org.telegram.messenger.dd.K0(2131746616), org.telegram.messenger.dd.K0(2131751678), 2131232022, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                }
            }
        });
        fy0Var83.a("tg://settings/data/proxy");
        fy0 fy0Var84 = new fy0(111, org.telegram.messenger.dd.K0(2131746856), "clearDraftsRow", org.telegram.messenger.dd.K0(2131751678), 2131232022, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                }
            }
        });
        fy0Var84.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        fy0 fy0Var85 = new fy0(222, org.telegram.messenger.dd.K0(2131745946), "saveToGallerySectionRow", org.telegram.messenger.dd.K0(2131751678), 2131232022, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                }
            }
        });
        fy0 fy0Var86 = new fy0(223, org.telegram.messenger.dd.K0(2131745936), "saveToGalleryPeerRow", org.telegram.messenger.dd.K0(2131751678), org.telegram.messenger.dd.K0(2131745946), 2131232022, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                }
            }
        });
        fy0Var86.a("tg://settings/data/save-to-photos/chats");
        fy0 fy0Var87 = new fy0(224, org.telegram.messenger.dd.K0(2131745943), "saveToGalleryGroupsRow", org.telegram.messenger.dd.K0(2131751678), org.telegram.messenger.dd.K0(2131745946), 2131232022, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                }
            }
        });
        fy0Var87.a("tg://settings/data/save-to-photos/groups");
        fy0 fy0Var88 = new fy0(225, org.telegram.messenger.dd.K0(2131745945), "saveToGalleryChannelsRow", org.telegram.messenger.dd.K0(2131751678), org.telegram.messenger.dd.K0(2131745946), 2131232022, new ah0(2, k2Var));
        fy0Var88.a("tg://settings/data/save-to-photos/channels");
        fy0 fy0Var89 = new fy0(300, org.telegram.messenger.dd.K0(2131752210), 2131232024, new ah0(3, k2Var));
        fy0Var89.a("tg://settings/appearance/themes");
        fy0 fy0Var90 = new fy0(301, org.telegram.messenger.dd.K0(2131744216), "textSizeHeaderRow", org.telegram.messenger.dd.K0(2131752210), 2131232024, new ah0(4, k2Var));
        fy0Var90.a("tg://settings/appearance/text-size");
        fy0 fy0Var91 = new fy0(302, org.telegram.messenger.dd.K0(2131752550), org.telegram.messenger.dd.K0(2131752210), 2131232024, new ah0(5, k2Var));
        fy0Var91.a("tg://settings/appearance/wallpapers");
        fy0 fy0Var92 = new fy0(303, org.telegram.messenger.dd.K0(2131745555), null, org.telegram.messenger.dd.K0(2131752210), org.telegram.messenger.dd.K0(2131752244), 2131232024, new ah0(6, k2Var));
        fy0 fy0Var93 = new fy0(304, org.telegram.messenger.dd.K0(2131746125), "resetRow", org.telegram.messenger.dd.K0(2131752210), org.telegram.messenger.dd.K0(2131752244), 2131232024, new ah0(8, k2Var));
        fy0 fy0Var94 = new fy0(306, org.telegram.messenger.dd.K0(2131752011), "themeHeaderRow", org.telegram.messenger.dd.K0(2131752210), 2131232024, new ah0(9, k2Var));
        fy0 fy0Var95 = new fy0(319, org.telegram.messenger.dd.K0(2131752878), null, org.telegram.messenger.dd.K0(2131752210), 2131232024, new ah0(10, k2Var));
        fy0 fy0Var96 = new fy0(320, org.telegram.messenger.dd.K0(2131751713), "createNewThemeRow", org.telegram.messenger.dd.K0(2131752210), org.telegram.messenger.dd.K0(2131752878), 2131232024, new ah0(11, k2Var));
        fy0Var96.a("tg://settings/appearance/themes/create");
        fy0 fy0Var97 = new fy0(321, org.telegram.messenger.dd.K0(2131752840), "bubbleRadiusHeaderRow", org.telegram.messenger.dd.K0(2131752210), 2131232024, new ah0(13, k2Var));
        fy0Var97.a("tg://settings/appearance/message-corners");
        fy0 fy0Var98 = new fy0(322, org.telegram.messenger.dd.K0(2131752225), "chatListHeaderRow", org.telegram.messenger.dd.K0(2131752210), 2131232024, new ah0(14, k2Var));
        fy0 fy0Var99 = new fy0(323, org.telegram.messenger.dd.K0(2131752222), "swipeGestureHeaderRow", org.telegram.messenger.dd.K0(2131752210), 2131232024, new ah0(15, k2Var));
        fy0 fy0Var100 = new fy0(324, org.telegram.messenger.dd.K0(2131754240), "appIconHeaderRow", org.telegram.messenger.dd.K0(2131752210), 2131232024, new ah0(16, k2Var));
        fy0Var100.a("tg://settings/appearance/app-icon");
        fy0 fy0Var101 = new fy0(305, org.telegram.messenger.dd.K0(2131753784), org.telegram.messenger.dd.K0(2131752210), 2131232024, new ah0(17, k2Var));
        fy0 fy0Var102 = new fy0(328, org.telegram.messenger.dd.K0(2131748266), "nextMediaTapRow", org.telegram.messenger.dd.K0(2131752210), 2131232024, new ah0(18, k2Var));
        fy0Var102.a("tg://settings/appearance/tap-for-next-media");
        fy0 fy0Var103 = new fy0(327, org.telegram.messenger.dd.K0(2131746442), "raiseToListenRow", org.telegram.messenger.dd.K0(2131752210), 2131232024, new ah0(20, k2Var));
        fy0Var103.a("tg://settings/data/raise-to-listen");
        fy0 fy0Var104 = new fy0(310, org.telegram.messenger.dd.K0(2131746440), "raiseToSpeakRow", org.telegram.messenger.dd.K0(2131752210), 2131232024, new ah0(21, k2Var));
        fy0Var104.a("tg://settings/data/raise-to-speak");
        fy0 fy0Var105 = new fy0(326, org.telegram.messenger.dd.K0(2131747448), "pauseOnMediaRow", org.telegram.messenger.dd.K0(2131752210), 2131232024, new ah0(22, k2Var));
        fy0Var105.a("tg://settings/data/pause-music");
        fy0 fy0Var106 = new fy0(325, org.telegram.messenger.dd.K0(2131748454), "bluetoothScoRow", org.telegram.messenger.dd.K0(2131752210), 2131232024, new ah0(24, k2Var));
        fy0 fy0Var107 = new fy0(308, org.telegram.messenger.dd.K0(2131751439), "directShareRow", org.telegram.messenger.dd.K0(2131752210), 2131232024, new ah0(25, k2Var));
        fy0 fy0Var108 = new fy0(311, org.telegram.messenger.dd.K0(2131745649), "sendByEnterRow", org.telegram.messenger.dd.K0(2131752210), 2131232024, new ah0(26, k2Var));
        fy0 fy0Var109 = new fy0(318, org.telegram.messenger.dd.K0(2131751368), "distanceRow", org.telegram.messenger.dd.K0(2131752210), 2131232024, new ah0(27, k2Var));
        fy0 fy0Var110 = new fy0(600, org.telegram.messenger.dd.K0(2131744875), 2131232037, new ah0(28, k2Var));
        fy0Var110.a("tg://settings/appearance/stickers-and-emoji");
        fy0 fy0Var111 = new fy0(601, org.telegram.messenger.dd.K0(2131744428), "suggestRow", org.telegram.messenger.dd.K0(2131744875), 2131232037, new ah0(29, k2Var));
        fy0 fy0Var112 = new fy0(602, org.telegram.messenger.dd.K0(2131750834), "featuredStickersHeaderRow", org.telegram.messenger.dd.K0(2131744875), 2131232037, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        return;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        return;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        return;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        return;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        return;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        return;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        return;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        return;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        return;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        return;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        return;
                }
            }
        });
        fy0 fy0Var113 = new fy0(603, org.telegram.messenger.dd.K0(2131748694), null, org.telegram.messenger.dd.K0(2131744875), 2131232037, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        return;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        return;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        return;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        return;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        return;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        return;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        return;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        return;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        return;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        return;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        return;
                }
            }
        });
        fy0 fy0Var114 = new fy0(604, org.telegram.messenger.dd.K0(2131754128), null, org.telegram.messenger.dd.K0(2131744875), 2131232037, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        return;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        return;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        return;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        return;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        return;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        return;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        return;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        return;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        return;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        return;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        return;
                }
            }
        });
        fy0Var114.a("tg://settings/appearance/stickers-and-emoji/archived");
        fy0 fy0Var115 = new fy0(605, org.telegram.messenger.dd.K0(2131754133), null, org.telegram.messenger.dd.K0(2131744875), 2131232037, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        return;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        return;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        return;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        return;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        return;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        return;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        return;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        return;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        return;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        return;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        return;
                }
            }
        });
        fy0 fy0Var116 = new fy0(606, org.telegram.messenger.dd.K0(2131749044), "largeEmojiRow", org.telegram.messenger.dd.K0(2131744875), 2131232037, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        return;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        return;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        return;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        return;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        return;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        return;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        return;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        return;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        return;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        return;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        return;
                }
            }
        });
        fy0Var116.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        fy0 fy0Var117 = new fy0(607, org.telegram.messenger.dd.K0(2131748733), "loopRow", org.telegram.messenger.dd.K0(2131744875), 2131232037, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        return;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        return;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        return;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        return;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        return;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        return;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        return;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        return;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        return;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        return;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        return;
                }
            }
        });
        fy0 fy0Var118 = new fy0(608, org.telegram.messenger.dd.K0(2131751197), null, org.telegram.messenger.dd.K0(2131744875), 2131231513, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        return;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        return;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        return;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        return;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        return;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        return;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        return;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        return;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        return;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        return;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        return;
                }
            }
        });
        fy0Var118.a("tg://settings/appearance/stickers-and-emoji/emoji");
        fy0 fy0Var119 = new fy0(609, org.telegram.messenger.dd.K0(2131744442), "suggestAnimatedEmojiRow", org.telegram.messenger.dd.K0(2131744875), org.telegram.messenger.dd.K0(2131751197), 2131231513, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        return;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        return;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        return;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        return;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        return;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        return;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        return;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        return;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        return;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        return;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        return;
                }
            }
        });
        fy0Var119.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        fy0 fy0Var120 = new fy0(610, org.telegram.messenger.dd.K0(2131750836), "featuredStickersHeaderRow", org.telegram.messenger.dd.K0(2131744875), org.telegram.messenger.dd.K0(2131751197), 2131231513, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        return;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        return;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        return;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        return;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        return;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        return;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        return;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        return;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        return;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        return;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        return;
                }
            }
        });
        fy0 fy0Var121 = new fy0(611, org.telegram.messenger.dd.K0(2131751351), null, org.telegram.messenger.dd.K0(2131744875), 2131232037, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        return;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        return;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        return;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        return;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        return;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        return;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        return;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        return;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        return;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        return;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        return;
                }
            }
        });
        fy0Var121.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        fy0 fy0Var122 = new fy0(700, org.telegram.messenger.dd.K0(2131750697), null, 2131232026, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        return;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        return;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        return;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        return;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        return;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        return;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        return;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        return;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        return;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        return;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        return;
                }
            }
        });
        fy0Var122.a("tg://settings/folders");
        fy0 fy0Var123 = new fy0(701, org.telegram.messenger.dd.K0(2131751717), "createFilterRow", org.telegram.messenger.dd.K0(2131750697), 2131232026, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        return;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        return;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        return;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        return;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        return;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        return;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        return;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        return;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        return;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        return;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        return;
                }
            }
        });
        fy0Var123.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            fy0Var5 = fy0Var123;
            fy0Var6 = fy0Var114;
            fy0Var7 = fy0Var116;
            fy0Var8 = fy0Var118;
            fy0Var9 = new fy0(800, org.telegram.messenger.dd.K0(2131744256), 2131232361, new Runnable() {
                @Override
                public final void run() {
                    int i10 = r1;
                    int i11 = 0;
                    org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                    switch (i10) {
                        case 0:
                            ab0 ab0Var = new ab0();
                            k2Var2.presentFragment(ab0Var);
                            ab0Var.b0(360928);
                            ab0Var.a0(64);
                            return;
                        case 1:
                            ab0 ab0Var2 = new ab0();
                            k2Var2.presentFragment(ab0Var2);
                            ab0Var2.b0(360928);
                            ab0Var2.a0(128);
                            return;
                        case 2:
                            k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            ab0 ab0Var3 = new ab0();
                            k2Var2.presentFragment(ab0Var3);
                            ab0Var3.b0(360928);
                            ab0Var3.a0(256);
                            return;
                        case 4:
                            ab0 ab0Var4 = new ab0();
                            k2Var2.presentFragment(ab0Var4);
                            ab0Var4.b0(360928);
                            ab0Var4.a0(32768);
                            return;
                        case 5:
                            ab0 ab0Var5 = new ab0();
                            k2Var2.presentFragment(ab0Var5);
                            ab0Var5.a0(512);
                            return;
                        case 6:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            ab0 ab0Var6 = new ab0();
                            k2Var2.presentFragment(ab0Var6);
                            ab0Var6.a0(1024);
                            return;
                        case 8:
                            ab0 ab0Var7 = new ab0();
                            k2Var2.presentFragment(ab0Var7);
                            ab0Var7.a0(2048);
                            return;
                        case 9:
                            ab0 ab0Var8 = new ab0();
                            k2Var2.presentFragment(ab0Var8);
                            while (true) {
                                ArrayList arrayList = ab0Var8.f35741s;
                                if (i11 < arrayList.size()) {
                                    if (((va0) arrayList.get(i11)).f42465f == 1) {
                                        ab0Var8.f35736b.e1(new i2.q(ab0Var8, i11, 14), 700, true);
                                        return;
                                    }
                                    i11++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            return;
                        case 14:
                            k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                            return;
                        case 15:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                            return;
                        case 16:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                            return;
                        case 17:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            k2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            k2Var2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            k2Var2.presentFragment(PasscodeActivity.p0());
                            return;
                        case 23:
                            kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                            i1Var2.K0();
                            k2Var2.showDialog(i1Var2);
                            return;
                        case 24:
                            k2Var2.presentFragment(new f(3));
                            return;
                        case 25:
                            k2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            zu0 zu0Var = new zu0();
                            zu0Var.getMessagesController().F0(true);
                            k2Var2.presentFragment(zu0Var);
                            return;
                        case 27:
                            k2Var2.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            fy0Var5 = fy0Var123;
            fy0Var6 = fy0Var114;
            fy0Var7 = fy0Var116;
            fy0Var8 = fy0Var118;
            fy0Var9 = null;
        }
        if (F(currentAccount, 0)) {
            fy0Var10 = new fy0(801, org.telegram.messenger.dd.K0(2131747013), org.telegram.messenger.dd.K0(2131744256), 2131232361, new Runnable() {
                @Override
                public final void run() {
                    int i10 = r1;
                    int i11 = 0;
                    org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                    switch (i10) {
                        case 0:
                            ab0 ab0Var = new ab0();
                            k2Var2.presentFragment(ab0Var);
                            ab0Var.b0(360928);
                            ab0Var.a0(64);
                            return;
                        case 1:
                            ab0 ab0Var2 = new ab0();
                            k2Var2.presentFragment(ab0Var2);
                            ab0Var2.b0(360928);
                            ab0Var2.a0(128);
                            return;
                        case 2:
                            k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            ab0 ab0Var3 = new ab0();
                            k2Var2.presentFragment(ab0Var3);
                            ab0Var3.b0(360928);
                            ab0Var3.a0(256);
                            return;
                        case 4:
                            ab0 ab0Var4 = new ab0();
                            k2Var2.presentFragment(ab0Var4);
                            ab0Var4.b0(360928);
                            ab0Var4.a0(32768);
                            return;
                        case 5:
                            ab0 ab0Var5 = new ab0();
                            k2Var2.presentFragment(ab0Var5);
                            ab0Var5.a0(512);
                            return;
                        case 6:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            ab0 ab0Var6 = new ab0();
                            k2Var2.presentFragment(ab0Var6);
                            ab0Var6.a0(1024);
                            return;
                        case 8:
                            ab0 ab0Var7 = new ab0();
                            k2Var2.presentFragment(ab0Var7);
                            ab0Var7.a0(2048);
                            return;
                        case 9:
                            ab0 ab0Var8 = new ab0();
                            k2Var2.presentFragment(ab0Var8);
                            while (true) {
                                ArrayList arrayList = ab0Var8.f35741s;
                                if (i11 < arrayList.size()) {
                                    if (((va0) arrayList.get(i11)).f42465f == 1) {
                                        ab0Var8.f35736b.e1(new i2.q(ab0Var8, i11, 14), 700, true);
                                        return;
                                    }
                                    i11++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            return;
                        case 14:
                            k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                            return;
                        case 15:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                            return;
                        case 16:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                            return;
                        case 17:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            k2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            k2Var2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            k2Var2.presentFragment(PasscodeActivity.p0());
                            return;
                        case 23:
                            kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                            i1Var2.K0();
                            k2Var2.showDialog(i1Var2);
                            return;
                        case 24:
                            k2Var2.presentFragment(new f(3));
                            return;
                        case 25:
                            k2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            zu0 zu0Var = new zu0();
                            zu0Var.getMessagesController().F0(true);
                            k2Var2.presentFragment(zu0Var);
                            return;
                        case 27:
                            k2Var2.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            fy0Var10 = null;
        }
        if (F(currentAccount, 11)) {
            fy0Var11 = new fy0(802, org.telegram.messenger.dd.K0(2131747022), org.telegram.messenger.dd.K0(2131744256), 2131232361, new Runnable() {
                @Override
                public final void run() {
                    int i10 = r1;
                    int i11 = 0;
                    org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                    switch (i10) {
                        case 0:
                            ab0 ab0Var = new ab0();
                            k2Var2.presentFragment(ab0Var);
                            ab0Var.b0(360928);
                            ab0Var.a0(64);
                            return;
                        case 1:
                            ab0 ab0Var2 = new ab0();
                            k2Var2.presentFragment(ab0Var2);
                            ab0Var2.b0(360928);
                            ab0Var2.a0(128);
                            return;
                        case 2:
                            k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            ab0 ab0Var3 = new ab0();
                            k2Var2.presentFragment(ab0Var3);
                            ab0Var3.b0(360928);
                            ab0Var3.a0(256);
                            return;
                        case 4:
                            ab0 ab0Var4 = new ab0();
                            k2Var2.presentFragment(ab0Var4);
                            ab0Var4.b0(360928);
                            ab0Var4.a0(32768);
                            return;
                        case 5:
                            ab0 ab0Var5 = new ab0();
                            k2Var2.presentFragment(ab0Var5);
                            ab0Var5.a0(512);
                            return;
                        case 6:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            ab0 ab0Var6 = new ab0();
                            k2Var2.presentFragment(ab0Var6);
                            ab0Var6.a0(1024);
                            return;
                        case 8:
                            ab0 ab0Var7 = new ab0();
                            k2Var2.presentFragment(ab0Var7);
                            ab0Var7.a0(2048);
                            return;
                        case 9:
                            ab0 ab0Var8 = new ab0();
                            k2Var2.presentFragment(ab0Var8);
                            while (true) {
                                ArrayList arrayList = ab0Var8.f35741s;
                                if (i11 < arrayList.size()) {
                                    if (((va0) arrayList.get(i11)).f42465f == 1) {
                                        ab0Var8.f35736b.e1(new i2.q(ab0Var8, i11, 14), 700, true);
                                        return;
                                    }
                                    i11++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            return;
                        case 14:
                            k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                            return;
                        case 15:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                            return;
                        case 16:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                            return;
                        case 17:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            k2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            k2Var2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            k2Var2.presentFragment(PasscodeActivity.p0());
                            return;
                        case 23:
                            kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                            i1Var2.K0();
                            k2Var2.showDialog(i1Var2);
                            return;
                        case 24:
                            k2Var2.presentFragment(new f(3));
                            return;
                        case 25:
                            k2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            zu0 zu0Var = new zu0();
                            zu0Var.getMessagesController().F0(true);
                            k2Var2.presentFragment(zu0Var);
                            return;
                        case 27:
                            k2Var2.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            fy0Var11 = null;
        }
        if (F(currentAccount, 1)) {
            fy0Var12 = new fy0(803, org.telegram.messenger.dd.K0(2131746979), org.telegram.messenger.dd.K0(2131744256), 2131232361, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            k2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            k2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            k2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            k2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                            kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            return;
                        case 5:
                            k2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 6:
                            int i10 = 0;
                            while (true) {
                                if (i10 < 4) {
                                    if (org.telegram.messenger.e20.i(i10).p()) {
                                        i10++;
                                    }
                                } else {
                                    i10 = -1;
                                }
                            }
                            if (i10 >= 0) {
                                k2Var.presentFragment(new gf0(i10));
                                return;
                            }
                            return;
                        case 7:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            k2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                            kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                            i1Var2.K0();
                            k2Var3.showDialog(i1Var2);
                            return;
                        case 15:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            k2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            k2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            k2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            k2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            k2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            k2Var.presentFragment(new y6());
                            return;
                        case 24:
                            k2Var.presentFragment(new y6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                            kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                            i1Var3.K0();
                            k2Var4.showDialog(i1Var3);
                            return;
                        case 26:
                            k2Var.presentFragment(new y6());
                            return;
                        case 27:
                            k2Var.presentFragment(new y6());
                            return;
                        case 28:
                            k2Var.presentFragment(new lu());
                            return;
                        default:
                            k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            fy0Var12 = null;
        }
        if (F(currentAccount, 2)) {
            fy0Var13 = new fy0(804, org.telegram.messenger.dd.K0(2131747027), org.telegram.messenger.dd.K0(2131744256), 2131232361, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            k2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            k2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            k2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            k2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                            kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            return;
                        case 5:
                            k2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 6:
                            int i10 = 0;
                            while (true) {
                                if (i10 < 4) {
                                    if (org.telegram.messenger.e20.i(i10).p()) {
                                        i10++;
                                    }
                                } else {
                                    i10 = -1;
                                }
                            }
                            if (i10 >= 0) {
                                k2Var.presentFragment(new gf0(i10));
                                return;
                            }
                            return;
                        case 7:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            k2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                            kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                            i1Var2.K0();
                            k2Var3.showDialog(i1Var2);
                            return;
                        case 15:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            k2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            k2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            k2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            k2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            k2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            k2Var.presentFragment(new y6());
                            return;
                        case 24:
                            k2Var.presentFragment(new y6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                            kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                            i1Var3.K0();
                            k2Var4.showDialog(i1Var3);
                            return;
                        case 26:
                            k2Var.presentFragment(new y6());
                            return;
                        case 27:
                            k2Var.presentFragment(new y6());
                            return;
                        case 28:
                            k2Var.presentFragment(new lu());
                            return;
                        default:
                            k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            fy0Var13 = null;
        }
        if (F(currentAccount, 8)) {
            fy0Var14 = new fy0(805, org.telegram.messenger.dd.K0(2131746977), org.telegram.messenger.dd.K0(2131744256), 2131232361, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            k2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            k2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            k2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            k2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                            kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            return;
                        case 5:
                            k2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 6:
                            int i10 = 0;
                            while (true) {
                                if (i10 < 4) {
                                    if (org.telegram.messenger.e20.i(i10).p()) {
                                        i10++;
                                    }
                                } else {
                                    i10 = -1;
                                }
                            }
                            if (i10 >= 0) {
                                k2Var.presentFragment(new gf0(i10));
                                return;
                            }
                            return;
                        case 7:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            k2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                            kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                            i1Var2.K0();
                            k2Var3.showDialog(i1Var2);
                            return;
                        case 15:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            k2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            k2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            k2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            k2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            k2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            k2Var.presentFragment(new y6());
                            return;
                        case 24:
                            k2Var.presentFragment(new y6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                            kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                            i1Var3.K0();
                            k2Var4.showDialog(i1Var3);
                            return;
                        case 26:
                            k2Var.presentFragment(new y6());
                            return;
                        case 27:
                            k2Var.presentFragment(new y6());
                            return;
                        case 28:
                            k2Var.presentFragment(new lu());
                            return;
                        default:
                            k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            fy0Var14 = null;
        }
        if (F(currentAccount, 3)) {
            fy0Var15 = new fy0(806, org.telegram.messenger.dd.K0(2131747007), org.telegram.messenger.dd.K0(2131744256), 2131232361, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            k2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 1:
                            k2Var.presentFragment(new DataAutoDownloadActivity(0));
                            return;
                        case 2:
                            k2Var.presentFragment(new DataAutoDownloadActivity(1));
                            return;
                        case 3:
                            k2Var.presentFragment(new DataAutoDownloadActivity(2));
                            return;
                        case 4:
                            k2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 5:
                            k2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 6:
                            org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                            kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            return;
                        case 7:
                            k2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 8:
                            k2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 9:
                            k2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 10:
                            k2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 11:
                            k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            return;
                        case 12:
                            k2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 13:
                            k2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 14:
                            k2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 15:
                            k2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 16:
                            k2Var.presentFragment(new DataSettingsActivity());
                            return;
                        default:
                            org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                            kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                            i1Var2.K0();
                            k2Var3.showDialog(i1Var2);
                            return;
                    }
                }
            });
        } else {
            fy0Var15 = null;
        }
        if (F(currentAccount, 4)) {
            fy0Var16 = new fy0(807, org.telegram.messenger.dd.K0(2131746998), org.telegram.messenger.dd.K0(2131744256), 2131232361, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            k2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 1:
                            k2Var.presentFragment(new DataAutoDownloadActivity(0));
                            return;
                        case 2:
                            k2Var.presentFragment(new DataAutoDownloadActivity(1));
                            return;
                        case 3:
                            k2Var.presentFragment(new DataAutoDownloadActivity(2));
                            return;
                        case 4:
                            k2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 5:
                            k2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 6:
                            org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                            kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            return;
                        case 7:
                            k2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 8:
                            k2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 9:
                            k2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 10:
                            k2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 11:
                            k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            return;
                        case 12:
                            k2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 13:
                            k2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 14:
                            k2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 15:
                            k2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 16:
                            k2Var.presentFragment(new DataSettingsActivity());
                            return;
                        default:
                            org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                            kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                            i1Var2.K0();
                            k2Var3.showDialog(i1Var2);
                            return;
                    }
                }
            });
        } else {
            fy0Var16 = null;
        }
        if (F(currentAccount, 5)) {
            fy0Var17 = new fy0(808, org.telegram.messenger.dd.K0(2131746991), org.telegram.messenger.dd.K0(2131744256), 2131232361, new ah0(12, k2Var));
        } else {
            fy0Var17 = null;
        }
        if (F(currentAccount, 9)) {
            fy0Var18 = new fy0(809, org.telegram.messenger.dd.K0(2131747040), org.telegram.messenger.dd.K0(2131744256), 2131232361, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            k2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            k2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            k2Var.presentFragment(new n(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                            kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            return;
                        case 5:
                            k2Var.presentFragment(new n(1));
                            return;
                        case 6:
                            k2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            k2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 8:
                            k2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            k2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            k2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            k2Var.presentFragment(new oz0());
                            return;
                        case 12:
                            k2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                            kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                            i1Var2.K0();
                            k2Var3.showDialog(i1Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                            kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                            i1Var3.K0();
                            k2Var4.showDialog(i1Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                            kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                            i1Var4.K0();
                            k2Var5.showDialog(i1Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                            kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                            i1Var5.K0();
                            k2Var6.showDialog(i1Var5);
                            return;
                        case 18:
                            k2Var.presentFragment(new ab0());
                            return;
                        case 19:
                            ab0 ab0Var = new ab0();
                            k2Var.presentFragment(ab0Var);
                            ab0Var.a0(3);
                            return;
                        case 20:
                            ab0 ab0Var2 = new ab0();
                            k2Var.presentFragment(ab0Var2);
                            ab0Var2.b0(3);
                            ab0Var2.a0(1);
                            return;
                        case 21:
                            k2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            ab0 ab0Var3 = new ab0();
                            k2Var.presentFragment(ab0Var3);
                            ab0Var3.b0(3);
                            ab0Var3.a0(2);
                            return;
                        case 23:
                            ab0 ab0Var4 = new ab0();
                            k2Var.presentFragment(ab0Var4);
                            ab0Var4.a0(28700);
                            return;
                        case 24:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            ab0 ab0Var5 = new ab0();
                            k2Var.presentFragment(ab0Var5);
                            ab0Var5.b0(28700);
                            ab0Var5.a0(16388);
                            return;
                        case 26:
                            ab0 ab0Var6 = new ab0();
                            k2Var.presentFragment(ab0Var6);
                            ab0Var6.b0(28700);
                            ab0Var6.a0(8200);
                            return;
                        case 27:
                            ab0 ab0Var7 = new ab0();
                            k2Var.presentFragment(ab0Var7);
                            ab0Var7.b0(28700);
                            ab0Var7.a0(4112);
                            return;
                        case 28:
                            ab0 ab0Var8 = new ab0();
                            k2Var.presentFragment(ab0Var8);
                            ab0Var8.a0(360928);
                            return;
                        default:
                            ab0 ab0Var9 = new ab0();
                            k2Var.presentFragment(ab0Var9);
                            ab0Var9.b0(360928);
                            ab0Var9.a0(32);
                            return;
                    }
                }
            });
        } else {
            fy0Var18 = null;
        }
        if (F(currentAccount, 6)) {
            fy0Var19 = new fy0(810, org.telegram.messenger.dd.K0(2131747002), org.telegram.messenger.dd.K0(2131744256), 2131232361, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            k2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            k2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            k2Var.presentFragment(new n(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                            kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            return;
                        case 5:
                            k2Var.presentFragment(new n(1));
                            return;
                        case 6:
                            k2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            k2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 8:
                            k2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            k2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            k2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            k2Var.presentFragment(new oz0());
                            return;
                        case 12:
                            k2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                            kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                            i1Var2.K0();
                            k2Var3.showDialog(i1Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                            kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                            i1Var3.K0();
                            k2Var4.showDialog(i1Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                            kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                            i1Var4.K0();
                            k2Var5.showDialog(i1Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                            kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                            i1Var5.K0();
                            k2Var6.showDialog(i1Var5);
                            return;
                        case 18:
                            k2Var.presentFragment(new ab0());
                            return;
                        case 19:
                            ab0 ab0Var = new ab0();
                            k2Var.presentFragment(ab0Var);
                            ab0Var.a0(3);
                            return;
                        case 20:
                            ab0 ab0Var2 = new ab0();
                            k2Var.presentFragment(ab0Var2);
                            ab0Var2.b0(3);
                            ab0Var2.a0(1);
                            return;
                        case 21:
                            k2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            ab0 ab0Var3 = new ab0();
                            k2Var.presentFragment(ab0Var3);
                            ab0Var3.b0(3);
                            ab0Var3.a0(2);
                            return;
                        case 23:
                            ab0 ab0Var4 = new ab0();
                            k2Var.presentFragment(ab0Var4);
                            ab0Var4.a0(28700);
                            return;
                        case 24:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            ab0 ab0Var5 = new ab0();
                            k2Var.presentFragment(ab0Var5);
                            ab0Var5.b0(28700);
                            ab0Var5.a0(16388);
                            return;
                        case 26:
                            ab0 ab0Var6 = new ab0();
                            k2Var.presentFragment(ab0Var6);
                            ab0Var6.b0(28700);
                            ab0Var6.a0(8200);
                            return;
                        case 27:
                            ab0 ab0Var7 = new ab0();
                            k2Var.presentFragment(ab0Var7);
                            ab0Var7.b0(28700);
                            ab0Var7.a0(4112);
                            return;
                        case 28:
                            ab0 ab0Var8 = new ab0();
                            k2Var.presentFragment(ab0Var8);
                            ab0Var8.a0(360928);
                            return;
                        default:
                            ab0 ab0Var9 = new ab0();
                            k2Var.presentFragment(ab0Var9);
                            ab0Var9.b0(360928);
                            ab0Var9.a0(32);
                            return;
                    }
                }
            });
        } else {
            fy0Var19 = null;
        }
        if (F(currentAccount, 7)) {
            fy0Var20 = new fy0(811, org.telegram.messenger.dd.K0(2131747037), org.telegram.messenger.dd.K0(2131744256), 2131232361, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            k2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            k2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            k2Var.presentFragment(new n(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                            kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            return;
                        case 5:
                            k2Var.presentFragment(new n(1));
                            return;
                        case 6:
                            k2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            k2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 8:
                            k2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            k2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            k2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            k2Var.presentFragment(new oz0());
                            return;
                        case 12:
                            k2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                            kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                            i1Var2.K0();
                            k2Var3.showDialog(i1Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                            kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                            i1Var3.K0();
                            k2Var4.showDialog(i1Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                            kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                            i1Var4.K0();
                            k2Var5.showDialog(i1Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                            kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                            i1Var5.K0();
                            k2Var6.showDialog(i1Var5);
                            return;
                        case 18:
                            k2Var.presentFragment(new ab0());
                            return;
                        case 19:
                            ab0 ab0Var = new ab0();
                            k2Var.presentFragment(ab0Var);
                            ab0Var.a0(3);
                            return;
                        case 20:
                            ab0 ab0Var2 = new ab0();
                            k2Var.presentFragment(ab0Var2);
                            ab0Var2.b0(3);
                            ab0Var2.a0(1);
                            return;
                        case 21:
                            k2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            ab0 ab0Var3 = new ab0();
                            k2Var.presentFragment(ab0Var3);
                            ab0Var3.b0(3);
                            ab0Var3.a0(2);
                            return;
                        case 23:
                            ab0 ab0Var4 = new ab0();
                            k2Var.presentFragment(ab0Var4);
                            ab0Var4.a0(28700);
                            return;
                        case 24:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            ab0 ab0Var5 = new ab0();
                            k2Var.presentFragment(ab0Var5);
                            ab0Var5.b0(28700);
                            ab0Var5.a0(16388);
                            return;
                        case 26:
                            ab0 ab0Var6 = new ab0();
                            k2Var.presentFragment(ab0Var6);
                            ab0Var6.b0(28700);
                            ab0Var6.a0(8200);
                            return;
                        case 27:
                            ab0 ab0Var7 = new ab0();
                            k2Var.presentFragment(ab0Var7);
                            ab0Var7.b0(28700);
                            ab0Var7.a0(4112);
                            return;
                        case 28:
                            ab0 ab0Var8 = new ab0();
                            k2Var.presentFragment(ab0Var8);
                            ab0Var8.a0(360928);
                            return;
                        default:
                            ab0 ab0Var9 = new ab0();
                            k2Var.presentFragment(ab0Var9);
                            ab0Var9.b0(360928);
                            ab0Var9.a0(32);
                            return;
                    }
                }
            });
        } else {
            fy0Var20 = null;
        }
        if (F(currentAccount, 10)) {
            fy0Var21 = new fy0(812, org.telegram.messenger.dd.K0(2131747035), org.telegram.messenger.dd.K0(2131744256), 2131232361, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            k2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            k2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            k2Var.presentFragment(new n(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                            kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            return;
                        case 5:
                            k2Var.presentFragment(new n(1));
                            return;
                        case 6:
                            k2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            k2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 8:
                            k2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            k2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            k2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            k2Var.presentFragment(new oz0());
                            return;
                        case 12:
                            k2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                            kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                            i1Var2.K0();
                            k2Var3.showDialog(i1Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                            kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                            i1Var3.K0();
                            k2Var4.showDialog(i1Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                            kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                            i1Var4.K0();
                            k2Var5.showDialog(i1Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                            kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                            i1Var5.K0();
                            k2Var6.showDialog(i1Var5);
                            return;
                        case 18:
                            k2Var.presentFragment(new ab0());
                            return;
                        case 19:
                            ab0 ab0Var = new ab0();
                            k2Var.presentFragment(ab0Var);
                            ab0Var.a0(3);
                            return;
                        case 20:
                            ab0 ab0Var2 = new ab0();
                            k2Var.presentFragment(ab0Var2);
                            ab0Var2.b0(3);
                            ab0Var2.a0(1);
                            return;
                        case 21:
                            k2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            ab0 ab0Var3 = new ab0();
                            k2Var.presentFragment(ab0Var3);
                            ab0Var3.b0(3);
                            ab0Var3.a0(2);
                            return;
                        case 23:
                            ab0 ab0Var4 = new ab0();
                            k2Var.presentFragment(ab0Var4);
                            ab0Var4.a0(28700);
                            return;
                        case 24:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            ab0 ab0Var5 = new ab0();
                            k2Var.presentFragment(ab0Var5);
                            ab0Var5.b0(28700);
                            ab0Var5.a0(16388);
                            return;
                        case 26:
                            ab0 ab0Var6 = new ab0();
                            k2Var.presentFragment(ab0Var6);
                            ab0Var6.b0(28700);
                            ab0Var6.a0(8200);
                            return;
                        case 27:
                            ab0 ab0Var7 = new ab0();
                            k2Var.presentFragment(ab0Var7);
                            ab0Var7.b0(28700);
                            ab0Var7.a0(4112);
                            return;
                        case 28:
                            ab0 ab0Var8 = new ab0();
                            k2Var.presentFragment(ab0Var8);
                            ab0Var8.a0(360928);
                            return;
                        default:
                            ab0 ab0Var9 = new ab0();
                            k2Var.presentFragment(ab0Var9);
                            ab0Var9.b0(360928);
                            ab0Var9.a0(32);
                            return;
                    }
                }
            });
        } else {
            fy0Var21 = null;
        }
        if (F(currentAccount, 12)) {
            fy0Var22 = new fy0(813, org.telegram.messenger.dd.K0(2131747019), org.telegram.messenger.dd.K0(2131744256), 2131232361, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            k2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            k2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            k2Var.presentFragment(new n(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                            kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            return;
                        case 5:
                            k2Var.presentFragment(new n(1));
                            return;
                        case 6:
                            k2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            k2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 8:
                            k2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            k2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            k2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            k2Var.presentFragment(new oz0());
                            return;
                        case 12:
                            k2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                            kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                            i1Var2.K0();
                            k2Var3.showDialog(i1Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                            kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                            i1Var3.K0();
                            k2Var4.showDialog(i1Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                            kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                            i1Var4.K0();
                            k2Var5.showDialog(i1Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                            kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                            i1Var5.K0();
                            k2Var6.showDialog(i1Var5);
                            return;
                        case 18:
                            k2Var.presentFragment(new ab0());
                            return;
                        case 19:
                            ab0 ab0Var = new ab0();
                            k2Var.presentFragment(ab0Var);
                            ab0Var.a0(3);
                            return;
                        case 20:
                            ab0 ab0Var2 = new ab0();
                            k2Var.presentFragment(ab0Var2);
                            ab0Var2.b0(3);
                            ab0Var2.a0(1);
                            return;
                        case 21:
                            k2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            ab0 ab0Var3 = new ab0();
                            k2Var.presentFragment(ab0Var3);
                            ab0Var3.b0(3);
                            ab0Var3.a0(2);
                            return;
                        case 23:
                            ab0 ab0Var4 = new ab0();
                            k2Var.presentFragment(ab0Var4);
                            ab0Var4.a0(28700);
                            return;
                        case 24:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            ab0 ab0Var5 = new ab0();
                            k2Var.presentFragment(ab0Var5);
                            ab0Var5.b0(28700);
                            ab0Var5.a0(16388);
                            return;
                        case 26:
                            ab0 ab0Var6 = new ab0();
                            k2Var.presentFragment(ab0Var6);
                            ab0Var6.b0(28700);
                            ab0Var6.a0(8200);
                            return;
                        case 27:
                            ab0 ab0Var7 = new ab0();
                            k2Var.presentFragment(ab0Var7);
                            ab0Var7.b0(28700);
                            ab0Var7.a0(4112);
                            return;
                        case 28:
                            ab0 ab0Var8 = new ab0();
                            k2Var.presentFragment(ab0Var8);
                            ab0Var8.a0(360928);
                            return;
                        default:
                            ab0 ab0Var9 = new ab0();
                            k2Var.presentFragment(ab0Var9);
                            ab0Var9.b0(360928);
                            ab0Var9.a0(32);
                            return;
                    }
                }
            });
        } else {
            fy0Var22 = null;
        }
        fy0 fy0Var124 = new fy0(900, org.telegram.messenger.dd.K0(2131747081), null, 2131232018, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        return;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        return;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        return;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        return;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        return;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        return;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        return;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        return;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        return;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        return;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        return;
                }
            }
        });
        fy0Var124.a("tg://settings/power-saving");
        fy0 fy0Var125 = new fy0(901, org.telegram.messenger.dd.K0(2131748860), org.telegram.messenger.dd.K0(2131747081), 2131232018, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        return;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        return;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        return;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        return;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        return;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        return;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        return;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        return;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        return;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        return;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        return;
                }
            }
        });
        fy0Var125.a("tg://settings/power-saving/stickers");
        fy0 fy0Var126 = new fy0(902, org.telegram.messenger.dd.K0(2131748872), null, org.telegram.messenger.dd.K0(2131747081), org.telegram.messenger.dd.K0(2131748860), 2131232018, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        return;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        return;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        return;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        return;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        return;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        return;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        return;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        return;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        return;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        return;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        return;
                }
            }
        });
        fy0 fy0Var127 = new fy0(903, org.telegram.messenger.dd.K0(2131748874), null, org.telegram.messenger.dd.K0(2131747081), org.telegram.messenger.dd.K0(2131748860), 2131232018, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        return;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        return;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        return;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        return;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        return;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        return;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        return;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        return;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        return;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        return;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        return;
                }
            }
        });
        fy0 fy0Var128 = new fy0(904, org.telegram.messenger.dd.K0(2131748865), org.telegram.messenger.dd.K0(2131747081), 2131232018, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        return;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        return;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        return;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        return;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        return;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        return;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        return;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        return;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        return;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        return;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        return;
                }
            }
        });
        fy0Var128.a("tg://settings/power-saving/emoji");
        fy0 fy0Var129 = new fy0(905, org.telegram.messenger.dd.K0(2131748872), null, org.telegram.messenger.dd.K0(2131747081), org.telegram.messenger.dd.K0(2131748865), 2131232018, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        return;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        return;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        return;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        return;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        return;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        return;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        return;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        return;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        return;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        return;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        return;
                }
            }
        });
        fy0 fy0Var130 = new fy0(906, org.telegram.messenger.dd.K0(2131748871), null, org.telegram.messenger.dd.K0(2131747081), org.telegram.messenger.dd.K0(2131748865), 2131232018, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        return;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        return;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        return;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        return;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        return;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        return;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        return;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        return;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        return;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        return;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        return;
                }
            }
        });
        fy0 fy0Var131 = new fy0(907, org.telegram.messenger.dd.K0(2131748874), null, org.telegram.messenger.dd.K0(2131747081), org.telegram.messenger.dd.K0(2131748865), 2131232018, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        return;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        return;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        return;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        return;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        return;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        return;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        return;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        return;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        return;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        return;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        return;
                }
            }
        });
        fy0 fy0Var132 = new fy0(908, org.telegram.messenger.dd.K0(2131748866), org.telegram.messenger.dd.K0(2131747081), 2131232018, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        return;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        return;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        return;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        return;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        return;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        return;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        return;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        return;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        return;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        return;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        return;
                }
            }
        });
        fy0Var132.a("tg://settings/power-saving/effects");
        fy0 fy0Var133 = new fy0(909, org.telegram.messenger.dd.K0(2131748869), null, org.telegram.messenger.dd.K0(2131747081), org.telegram.messenger.dd.K0(2131748866), 2131232018, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        return;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        return;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        return;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        return;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        return;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        return;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        return;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        return;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        return;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        return;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        return;
                }
            }
        });
        fy0Var133.a("tg://settings/power-saving/background");
        fy0 fy0Var134 = new fy0(910, org.telegram.messenger.dd.K0(2131748857), null, org.telegram.messenger.dd.K0(2131747081), org.telegram.messenger.dd.K0(2131748866), 2131232018, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        return;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        return;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        return;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        return;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        return;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.f35741s;
                            if (i11 < arrayList.size()) {
                                if (((va0) arrayList.get(i11)).f42465f == 1) {
                                    ab0Var8.f35736b.e1(new i2.q(ab0Var8, i11, 14), 700, true);
                                    return;
                                }
                                i11++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        return;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        return;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        return;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        return;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        return;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        fy0 fy0Var135 = new fy0(911, org.telegram.messenger.dd.K0(2131748861), null, org.telegram.messenger.dd.K0(2131747081), org.telegram.messenger.dd.K0(2131748866), 2131232018, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        return;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        return;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        return;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        return;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        return;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.f35741s;
                            if (i11 < arrayList.size()) {
                                if (((va0) arrayList.get(i11)).f42465f == 1) {
                                    ab0Var8.f35736b.e1(new i2.q(ab0Var8, i11, 14), 700, true);
                                    return;
                                }
                                i11++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        return;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        return;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        return;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        return;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        return;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        if (org.telegram.messenger.uz.o() >= 1) {
            fy0Var23 = new fy0(326, org.telegram.messenger.dd.K0(2131748868), null, org.telegram.messenger.dd.K0(2131747081), org.telegram.messenger.dd.K0(2131748866), 2131232018, new Runnable() {
                @Override
                public final void run() {
                    int i10 = r1;
                    int i11 = 0;
                    org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                    switch (i10) {
                        case 0:
                            ab0 ab0Var = new ab0();
                            k2Var2.presentFragment(ab0Var);
                            ab0Var.b0(360928);
                            ab0Var.a0(64);
                            return;
                        case 1:
                            ab0 ab0Var2 = new ab0();
                            k2Var2.presentFragment(ab0Var2);
                            ab0Var2.b0(360928);
                            ab0Var2.a0(128);
                            return;
                        case 2:
                            k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            ab0 ab0Var3 = new ab0();
                            k2Var2.presentFragment(ab0Var3);
                            ab0Var3.b0(360928);
                            ab0Var3.a0(256);
                            return;
                        case 4:
                            ab0 ab0Var4 = new ab0();
                            k2Var2.presentFragment(ab0Var4);
                            ab0Var4.b0(360928);
                            ab0Var4.a0(32768);
                            return;
                        case 5:
                            ab0 ab0Var5 = new ab0();
                            k2Var2.presentFragment(ab0Var5);
                            ab0Var5.a0(512);
                            return;
                        case 6:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            ab0 ab0Var6 = new ab0();
                            k2Var2.presentFragment(ab0Var6);
                            ab0Var6.a0(1024);
                            return;
                        case 8:
                            ab0 ab0Var7 = new ab0();
                            k2Var2.presentFragment(ab0Var7);
                            ab0Var7.a0(2048);
                            return;
                        case 9:
                            ab0 ab0Var8 = new ab0();
                            k2Var2.presentFragment(ab0Var8);
                            while (true) {
                                ArrayList arrayList = ab0Var8.f35741s;
                                if (i11 < arrayList.size()) {
                                    if (((va0) arrayList.get(i11)).f42465f == 1) {
                                        ab0Var8.f35736b.e1(new i2.q(ab0Var8, i11, 14), 700, true);
                                        return;
                                    }
                                    i11++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            return;
                        case 14:
                            k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                            return;
                        case 15:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                            return;
                        case 16:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                            return;
                        case 17:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            k2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            k2Var2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            k2Var2.presentFragment(PasscodeActivity.p0());
                            return;
                        case 23:
                            kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                            i1Var2.K0();
                            k2Var2.showDialog(i1Var2);
                            return;
                        case 24:
                            k2Var2.presentFragment(new f(3));
                            return;
                        case 25:
                            k2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            zu0 zu0Var = new zu0();
                            zu0Var.getMessagesController().F0(true);
                            k2Var2.presentFragment(zu0Var);
                            return;
                        case 27:
                            k2Var2.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            fy0Var23 = null;
        }
        fy0 fy0Var136 = new fy0(912, org.telegram.messenger.dd.K0(2131748862), null, org.telegram.messenger.dd.K0(2131747081), org.telegram.messenger.dd.K0(2131748866), 2131232018, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        return;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        return;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        return;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        return;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        return;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.f35741s;
                            if (i11 < arrayList.size()) {
                                if (((va0) arrayList.get(i11)).f42465f == 1) {
                                    ab0Var8.f35736b.e1(new i2.q(ab0Var8, i11, 14), 700, true);
                                    return;
                                }
                                i11++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        return;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        return;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        return;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        return;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        return;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        fy0 fy0Var137 = new fy0(913, org.telegram.messenger.dd.K0(2131748867), org.telegram.messenger.dd.K0(2131747081), 2131232018, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        return;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        return;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        return;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        return;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        return;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.f35741s;
                            if (i11 < arrayList.size()) {
                                if (((va0) arrayList.get(i11)).f42465f == 1) {
                                    ab0Var8.f35736b.e1(new i2.q(ab0Var8, i11, 14), 700, true);
                                    return;
                                }
                                i11++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        return;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        return;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        return;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        return;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        return;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        fy0Var137.a("tg://settings/power-saving/call-animations");
        fy0 fy0Var138 = new fy0(214, org.telegram.messenger.dd.K0(2131748870), org.telegram.messenger.dd.K0(2131747081), 2131232018, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        return;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        return;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        return;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        return;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        return;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.f35741s;
                            if (i11 < arrayList.size()) {
                                if (((va0) arrayList.get(i11)).f42465f == 1) {
                                    ab0Var8.f35736b.e1(new i2.q(ab0Var8, i11, 14), 700, true);
                                    return;
                                }
                                i11++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        return;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        return;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        return;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        return;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        return;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        fy0Var138.a("tg://settings/power-saving/videos");
        fy0 fy0Var139 = new fy0(213, org.telegram.messenger.dd.K0(2131748873), org.telegram.messenger.dd.K0(2131747081), 2131232018, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        return;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        return;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        return;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        return;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        return;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.f35741s;
                            if (i11 < arrayList.size()) {
                                if (((va0) arrayList.get(i11)).f42465f == 1) {
                                    ab0Var8.f35736b.e1(new i2.q(ab0Var8, i11, 14), 700, true);
                                    return;
                                }
                                i11++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        return;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        return;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        return;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        return;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        return;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        fy0Var139.a("tg://settings/power-saving/gifs");
        fy0 fy0Var140 = new fy0(914, org.telegram.messenger.dd.K0(2131748856), org.telegram.messenger.dd.K0(2131747081), 2131232018, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        return;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        return;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        return;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        return;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        return;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.f35741s;
                            if (i11 < arrayList.size()) {
                                if (((va0) arrayList.get(i11)).f42465f == 1) {
                                    ab0Var8.f35736b.e1(new i2.q(ab0Var8, i11, 14), 700, true);
                                    return;
                                }
                                i11++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        return;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        return;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        return;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        return;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        return;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        fy0Var140.a("tg://settings/power-saving/transitions");
        fy0 fy0Var141 = new fy0(400, org.telegram.messenger.dd.K0(2131749064), 2131232029, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        return;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        return;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        return;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        return;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        return;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.f35741s;
                            if (i11 < arrayList.size()) {
                                if (((va0) arrayList.get(i11)).f42465f == 1) {
                                    ab0Var8.f35736b.e1(new i2.q(ab0Var8, i11, 14), 700, true);
                                    return;
                                }
                                i11++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        return;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        return;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        return;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        return;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        return;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        fy0Var141.a("tg://settings/language");
        fy0 fy0Var142 = new fy0(405, org.telegram.messenger.dd.K0(2131745345), org.telegram.messenger.dd.K0(2131749064), 2131232029, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        return;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        return;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        return;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        return;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        return;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.f35741s;
                            if (i11 < arrayList.size()) {
                                if (((va0) arrayList.get(i11)).f42465f == 1) {
                                    ab0Var8.f35736b.e1(new i2.q(ab0Var8, i11, 14), 700, true);
                                    return;
                                }
                                i11++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        return;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        return;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        return;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        return;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        return;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        fy0Var142.a("tg://settings/language/show-button");
        if (org.telegram.messenger.wp.r1(currentAccount).S1().s()) {
            fy0 fy0Var143 = new fy0(406, org.telegram.messenger.dd.K0(2131751359), org.telegram.messenger.dd.K0(2131749064), 2131232029, new Runnable() {
                @Override
                public final void run() {
                    int i10 = r1;
                    int i11 = 0;
                    org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                    switch (i10) {
                        case 0:
                            ab0 ab0Var = new ab0();
                            k2Var2.presentFragment(ab0Var);
                            ab0Var.b0(360928);
                            ab0Var.a0(64);
                            return;
                        case 1:
                            ab0 ab0Var2 = new ab0();
                            k2Var2.presentFragment(ab0Var2);
                            ab0Var2.b0(360928);
                            ab0Var2.a0(128);
                            return;
                        case 2:
                            k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            ab0 ab0Var3 = new ab0();
                            k2Var2.presentFragment(ab0Var3);
                            ab0Var3.b0(360928);
                            ab0Var3.a0(256);
                            return;
                        case 4:
                            ab0 ab0Var4 = new ab0();
                            k2Var2.presentFragment(ab0Var4);
                            ab0Var4.b0(360928);
                            ab0Var4.a0(32768);
                            return;
                        case 5:
                            ab0 ab0Var5 = new ab0();
                            k2Var2.presentFragment(ab0Var5);
                            ab0Var5.a0(512);
                            return;
                        case 6:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            ab0 ab0Var6 = new ab0();
                            k2Var2.presentFragment(ab0Var6);
                            ab0Var6.a0(1024);
                            return;
                        case 8:
                            ab0 ab0Var7 = new ab0();
                            k2Var2.presentFragment(ab0Var7);
                            ab0Var7.a0(2048);
                            return;
                        case 9:
                            ab0 ab0Var8 = new ab0();
                            k2Var2.presentFragment(ab0Var8);
                            while (true) {
                                ArrayList arrayList = ab0Var8.f35741s;
                                if (i11 < arrayList.size()) {
                                    if (((va0) arrayList.get(i11)).f42465f == 1) {
                                        ab0Var8.f35736b.e1(new i2.q(ab0Var8, i11, 14), 700, true);
                                        return;
                                    }
                                    i11++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            return;
                        case 14:
                            k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                            return;
                        case 15:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                            return;
                        case 16:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                            return;
                        case 17:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            k2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            k2Var2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            k2Var2.presentFragment(PasscodeActivity.p0());
                            return;
                        case 23:
                            kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                            i1Var2.K0();
                            k2Var2.showDialog(i1Var2);
                            return;
                        case 24:
                            k2Var2.presentFragment(new f(3));
                            return;
                        case 25:
                            k2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            zu0 zu0Var = new zu0();
                            zu0Var.getMessagesController().F0(true);
                            k2Var2.presentFragment(zu0Var);
                            return;
                        case 27:
                            k2Var2.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
            fy0Var143.a("tg://settings/language/do-not-translate");
            fy0Var44 = fy0Var143;
        }
        fy0 fy0Var144 = new fy0(402, org.telegram.messenger.dd.K0(2131753986), org.telegram.messenger.dd.K0(2131745497), 2131232028, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        return;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        return;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        return;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        return;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        return;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.f35741s;
                            if (i11 < arrayList.size()) {
                                if (((va0) arrayList.get(i11)).f42465f == 1) {
                                    ab0Var8.f35736b.e1(new i2.q(ab0Var8, i11, 14), 700, true);
                                    return;
                                }
                                i11++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        return;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        return;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        return;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        return;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        return;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        fy0Var144.a("tg://settings/ask-question");
        fy0 fy0Var145 = new fy0(403, org.telegram.messenger.dd.K0(2131744267), org.telegram.messenger.dd.K0(2131745497), 2131232028, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        return;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        return;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        return;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        return;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        return;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.f35741s;
                            if (i11 < arrayList.size()) {
                                if (((va0) arrayList.get(i11)).f42465f == 1) {
                                    ab0Var8.f35736b.e1(new i2.q(ab0Var8, i11, 14), 700, true);
                                    return;
                                }
                                i11++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        return;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        return;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        return;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        return;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        return;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        fy0Var145.a("tg://settings/faq");
        fy0 fy0Var146 = new fy0(404, org.telegram.messenger.dd.K0(2131746798), org.telegram.messenger.dd.K0(2131745497), 2131232028, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        return;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        return;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        return;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        return;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        return;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.f35741s;
                            if (i11 < arrayList.size()) {
                                if (((va0) arrayList.get(i11)).f42465f == 1) {
                                    ab0Var8.f35736b.e1(new i2.q(ab0Var8, i11, 14), 700, true);
                                    return;
                                }
                                i11++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        return;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        return;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        return;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        return;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        return;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        return;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        fy0Var146.a("tg://settings/privacy-policy");
        return new fy0[]{fy0Var24, fy0Var25, fy0Var26, fy0Var27, fy0Var28, fy0Var29, fy0Var30, fy0Var31, fy0Var32, fy0Var33, fy0Var34, fy0Var35, fy0Var36, fy0Var37, fy0Var38, fy0Var39, fy0Var40, fy0Var, fy0Var42, fy0Var43, fy0Var2, fy0Var45, fy0Var46, fy0Var47, fy0Var48, fy0Var49, fy0Var50, fy0Var51, fy0Var52, fy0Var53, fy0Var3, fy0Var4, fy0Var55, fy0Var56, fy0Var57, fy0Var58, fy0Var59, fy0Var60, fy0Var61, fy0Var62, fy0Var63, fy0Var64, fy0Var65, fy0Var66, fy0Var67, fy0Var68, fy0Var69, fy0Var70, fy0Var71, fy0Var72, fy0Var73, fy0Var74, fy0Var75, fy0Var76, fy0Var77, fy0Var78, fy0Var79, fy0Var80, fy0Var81, fy0Var82, fy0Var83, fy0Var84, fy0Var85, fy0Var86, fy0Var87, fy0Var88, fy0Var89, fy0Var90, fy0Var91, fy0Var92, fy0Var93, fy0Var94, fy0Var95, fy0Var96, fy0Var97, fy0Var98, fy0Var99, fy0Var100, fy0Var101, fy0Var102, fy0Var103, fy0Var104, fy0Var105, fy0Var106, fy0Var107, fy0Var108, fy0Var109, fy0Var110, fy0Var111, fy0Var112, fy0Var113, fy0Var6, fy0Var115, fy0Var7, fy0Var117, fy0Var8, fy0Var119, fy0Var120, fy0Var121, fy0Var122, fy0Var5, fy0Var9, fy0Var10, fy0Var11, fy0Var12, fy0Var13, fy0Var14, fy0Var15, fy0Var16, fy0Var17, fy0Var18, fy0Var19, fy0Var20, fy0Var21, fy0Var22, fy0Var124, fy0Var125, fy0Var126, fy0Var127, fy0Var128, fy0Var129, fy0Var130, fy0Var131, fy0Var132, fy0Var133, fy0Var134, fy0Var135, fy0Var23, fy0Var136, fy0Var137, fy0Var138, fy0Var139, fy0Var140, fy0Var141, fy0Var142, fy0Var44, fy0Var144, fy0Var145, fy0Var146};
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47912f == 0) {
            return true;
        }
        return false;
    }

    public final void E(Object obj) {
        ArrayList arrayList = this.f37591w;
        int indexOf = arrayList.indexOf(obj);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
        }
        arrayList.add(0, obj);
        if (!this.f37592x) {
            f();
        }
        if (arrayList.size() > 20) {
            a1.g.x(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof fy0) {
                ((fy0) obj2).f37259g = i10;
            } else if (obj2 instanceof org.telegram.messenger.ip) {
                ((org.telegram.messenger.ip) obj2).d = i10;
            }
            linkedHashSet.add(obj2.toString());
        }
        org.telegram.messenger.wp.d1().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i10 = this.f37587f;
        TLRPC.WebPage webPage = org.telegram.messenger.wp.r1(i10).f19220q2;
        this.E = webPage;
        if (webPage != null) {
            this.d.addAll(org.telegram.messenger.wp.r1(i10).f19212p2);
        }
        if (this.E == null && !this.F) {
            this.F = true;
            TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
            tL_messages_getWebPage.url = org.telegram.messenger.dd.L0(2131744265, null);
            tL_messages_getWebPage.hash = 0;
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getWebPage, new k(this, 21));
        }
    }

    public final void I(String str) {
        this.D = str;
        if (this.f37593y != null) {
            Utilities.f14523g.a(this.f37593y);
            this.f37593y = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.f37592x = false;
            this.f37589r.clear();
            this.f37590s.clear();
            this.f37588n.clear();
            org.telegram.ui.ActionBar.k2 k2Var = this.e;
            if (k2Var instanceof ProfileActivity) {
                try {
                    ((ProfileActivity) k2Var).O.f25947b.getImageReceiver().P0(false);
                    ((ProfileActivity) this.e).O.d.setText(org.telegram.messenger.dd.L0(2131745495, null));
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
            f();
            return;
        }
        org.telegram.messenger.r5 r5Var = Utilities.f14523g;
        hr0 hr0Var = new hr0(21, this, str);
        this.f37593y = hr0Var;
        r5Var.d(hr0Var, 300L);
    }

    public final void J() {
        String[] strArr;
        fy0 fy0Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            fy0[] fy0VarArr = this.f37586c;
            if (i10 >= fy0VarArr.length) {
                break;
            }
            fy0 fy0Var2 = fy0VarArr[i10];
            if (fy0Var2 != null) {
                hashMap.put(Integer.valueOf(fy0Var2.f37258f), this.f37586c[i10]);
            }
            i10++;
        }
        Set<String> stringSet = org.telegram.messenger.wp.d1().getStringSet("settingsSearchRecent2", null);
        ArrayList arrayList = this.f37591w;
        if (stringSet != null) {
            for (String str : stringSet) {
                try {
                    SerializedData serializedData = new SerializedData(Utilities.v(str));
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
                        org.telegram.messenger.ip ipVar = new org.telegram.messenger.ip(readString, strArr, serializedData.readString(false));
                        ipVar.d = readInt32;
                        arrayList.add(ipVar);
                    } else if (readInt322 == 1 && (fy0Var = (fy0) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        fy0Var.f37259g = readInt32;
                        arrayList.add(fy0Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new dx0(this, 1));
    }

    @Override
    public final int b() {
        int size;
        int i10 = 0;
        if (this.f37592x) {
            int size2 = this.f37589r.size();
            if (!this.f37590s.isEmpty()) {
                i10 = this.f37590s.size() + 1;
            }
            return size2 + i10;
        }
        ArrayList arrayList = this.f37591w;
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
    public final int d(int i10) {
        if (this.f37592x) {
            if (i10 < this.f37589r.size() || i10 != this.f37589r.size()) {
                return 0;
            }
        } else {
            ArrayList arrayList = this.f37591w;
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
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        int i12 = c1Var.f47912f;
        View view = c1Var.f47909a;
        fy0 fy0Var = null;
        boolean z10 = true;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    ((org.telegram.ui.Cells.p4) view).setText(org.telegram.messenger.dd.L0(2131745487, null));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.z3) view).setText(org.telegram.messenger.dd.L0(2131745500, null));
            return;
        }
        org.telegram.ui.Cells.z6 z6Var = (org.telegram.ui.Cells.z6) view;
        boolean z11 = false;
        if (this.f37592x) {
            if (i10 < this.f37589r.size()) {
                fy0 fy0Var2 = (fy0) this.f37589r.get(i10);
                if (i10 > 0) {
                    fy0Var = (fy0) this.f37589r.get(i10 - 1);
                }
                if (fy0Var != null && fy0Var.e == fy0Var2.e) {
                    i11 = 0;
                } else {
                    i11 = fy0Var2.e;
                }
                CharSequence charSequence = (CharSequence) this.f37588n.get(i10);
                String[] strArr = fy0Var2.d;
                if (i10 >= this.f37589r.size() - 1) {
                    z10 = false;
                }
                z6Var.b(charSequence, strArr, i11, z10);
                return;
            }
            int e = sc.e.e(1, i10, this.f37589r);
            CharSequence charSequence2 = (CharSequence) this.f37588n.get(this.f37589r.size() + e);
            String[] strArr2 = ((org.telegram.messenger.ip) this.f37590s.get(e)).f16320b;
            if (e < this.f37589r.size() - 1) {
                z11 = true;
            }
            z6Var.a(charSequence2, strArr2, true, z11);
            return;
        }
        ArrayList arrayList = this.f37591w;
        if (!arrayList.isEmpty()) {
            i10--;
        }
        if (i10 < arrayList.size()) {
            Object obj = arrayList.get(i10);
            if (obj instanceof fy0) {
                fy0 fy0Var3 = (fy0) obj;
                String str = fy0Var3.f37255a;
                String[] strArr3 = fy0Var3.d;
                if (i10 >= arrayList.size() - 1) {
                    z10 = false;
                }
                z6Var.a(str, strArr3, false, z10);
                return;
            } else if (obj instanceof org.telegram.messenger.ip) {
                org.telegram.messenger.ip ipVar = (org.telegram.messenger.ip) obj;
                String str2 = ipVar.f16319a;
                String[] strArr4 = ipVar.f16320b;
                if (i10 < arrayList.size() - 1) {
                    z11 = true;
                }
                z6Var.a(str2, strArr4, true, z11);
                return;
            } else {
                return;
            }
        }
        int e7 = sc.e.e(1, i10, arrayList);
        org.telegram.messenger.ip ipVar2 = (org.telegram.messenger.ip) this.d.get(e7);
        String str3 = ipVar2.f16319a;
        String[] strArr5 = ipVar2.f16320b;
        if (e7 < arrayList.size() - 1) {
            z11 = true;
        }
        z6Var.a(str3, strArr5, true, z11);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View z6Var;
        Context context = this.h;
        if (i10 != 0) {
            if (i10 != 1) {
                z6Var = new org.telegram.ui.Cells.p4(context, 16);
            } else {
                z6Var = new org.telegram.ui.Cells.z3(context, null);
            }
        } else {
            z6Var = new org.telegram.ui.Cells.z6(context);
        }
        z6Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.c1(z6Var);
    }
}
