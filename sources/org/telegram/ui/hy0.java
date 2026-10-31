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
public class hy0 extends org.telegram.ui.Components.sk0 {
    public String D;
    public TLRPC.WebPage E;
    public boolean F;
    public gy0[] f38053c;
    public final org.telegram.ui.ActionBar.k2 e;
    public final int f38054f;
    public final Context h;
    public boolean f38059x;
    public et0 f38060y;
    public final ArrayList d = new ArrayList();
    public ArrayList f38055n = new ArrayList();
    public ArrayList f38056r = new ArrayList();
    public ArrayList f38057s = new ArrayList();
    public final ArrayList f38058w = new ArrayList();

    public hy0(Context context, org.telegram.ui.ActionBar.k2 k2Var) {
        this.e = k2Var;
        this.f38054f = k2Var.getCurrentAccount();
        this.h = context;
        this.f38053c = H(k2Var);
        J();
    }

    public static boolean F(int i10, int i11) {
        if (org.telegram.messenger.vp.r1(i10).A3() && !org.telegram.messenger.d20.i(i10).q()) {
            return false;
        }
        if (i11 != -1 && org.telegram.messenger.vp.r1(i10).N0.get(i11, -1) == -1) {
            return false;
        }
        return true;
    }

    public static gy0[] H(final org.telegram.ui.ActionBar.k2 k2Var) {
        gy0 gy0Var;
        gy0 gy0Var2;
        gy0 gy0Var3;
        gy0 gy0Var4;
        gy0 gy0Var5;
        gy0 gy0Var6;
        gy0 gy0Var7;
        gy0 gy0Var8;
        gy0 gy0Var9;
        gy0 gy0Var10;
        gy0 gy0Var11;
        gy0 gy0Var12;
        gy0 gy0Var13;
        gy0 gy0Var14;
        gy0 gy0Var15;
        gy0 gy0Var16;
        gy0 gy0Var17;
        gy0 gy0Var18;
        gy0 gy0Var19;
        gy0 gy0Var20;
        gy0 gy0Var21;
        gy0 gy0Var22;
        gy0 gy0Var23;
        final int currentAccount = k2Var.getCurrentAccount();
        gy0 gy0Var24 = new gy0(500, org.telegram.messenger.cd.K0(2131751265), 0, new et0(19, k2Var, k2Var.getResourceProvider()));
        gy0 gy0Var25 = new gy0(501, org.telegram.messenger.cd.K0(2131752537), 0, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        return;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        return;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        return;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        return;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        return;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.f36162s;
                            if (i11 < arrayList.size()) {
                                if (((wa0) arrayList.get(i11)).f42913f == 1) {
                                    bb0Var8.f36157b.e1(new i2.q(bb0Var8, i11, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var25.a("tg://settings/edit/change-number");
        gy0 gy0Var26 = new gy0(502, org.telegram.messenger.cd.K0(2131754468), 0, new Runnable() {
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
                                if (org.telegram.messenger.d20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new hf0(i10));
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
                        k2Var.presentFragment(new mu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        gy0Var26.a("tg://settings/edit/add-account");
        gy0 gy0Var27 = new gy0(1, org.telegram.messenger.cd.K0(2131747938), 2131232261, new Runnable() {
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
                                if (org.telegram.messenger.d20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new hf0(i10));
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
                        k2Var.presentFragment(new mu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        gy0Var27.a("tg://settings/notifications");
        gy0 gy0Var28 = new gy0(2, org.telegram.messenger.cd.K0(2131747894), org.telegram.messenger.cd.K0(2131747938), 2131232261, new Runnable() {
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
                                if (org.telegram.messenger.d20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new hf0(i10));
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
                        k2Var.presentFragment(new mu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        gy0Var28.a("tg://settings/notifications/private-chats");
        gy0 gy0Var29 = new gy0(3, org.telegram.messenger.cd.K0(2131747923), org.telegram.messenger.cd.K0(2131747938), 2131232261, new Runnable() {
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
        gy0Var29.a("tg://settings/notifications/groups");
        gy0 gy0Var30 = new gy0(4, org.telegram.messenger.cd.K0(2131747937), org.telegram.messenger.cd.K0(2131747938), 2131232261, new ch0(7, k2Var));
        gy0Var30.a("tg://settings/notifications/channels");
        gy0 gy0Var31 = new gy0(5, org.telegram.messenger.cd.K0(2131743305), "callsSectionRow", org.telegram.messenger.cd.K0(2131747938), 2131232261, new ch0(19, k2Var));
        gy0 gy0Var32 = new gy0(6, org.telegram.messenger.cd.K0(2131753733), "badgeNumberSection", org.telegram.messenger.cd.K0(2131747938), 2131232261, new Runnable() {
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        return;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        return;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        return;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        return;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        return;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        return;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        return;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        return;
                }
            }
        });
        gy0 gy0Var33 = new gy0(7, org.telegram.messenger.cd.K0(2131749228), "inappSectionRow", org.telegram.messenger.cd.K0(2131747938), 2131232261, new Runnable() {
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        return;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        return;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        return;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        return;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        return;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        return;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        return;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        return;
                }
            }
        });
        gy0 gy0Var34 = new gy0(8, org.telegram.messenger.cd.K0(2131751790), "contactJoinedRow", org.telegram.messenger.cd.K0(2131747938), 2131232261, new ch0(23, k2Var));
        gy0Var34.a("tg://settings/notifications/new-contacts");
        gy0 gy0Var35 = new gy0(9, org.telegram.messenger.cd.K0(2131747244), "pinnedMessageRow", org.telegram.messenger.cd.K0(2131747938), 2131232261, new Runnable() {
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        return;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        return;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        return;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        return;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        return;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        return;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        return;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        return;
                }
            }
        });
        gy0Var35.a("tg://settings/notifications/pinned-messages");
        gy0 gy0Var36 = new gy0(10, org.telegram.messenger.cd.K0(2131746129), "resetNotificationsRow", org.telegram.messenger.cd.K0(2131747938), 2131232261, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        return;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        return;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        return;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        return;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        return;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.f36162s;
                            if (i11 < arrayList.size()) {
                                if (((wa0) arrayList.get(i11)).f42913f == 1) {
                                    bb0Var8.f36157b.e1(new i2.q(bb0Var8, i11, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var36.a("tg://settings/notifications/reset");
        gy0 gy0Var37 = new gy0(11, org.telegram.messenger.cd.K0(2131747892), "notificationsServiceRow", org.telegram.messenger.cd.K0(2131747938), 2131232261, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        return;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        return;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        return;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        return;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        return;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.f36162s;
                            if (i11 < arrayList.size()) {
                                if (((wa0) arrayList.get(i11)).f42913f == 1) {
                                    bb0Var8.f36157b.e1(new i2.q(bb0Var8, i11, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0 gy0Var38 = new gy0(12, org.telegram.messenger.cd.K0(2131747891), "notificationsServiceConnectionRow", org.telegram.messenger.cd.K0(2131747938), 2131232261, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        return;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        return;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        return;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        return;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        return;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.f36162s;
                            if (i11 < arrayList.size()) {
                                if (((wa0) arrayList.get(i11)).f42913f == 1) {
                                    bb0Var8.f36157b.e1(new i2.q(bb0Var8, i11, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0 gy0Var39 = new gy0(13, org.telegram.messenger.cd.K0(2131746290), "repeatRow", org.telegram.messenger.cd.K0(2131747938), 2131232261, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        return;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        return;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        return;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        return;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        return;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.f36162s;
                            if (i11 < arrayList.size()) {
                                if (((wa0) arrayList.get(i11)).f42913f == 1) {
                                    bb0Var8.f36157b.e1(new i2.q(bb0Var8, i11, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0 gy0Var40 = new gy0(100, org.telegram.messenger.cd.K0(2131746786), 2131232354, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        return;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        return;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        return;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        return;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        return;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.f36162s;
                            if (i11 < arrayList.size()) {
                                if (((wa0) arrayList.get(i11)).f42913f == 1) {
                                    bb0Var8.f36157b.e1(new i2.q(bb0Var8, i11, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var40.a("tg://settings/privacy");
        gy0 gy0Var41 = new gy0(109, org.telegram.messenger.cd.K0(2131743963), org.telegram.messenger.cd.K0(2131746786), 2131232035, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        return;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        return;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        return;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        return;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        return;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.f36162s;
                            if (i11 < arrayList.size()) {
                                if (((wa0) arrayList.get(i11)).f42913f == 1) {
                                    bb0Var8.f36157b.e1(new i2.q(bb0Var8, i11, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var41.a("tg://settings/privacy/2sv");
        gy0 gy0Var42 = new gy0(124, org.telegram.messenger.cd.K0(2131753850), org.telegram.messenger.cd.K0(2131746786), 2131232035, new Runnable() {
            @Override
            public final void run() {
                int i10 = r2;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                int i11 = currentAccount;
                switch (i10) {
                    case 0:
                        if (org.telegram.messenger.d20.i(i11).f15168p0 >= 0) {
                            k2Var2.presentFragment(new p4());
                            return;
                        }
                        return;
                    default:
                        if (!org.telegram.messenger.d20.i(i11).q()) {
                            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(k2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.eb ebVar = new org.telegram.ui.Components.eb(a02.W(), null);
                            ebVar.d(2131624344, new String[0]);
                            String L0 = org.telegram.messenger.cd.L0(2131746770, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(L0);
                            int indexOf = L0.indexOf(42);
                            int lastIndexOf = L0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) L0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new dh.a(a02, 6), indexOf, lastIndexOf - 1, 33);
                            }
                            ebVar.f25745b.setText(spannableStringBuilder);
                            ebVar.f25745b.setSingleLine(false);
                            ebVar.f25745b.setMaxLines(2);
                            a02.b(ebVar, 2750).j();
                            return;
                        }
                        k2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        gy0Var42.a("tg://settings/privacy/auto-delete");
        gy0 gy0Var43 = new gy0(108, org.telegram.messenger.cd.K0(2131747673), org.telegram.messenger.cd.K0(2131746786), 2131232035, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        return;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        return;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        return;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        return;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        return;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.f36162s;
                            if (i11 < arrayList.size()) {
                                if (((wa0) arrayList.get(i11)).f42913f == 1) {
                                    bb0Var8.f36157b.e1(new i2.q(bb0Var8, i11, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var43.a("tg://settings/privacy/passcode");
        gy0 gy0Var44 = null;
        if (org.telegram.messenger.tz.f18164m1) {
            gy0Var = gy0Var41;
            gy0Var2 = new gy0(125, org.telegram.messenger.cd.K0(2131751203), "emailLoginRow", org.telegram.messenger.cd.K0(2131746786), 2131232035, new Runnable() {
                @Override
                public final void run() {
                    int i10 = r1;
                    int i11 = 0;
                    org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                    switch (i10) {
                        case 0:
                            bb0 bb0Var = new bb0();
                            k2Var2.presentFragment(bb0Var);
                            bb0Var.a0(360928);
                            bb0Var.Z(64);
                            return;
                        case 1:
                            bb0 bb0Var2 = new bb0();
                            k2Var2.presentFragment(bb0Var2);
                            bb0Var2.a0(360928);
                            bb0Var2.Z(128);
                            return;
                        case 2:
                            k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            bb0 bb0Var3 = new bb0();
                            k2Var2.presentFragment(bb0Var3);
                            bb0Var3.a0(360928);
                            bb0Var3.Z(256);
                            return;
                        case 4:
                            bb0 bb0Var4 = new bb0();
                            k2Var2.presentFragment(bb0Var4);
                            bb0Var4.a0(360928);
                            bb0Var4.Z(32768);
                            return;
                        case 5:
                            bb0 bb0Var5 = new bb0();
                            k2Var2.presentFragment(bb0Var5);
                            bb0Var5.Z(512);
                            return;
                        case 6:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            bb0 bb0Var6 = new bb0();
                            k2Var2.presentFragment(bb0Var6);
                            bb0Var6.Z(1024);
                            return;
                        case 8:
                            bb0 bb0Var7 = new bb0();
                            k2Var2.presentFragment(bb0Var7);
                            bb0Var7.Z(2048);
                            return;
                        case 9:
                            bb0 bb0Var8 = new bb0();
                            k2Var2.presentFragment(bb0Var8);
                            while (true) {
                                ArrayList arrayList = bb0Var8.f36162s;
                                if (i11 < arrayList.size()) {
                                    if (((wa0) arrayList.get(i11)).f42913f == 1) {
                                        bb0Var8.f36157b.e1(new i2.q(bb0Var8, i11, 14), 700, true);
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
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                            return;
                        case 16:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                            k2Var2.presentFragment(PasscodeActivity.o0());
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
                            av0 av0Var = new av0();
                            av0Var.getMessagesController().F0(true);
                            k2Var2.presentFragment(av0Var);
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
            gy0Var2.a("tg://settings/privacy/login-email");
        } else {
            gy0Var = gy0Var41;
            gy0Var2 = null;
        }
        gy0 gy0Var45 = new gy0(101, org.telegram.messenger.cd.K0(2131753681), org.telegram.messenger.cd.K0(2131746786), 2131232354, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        return;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        return;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        return;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        return;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        return;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.f36162s;
                            if (i11 < arrayList.size()) {
                                if (((wa0) arrayList.get(i11)).f42913f == 1) {
                                    bb0Var8.f36157b.e1(new i2.q(bb0Var8, i11, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var45.a("tg://settings/privacy/blocked");
        gy0 gy0Var46 = new gy0(110, org.telegram.messenger.cd.K0(2131745568), 2131232035, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        return;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        return;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        return;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        return;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        return;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.f36162s;
                            if (i11 < arrayList.size()) {
                                if (((wa0) arrayList.get(i11)).f42913f == 1) {
                                    bb0Var8.f36157b.e1(new i2.q(bb0Var8, i11, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var46.a("tg://settings/devices");
        gy0 gy0Var47 = new gy0(105, org.telegram.messenger.cd.K0(2131746805), org.telegram.messenger.cd.K0(2131746786), 2131232354, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        return;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        return;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        return;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        return;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        return;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.f36162s;
                            if (i11 < arrayList.size()) {
                                if (((wa0) arrayList.get(i11)).f42913f == 1) {
                                    bb0Var8.f36157b.e1(new i2.q(bb0Var8, i11, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var47.a("tg://settings/privacy/phone-number/");
        gy0 gy0Var48 = new gy0(102, org.telegram.messenger.cd.K0(2131746830), org.telegram.messenger.cd.K0(2131746786), 2131232354, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        return;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        return;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        return;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        return;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        return;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.f36162s;
                            if (i11 < arrayList.size()) {
                                if (((wa0) arrayList.get(i11)).f42913f == 1) {
                                    bb0Var8.f36157b.e1(new i2.q(bb0Var8, i11, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var48.a("tg://settings/privacy/last-seen");
        gy0 gy0Var49 = new gy0(103, org.telegram.messenger.cd.K0(2131746792), org.telegram.messenger.cd.K0(2131746786), 2131232354, new Runnable() {
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
                                if (org.telegram.messenger.d20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new hf0(i10));
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
                        k2Var.presentFragment(new mu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        gy0Var49.a("tg://settings/privacy/profile-photos");
        gy0 gy0Var50 = new gy0(104, org.telegram.messenger.cd.K0(2131746852), org.telegram.messenger.cd.K0(2131746786), 2131232354, new Runnable() {
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
                                if (org.telegram.messenger.d20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new hf0(i10));
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
                        k2Var.presentFragment(new mu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        gy0Var50.a("tg://settings/privacy/forwards");
        gy0 gy0Var51 = new gy0(122, org.telegram.messenger.cd.K0(2131746815), org.telegram.messenger.cd.K0(2131746786), 2131232354, new Runnable() {
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
                                if (org.telegram.messenger.d20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new hf0(i10));
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
                        k2Var.presentFragment(new mu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        gy0Var51.a("tg://settings/privacy/calls/p2p");
        gy0 gy0Var52 = new gy0(106, org.telegram.messenger.cd.K0(2131752596), org.telegram.messenger.cd.K0(2131746786), 2131232354, new Runnable() {
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
                                if (org.telegram.messenger.d20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new hf0(i10));
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
                        k2Var.presentFragment(new mu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        gy0Var52.a("tg://settings/privacy/calls");
        gy0 gy0Var53 = new gy0(107, org.telegram.messenger.cd.K0(2131746832), org.telegram.messenger.cd.K0(2131746786), 2131232354, new Runnable() {
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
                                if (org.telegram.messenger.d20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new hf0(i10));
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
                        k2Var.presentFragment(new mu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        gy0Var53.a("tg://settings/privacy/invites");
        gy0 gy0Var54 = new gy0(123, org.telegram.messenger.cd.K0(2131746773), org.telegram.messenger.cd.K0(2131746786), 2131232354, new Runnable() {
            @Override
            public final void run() {
                int i10 = r2;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                int i11 = currentAccount;
                switch (i10) {
                    case 0:
                        if (org.telegram.messenger.d20.i(i11).f15168p0 >= 0) {
                            k2Var2.presentFragment(new p4());
                            return;
                        }
                        return;
                    default:
                        if (!org.telegram.messenger.d20.i(i11).q()) {
                            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(k2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.eb ebVar = new org.telegram.ui.Components.eb(a02.W(), null);
                            ebVar.d(2131624344, new String[0]);
                            String L0 = org.telegram.messenger.cd.L0(2131746770, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(L0);
                            int indexOf = L0.indexOf(42);
                            int lastIndexOf = L0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) L0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new dh.a(a02, 6), indexOf, lastIndexOf - 1, 33);
                            }
                            ebVar.f25745b.setText(spannableStringBuilder);
                            ebVar.f25745b.setSingleLine(false);
                            ebVar.f25745b.setMaxLines(2);
                            a02.b(ebVar, 2750).j();
                            return;
                        }
                        k2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        gy0Var54.a("tg://settings/privacy/voice");
        if (org.telegram.messenger.vp.r1(currentAccount).f18737a4) {
            gy0Var3 = gy0Var54;
            gy0Var4 = new gy0(121, org.telegram.messenger.cd.K0(2131754171), "newChatsRow", org.telegram.messenger.cd.K0(2131746786), 2131232035, new Runnable() {
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
                                    if (org.telegram.messenger.d20.i(i10).p()) {
                                        i10++;
                                    }
                                } else {
                                    i10 = -1;
                                }
                            }
                            if (i10 >= 0) {
                                k2Var.presentFragment(new hf0(i10));
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
                            k2Var.presentFragment(new mu());
                            return;
                        default:
                            k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
            gy0Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            gy0Var3 = gy0Var54;
            gy0Var4 = null;
        }
        gy0 gy0Var55 = new gy0(112, org.telegram.messenger.cd.K0(2131751597), "deleteAccountRow", org.telegram.messenger.cd.K0(2131746786), 2131232035, new Runnable() {
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
                                if (org.telegram.messenger.d20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new hf0(i10));
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
                        k2Var.presentFragment(new mu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        gy0Var55.a("tg://settings/privacy/self-destruct");
        gy0 gy0Var56 = new gy0(113, org.telegram.messenger.cd.K0(2131746812), "paymentsClearRow", org.telegram.messenger.cd.K0(2131746786), 2131232035, new Runnable() {
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
                                if (org.telegram.messenger.d20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new hf0(i10));
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
                        k2Var.presentFragment(new mu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        gy0Var56.a("tg://settings/privacy/data-settings/clear-payment-info");
        gy0 gy0Var57 = new gy0(114, org.telegram.messenger.cd.K0(2131742937), org.telegram.messenger.cd.K0(2131746786), 2131232035, new Runnable() {
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
                                if (org.telegram.messenger.d20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new hf0(i10));
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
                        k2Var.presentFragment(new mu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        gy0Var57.a("tg://settings/privacy/active-websites");
        gy0 gy0Var58 = new gy0(115, org.telegram.messenger.cd.K0(2131744322), "contactsDeleteRow", org.telegram.messenger.cd.K0(2131746786), 2131232035, new Runnable() {
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
                                if (org.telegram.messenger.d20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new hf0(i10));
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
                        k2Var.presentFragment(new mu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        gy0Var58.a("tg://settings/privacy/data-settings/delete-synced");
        gy0 gy0Var59 = new gy0(116, org.telegram.messenger.cd.K0(2131744324), "contactsSyncRow", org.telegram.messenger.cd.K0(2131746786), 2131232035, new Runnable() {
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
                                if (org.telegram.messenger.d20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new hf0(i10));
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
                        k2Var.presentFragment(new mu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        gy0Var59.a("tg://settings/privacy/data-settings/sync-contacts");
        gy0 gy0Var60 = new gy0(117, org.telegram.messenger.cd.K0(2131744438), "contactsSuggestRow", org.telegram.messenger.cd.K0(2131746786), 2131232035, new Runnable() {
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
                                if (org.telegram.messenger.d20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new hf0(i10));
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
                        k2Var.presentFragment(new mu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        gy0Var60.a("tg://settings/privacy/data-settings/suggest-contacts");
        gy0 gy0Var61 = new gy0(118, org.telegram.messenger.cd.K0(2131748704), "secretMapRow", org.telegram.messenger.cd.K0(2131746786), 2131232035, new Runnable() {
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
                                if (org.telegram.messenger.d20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new hf0(i10));
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
                        k2Var.presentFragment(new mu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        gy0Var61.a("tg://settings/privacy/data-settings/map-provider");
        gy0 gy0Var62 = new gy0(119, org.telegram.messenger.cd.K0(2131745701), "secretWebpageRow", org.telegram.messenger.cd.K0(2131746786), 2131232035, new Runnable() {
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
                                if (org.telegram.messenger.d20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new hf0(i10));
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
                        k2Var.presentFragment(new mu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        gy0Var62.a("tg://settings/privacy/data-settings/link-previews");
        gy0 gy0Var63 = new gy0(120, org.telegram.messenger.cd.K0(2131751456), 2131232023, new Runnable() {
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
                                if (org.telegram.messenger.d20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new hf0(i10));
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
                        k2Var.presentFragment(new mu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        gy0Var63.a("tg://settings/devices");
        gy0 gy0Var64 = new gy0(121, org.telegram.messenger.cd.K0(2131744233), "terminateAllSessionsRow", org.telegram.messenger.cd.K0(2131751456), 2131232023, new Runnable() {
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
                                if (org.telegram.messenger.d20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new hf0(i10));
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
                        k2Var.presentFragment(new mu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        gy0Var64.a("tg://settings/devices/terminate-sessions");
        gy0 gy0Var65 = new gy0(122, org.telegram.messenger.cd.K0(2131748927), org.telegram.messenger.cd.K0(2131751456), 2131232023, new Runnable() {
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
                                if (org.telegram.messenger.d20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new hf0(i10));
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
                        k2Var.presentFragment(new mu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        gy0Var65.a("tg://settings/devices/link-desktop");
        gy0 gy0Var66 = new gy0(200, org.telegram.messenger.cd.K0(2131751678), 2131232022, new Runnable() {
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
                                if (org.telegram.messenger.d20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new hf0(i10));
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
                        k2Var.presentFragment(new mu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        gy0Var66.a("tg://settings/privacy/data-settings");
        gy0 gy0Var67 = new gy0(201, org.telegram.messenger.cd.K0(2131751677), "usageSectionRow", org.telegram.messenger.cd.K0(2131751678), 2131232022, new Runnable() {
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
                                if (org.telegram.messenger.d20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new hf0(i10));
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
                        k2Var.presentFragment(new mu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        gy0 gy0Var68 = new gy0(202, org.telegram.messenger.cd.K0(2131744834), org.telegram.messenger.cd.K0(2131751678), 2131232022, new Runnable() {
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
                                if (org.telegram.messenger.d20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new hf0(i10));
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
                        k2Var.presentFragment(new mu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        gy0Var68.a("tg://settings/data/storage");
        gy0 gy0Var69 = new gy0(203, org.telegram.messenger.cd.K0(2131749070), "keepMediaRow", org.telegram.messenger.cd.K0(2131751678), org.telegram.messenger.cd.K0(2131744834), 2131232022, new Runnable() {
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
                                if (org.telegram.messenger.d20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new hf0(i10));
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
                        k2Var.presentFragment(new mu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        gy0 gy0Var70 = new gy0(204, org.telegram.messenger.cd.K0(2131752075), "cacheRow", org.telegram.messenger.cd.K0(2131751678), org.telegram.messenger.cd.K0(2131744834), 2131232022, new Runnable() {
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
                                if (org.telegram.messenger.d20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new hf0(i10));
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
                        k2Var.presentFragment(new mu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        gy0 gy0Var71 = new gy0(205, org.telegram.messenger.cd.K0(2131748784), "databaseRow", org.telegram.messenger.cd.K0(2131751678), org.telegram.messenger.cd.K0(2131744834), 2131232022, new Runnable() {
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
                                if (org.telegram.messenger.d20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new hf0(i10));
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
                        k2Var.presentFragment(new mu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        gy0 gy0Var72 = new gy0(206, org.telegram.messenger.cd.K0(2131748312), org.telegram.messenger.cd.K0(2131751678), 2131232022, new Runnable() {
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
                                if (org.telegram.messenger.d20.i(i10).p()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            k2Var.presentFragment(new hf0(i10));
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
                        k2Var.presentFragment(new mu());
                        return;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        gy0Var72.a("tg://settings/data/usage");
        gy0 gy0Var73 = new gy0(207, org.telegram.messenger.cd.K0(2131753767), "mediaDownloadSectionRow", org.telegram.messenger.cd.K0(2131751678), 2131232022, new Runnable() {
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
        gy0 gy0Var74 = new gy0(208, org.telegram.messenger.cd.K0(2131742910), org.telegram.messenger.cd.K0(2131751678), 2131232022, new Runnable() {
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
        gy0 gy0Var75 = new gy0(209, org.telegram.messenger.cd.K0(2131742912), org.telegram.messenger.cd.K0(2131751678), 2131232022, new Runnable() {
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
        gy0 gy0Var76 = new gy0(210, org.telegram.messenger.cd.K0(2131742911), org.telegram.messenger.cd.K0(2131751678), 2131232022, new Runnable() {
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
        gy0 gy0Var77 = new gy0(211, org.telegram.messenger.cd.K0(2131746128), "resetDownloadRow", org.telegram.messenger.cd.K0(2131751678), 2131232022, new Runnable() {
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
        gy0Var77.a("tg://settings/data/auto-download/reset");
        gy0 gy0Var78 = new gy0(215, org.telegram.messenger.cd.K0(2131744464), "streamSectionRow", org.telegram.messenger.cd.K0(2131751678), 2131232022, new Runnable() {
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
        gy0 gy0Var79 = new gy0(216, org.telegram.messenger.cd.K0(2131751145), "enableStreamRow", org.telegram.messenger.cd.K0(2131751678), 2131232022, new Runnable() {
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
        gy0 gy0Var80 = new gy0(217, org.telegram.messenger.cd.K0(2131752596), "callsSectionRow", org.telegram.messenger.cd.K0(2131751678), 2131232022, new Runnable() {
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
        gy0 gy0Var81 = new gy0(218, org.telegram.messenger.cd.K0(2131743255), "useLessDataForCallsRow", org.telegram.messenger.cd.K0(2131751678), 2131232022, new Runnable() {
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
        gy0Var81.a("tg://settings/data/use-less-data");
        gy0 gy0Var82 = new gy0(219, org.telegram.messenger.cd.K0(2131743284), "quickRepliesRow", org.telegram.messenger.cd.K0(2131751678), 2131232022, new Runnable() {
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
        gy0 gy0Var83 = new gy0(220, org.telegram.messenger.cd.K0(2131746616), org.telegram.messenger.cd.K0(2131751678), 2131232022, new Runnable() {
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
        gy0Var83.a("tg://settings/data/proxy");
        gy0 gy0Var84 = new gy0(111, org.telegram.messenger.cd.K0(2131746856), "clearDraftsRow", org.telegram.messenger.cd.K0(2131751678), 2131232022, new Runnable() {
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
        gy0Var84.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        gy0 gy0Var85 = new gy0(222, org.telegram.messenger.cd.K0(2131745946), "saveToGallerySectionRow", org.telegram.messenger.cd.K0(2131751678), 2131232022, new Runnable() {
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
        gy0 gy0Var86 = new gy0(223, org.telegram.messenger.cd.K0(2131745936), "saveToGalleryPeerRow", org.telegram.messenger.cd.K0(2131751678), org.telegram.messenger.cd.K0(2131745946), 2131232022, new Runnable() {
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
        gy0Var86.a("tg://settings/data/save-to-photos/chats");
        gy0 gy0Var87 = new gy0(224, org.telegram.messenger.cd.K0(2131745943), "saveToGalleryGroupsRow", org.telegram.messenger.cd.K0(2131751678), org.telegram.messenger.cd.K0(2131745946), 2131232022, new Runnable() {
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
        gy0Var87.a("tg://settings/data/save-to-photos/groups");
        gy0 gy0Var88 = new gy0(225, org.telegram.messenger.cd.K0(2131745945), "saveToGalleryChannelsRow", org.telegram.messenger.cd.K0(2131751678), org.telegram.messenger.cd.K0(2131745946), 2131232022, new ch0(2, k2Var));
        gy0Var88.a("tg://settings/data/save-to-photos/channels");
        gy0 gy0Var89 = new gy0(300, org.telegram.messenger.cd.K0(2131752210), 2131232024, new ch0(3, k2Var));
        gy0Var89.a("tg://settings/appearance/themes");
        gy0 gy0Var90 = new gy0(301, org.telegram.messenger.cd.K0(2131744216), "textSizeHeaderRow", org.telegram.messenger.cd.K0(2131752210), 2131232024, new ch0(4, k2Var));
        gy0Var90.a("tg://settings/appearance/text-size");
        gy0 gy0Var91 = new gy0(302, org.telegram.messenger.cd.K0(2131752550), org.telegram.messenger.cd.K0(2131752210), 2131232024, new ch0(5, k2Var));
        gy0Var91.a("tg://settings/appearance/wallpapers");
        gy0 gy0Var92 = new gy0(303, org.telegram.messenger.cd.K0(2131745555), null, org.telegram.messenger.cd.K0(2131752210), org.telegram.messenger.cd.K0(2131752244), 2131232024, new ch0(6, k2Var));
        gy0 gy0Var93 = new gy0(304, org.telegram.messenger.cd.K0(2131746125), "resetRow", org.telegram.messenger.cd.K0(2131752210), org.telegram.messenger.cd.K0(2131752244), 2131232024, new ch0(8, k2Var));
        gy0 gy0Var94 = new gy0(306, org.telegram.messenger.cd.K0(2131752011), "themeHeaderRow", org.telegram.messenger.cd.K0(2131752210), 2131232024, new ch0(9, k2Var));
        gy0 gy0Var95 = new gy0(319, org.telegram.messenger.cd.K0(2131752878), null, org.telegram.messenger.cd.K0(2131752210), 2131232024, new ch0(10, k2Var));
        gy0 gy0Var96 = new gy0(320, org.telegram.messenger.cd.K0(2131751713), "createNewThemeRow", org.telegram.messenger.cd.K0(2131752210), org.telegram.messenger.cd.K0(2131752878), 2131232024, new ch0(11, k2Var));
        gy0Var96.a("tg://settings/appearance/themes/create");
        gy0 gy0Var97 = new gy0(321, org.telegram.messenger.cd.K0(2131752840), "bubbleRadiusHeaderRow", org.telegram.messenger.cd.K0(2131752210), 2131232024, new ch0(13, k2Var));
        gy0Var97.a("tg://settings/appearance/message-corners");
        gy0 gy0Var98 = new gy0(322, org.telegram.messenger.cd.K0(2131752225), "chatListHeaderRow", org.telegram.messenger.cd.K0(2131752210), 2131232024, new ch0(14, k2Var));
        gy0 gy0Var99 = new gy0(323, org.telegram.messenger.cd.K0(2131752222), "swipeGestureHeaderRow", org.telegram.messenger.cd.K0(2131752210), 2131232024, new ch0(15, k2Var));
        gy0 gy0Var100 = new gy0(324, org.telegram.messenger.cd.K0(2131754240), "appIconHeaderRow", org.telegram.messenger.cd.K0(2131752210), 2131232024, new ch0(16, k2Var));
        gy0Var100.a("tg://settings/appearance/app-icon");
        gy0 gy0Var101 = new gy0(305, org.telegram.messenger.cd.K0(2131753784), org.telegram.messenger.cd.K0(2131752210), 2131232024, new ch0(17, k2Var));
        gy0 gy0Var102 = new gy0(328, org.telegram.messenger.cd.K0(2131748266), "nextMediaTapRow", org.telegram.messenger.cd.K0(2131752210), 2131232024, new ch0(18, k2Var));
        gy0Var102.a("tg://settings/appearance/tap-for-next-media");
        gy0 gy0Var103 = new gy0(327, org.telegram.messenger.cd.K0(2131746442), "raiseToListenRow", org.telegram.messenger.cd.K0(2131752210), 2131232024, new ch0(20, k2Var));
        gy0Var103.a("tg://settings/data/raise-to-listen");
        gy0 gy0Var104 = new gy0(310, org.telegram.messenger.cd.K0(2131746440), "raiseToSpeakRow", org.telegram.messenger.cd.K0(2131752210), 2131232024, new ch0(21, k2Var));
        gy0Var104.a("tg://settings/data/raise-to-speak");
        gy0 gy0Var105 = new gy0(326, org.telegram.messenger.cd.K0(2131747448), "pauseOnMediaRow", org.telegram.messenger.cd.K0(2131752210), 2131232024, new ch0(22, k2Var));
        gy0Var105.a("tg://settings/data/pause-music");
        gy0 gy0Var106 = new gy0(325, org.telegram.messenger.cd.K0(2131748454), "bluetoothScoRow", org.telegram.messenger.cd.K0(2131752210), 2131232024, new ch0(24, k2Var));
        gy0 gy0Var107 = new gy0(308, org.telegram.messenger.cd.K0(2131751439), "directShareRow", org.telegram.messenger.cd.K0(2131752210), 2131232024, new ch0(25, k2Var));
        gy0 gy0Var108 = new gy0(311, org.telegram.messenger.cd.K0(2131745649), "sendByEnterRow", org.telegram.messenger.cd.K0(2131752210), 2131232024, new ch0(26, k2Var));
        gy0 gy0Var109 = new gy0(318, org.telegram.messenger.cd.K0(2131751368), "distanceRow", org.telegram.messenger.cd.K0(2131752210), 2131232024, new ch0(27, k2Var));
        gy0 gy0Var110 = new gy0(600, org.telegram.messenger.cd.K0(2131744875), 2131232037, new ch0(28, k2Var));
        gy0Var110.a("tg://settings/appearance/stickers-and-emoji");
        gy0 gy0Var111 = new gy0(601, org.telegram.messenger.cd.K0(2131744428), "suggestRow", org.telegram.messenger.cd.K0(2131744875), 2131232037, new ch0(29, k2Var));
        gy0 gy0Var112 = new gy0(602, org.telegram.messenger.cd.K0(2131750834), "featuredStickersHeaderRow", org.telegram.messenger.cd.K0(2131744875), 2131232037, new Runnable() {
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        return;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        return;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        return;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        return;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        return;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        return;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        return;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        return;
                }
            }
        });
        gy0 gy0Var113 = new gy0(603, org.telegram.messenger.cd.K0(2131748694), null, org.telegram.messenger.cd.K0(2131744875), 2131232037, new Runnable() {
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        return;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        return;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        return;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        return;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        return;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        return;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        return;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        return;
                }
            }
        });
        gy0 gy0Var114 = new gy0(604, org.telegram.messenger.cd.K0(2131754128), null, org.telegram.messenger.cd.K0(2131744875), 2131232037, new Runnable() {
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        return;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        return;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        return;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        return;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        return;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        return;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        return;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        return;
                }
            }
        });
        gy0Var114.a("tg://settings/appearance/stickers-and-emoji/archived");
        gy0 gy0Var115 = new gy0(605, org.telegram.messenger.cd.K0(2131754133), null, org.telegram.messenger.cd.K0(2131744875), 2131232037, new Runnable() {
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        return;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        return;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        return;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        return;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        return;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        return;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        return;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        return;
                }
            }
        });
        gy0 gy0Var116 = new gy0(606, org.telegram.messenger.cd.K0(2131749044), "largeEmojiRow", org.telegram.messenger.cd.K0(2131744875), 2131232037, new Runnable() {
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        return;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        return;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        return;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        return;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        return;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        return;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        return;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        return;
                }
            }
        });
        gy0Var116.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        gy0 gy0Var117 = new gy0(607, org.telegram.messenger.cd.K0(2131748733), "loopRow", org.telegram.messenger.cd.K0(2131744875), 2131232037, new Runnable() {
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        return;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        return;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        return;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        return;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        return;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        return;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        return;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        return;
                }
            }
        });
        gy0 gy0Var118 = new gy0(608, org.telegram.messenger.cd.K0(2131751197), null, org.telegram.messenger.cd.K0(2131744875), 2131231513, new Runnable() {
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        return;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        return;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        return;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        return;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        return;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        return;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        return;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        return;
                }
            }
        });
        gy0Var118.a("tg://settings/appearance/stickers-and-emoji/emoji");
        gy0 gy0Var119 = new gy0(609, org.telegram.messenger.cd.K0(2131744442), "suggestAnimatedEmojiRow", org.telegram.messenger.cd.K0(2131744875), org.telegram.messenger.cd.K0(2131751197), 2131231513, new Runnable() {
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        return;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        return;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        return;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        return;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        return;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        return;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        return;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        return;
                }
            }
        });
        gy0Var119.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        gy0 gy0Var120 = new gy0(610, org.telegram.messenger.cd.K0(2131750836), "featuredStickersHeaderRow", org.telegram.messenger.cd.K0(2131744875), org.telegram.messenger.cd.K0(2131751197), 2131231513, new Runnable() {
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        return;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        return;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        return;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        return;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        return;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        return;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        return;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        return;
                }
            }
        });
        gy0 gy0Var121 = new gy0(611, org.telegram.messenger.cd.K0(2131751351), null, org.telegram.messenger.cd.K0(2131744875), 2131232037, new Runnable() {
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        return;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        return;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        return;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        return;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        return;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        return;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        return;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        return;
                }
            }
        });
        gy0Var121.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        gy0 gy0Var122 = new gy0(700, org.telegram.messenger.cd.K0(2131750697), null, 2131232026, new Runnable() {
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        return;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        return;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        return;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        return;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        return;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        return;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        return;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        return;
                }
            }
        });
        gy0Var122.a("tg://settings/folders");
        gy0 gy0Var123 = new gy0(701, org.telegram.messenger.cd.K0(2131751717), "createFilterRow", org.telegram.messenger.cd.K0(2131750697), 2131232026, new Runnable() {
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        return;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        return;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        return;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        return;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        return;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        return;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        return;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        return;
                }
            }
        });
        gy0Var123.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            gy0Var5 = gy0Var123;
            gy0Var6 = gy0Var114;
            gy0Var7 = gy0Var116;
            gy0Var8 = gy0Var118;
            gy0Var9 = new gy0(800, org.telegram.messenger.cd.K0(2131744256), 2131232361, new Runnable() {
                @Override
                public final void run() {
                    int i10 = r1;
                    int i11 = 0;
                    org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                    switch (i10) {
                        case 0:
                            bb0 bb0Var = new bb0();
                            k2Var2.presentFragment(bb0Var);
                            bb0Var.a0(360928);
                            bb0Var.Z(64);
                            return;
                        case 1:
                            bb0 bb0Var2 = new bb0();
                            k2Var2.presentFragment(bb0Var2);
                            bb0Var2.a0(360928);
                            bb0Var2.Z(128);
                            return;
                        case 2:
                            k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            bb0 bb0Var3 = new bb0();
                            k2Var2.presentFragment(bb0Var3);
                            bb0Var3.a0(360928);
                            bb0Var3.Z(256);
                            return;
                        case 4:
                            bb0 bb0Var4 = new bb0();
                            k2Var2.presentFragment(bb0Var4);
                            bb0Var4.a0(360928);
                            bb0Var4.Z(32768);
                            return;
                        case 5:
                            bb0 bb0Var5 = new bb0();
                            k2Var2.presentFragment(bb0Var5);
                            bb0Var5.Z(512);
                            return;
                        case 6:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            bb0 bb0Var6 = new bb0();
                            k2Var2.presentFragment(bb0Var6);
                            bb0Var6.Z(1024);
                            return;
                        case 8:
                            bb0 bb0Var7 = new bb0();
                            k2Var2.presentFragment(bb0Var7);
                            bb0Var7.Z(2048);
                            return;
                        case 9:
                            bb0 bb0Var8 = new bb0();
                            k2Var2.presentFragment(bb0Var8);
                            while (true) {
                                ArrayList arrayList = bb0Var8.f36162s;
                                if (i11 < arrayList.size()) {
                                    if (((wa0) arrayList.get(i11)).f42913f == 1) {
                                        bb0Var8.f36157b.e1(new i2.q(bb0Var8, i11, 14), 700, true);
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
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                            return;
                        case 16:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                            k2Var2.presentFragment(PasscodeActivity.o0());
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
                            av0 av0Var = new av0();
                            av0Var.getMessagesController().F0(true);
                            k2Var2.presentFragment(av0Var);
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
            gy0Var5 = gy0Var123;
            gy0Var6 = gy0Var114;
            gy0Var7 = gy0Var116;
            gy0Var8 = gy0Var118;
            gy0Var9 = null;
        }
        if (F(currentAccount, 0)) {
            gy0Var10 = new gy0(801, org.telegram.messenger.cd.K0(2131747013), org.telegram.messenger.cd.K0(2131744256), 2131232361, new Runnable() {
                @Override
                public final void run() {
                    int i10 = r1;
                    int i11 = 0;
                    org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                    switch (i10) {
                        case 0:
                            bb0 bb0Var = new bb0();
                            k2Var2.presentFragment(bb0Var);
                            bb0Var.a0(360928);
                            bb0Var.Z(64);
                            return;
                        case 1:
                            bb0 bb0Var2 = new bb0();
                            k2Var2.presentFragment(bb0Var2);
                            bb0Var2.a0(360928);
                            bb0Var2.Z(128);
                            return;
                        case 2:
                            k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            bb0 bb0Var3 = new bb0();
                            k2Var2.presentFragment(bb0Var3);
                            bb0Var3.a0(360928);
                            bb0Var3.Z(256);
                            return;
                        case 4:
                            bb0 bb0Var4 = new bb0();
                            k2Var2.presentFragment(bb0Var4);
                            bb0Var4.a0(360928);
                            bb0Var4.Z(32768);
                            return;
                        case 5:
                            bb0 bb0Var5 = new bb0();
                            k2Var2.presentFragment(bb0Var5);
                            bb0Var5.Z(512);
                            return;
                        case 6:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            bb0 bb0Var6 = new bb0();
                            k2Var2.presentFragment(bb0Var6);
                            bb0Var6.Z(1024);
                            return;
                        case 8:
                            bb0 bb0Var7 = new bb0();
                            k2Var2.presentFragment(bb0Var7);
                            bb0Var7.Z(2048);
                            return;
                        case 9:
                            bb0 bb0Var8 = new bb0();
                            k2Var2.presentFragment(bb0Var8);
                            while (true) {
                                ArrayList arrayList = bb0Var8.f36162s;
                                if (i11 < arrayList.size()) {
                                    if (((wa0) arrayList.get(i11)).f42913f == 1) {
                                        bb0Var8.f36157b.e1(new i2.q(bb0Var8, i11, 14), 700, true);
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
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                            return;
                        case 16:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                            k2Var2.presentFragment(PasscodeActivity.o0());
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
                            av0 av0Var = new av0();
                            av0Var.getMessagesController().F0(true);
                            k2Var2.presentFragment(av0Var);
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
            gy0Var10 = null;
        }
        if (F(currentAccount, 11)) {
            gy0Var11 = new gy0(802, org.telegram.messenger.cd.K0(2131747022), org.telegram.messenger.cd.K0(2131744256), 2131232361, new Runnable() {
                @Override
                public final void run() {
                    int i10 = r1;
                    int i11 = 0;
                    org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                    switch (i10) {
                        case 0:
                            bb0 bb0Var = new bb0();
                            k2Var2.presentFragment(bb0Var);
                            bb0Var.a0(360928);
                            bb0Var.Z(64);
                            return;
                        case 1:
                            bb0 bb0Var2 = new bb0();
                            k2Var2.presentFragment(bb0Var2);
                            bb0Var2.a0(360928);
                            bb0Var2.Z(128);
                            return;
                        case 2:
                            k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            bb0 bb0Var3 = new bb0();
                            k2Var2.presentFragment(bb0Var3);
                            bb0Var3.a0(360928);
                            bb0Var3.Z(256);
                            return;
                        case 4:
                            bb0 bb0Var4 = new bb0();
                            k2Var2.presentFragment(bb0Var4);
                            bb0Var4.a0(360928);
                            bb0Var4.Z(32768);
                            return;
                        case 5:
                            bb0 bb0Var5 = new bb0();
                            k2Var2.presentFragment(bb0Var5);
                            bb0Var5.Z(512);
                            return;
                        case 6:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            bb0 bb0Var6 = new bb0();
                            k2Var2.presentFragment(bb0Var6);
                            bb0Var6.Z(1024);
                            return;
                        case 8:
                            bb0 bb0Var7 = new bb0();
                            k2Var2.presentFragment(bb0Var7);
                            bb0Var7.Z(2048);
                            return;
                        case 9:
                            bb0 bb0Var8 = new bb0();
                            k2Var2.presentFragment(bb0Var8);
                            while (true) {
                                ArrayList arrayList = bb0Var8.f36162s;
                                if (i11 < arrayList.size()) {
                                    if (((wa0) arrayList.get(i11)).f42913f == 1) {
                                        bb0Var8.f36157b.e1(new i2.q(bb0Var8, i11, 14), 700, true);
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
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                            return;
                        case 16:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                            k2Var2.presentFragment(PasscodeActivity.o0());
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
                            av0 av0Var = new av0();
                            av0Var.getMessagesController().F0(true);
                            k2Var2.presentFragment(av0Var);
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
            gy0Var11 = null;
        }
        if (F(currentAccount, 1)) {
            gy0Var12 = new gy0(803, org.telegram.messenger.cd.K0(2131746979), org.telegram.messenger.cd.K0(2131744256), 2131232361, new Runnable() {
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
                                    if (org.telegram.messenger.d20.i(i10).p()) {
                                        i10++;
                                    }
                                } else {
                                    i10 = -1;
                                }
                            }
                            if (i10 >= 0) {
                                k2Var.presentFragment(new hf0(i10));
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
                            k2Var.presentFragment(new mu());
                            return;
                        default:
                            k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            gy0Var12 = null;
        }
        if (F(currentAccount, 2)) {
            gy0Var13 = new gy0(804, org.telegram.messenger.cd.K0(2131747027), org.telegram.messenger.cd.K0(2131744256), 2131232361, new Runnable() {
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
                                    if (org.telegram.messenger.d20.i(i10).p()) {
                                        i10++;
                                    }
                                } else {
                                    i10 = -1;
                                }
                            }
                            if (i10 >= 0) {
                                k2Var.presentFragment(new hf0(i10));
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
                            k2Var.presentFragment(new mu());
                            return;
                        default:
                            k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            gy0Var13 = null;
        }
        if (F(currentAccount, 8)) {
            gy0Var14 = new gy0(805, org.telegram.messenger.cd.K0(2131746977), org.telegram.messenger.cd.K0(2131744256), 2131232361, new Runnable() {
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
                                    if (org.telegram.messenger.d20.i(i10).p()) {
                                        i10++;
                                    }
                                } else {
                                    i10 = -1;
                                }
                            }
                            if (i10 >= 0) {
                                k2Var.presentFragment(new hf0(i10));
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
                            k2Var.presentFragment(new mu());
                            return;
                        default:
                            k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            gy0Var14 = null;
        }
        if (F(currentAccount, 3)) {
            gy0Var15 = new gy0(806, org.telegram.messenger.cd.K0(2131747007), org.telegram.messenger.cd.K0(2131744256), 2131232361, new Runnable() {
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
            gy0Var15 = null;
        }
        if (F(currentAccount, 4)) {
            gy0Var16 = new gy0(807, org.telegram.messenger.cd.K0(2131746998), org.telegram.messenger.cd.K0(2131744256), 2131232361, new Runnable() {
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
            gy0Var16 = null;
        }
        if (F(currentAccount, 5)) {
            gy0Var17 = new gy0(808, org.telegram.messenger.cd.K0(2131746991), org.telegram.messenger.cd.K0(2131744256), 2131232361, new ch0(12, k2Var));
        } else {
            gy0Var17 = null;
        }
        if (F(currentAccount, 9)) {
            gy0Var18 = new gy0(809, org.telegram.messenger.cd.K0(2131747040), org.telegram.messenger.cd.K0(2131744256), 2131232361, new Runnable() {
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
                            k2Var.presentFragment(new pz0());
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
                            k2Var.presentFragment(new bb0());
                            return;
                        case 19:
                            bb0 bb0Var = new bb0();
                            k2Var.presentFragment(bb0Var);
                            bb0Var.Z(3);
                            return;
                        case 20:
                            bb0 bb0Var2 = new bb0();
                            k2Var.presentFragment(bb0Var2);
                            bb0Var2.a0(3);
                            bb0Var2.Z(1);
                            return;
                        case 21:
                            k2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            bb0 bb0Var3 = new bb0();
                            k2Var.presentFragment(bb0Var3);
                            bb0Var3.a0(3);
                            bb0Var3.Z(2);
                            return;
                        case 23:
                            bb0 bb0Var4 = new bb0();
                            k2Var.presentFragment(bb0Var4);
                            bb0Var4.Z(28700);
                            return;
                        case 24:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            bb0 bb0Var5 = new bb0();
                            k2Var.presentFragment(bb0Var5);
                            bb0Var5.a0(28700);
                            bb0Var5.Z(16388);
                            return;
                        case 26:
                            bb0 bb0Var6 = new bb0();
                            k2Var.presentFragment(bb0Var6);
                            bb0Var6.a0(28700);
                            bb0Var6.Z(8200);
                            return;
                        case 27:
                            bb0 bb0Var7 = new bb0();
                            k2Var.presentFragment(bb0Var7);
                            bb0Var7.a0(28700);
                            bb0Var7.Z(4112);
                            return;
                        case 28:
                            bb0 bb0Var8 = new bb0();
                            k2Var.presentFragment(bb0Var8);
                            bb0Var8.Z(360928);
                            return;
                        default:
                            bb0 bb0Var9 = new bb0();
                            k2Var.presentFragment(bb0Var9);
                            bb0Var9.a0(360928);
                            bb0Var9.Z(32);
                            return;
                    }
                }
            });
        } else {
            gy0Var18 = null;
        }
        if (F(currentAccount, 6)) {
            gy0Var19 = new gy0(810, org.telegram.messenger.cd.K0(2131747002), org.telegram.messenger.cd.K0(2131744256), 2131232361, new Runnable() {
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
                            k2Var.presentFragment(new pz0());
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
                            k2Var.presentFragment(new bb0());
                            return;
                        case 19:
                            bb0 bb0Var = new bb0();
                            k2Var.presentFragment(bb0Var);
                            bb0Var.Z(3);
                            return;
                        case 20:
                            bb0 bb0Var2 = new bb0();
                            k2Var.presentFragment(bb0Var2);
                            bb0Var2.a0(3);
                            bb0Var2.Z(1);
                            return;
                        case 21:
                            k2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            bb0 bb0Var3 = new bb0();
                            k2Var.presentFragment(bb0Var3);
                            bb0Var3.a0(3);
                            bb0Var3.Z(2);
                            return;
                        case 23:
                            bb0 bb0Var4 = new bb0();
                            k2Var.presentFragment(bb0Var4);
                            bb0Var4.Z(28700);
                            return;
                        case 24:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            bb0 bb0Var5 = new bb0();
                            k2Var.presentFragment(bb0Var5);
                            bb0Var5.a0(28700);
                            bb0Var5.Z(16388);
                            return;
                        case 26:
                            bb0 bb0Var6 = new bb0();
                            k2Var.presentFragment(bb0Var6);
                            bb0Var6.a0(28700);
                            bb0Var6.Z(8200);
                            return;
                        case 27:
                            bb0 bb0Var7 = new bb0();
                            k2Var.presentFragment(bb0Var7);
                            bb0Var7.a0(28700);
                            bb0Var7.Z(4112);
                            return;
                        case 28:
                            bb0 bb0Var8 = new bb0();
                            k2Var.presentFragment(bb0Var8);
                            bb0Var8.Z(360928);
                            return;
                        default:
                            bb0 bb0Var9 = new bb0();
                            k2Var.presentFragment(bb0Var9);
                            bb0Var9.a0(360928);
                            bb0Var9.Z(32);
                            return;
                    }
                }
            });
        } else {
            gy0Var19 = null;
        }
        if (F(currentAccount, 7)) {
            gy0Var20 = new gy0(811, org.telegram.messenger.cd.K0(2131747037), org.telegram.messenger.cd.K0(2131744256), 2131232361, new Runnable() {
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
                            k2Var.presentFragment(new pz0());
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
                            k2Var.presentFragment(new bb0());
                            return;
                        case 19:
                            bb0 bb0Var = new bb0();
                            k2Var.presentFragment(bb0Var);
                            bb0Var.Z(3);
                            return;
                        case 20:
                            bb0 bb0Var2 = new bb0();
                            k2Var.presentFragment(bb0Var2);
                            bb0Var2.a0(3);
                            bb0Var2.Z(1);
                            return;
                        case 21:
                            k2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            bb0 bb0Var3 = new bb0();
                            k2Var.presentFragment(bb0Var3);
                            bb0Var3.a0(3);
                            bb0Var3.Z(2);
                            return;
                        case 23:
                            bb0 bb0Var4 = new bb0();
                            k2Var.presentFragment(bb0Var4);
                            bb0Var4.Z(28700);
                            return;
                        case 24:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            bb0 bb0Var5 = new bb0();
                            k2Var.presentFragment(bb0Var5);
                            bb0Var5.a0(28700);
                            bb0Var5.Z(16388);
                            return;
                        case 26:
                            bb0 bb0Var6 = new bb0();
                            k2Var.presentFragment(bb0Var6);
                            bb0Var6.a0(28700);
                            bb0Var6.Z(8200);
                            return;
                        case 27:
                            bb0 bb0Var7 = new bb0();
                            k2Var.presentFragment(bb0Var7);
                            bb0Var7.a0(28700);
                            bb0Var7.Z(4112);
                            return;
                        case 28:
                            bb0 bb0Var8 = new bb0();
                            k2Var.presentFragment(bb0Var8);
                            bb0Var8.Z(360928);
                            return;
                        default:
                            bb0 bb0Var9 = new bb0();
                            k2Var.presentFragment(bb0Var9);
                            bb0Var9.a0(360928);
                            bb0Var9.Z(32);
                            return;
                    }
                }
            });
        } else {
            gy0Var20 = null;
        }
        if (F(currentAccount, 10)) {
            gy0Var21 = new gy0(812, org.telegram.messenger.cd.K0(2131747035), org.telegram.messenger.cd.K0(2131744256), 2131232361, new Runnable() {
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
                            k2Var.presentFragment(new pz0());
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
                            k2Var.presentFragment(new bb0());
                            return;
                        case 19:
                            bb0 bb0Var = new bb0();
                            k2Var.presentFragment(bb0Var);
                            bb0Var.Z(3);
                            return;
                        case 20:
                            bb0 bb0Var2 = new bb0();
                            k2Var.presentFragment(bb0Var2);
                            bb0Var2.a0(3);
                            bb0Var2.Z(1);
                            return;
                        case 21:
                            k2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            bb0 bb0Var3 = new bb0();
                            k2Var.presentFragment(bb0Var3);
                            bb0Var3.a0(3);
                            bb0Var3.Z(2);
                            return;
                        case 23:
                            bb0 bb0Var4 = new bb0();
                            k2Var.presentFragment(bb0Var4);
                            bb0Var4.Z(28700);
                            return;
                        case 24:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            bb0 bb0Var5 = new bb0();
                            k2Var.presentFragment(bb0Var5);
                            bb0Var5.a0(28700);
                            bb0Var5.Z(16388);
                            return;
                        case 26:
                            bb0 bb0Var6 = new bb0();
                            k2Var.presentFragment(bb0Var6);
                            bb0Var6.a0(28700);
                            bb0Var6.Z(8200);
                            return;
                        case 27:
                            bb0 bb0Var7 = new bb0();
                            k2Var.presentFragment(bb0Var7);
                            bb0Var7.a0(28700);
                            bb0Var7.Z(4112);
                            return;
                        case 28:
                            bb0 bb0Var8 = new bb0();
                            k2Var.presentFragment(bb0Var8);
                            bb0Var8.Z(360928);
                            return;
                        default:
                            bb0 bb0Var9 = new bb0();
                            k2Var.presentFragment(bb0Var9);
                            bb0Var9.a0(360928);
                            bb0Var9.Z(32);
                            return;
                    }
                }
            });
        } else {
            gy0Var21 = null;
        }
        if (F(currentAccount, 12)) {
            gy0Var22 = new gy0(813, org.telegram.messenger.cd.K0(2131747019), org.telegram.messenger.cd.K0(2131744256), 2131232361, new Runnable() {
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
                            k2Var.presentFragment(new pz0());
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
                            k2Var.presentFragment(new bb0());
                            return;
                        case 19:
                            bb0 bb0Var = new bb0();
                            k2Var.presentFragment(bb0Var);
                            bb0Var.Z(3);
                            return;
                        case 20:
                            bb0 bb0Var2 = new bb0();
                            k2Var.presentFragment(bb0Var2);
                            bb0Var2.a0(3);
                            bb0Var2.Z(1);
                            return;
                        case 21:
                            k2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            bb0 bb0Var3 = new bb0();
                            k2Var.presentFragment(bb0Var3);
                            bb0Var3.a0(3);
                            bb0Var3.Z(2);
                            return;
                        case 23:
                            bb0 bb0Var4 = new bb0();
                            k2Var.presentFragment(bb0Var4);
                            bb0Var4.Z(28700);
                            return;
                        case 24:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            bb0 bb0Var5 = new bb0();
                            k2Var.presentFragment(bb0Var5);
                            bb0Var5.a0(28700);
                            bb0Var5.Z(16388);
                            return;
                        case 26:
                            bb0 bb0Var6 = new bb0();
                            k2Var.presentFragment(bb0Var6);
                            bb0Var6.a0(28700);
                            bb0Var6.Z(8200);
                            return;
                        case 27:
                            bb0 bb0Var7 = new bb0();
                            k2Var.presentFragment(bb0Var7);
                            bb0Var7.a0(28700);
                            bb0Var7.Z(4112);
                            return;
                        case 28:
                            bb0 bb0Var8 = new bb0();
                            k2Var.presentFragment(bb0Var8);
                            bb0Var8.Z(360928);
                            return;
                        default:
                            bb0 bb0Var9 = new bb0();
                            k2Var.presentFragment(bb0Var9);
                            bb0Var9.a0(360928);
                            bb0Var9.Z(32);
                            return;
                    }
                }
            });
        } else {
            gy0Var22 = null;
        }
        gy0 gy0Var124 = new gy0(900, org.telegram.messenger.cd.K0(2131747081), null, 2131232018, new Runnable() {
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        return;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        return;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        return;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        return;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        return;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        return;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        return;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        return;
                }
            }
        });
        gy0Var124.a("tg://settings/power-saving");
        gy0 gy0Var125 = new gy0(901, org.telegram.messenger.cd.K0(2131748860), org.telegram.messenger.cd.K0(2131747081), 2131232018, new Runnable() {
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        return;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        return;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        return;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        return;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        return;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        return;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        return;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        return;
                }
            }
        });
        gy0Var125.a("tg://settings/power-saving/stickers");
        gy0 gy0Var126 = new gy0(902, org.telegram.messenger.cd.K0(2131748872), null, org.telegram.messenger.cd.K0(2131747081), org.telegram.messenger.cd.K0(2131748860), 2131232018, new Runnable() {
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        return;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        return;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        return;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        return;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        return;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        return;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        return;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        return;
                }
            }
        });
        gy0 gy0Var127 = new gy0(903, org.telegram.messenger.cd.K0(2131748874), null, org.telegram.messenger.cd.K0(2131747081), org.telegram.messenger.cd.K0(2131748860), 2131232018, new Runnable() {
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        return;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        return;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        return;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        return;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        return;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        return;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        return;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        return;
                }
            }
        });
        gy0 gy0Var128 = new gy0(904, org.telegram.messenger.cd.K0(2131748865), org.telegram.messenger.cd.K0(2131747081), 2131232018, new Runnable() {
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        return;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        return;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        return;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        return;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        return;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        return;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        return;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        return;
                }
            }
        });
        gy0Var128.a("tg://settings/power-saving/emoji");
        gy0 gy0Var129 = new gy0(905, org.telegram.messenger.cd.K0(2131748872), null, org.telegram.messenger.cd.K0(2131747081), org.telegram.messenger.cd.K0(2131748865), 2131232018, new Runnable() {
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        return;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        return;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        return;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        return;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        return;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        return;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        return;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        return;
                }
            }
        });
        gy0 gy0Var130 = new gy0(906, org.telegram.messenger.cd.K0(2131748871), null, org.telegram.messenger.cd.K0(2131747081), org.telegram.messenger.cd.K0(2131748865), 2131232018, new Runnable() {
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        return;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        return;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        return;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        return;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        return;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        return;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        return;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        return;
                }
            }
        });
        gy0 gy0Var131 = new gy0(907, org.telegram.messenger.cd.K0(2131748874), null, org.telegram.messenger.cd.K0(2131747081), org.telegram.messenger.cd.K0(2131748865), 2131232018, new Runnable() {
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        return;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        return;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        return;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        return;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        return;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        return;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        return;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        return;
                }
            }
        });
        gy0 gy0Var132 = new gy0(908, org.telegram.messenger.cd.K0(2131748866), org.telegram.messenger.cd.K0(2131747081), 2131232018, new Runnable() {
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        return;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        return;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        return;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        return;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        return;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        return;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        return;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        return;
                }
            }
        });
        gy0Var132.a("tg://settings/power-saving/effects");
        gy0 gy0Var133 = new gy0(909, org.telegram.messenger.cd.K0(2131748869), null, org.telegram.messenger.cd.K0(2131747081), org.telegram.messenger.cd.K0(2131748866), 2131232018, new Runnable() {
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        return;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        return;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        return;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        return;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        return;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        return;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        return;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        return;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        return;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        return;
                }
            }
        });
        gy0Var133.a("tg://settings/power-saving/background");
        gy0 gy0Var134 = new gy0(910, org.telegram.messenger.cd.K0(2131748857), null, org.telegram.messenger.cd.K0(2131747081), org.telegram.messenger.cd.K0(2131748866), 2131232018, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        return;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        return;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        return;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        return;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        return;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.f36162s;
                            if (i11 < arrayList.size()) {
                                if (((wa0) arrayList.get(i11)).f42913f == 1) {
                                    bb0Var8.f36157b.e1(new i2.q(bb0Var8, i11, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0 gy0Var135 = new gy0(911, org.telegram.messenger.cd.K0(2131748861), null, org.telegram.messenger.cd.K0(2131747081), org.telegram.messenger.cd.K0(2131748866), 2131232018, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        return;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        return;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        return;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        return;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        return;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.f36162s;
                            if (i11 < arrayList.size()) {
                                if (((wa0) arrayList.get(i11)).f42913f == 1) {
                                    bb0Var8.f36157b.e1(new i2.q(bb0Var8, i11, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        if (org.telegram.messenger.tz.o() >= 1) {
            gy0Var23 = new gy0(326, org.telegram.messenger.cd.K0(2131748868), null, org.telegram.messenger.cd.K0(2131747081), org.telegram.messenger.cd.K0(2131748866), 2131232018, new Runnable() {
                @Override
                public final void run() {
                    int i10 = r1;
                    int i11 = 0;
                    org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                    switch (i10) {
                        case 0:
                            bb0 bb0Var = new bb0();
                            k2Var2.presentFragment(bb0Var);
                            bb0Var.a0(360928);
                            bb0Var.Z(64);
                            return;
                        case 1:
                            bb0 bb0Var2 = new bb0();
                            k2Var2.presentFragment(bb0Var2);
                            bb0Var2.a0(360928);
                            bb0Var2.Z(128);
                            return;
                        case 2:
                            k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            bb0 bb0Var3 = new bb0();
                            k2Var2.presentFragment(bb0Var3);
                            bb0Var3.a0(360928);
                            bb0Var3.Z(256);
                            return;
                        case 4:
                            bb0 bb0Var4 = new bb0();
                            k2Var2.presentFragment(bb0Var4);
                            bb0Var4.a0(360928);
                            bb0Var4.Z(32768);
                            return;
                        case 5:
                            bb0 bb0Var5 = new bb0();
                            k2Var2.presentFragment(bb0Var5);
                            bb0Var5.Z(512);
                            return;
                        case 6:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            bb0 bb0Var6 = new bb0();
                            k2Var2.presentFragment(bb0Var6);
                            bb0Var6.Z(1024);
                            return;
                        case 8:
                            bb0 bb0Var7 = new bb0();
                            k2Var2.presentFragment(bb0Var7);
                            bb0Var7.Z(2048);
                            return;
                        case 9:
                            bb0 bb0Var8 = new bb0();
                            k2Var2.presentFragment(bb0Var8);
                            while (true) {
                                ArrayList arrayList = bb0Var8.f36162s;
                                if (i11 < arrayList.size()) {
                                    if (((wa0) arrayList.get(i11)).f42913f == 1) {
                                        bb0Var8.f36157b.e1(new i2.q(bb0Var8, i11, 14), 700, true);
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
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                            return;
                        case 16:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                            k2Var2.presentFragment(PasscodeActivity.o0());
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
                            av0 av0Var = new av0();
                            av0Var.getMessagesController().F0(true);
                            k2Var2.presentFragment(av0Var);
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
            gy0Var23 = null;
        }
        gy0 gy0Var136 = new gy0(912, org.telegram.messenger.cd.K0(2131748862), null, org.telegram.messenger.cd.K0(2131747081), org.telegram.messenger.cd.K0(2131748866), 2131232018, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        return;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        return;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        return;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        return;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        return;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.f36162s;
                            if (i11 < arrayList.size()) {
                                if (((wa0) arrayList.get(i11)).f42913f == 1) {
                                    bb0Var8.f36157b.e1(new i2.q(bb0Var8, i11, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0 gy0Var137 = new gy0(913, org.telegram.messenger.cd.K0(2131748867), org.telegram.messenger.cd.K0(2131747081), 2131232018, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        return;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        return;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        return;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        return;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        return;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.f36162s;
                            if (i11 < arrayList.size()) {
                                if (((wa0) arrayList.get(i11)).f42913f == 1) {
                                    bb0Var8.f36157b.e1(new i2.q(bb0Var8, i11, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var137.a("tg://settings/power-saving/call-animations");
        gy0 gy0Var138 = new gy0(214, org.telegram.messenger.cd.K0(2131748870), org.telegram.messenger.cd.K0(2131747081), 2131232018, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        return;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        return;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        return;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        return;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        return;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.f36162s;
                            if (i11 < arrayList.size()) {
                                if (((wa0) arrayList.get(i11)).f42913f == 1) {
                                    bb0Var8.f36157b.e1(new i2.q(bb0Var8, i11, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var138.a("tg://settings/power-saving/videos");
        gy0 gy0Var139 = new gy0(213, org.telegram.messenger.cd.K0(2131748873), org.telegram.messenger.cd.K0(2131747081), 2131232018, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        return;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        return;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        return;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        return;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        return;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.f36162s;
                            if (i11 < arrayList.size()) {
                                if (((wa0) arrayList.get(i11)).f42913f == 1) {
                                    bb0Var8.f36157b.e1(new i2.q(bb0Var8, i11, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var139.a("tg://settings/power-saving/gifs");
        gy0 gy0Var140 = new gy0(914, org.telegram.messenger.cd.K0(2131748856), org.telegram.messenger.cd.K0(2131747081), 2131232018, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        return;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        return;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        return;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        return;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        return;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.f36162s;
                            if (i11 < arrayList.size()) {
                                if (((wa0) arrayList.get(i11)).f42913f == 1) {
                                    bb0Var8.f36157b.e1(new i2.q(bb0Var8, i11, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var140.a("tg://settings/power-saving/transitions");
        gy0 gy0Var141 = new gy0(400, org.telegram.messenger.cd.K0(2131749064), 2131232029, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        return;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        return;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        return;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        return;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        return;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.f36162s;
                            if (i11 < arrayList.size()) {
                                if (((wa0) arrayList.get(i11)).f42913f == 1) {
                                    bb0Var8.f36157b.e1(new i2.q(bb0Var8, i11, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var141.a("tg://settings/language");
        gy0 gy0Var142 = new gy0(405, org.telegram.messenger.cd.K0(2131745345), org.telegram.messenger.cd.K0(2131749064), 2131232029, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        return;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        return;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        return;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        return;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        return;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.f36162s;
                            if (i11 < arrayList.size()) {
                                if (((wa0) arrayList.get(i11)).f42913f == 1) {
                                    bb0Var8.f36157b.e1(new i2.q(bb0Var8, i11, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var142.a("tg://settings/language/show-button");
        if (org.telegram.messenger.vp.r1(currentAccount).S1().s()) {
            gy0 gy0Var143 = new gy0(406, org.telegram.messenger.cd.K0(2131751359), org.telegram.messenger.cd.K0(2131749064), 2131232029, new Runnable() {
                @Override
                public final void run() {
                    int i10 = r1;
                    int i11 = 0;
                    org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                    switch (i10) {
                        case 0:
                            bb0 bb0Var = new bb0();
                            k2Var2.presentFragment(bb0Var);
                            bb0Var.a0(360928);
                            bb0Var.Z(64);
                            return;
                        case 1:
                            bb0 bb0Var2 = new bb0();
                            k2Var2.presentFragment(bb0Var2);
                            bb0Var2.a0(360928);
                            bb0Var2.Z(128);
                            return;
                        case 2:
                            k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            bb0 bb0Var3 = new bb0();
                            k2Var2.presentFragment(bb0Var3);
                            bb0Var3.a0(360928);
                            bb0Var3.Z(256);
                            return;
                        case 4:
                            bb0 bb0Var4 = new bb0();
                            k2Var2.presentFragment(bb0Var4);
                            bb0Var4.a0(360928);
                            bb0Var4.Z(32768);
                            return;
                        case 5:
                            bb0 bb0Var5 = new bb0();
                            k2Var2.presentFragment(bb0Var5);
                            bb0Var5.Z(512);
                            return;
                        case 6:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            bb0 bb0Var6 = new bb0();
                            k2Var2.presentFragment(bb0Var6);
                            bb0Var6.Z(1024);
                            return;
                        case 8:
                            bb0 bb0Var7 = new bb0();
                            k2Var2.presentFragment(bb0Var7);
                            bb0Var7.Z(2048);
                            return;
                        case 9:
                            bb0 bb0Var8 = new bb0();
                            k2Var2.presentFragment(bb0Var8);
                            while (true) {
                                ArrayList arrayList = bb0Var8.f36162s;
                                if (i11 < arrayList.size()) {
                                    if (((wa0) arrayList.get(i11)).f42913f == 1) {
                                        bb0Var8.f36157b.e1(new i2.q(bb0Var8, i11, 14), 700, true);
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
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                            return;
                        case 16:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                            k2Var2.presentFragment(PasscodeActivity.o0());
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
                            av0 av0Var = new av0();
                            av0Var.getMessagesController().F0(true);
                            k2Var2.presentFragment(av0Var);
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
            gy0Var143.a("tg://settings/language/do-not-translate");
            gy0Var44 = gy0Var143;
        }
        gy0 gy0Var144 = new gy0(402, org.telegram.messenger.cd.K0(2131753986), org.telegram.messenger.cd.K0(2131745497), 2131232028, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        return;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        return;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        return;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        return;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        return;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.f36162s;
                            if (i11 < arrayList.size()) {
                                if (((wa0) arrayList.get(i11)).f42913f == 1) {
                                    bb0Var8.f36157b.e1(new i2.q(bb0Var8, i11, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var144.a("tg://settings/ask-question");
        gy0 gy0Var145 = new gy0(403, org.telegram.messenger.cd.K0(2131744267), org.telegram.messenger.cd.K0(2131745497), 2131232028, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        return;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        return;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        return;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        return;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        return;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.f36162s;
                            if (i11 < arrayList.size()) {
                                if (((wa0) arrayList.get(i11)).f42913f == 1) {
                                    bb0Var8.f36157b.e1(new i2.q(bb0Var8, i11, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var145.a("tg://settings/faq");
        gy0 gy0Var146 = new gy0(404, org.telegram.messenger.cd.K0(2131746798), org.telegram.messenger.cd.K0(2131745497), 2131232028, new Runnable() {
            @Override
            public final void run() {
                int i10 = r1;
                int i11 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i10) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        return;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        return;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        return;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        return;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        return;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        return;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        return;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.f36162s;
                            if (i11 < arrayList.size()) {
                                if (((wa0) arrayList.get(i11)).f42913f == 1) {
                                    bb0Var8.f36157b.e1(new i2.q(bb0Var8, i11, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        return;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var146.a("tg://settings/privacy-policy");
        return new gy0[]{gy0Var24, gy0Var25, gy0Var26, gy0Var27, gy0Var28, gy0Var29, gy0Var30, gy0Var31, gy0Var32, gy0Var33, gy0Var34, gy0Var35, gy0Var36, gy0Var37, gy0Var38, gy0Var39, gy0Var40, gy0Var, gy0Var42, gy0Var43, gy0Var2, gy0Var45, gy0Var46, gy0Var47, gy0Var48, gy0Var49, gy0Var50, gy0Var51, gy0Var52, gy0Var53, gy0Var3, gy0Var4, gy0Var55, gy0Var56, gy0Var57, gy0Var58, gy0Var59, gy0Var60, gy0Var61, gy0Var62, gy0Var63, gy0Var64, gy0Var65, gy0Var66, gy0Var67, gy0Var68, gy0Var69, gy0Var70, gy0Var71, gy0Var72, gy0Var73, gy0Var74, gy0Var75, gy0Var76, gy0Var77, gy0Var78, gy0Var79, gy0Var80, gy0Var81, gy0Var82, gy0Var83, gy0Var84, gy0Var85, gy0Var86, gy0Var87, gy0Var88, gy0Var89, gy0Var90, gy0Var91, gy0Var92, gy0Var93, gy0Var94, gy0Var95, gy0Var96, gy0Var97, gy0Var98, gy0Var99, gy0Var100, gy0Var101, gy0Var102, gy0Var103, gy0Var104, gy0Var105, gy0Var106, gy0Var107, gy0Var108, gy0Var109, gy0Var110, gy0Var111, gy0Var112, gy0Var113, gy0Var6, gy0Var115, gy0Var7, gy0Var117, gy0Var8, gy0Var119, gy0Var120, gy0Var121, gy0Var122, gy0Var5, gy0Var9, gy0Var10, gy0Var11, gy0Var12, gy0Var13, gy0Var14, gy0Var15, gy0Var16, gy0Var17, gy0Var18, gy0Var19, gy0Var20, gy0Var21, gy0Var22, gy0Var124, gy0Var125, gy0Var126, gy0Var127, gy0Var128, gy0Var129, gy0Var130, gy0Var131, gy0Var132, gy0Var133, gy0Var134, gy0Var135, gy0Var23, gy0Var136, gy0Var137, gy0Var138, gy0Var139, gy0Var140, gy0Var141, gy0Var142, gy0Var44, gy0Var144, gy0Var145, gy0Var146};
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47901f == 0) {
            return true;
        }
        return false;
    }

    public final void E(Object obj) {
        ArrayList arrayList = this.f38058w;
        int indexOf = arrayList.indexOf(obj);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
        }
        arrayList.add(0, obj);
        if (!this.f38059x) {
            f();
        }
        if (arrayList.size() > 20) {
            a1.g.x(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof gy0) {
                ((gy0) obj2).f37673g = i10;
            } else if (obj2 instanceof org.telegram.messenger.hp) {
                ((org.telegram.messenger.hp) obj2).d = i10;
            }
            linkedHashSet.add(obj2.toString());
        }
        org.telegram.messenger.vp.d1().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i10 = this.f38054f;
        TLRPC.WebPage webPage = org.telegram.messenger.vp.r1(i10).f18877q2;
        this.E = webPage;
        if (webPage != null) {
            this.d.addAll(org.telegram.messenger.vp.r1(i10).f18869p2);
        }
        if (this.E == null && !this.F) {
            this.F = true;
            TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
            tL_messages_getWebPage.url = org.telegram.messenger.cd.L0(2131744265, null);
            tL_messages_getWebPage.hash = 0;
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getWebPage, new k(this, 21));
        }
    }

    public final void I(String str) {
        this.D = str;
        if (this.f38060y != null) {
            Utilities.f14522g.a(this.f38060y);
            this.f38060y = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.f38059x = false;
            this.f38056r.clear();
            this.f38057s.clear();
            this.f38055n.clear();
            org.telegram.ui.ActionBar.k2 k2Var = this.e;
            if (k2Var instanceof ProfileActivity) {
                try {
                    ((ProfileActivity) k2Var).O.f25550b.getImageReceiver().P0(false);
                    ((ProfileActivity) this.e).O.d.setText(org.telegram.messenger.cd.L0(2131745495, null));
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
            f();
            return;
        }
        org.telegram.messenger.r5 r5Var = Utilities.f14522g;
        et0 et0Var = new et0(20, this, str);
        this.f38060y = et0Var;
        r5Var.d(et0Var, 300L);
    }

    public final void J() {
        String[] strArr;
        gy0 gy0Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            gy0[] gy0VarArr = this.f38053c;
            if (i10 >= gy0VarArr.length) {
                break;
            }
            gy0 gy0Var2 = gy0VarArr[i10];
            if (gy0Var2 != null) {
                hashMap.put(Integer.valueOf(gy0Var2.f37672f), this.f38053c[i10]);
            }
            i10++;
        }
        Set<String> stringSet = org.telegram.messenger.vp.d1().getStringSet("settingsSearchRecent2", null);
        ArrayList arrayList = this.f38058w;
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
                        org.telegram.messenger.hp hpVar = new org.telegram.messenger.hp(readString, strArr, serializedData.readString(false));
                        hpVar.d = readInt32;
                        arrayList.add(hpVar);
                    } else if (readInt322 == 1 && (gy0Var = (gy0) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        gy0Var.f37673g = readInt32;
                        arrayList.add(gy0Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new ex0(this, 1));
    }

    @Override
    public final int b() {
        int size;
        int i10 = 0;
        if (this.f38059x) {
            int size2 = this.f38056r.size();
            if (!this.f38057s.isEmpty()) {
                i10 = this.f38057s.size() + 1;
            }
            return size2 + i10;
        }
        ArrayList arrayList = this.f38058w;
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
        if (this.f38059x) {
            if (i10 < this.f38056r.size() || i10 != this.f38056r.size()) {
                return 0;
            }
        } else {
            ArrayList arrayList = this.f38058w;
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
        int i12 = c1Var.f47901f;
        View view = c1Var.f47898a;
        gy0 gy0Var = null;
        boolean z10 = true;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    ((org.telegram.ui.Cells.p4) view).setText(org.telegram.messenger.cd.L0(2131745487, null));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.z3) view).setText(org.telegram.messenger.cd.L0(2131745500, null));
            return;
        }
        org.telegram.ui.Cells.z6 z6Var = (org.telegram.ui.Cells.z6) view;
        boolean z11 = false;
        if (this.f38059x) {
            if (i10 < this.f38056r.size()) {
                gy0 gy0Var2 = (gy0) this.f38056r.get(i10);
                if (i10 > 0) {
                    gy0Var = (gy0) this.f38056r.get(i10 - 1);
                }
                if (gy0Var != null && gy0Var.e == gy0Var2.e) {
                    i11 = 0;
                } else {
                    i11 = gy0Var2.e;
                }
                CharSequence charSequence = (CharSequence) this.f38055n.get(i10);
                String[] strArr = gy0Var2.d;
                if (i10 >= this.f38056r.size() - 1) {
                    z10 = false;
                }
                z6Var.b(charSequence, strArr, i11, z10);
                return;
            }
            int e = sc.e.e(1, i10, this.f38056r);
            CharSequence charSequence2 = (CharSequence) this.f38055n.get(this.f38056r.size() + e);
            String[] strArr2 = ((org.telegram.messenger.hp) this.f38057s.get(e)).f15927b;
            if (e < this.f38056r.size() - 1) {
                z11 = true;
            }
            z6Var.a(charSequence2, strArr2, true, z11);
            return;
        }
        ArrayList arrayList = this.f38058w;
        if (!arrayList.isEmpty()) {
            i10--;
        }
        if (i10 < arrayList.size()) {
            Object obj = arrayList.get(i10);
            if (obj instanceof gy0) {
                gy0 gy0Var3 = (gy0) obj;
                String str = gy0Var3.f37669a;
                String[] strArr3 = gy0Var3.d;
                if (i10 >= arrayList.size() - 1) {
                    z10 = false;
                }
                z6Var.a(str, strArr3, false, z10);
                return;
            } else if (obj instanceof org.telegram.messenger.hp) {
                org.telegram.messenger.hp hpVar = (org.telegram.messenger.hp) obj;
                String str2 = hpVar.f15926a;
                String[] strArr4 = hpVar.f15927b;
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
        org.telegram.messenger.hp hpVar2 = (org.telegram.messenger.hp) this.d.get(e7);
        String str3 = hpVar2.f15926a;
        String[] strArr5 = hpVar2.f15927b;
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
