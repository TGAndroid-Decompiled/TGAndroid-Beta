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
public class lw0 extends org.telegram.ui.Components.sj0 {
    public String E;
    public TLRPC.WebPage F;
    public boolean G;
    public kw0[] f47450c;
    public final org.telegram.ui.ActionBar.d2 f47451e;
    public final int f47452f;
    public final Context h;
    public boolean f47457x;
    public qv0 f47458y;
    public final ArrayList d = new ArrayList();
    public ArrayList f47453n = new ArrayList();
    public ArrayList f47454r = new ArrayList();
    public ArrayList f47455s = new ArrayList();
    public final ArrayList f47456w = new ArrayList();

    public lw0(Context context, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f47451e = d2Var;
        this.f47452f = d2Var.getCurrentAccount();
        this.h = context;
        this.f47450c = H(d2Var);
        J();
    }

    public static boolean F(int i3, int i10) {
        if (org.telegram.messenger.hp.s1(i3).D3() && !org.telegram.messenger.h10.i(i3).q()) {
            return false;
        }
        if (i10 != -1 && org.telegram.messenger.hp.s1(i3).O0.get(i10, -1) == -1) {
            return false;
        }
        return true;
    }

    public static kw0[] H(final org.telegram.ui.ActionBar.d2 d2Var) {
        kw0 kw0Var;
        kw0 kw0Var2;
        kw0 kw0Var3;
        kw0 kw0Var4;
        kw0 kw0Var5;
        kw0 kw0Var6;
        kw0 kw0Var7;
        kw0 kw0Var8;
        kw0 kw0Var9;
        kw0 kw0Var10;
        kw0 kw0Var11;
        kw0 kw0Var12;
        kw0 kw0Var13;
        kw0 kw0Var14;
        kw0 kw0Var15;
        kw0 kw0Var16;
        kw0 kw0Var17;
        kw0 kw0Var18;
        kw0 kw0Var19;
        kw0 kw0Var20;
        kw0 kw0Var21;
        kw0 kw0Var22;
        kw0 kw0Var23;
        final int currentAccount = d2Var.getCurrentAccount();
        kw0 kw0Var24 = new kw0(500, org.telegram.messenger.bd.L0(2131751265), 0, new qv0(1, d2Var, d2Var.getResourceProvider()));
        kw0 kw0Var25 = new kw0(501, org.telegram.messenger.bd.L0(2131752537), 0, new Runnable() {
            @Override
            public final void run() {
                int i3 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i3) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        return;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        return;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        return;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        return;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        return;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        return;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        return;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.f49748s;
                            if (i10 < arrayList.size()) {
                                if (((o90) arrayList.get(i10)).f48239f == 1) {
                                    t90Var8.f49742b.e1(new k2.q(t90Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        return;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        return;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        return;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        return;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        return;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        kw0Var25.a("tg://settings/edit/change-number");
        kw0 kw0Var26 = new kw0(502, org.telegram.messenger.bd.L0(2131754468), 0, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                if (org.telegram.messenger.h10.i(i3).p()) {
                                    i3++;
                                }
                            } else {
                                i3 = -1;
                            }
                        }
                        if (i3 >= 0) {
                            d2Var.presentFragment(new xd0(i3));
                            return;
                        }
                        return;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        d2Var.presentFragment(new z6());
                        return;
                    case 24:
                        d2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 26:
                        d2Var.presentFragment(new z6());
                        return;
                    case 27:
                        d2Var.presentFragment(new z6());
                        return;
                    case 28:
                        d2Var.presentFragment(new ht());
                        return;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        kw0Var26.a("tg://settings/edit/add-account");
        kw0 kw0Var27 = new kw0(1, org.telegram.messenger.bd.L0(2131747930), 2131232262, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                if (org.telegram.messenger.h10.i(i3).p()) {
                                    i3++;
                                }
                            } else {
                                i3 = -1;
                            }
                        }
                        if (i3 >= 0) {
                            d2Var.presentFragment(new xd0(i3));
                            return;
                        }
                        return;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        d2Var.presentFragment(new z6());
                        return;
                    case 24:
                        d2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 26:
                        d2Var.presentFragment(new z6());
                        return;
                    case 27:
                        d2Var.presentFragment(new z6());
                        return;
                    case 28:
                        d2Var.presentFragment(new ht());
                        return;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        kw0Var27.a("tg://settings/notifications");
        kw0 kw0Var28 = new kw0(2, org.telegram.messenger.bd.L0(2131747886), org.telegram.messenger.bd.L0(2131747930), 2131232262, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                if (org.telegram.messenger.h10.i(i3).p()) {
                                    i3++;
                                }
                            } else {
                                i3 = -1;
                            }
                        }
                        if (i3 >= 0) {
                            d2Var.presentFragment(new xd0(i3));
                            return;
                        }
                        return;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        d2Var.presentFragment(new z6());
                        return;
                    case 24:
                        d2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 26:
                        d2Var.presentFragment(new z6());
                        return;
                    case 27:
                        d2Var.presentFragment(new z6());
                        return;
                    case 28:
                        d2Var.presentFragment(new ht());
                        return;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        kw0Var28.a("tg://settings/notifications/private-chats");
        kw0 kw0Var29 = new kw0(3, org.telegram.messenger.bd.L0(2131747915), org.telegram.messenger.bd.L0(2131747930), 2131232262, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                }
            }
        });
        kw0Var29.a("tg://settings/notifications/groups");
        kw0 kw0Var30 = new kw0(4, org.telegram.messenger.bd.L0(2131747929), org.telegram.messenger.bd.L0(2131747930), 2131232262, new nf0(7, d2Var));
        kw0Var30.a("tg://settings/notifications/channels");
        kw0 kw0Var31 = new kw0(5, org.telegram.messenger.bd.L0(2131743289), "callsSectionRow", org.telegram.messenger.bd.L0(2131747930), 2131232262, new nf0(19, d2Var));
        kw0 kw0Var32 = new kw0(6, org.telegram.messenger.bd.L0(2131753733), "badgeNumberSection", org.telegram.messenger.bd.L0(2131747930), 2131232262, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        return;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        return;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        return;
                    case 18:
                        d2Var.presentFragment(new t90());
                        return;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        return;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        return;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        return;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        return;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        return;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        return;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        return;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        return;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        return;
                }
            }
        });
        kw0 kw0Var33 = new kw0(7, org.telegram.messenger.bd.L0(2131749227), "inappSectionRow", org.telegram.messenger.bd.L0(2131747930), 2131232262, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        return;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        return;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        return;
                    case 18:
                        d2Var.presentFragment(new t90());
                        return;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        return;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        return;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        return;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        return;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        return;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        return;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        return;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        return;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        return;
                }
            }
        });
        kw0 kw0Var34 = new kw0(8, org.telegram.messenger.bd.L0(2131751790), "contactJoinedRow", org.telegram.messenger.bd.L0(2131747930), 2131232262, new nf0(23, d2Var));
        kw0Var34.a("tg://settings/notifications/new-contacts");
        kw0 kw0Var35 = new kw0(9, org.telegram.messenger.bd.L0(2131747236), "pinnedMessageRow", org.telegram.messenger.bd.L0(2131747930), 2131232262, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        return;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        return;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        return;
                    case 18:
                        d2Var.presentFragment(new t90());
                        return;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        return;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        return;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        return;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        return;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        return;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        return;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        return;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        return;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        return;
                }
            }
        });
        kw0Var35.a("tg://settings/notifications/pinned-messages");
        kw0 kw0Var36 = new kw0(10, org.telegram.messenger.bd.L0(2131746122), "resetNotificationsRow", org.telegram.messenger.bd.L0(2131747930), 2131232262, new Runnable() {
            @Override
            public final void run() {
                int i3 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i3) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        return;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        return;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        return;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        return;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        return;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        return;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        return;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.f49748s;
                            if (i10 < arrayList.size()) {
                                if (((o90) arrayList.get(i10)).f48239f == 1) {
                                    t90Var8.f49742b.e1(new k2.q(t90Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        return;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        return;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        return;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        return;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        return;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        kw0Var36.a("tg://settings/notifications/reset");
        kw0 kw0Var37 = new kw0(11, org.telegram.messenger.bd.L0(2131747884), "notificationsServiceRow", org.telegram.messenger.bd.L0(2131747930), 2131232262, new Runnable() {
            @Override
            public final void run() {
                int i3 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i3) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        return;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        return;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        return;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        return;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        return;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        return;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        return;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.f49748s;
                            if (i10 < arrayList.size()) {
                                if (((o90) arrayList.get(i10)).f48239f == 1) {
                                    t90Var8.f49742b.e1(new k2.q(t90Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        return;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        return;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        return;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        return;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        return;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        kw0 kw0Var38 = new kw0(12, org.telegram.messenger.bd.L0(2131747883), "notificationsServiceConnectionRow", org.telegram.messenger.bd.L0(2131747930), 2131232262, new Runnable() {
            @Override
            public final void run() {
                int i3 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i3) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        return;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        return;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        return;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        return;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        return;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        return;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        return;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.f49748s;
                            if (i10 < arrayList.size()) {
                                if (((o90) arrayList.get(i10)).f48239f == 1) {
                                    t90Var8.f49742b.e1(new k2.q(t90Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        return;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        return;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        return;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        return;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        return;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        kw0 kw0Var39 = new kw0(13, org.telegram.messenger.bd.L0(2131746283), "repeatRow", org.telegram.messenger.bd.L0(2131747930), 2131232262, new Runnable() {
            @Override
            public final void run() {
                int i3 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i3) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        return;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        return;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        return;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        return;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        return;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        return;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        return;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.f49748s;
                            if (i10 < arrayList.size()) {
                                if (((o90) arrayList.get(i10)).f48239f == 1) {
                                    t90Var8.f49742b.e1(new k2.q(t90Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        return;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        return;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        return;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        return;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        return;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        kw0 kw0Var40 = new kw0(100, org.telegram.messenger.bd.L0(2131746779), 2131232355, new Runnable() {
            @Override
            public final void run() {
                int i3 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i3) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        return;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        return;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        return;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        return;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        return;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        return;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        return;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.f49748s;
                            if (i10 < arrayList.size()) {
                                if (((o90) arrayList.get(i10)).f48239f == 1) {
                                    t90Var8.f49742b.e1(new k2.q(t90Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        return;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        return;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        return;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        return;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        return;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        kw0Var40.a("tg://settings/privacy");
        kw0 kw0Var41 = new kw0(109, org.telegram.messenger.bd.L0(2131743948), org.telegram.messenger.bd.L0(2131746779), 2131232036, new Runnable() {
            @Override
            public final void run() {
                int i3 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i3) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        return;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        return;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        return;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        return;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        return;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        return;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        return;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.f49748s;
                            if (i10 < arrayList.size()) {
                                if (((o90) arrayList.get(i10)).f48239f == 1) {
                                    t90Var8.f49742b.e1(new k2.q(t90Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        return;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        return;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        return;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        return;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        return;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        kw0Var41.a("tg://settings/privacy/2sv");
        kw0 kw0Var42 = new kw0(124, org.telegram.messenger.bd.L0(2131753850), org.telegram.messenger.bd.L0(2131746779), 2131232036, new Runnable() {
            @Override
            public final void run() {
                int i3 = r2;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                int i10 = currentAccount;
                switch (i3) {
                    case 0:
                        if (org.telegram.messenger.h10.i(i10).f22852q0 >= 0) {
                            d2Var2.presentFragment(new r4());
                            return;
                        }
                        return;
                    default:
                        if (!org.telegram.messenger.h10.i(i10).q()) {
                            org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(d2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.ib ibVar = new org.telegram.ui.Components.ib(a02.W(), null);
                            ibVar.d(2131624346, new String[0]);
                            String M0 = org.telegram.messenger.bd.M0(2131746763, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                            int indexOf = M0.indexOf(42);
                            int lastIndexOf = M0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) M0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new gi.ka(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            ibVar.f34651b.setText(spannableStringBuilder);
                            ibVar.f34651b.setSingleLine(false);
                            ibVar.f34651b.setMaxLines(2);
                            a02.b(ibVar, 2750).j();
                            return;
                        }
                        d2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        kw0Var42.a("tg://settings/privacy/auto-delete");
        kw0 kw0Var43 = new kw0(108, org.telegram.messenger.bd.L0(2131747665), org.telegram.messenger.bd.L0(2131746779), 2131232036, new Runnable() {
            @Override
            public final void run() {
                int i3 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i3) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        return;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        return;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        return;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        return;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        return;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        return;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        return;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.f49748s;
                            if (i10 < arrayList.size()) {
                                if (((o90) arrayList.get(i10)).f48239f == 1) {
                                    t90Var8.f49742b.e1(new k2.q(t90Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        return;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        return;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        return;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        return;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        return;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        kw0Var43.a("tg://settings/privacy/passcode");
        kw0 kw0Var44 = null;
        if (org.telegram.messenger.az.m1) {
            kw0Var = kw0Var41;
            kw0Var2 = new kw0(125, org.telegram.messenger.bd.L0(2131751203), "emailLoginRow", org.telegram.messenger.bd.L0(2131746779), 2131232036, new Runnable() {
                @Override
                public final void run() {
                    int i3 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                    switch (i3) {
                        case 0:
                            t90 t90Var = new t90();
                            d2Var2.presentFragment(t90Var);
                            t90Var.b0(360928);
                            t90Var.a0(64);
                            return;
                        case 1:
                            t90 t90Var2 = new t90();
                            d2Var2.presentFragment(t90Var2);
                            t90Var2.b0(360928);
                            t90Var2.a0(128);
                            return;
                        case 2:
                            d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            t90 t90Var3 = new t90();
                            d2Var2.presentFragment(t90Var3);
                            t90Var3.b0(360928);
                            t90Var3.a0(256);
                            return;
                        case 4:
                            t90 t90Var4 = new t90();
                            d2Var2.presentFragment(t90Var4);
                            t90Var4.b0(360928);
                            t90Var4.a0(32768);
                            return;
                        case 5:
                            t90 t90Var5 = new t90();
                            d2Var2.presentFragment(t90Var5);
                            t90Var5.a0(512);
                            return;
                        case 6:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            t90 t90Var6 = new t90();
                            d2Var2.presentFragment(t90Var6);
                            t90Var6.a0(1024);
                            return;
                        case 8:
                            t90 t90Var7 = new t90();
                            d2Var2.presentFragment(t90Var7);
                            t90Var7.a0(2048);
                            return;
                        case 9:
                            t90 t90Var8 = new t90();
                            d2Var2.presentFragment(t90Var8);
                            while (true) {
                                ArrayList arrayList = t90Var8.f49748s;
                                if (i10 < arrayList.size()) {
                                    if (((o90) arrayList.get(i10)).f48239f == 1) {
                                        t90Var8.f49742b.e1(new k2.q(t90Var8, i10, 13), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            return;
                        case 14:
                            d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                            return;
                        case 15:
                            sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                            return;
                        case 16:
                            sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                            return;
                        case 17:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            d2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            d2Var2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            d2Var2.presentFragment(PasscodeActivity.p0());
                            return;
                        case 23:
                            vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                            v0Var2.K0();
                            d2Var2.showDialog(v0Var2);
                            return;
                        case 24:
                            d2Var2.presentFragment(new g(3));
                            return;
                        case 25:
                            d2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            it0 it0Var = new it0();
                            it0Var.getMessagesController().F0(true);
                            d2Var2.presentFragment(it0Var);
                            return;
                        case 27:
                            d2Var2.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
            kw0Var2.a("tg://settings/privacy/login-email");
        } else {
            kw0Var = kw0Var41;
            kw0Var2 = null;
        }
        kw0 kw0Var45 = new kw0(101, org.telegram.messenger.bd.L0(2131753681), org.telegram.messenger.bd.L0(2131746779), 2131232355, new Runnable() {
            @Override
            public final void run() {
                int i3 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i3) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        return;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        return;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        return;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        return;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        return;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        return;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        return;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.f49748s;
                            if (i10 < arrayList.size()) {
                                if (((o90) arrayList.get(i10)).f48239f == 1) {
                                    t90Var8.f49742b.e1(new k2.q(t90Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        return;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        return;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        return;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        return;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        return;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        kw0Var45.a("tg://settings/privacy/blocked");
        kw0 kw0Var46 = new kw0(110, org.telegram.messenger.bd.L0(2131745561), 2131232036, new Runnable() {
            @Override
            public final void run() {
                int i3 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i3) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        return;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        return;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        return;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        return;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        return;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        return;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        return;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.f49748s;
                            if (i10 < arrayList.size()) {
                                if (((o90) arrayList.get(i10)).f48239f == 1) {
                                    t90Var8.f49742b.e1(new k2.q(t90Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        return;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        return;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        return;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        return;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        return;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        kw0Var46.a("tg://settings/devices");
        kw0 kw0Var47 = new kw0(105, org.telegram.messenger.bd.L0(2131746798), org.telegram.messenger.bd.L0(2131746779), 2131232355, new Runnable() {
            @Override
            public final void run() {
                int i3 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i3) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        return;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        return;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        return;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        return;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        return;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        return;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        return;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.f49748s;
                            if (i10 < arrayList.size()) {
                                if (((o90) arrayList.get(i10)).f48239f == 1) {
                                    t90Var8.f49742b.e1(new k2.q(t90Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        return;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        return;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        return;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        return;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        return;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        kw0Var47.a("tg://settings/privacy/phone-number/");
        kw0 kw0Var48 = new kw0(102, org.telegram.messenger.bd.L0(2131746823), org.telegram.messenger.bd.L0(2131746779), 2131232355, new Runnable() {
            @Override
            public final void run() {
                int i3 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i3) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        return;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        return;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        return;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        return;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        return;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        return;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        return;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.f49748s;
                            if (i10 < arrayList.size()) {
                                if (((o90) arrayList.get(i10)).f48239f == 1) {
                                    t90Var8.f49742b.e1(new k2.q(t90Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        return;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        return;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        return;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        return;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        return;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        kw0Var48.a("tg://settings/privacy/last-seen");
        kw0 kw0Var49 = new kw0(103, org.telegram.messenger.bd.L0(2131746785), org.telegram.messenger.bd.L0(2131746779), 2131232355, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                if (org.telegram.messenger.h10.i(i3).p()) {
                                    i3++;
                                }
                            } else {
                                i3 = -1;
                            }
                        }
                        if (i3 >= 0) {
                            d2Var.presentFragment(new xd0(i3));
                            return;
                        }
                        return;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        d2Var.presentFragment(new z6());
                        return;
                    case 24:
                        d2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 26:
                        d2Var.presentFragment(new z6());
                        return;
                    case 27:
                        d2Var.presentFragment(new z6());
                        return;
                    case 28:
                        d2Var.presentFragment(new ht());
                        return;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        kw0Var49.a("tg://settings/privacy/profile-photos");
        kw0 kw0Var50 = new kw0(104, org.telegram.messenger.bd.L0(2131746845), org.telegram.messenger.bd.L0(2131746779), 2131232355, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                if (org.telegram.messenger.h10.i(i3).p()) {
                                    i3++;
                                }
                            } else {
                                i3 = -1;
                            }
                        }
                        if (i3 >= 0) {
                            d2Var.presentFragment(new xd0(i3));
                            return;
                        }
                        return;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        d2Var.presentFragment(new z6());
                        return;
                    case 24:
                        d2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 26:
                        d2Var.presentFragment(new z6());
                        return;
                    case 27:
                        d2Var.presentFragment(new z6());
                        return;
                    case 28:
                        d2Var.presentFragment(new ht());
                        return;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        kw0Var50.a("tg://settings/privacy/forwards");
        kw0 kw0Var51 = new kw0(122, org.telegram.messenger.bd.L0(2131746808), org.telegram.messenger.bd.L0(2131746779), 2131232355, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                if (org.telegram.messenger.h10.i(i3).p()) {
                                    i3++;
                                }
                            } else {
                                i3 = -1;
                            }
                        }
                        if (i3 >= 0) {
                            d2Var.presentFragment(new xd0(i3));
                            return;
                        }
                        return;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        d2Var.presentFragment(new z6());
                        return;
                    case 24:
                        d2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 26:
                        d2Var.presentFragment(new z6());
                        return;
                    case 27:
                        d2Var.presentFragment(new z6());
                        return;
                    case 28:
                        d2Var.presentFragment(new ht());
                        return;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        kw0Var51.a("tg://settings/privacy/calls/p2p");
        kw0 kw0Var52 = new kw0(106, org.telegram.messenger.bd.L0(2131752596), org.telegram.messenger.bd.L0(2131746779), 2131232355, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                if (org.telegram.messenger.h10.i(i3).p()) {
                                    i3++;
                                }
                            } else {
                                i3 = -1;
                            }
                        }
                        if (i3 >= 0) {
                            d2Var.presentFragment(new xd0(i3));
                            return;
                        }
                        return;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        d2Var.presentFragment(new z6());
                        return;
                    case 24:
                        d2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 26:
                        d2Var.presentFragment(new z6());
                        return;
                    case 27:
                        d2Var.presentFragment(new z6());
                        return;
                    case 28:
                        d2Var.presentFragment(new ht());
                        return;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        kw0Var52.a("tg://settings/privacy/calls");
        kw0 kw0Var53 = new kw0(107, org.telegram.messenger.bd.L0(2131746825), org.telegram.messenger.bd.L0(2131746779), 2131232355, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                if (org.telegram.messenger.h10.i(i3).p()) {
                                    i3++;
                                }
                            } else {
                                i3 = -1;
                            }
                        }
                        if (i3 >= 0) {
                            d2Var.presentFragment(new xd0(i3));
                            return;
                        }
                        return;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        d2Var.presentFragment(new z6());
                        return;
                    case 24:
                        d2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 26:
                        d2Var.presentFragment(new z6());
                        return;
                    case 27:
                        d2Var.presentFragment(new z6());
                        return;
                    case 28:
                        d2Var.presentFragment(new ht());
                        return;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        kw0Var53.a("tg://settings/privacy/invites");
        kw0 kw0Var54 = new kw0(123, org.telegram.messenger.bd.L0(2131746766), org.telegram.messenger.bd.L0(2131746779), 2131232355, new Runnable() {
            @Override
            public final void run() {
                int i3 = r2;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                int i10 = currentAccount;
                switch (i3) {
                    case 0:
                        if (org.telegram.messenger.h10.i(i10).f22852q0 >= 0) {
                            d2Var2.presentFragment(new r4());
                            return;
                        }
                        return;
                    default:
                        if (!org.telegram.messenger.h10.i(i10).q()) {
                            org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(d2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.ib ibVar = new org.telegram.ui.Components.ib(a02.W(), null);
                            ibVar.d(2131624346, new String[0]);
                            String M0 = org.telegram.messenger.bd.M0(2131746763, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                            int indexOf = M0.indexOf(42);
                            int lastIndexOf = M0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) M0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new gi.ka(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            ibVar.f34651b.setText(spannableStringBuilder);
                            ibVar.f34651b.setSingleLine(false);
                            ibVar.f34651b.setMaxLines(2);
                            a02.b(ibVar, 2750).j();
                            return;
                        }
                        d2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        kw0Var54.a("tg://settings/privacy/voice");
        if (org.telegram.messenger.hp.s1(currentAccount).Z3) {
            kw0Var3 = kw0Var54;
            kw0Var4 = new kw0(121, org.telegram.messenger.bd.L0(2131754171), "newChatsRow", org.telegram.messenger.bd.L0(2131746779), 2131232036, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            d2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            d2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            d2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            d2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                            vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            return;
                        case 5:
                            d2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 6:
                            int i3 = 0;
                            while (true) {
                                if (i3 < 4) {
                                    if (org.telegram.messenger.h10.i(i3).p()) {
                                        i3++;
                                    }
                                } else {
                                    i3 = -1;
                                }
                            }
                            if (i3 >= 0) {
                                d2Var.presentFragment(new xd0(i3));
                                return;
                            }
                            return;
                        case 7:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            d2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                            vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                            v0Var2.K0();
                            d2Var3.showDialog(v0Var2);
                            return;
                        case 15:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            d2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            d2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            d2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            d2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            d2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            d2Var.presentFragment(new z6());
                            return;
                        case 24:
                            d2Var.presentFragment(new z6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                            vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                            v0Var3.K0();
                            d2Var4.showDialog(v0Var3);
                            return;
                        case 26:
                            d2Var.presentFragment(new z6());
                            return;
                        case 27:
                            d2Var.presentFragment(new z6());
                            return;
                        case 28:
                            d2Var.presentFragment(new ht());
                            return;
                        default:
                            d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
            kw0Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            kw0Var3 = kw0Var54;
            kw0Var4 = null;
        }
        kw0 kw0Var55 = new kw0(112, org.telegram.messenger.bd.L0(2131751597), "deleteAccountRow", org.telegram.messenger.bd.L0(2131746779), 2131232036, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                if (org.telegram.messenger.h10.i(i3).p()) {
                                    i3++;
                                }
                            } else {
                                i3 = -1;
                            }
                        }
                        if (i3 >= 0) {
                            d2Var.presentFragment(new xd0(i3));
                            return;
                        }
                        return;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        d2Var.presentFragment(new z6());
                        return;
                    case 24:
                        d2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 26:
                        d2Var.presentFragment(new z6());
                        return;
                    case 27:
                        d2Var.presentFragment(new z6());
                        return;
                    case 28:
                        d2Var.presentFragment(new ht());
                        return;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        kw0Var55.a("tg://settings/privacy/self-destruct");
        kw0 kw0Var56 = new kw0(113, org.telegram.messenger.bd.L0(2131746805), "paymentsClearRow", org.telegram.messenger.bd.L0(2131746779), 2131232036, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                if (org.telegram.messenger.h10.i(i3).p()) {
                                    i3++;
                                }
                            } else {
                                i3 = -1;
                            }
                        }
                        if (i3 >= 0) {
                            d2Var.presentFragment(new xd0(i3));
                            return;
                        }
                        return;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        d2Var.presentFragment(new z6());
                        return;
                    case 24:
                        d2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 26:
                        d2Var.presentFragment(new z6());
                        return;
                    case 27:
                        d2Var.presentFragment(new z6());
                        return;
                    case 28:
                        d2Var.presentFragment(new ht());
                        return;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        kw0Var56.a("tg://settings/privacy/data-settings/clear-payment-info");
        kw0 kw0Var57 = new kw0(114, org.telegram.messenger.bd.L0(2131742921), org.telegram.messenger.bd.L0(2131746779), 2131232036, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                if (org.telegram.messenger.h10.i(i3).p()) {
                                    i3++;
                                }
                            } else {
                                i3 = -1;
                            }
                        }
                        if (i3 >= 0) {
                            d2Var.presentFragment(new xd0(i3));
                            return;
                        }
                        return;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        d2Var.presentFragment(new z6());
                        return;
                    case 24:
                        d2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 26:
                        d2Var.presentFragment(new z6());
                        return;
                    case 27:
                        d2Var.presentFragment(new z6());
                        return;
                    case 28:
                        d2Var.presentFragment(new ht());
                        return;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        kw0Var57.a("tg://settings/privacy/active-websites");
        kw0 kw0Var58 = new kw0(115, org.telegram.messenger.bd.L0(2131744306), "contactsDeleteRow", org.telegram.messenger.bd.L0(2131746779), 2131232036, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                if (org.telegram.messenger.h10.i(i3).p()) {
                                    i3++;
                                }
                            } else {
                                i3 = -1;
                            }
                        }
                        if (i3 >= 0) {
                            d2Var.presentFragment(new xd0(i3));
                            return;
                        }
                        return;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        d2Var.presentFragment(new z6());
                        return;
                    case 24:
                        d2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 26:
                        d2Var.presentFragment(new z6());
                        return;
                    case 27:
                        d2Var.presentFragment(new z6());
                        return;
                    case 28:
                        d2Var.presentFragment(new ht());
                        return;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        kw0Var58.a("tg://settings/privacy/data-settings/delete-synced");
        kw0 kw0Var59 = new kw0(116, org.telegram.messenger.bd.L0(2131744308), "contactsSyncRow", org.telegram.messenger.bd.L0(2131746779), 2131232036, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                if (org.telegram.messenger.h10.i(i3).p()) {
                                    i3++;
                                }
                            } else {
                                i3 = -1;
                            }
                        }
                        if (i3 >= 0) {
                            d2Var.presentFragment(new xd0(i3));
                            return;
                        }
                        return;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        d2Var.presentFragment(new z6());
                        return;
                    case 24:
                        d2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 26:
                        d2Var.presentFragment(new z6());
                        return;
                    case 27:
                        d2Var.presentFragment(new z6());
                        return;
                    case 28:
                        d2Var.presentFragment(new ht());
                        return;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        kw0Var59.a("tg://settings/privacy/data-settings/sync-contacts");
        kw0 kw0Var60 = new kw0(117, org.telegram.messenger.bd.L0(2131744422), "contactsSuggestRow", org.telegram.messenger.bd.L0(2131746779), 2131232036, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                if (org.telegram.messenger.h10.i(i3).p()) {
                                    i3++;
                                }
                            } else {
                                i3 = -1;
                            }
                        }
                        if (i3 >= 0) {
                            d2Var.presentFragment(new xd0(i3));
                            return;
                        }
                        return;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        d2Var.presentFragment(new z6());
                        return;
                    case 24:
                        d2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 26:
                        d2Var.presentFragment(new z6());
                        return;
                    case 27:
                        d2Var.presentFragment(new z6());
                        return;
                    case 28:
                        d2Var.presentFragment(new ht());
                        return;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        kw0Var60.a("tg://settings/privacy/data-settings/suggest-contacts");
        kw0 kw0Var61 = new kw0(118, org.telegram.messenger.bd.L0(2131748697), "secretMapRow", org.telegram.messenger.bd.L0(2131746779), 2131232036, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                if (org.telegram.messenger.h10.i(i3).p()) {
                                    i3++;
                                }
                            } else {
                                i3 = -1;
                            }
                        }
                        if (i3 >= 0) {
                            d2Var.presentFragment(new xd0(i3));
                            return;
                        }
                        return;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        d2Var.presentFragment(new z6());
                        return;
                    case 24:
                        d2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 26:
                        d2Var.presentFragment(new z6());
                        return;
                    case 27:
                        d2Var.presentFragment(new z6());
                        return;
                    case 28:
                        d2Var.presentFragment(new ht());
                        return;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        kw0Var61.a("tg://settings/privacy/data-settings/map-provider");
        kw0 kw0Var62 = new kw0(119, org.telegram.messenger.bd.L0(2131745694), "secretWebpageRow", org.telegram.messenger.bd.L0(2131746779), 2131232036, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                if (org.telegram.messenger.h10.i(i3).p()) {
                                    i3++;
                                }
                            } else {
                                i3 = -1;
                            }
                        }
                        if (i3 >= 0) {
                            d2Var.presentFragment(new xd0(i3));
                            return;
                        }
                        return;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        d2Var.presentFragment(new z6());
                        return;
                    case 24:
                        d2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 26:
                        d2Var.presentFragment(new z6());
                        return;
                    case 27:
                        d2Var.presentFragment(new z6());
                        return;
                    case 28:
                        d2Var.presentFragment(new ht());
                        return;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        kw0Var62.a("tg://settings/privacy/data-settings/link-previews");
        kw0 kw0Var63 = new kw0(120, org.telegram.messenger.bd.L0(2131751456), 2131232024, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                if (org.telegram.messenger.h10.i(i3).p()) {
                                    i3++;
                                }
                            } else {
                                i3 = -1;
                            }
                        }
                        if (i3 >= 0) {
                            d2Var.presentFragment(new xd0(i3));
                            return;
                        }
                        return;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        d2Var.presentFragment(new z6());
                        return;
                    case 24:
                        d2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 26:
                        d2Var.presentFragment(new z6());
                        return;
                    case 27:
                        d2Var.presentFragment(new z6());
                        return;
                    case 28:
                        d2Var.presentFragment(new ht());
                        return;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        kw0Var63.a("tg://settings/devices");
        kw0 kw0Var64 = new kw0(121, org.telegram.messenger.bd.L0(2131744218), "terminateAllSessionsRow", org.telegram.messenger.bd.L0(2131751456), 2131232024, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                if (org.telegram.messenger.h10.i(i3).p()) {
                                    i3++;
                                }
                            } else {
                                i3 = -1;
                            }
                        }
                        if (i3 >= 0) {
                            d2Var.presentFragment(new xd0(i3));
                            return;
                        }
                        return;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        d2Var.presentFragment(new z6());
                        return;
                    case 24:
                        d2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 26:
                        d2Var.presentFragment(new z6());
                        return;
                    case 27:
                        d2Var.presentFragment(new z6());
                        return;
                    case 28:
                        d2Var.presentFragment(new ht());
                        return;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        kw0Var64.a("tg://settings/devices/terminate-sessions");
        kw0 kw0Var65 = new kw0(122, org.telegram.messenger.bd.L0(2131748925), org.telegram.messenger.bd.L0(2131751456), 2131232024, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                if (org.telegram.messenger.h10.i(i3).p()) {
                                    i3++;
                                }
                            } else {
                                i3 = -1;
                            }
                        }
                        if (i3 >= 0) {
                            d2Var.presentFragment(new xd0(i3));
                            return;
                        }
                        return;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        d2Var.presentFragment(new z6());
                        return;
                    case 24:
                        d2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 26:
                        d2Var.presentFragment(new z6());
                        return;
                    case 27:
                        d2Var.presentFragment(new z6());
                        return;
                    case 28:
                        d2Var.presentFragment(new ht());
                        return;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        kw0Var65.a("tg://settings/devices/link-desktop");
        kw0 kw0Var66 = new kw0(200, org.telegram.messenger.bd.L0(2131751678), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                if (org.telegram.messenger.h10.i(i3).p()) {
                                    i3++;
                                }
                            } else {
                                i3 = -1;
                            }
                        }
                        if (i3 >= 0) {
                            d2Var.presentFragment(new xd0(i3));
                            return;
                        }
                        return;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        d2Var.presentFragment(new z6());
                        return;
                    case 24:
                        d2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 26:
                        d2Var.presentFragment(new z6());
                        return;
                    case 27:
                        d2Var.presentFragment(new z6());
                        return;
                    case 28:
                        d2Var.presentFragment(new ht());
                        return;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        kw0Var66.a("tg://settings/privacy/data-settings");
        kw0 kw0Var67 = new kw0(201, org.telegram.messenger.bd.L0(2131751677), "usageSectionRow", org.telegram.messenger.bd.L0(2131751678), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                if (org.telegram.messenger.h10.i(i3).p()) {
                                    i3++;
                                }
                            } else {
                                i3 = -1;
                            }
                        }
                        if (i3 >= 0) {
                            d2Var.presentFragment(new xd0(i3));
                            return;
                        }
                        return;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        d2Var.presentFragment(new z6());
                        return;
                    case 24:
                        d2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 26:
                        d2Var.presentFragment(new z6());
                        return;
                    case 27:
                        d2Var.presentFragment(new z6());
                        return;
                    case 28:
                        d2Var.presentFragment(new ht());
                        return;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        kw0 kw0Var68 = new kw0(202, org.telegram.messenger.bd.L0(2131744826), org.telegram.messenger.bd.L0(2131751678), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                if (org.telegram.messenger.h10.i(i3).p()) {
                                    i3++;
                                }
                            } else {
                                i3 = -1;
                            }
                        }
                        if (i3 >= 0) {
                            d2Var.presentFragment(new xd0(i3));
                            return;
                        }
                        return;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        d2Var.presentFragment(new z6());
                        return;
                    case 24:
                        d2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 26:
                        d2Var.presentFragment(new z6());
                        return;
                    case 27:
                        d2Var.presentFragment(new z6());
                        return;
                    case 28:
                        d2Var.presentFragment(new ht());
                        return;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        kw0Var68.a("tg://settings/data/storage");
        kw0 kw0Var69 = new kw0(203, org.telegram.messenger.bd.L0(2131749068), "keepMediaRow", org.telegram.messenger.bd.L0(2131751678), org.telegram.messenger.bd.L0(2131744826), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                if (org.telegram.messenger.h10.i(i3).p()) {
                                    i3++;
                                }
                            } else {
                                i3 = -1;
                            }
                        }
                        if (i3 >= 0) {
                            d2Var.presentFragment(new xd0(i3));
                            return;
                        }
                        return;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        d2Var.presentFragment(new z6());
                        return;
                    case 24:
                        d2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 26:
                        d2Var.presentFragment(new z6());
                        return;
                    case 27:
                        d2Var.presentFragment(new z6());
                        return;
                    case 28:
                        d2Var.presentFragment(new ht());
                        return;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        kw0 kw0Var70 = new kw0(204, org.telegram.messenger.bd.L0(2131752075), "cacheRow", org.telegram.messenger.bd.L0(2131751678), org.telegram.messenger.bd.L0(2131744826), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                if (org.telegram.messenger.h10.i(i3).p()) {
                                    i3++;
                                }
                            } else {
                                i3 = -1;
                            }
                        }
                        if (i3 >= 0) {
                            d2Var.presentFragment(new xd0(i3));
                            return;
                        }
                        return;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        d2Var.presentFragment(new z6());
                        return;
                    case 24:
                        d2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 26:
                        d2Var.presentFragment(new z6());
                        return;
                    case 27:
                        d2Var.presentFragment(new z6());
                        return;
                    case 28:
                        d2Var.presentFragment(new ht());
                        return;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        kw0 kw0Var71 = new kw0(205, org.telegram.messenger.bd.L0(2131748782), "databaseRow", org.telegram.messenger.bd.L0(2131751678), org.telegram.messenger.bd.L0(2131744826), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                if (org.telegram.messenger.h10.i(i3).p()) {
                                    i3++;
                                }
                            } else {
                                i3 = -1;
                            }
                        }
                        if (i3 >= 0) {
                            d2Var.presentFragment(new xd0(i3));
                            return;
                        }
                        return;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        d2Var.presentFragment(new z6());
                        return;
                    case 24:
                        d2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 26:
                        d2Var.presentFragment(new z6());
                        return;
                    case 27:
                        d2Var.presentFragment(new z6());
                        return;
                    case 28:
                        d2Var.presentFragment(new ht());
                        return;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        kw0 kw0Var72 = new kw0(206, org.telegram.messenger.bd.L0(2131748306), org.telegram.messenger.bd.L0(2131751678), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                if (org.telegram.messenger.h10.i(i3).p()) {
                                    i3++;
                                }
                            } else {
                                i3 = -1;
                            }
                        }
                        if (i3 >= 0) {
                            d2Var.presentFragment(new xd0(i3));
                            return;
                        }
                        return;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        d2Var.presentFragment(new z6());
                        return;
                    case 24:
                        d2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 26:
                        d2Var.presentFragment(new z6());
                        return;
                    case 27:
                        d2Var.presentFragment(new z6());
                        return;
                    case 28:
                        d2Var.presentFragment(new ht());
                        return;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        kw0Var72.a("tg://settings/data/usage");
        kw0 kw0Var73 = new kw0(207, org.telegram.messenger.bd.L0(2131753767), "mediaDownloadSectionRow", org.telegram.messenger.bd.L0(2131751678), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                }
            }
        });
        kw0 kw0Var74 = new kw0(208, org.telegram.messenger.bd.L0(2131742894), org.telegram.messenger.bd.L0(2131751678), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                }
            }
        });
        kw0 kw0Var75 = new kw0(209, org.telegram.messenger.bd.L0(2131742896), org.telegram.messenger.bd.L0(2131751678), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                }
            }
        });
        kw0 kw0Var76 = new kw0(210, org.telegram.messenger.bd.L0(2131742895), org.telegram.messenger.bd.L0(2131751678), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                }
            }
        });
        kw0 kw0Var77 = new kw0(211, org.telegram.messenger.bd.L0(2131746121), "resetDownloadRow", org.telegram.messenger.bd.L0(2131751678), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                }
            }
        });
        kw0Var77.a("tg://settings/data/auto-download/reset");
        kw0 kw0Var78 = new kw0(215, org.telegram.messenger.bd.L0(2131744448), "streamSectionRow", org.telegram.messenger.bd.L0(2131751678), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                }
            }
        });
        kw0 kw0Var79 = new kw0(216, org.telegram.messenger.bd.L0(2131751145), "enableStreamRow", org.telegram.messenger.bd.L0(2131751678), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                }
            }
        });
        kw0 kw0Var80 = new kw0(217, org.telegram.messenger.bd.L0(2131752596), "callsSectionRow", org.telegram.messenger.bd.L0(2131751678), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                }
            }
        });
        kw0 kw0Var81 = new kw0(218, org.telegram.messenger.bd.L0(2131743239), "useLessDataForCallsRow", org.telegram.messenger.bd.L0(2131751678), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                }
            }
        });
        kw0Var81.a("tg://settings/data/use-less-data");
        kw0 kw0Var82 = new kw0(219, org.telegram.messenger.bd.L0(2131743268), "quickRepliesRow", org.telegram.messenger.bd.L0(2131751678), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                }
            }
        });
        kw0 kw0Var83 = new kw0(220, org.telegram.messenger.bd.L0(2131746609), org.telegram.messenger.bd.L0(2131751678), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                }
            }
        });
        kw0Var83.a("tg://settings/data/proxy");
        kw0 kw0Var84 = new kw0(111, org.telegram.messenger.bd.L0(2131746849), "clearDraftsRow", org.telegram.messenger.bd.L0(2131751678), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                }
            }
        });
        kw0Var84.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        kw0 kw0Var85 = new kw0(222, org.telegram.messenger.bd.L0(2131745939), "saveToGallerySectionRow", org.telegram.messenger.bd.L0(2131751678), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                }
            }
        });
        kw0 kw0Var86 = new kw0(223, org.telegram.messenger.bd.L0(2131745929), "saveToGalleryPeerRow", org.telegram.messenger.bd.L0(2131751678), org.telegram.messenger.bd.L0(2131745939), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                }
            }
        });
        kw0Var86.a("tg://settings/data/save-to-photos/chats");
        kw0 kw0Var87 = new kw0(224, org.telegram.messenger.bd.L0(2131745936), "saveToGalleryGroupsRow", org.telegram.messenger.bd.L0(2131751678), org.telegram.messenger.bd.L0(2131745939), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                }
            }
        });
        kw0Var87.a("tg://settings/data/save-to-photos/groups");
        kw0 kw0Var88 = new kw0(225, org.telegram.messenger.bd.L0(2131745938), "saveToGalleryChannelsRow", org.telegram.messenger.bd.L0(2131751678), org.telegram.messenger.bd.L0(2131745939), 2131232023, new nf0(2, d2Var));
        kw0Var88.a("tg://settings/data/save-to-photos/channels");
        kw0 kw0Var89 = new kw0(300, org.telegram.messenger.bd.L0(2131752210), 2131232025, new nf0(3, d2Var));
        kw0Var89.a("tg://settings/appearance/themes");
        kw0 kw0Var90 = new kw0(301, org.telegram.messenger.bd.L0(2131744201), "textSizeHeaderRow", org.telegram.messenger.bd.L0(2131752210), 2131232025, new nf0(4, d2Var));
        kw0Var90.a("tg://settings/appearance/text-size");
        kw0 kw0Var91 = new kw0(302, org.telegram.messenger.bd.L0(2131752550), org.telegram.messenger.bd.L0(2131752210), 2131232025, new nf0(5, d2Var));
        kw0Var91.a("tg://settings/appearance/wallpapers");
        kw0 kw0Var92 = new kw0(303, org.telegram.messenger.bd.L0(2131745548), null, org.telegram.messenger.bd.L0(2131752210), org.telegram.messenger.bd.L0(2131752244), 2131232025, new nf0(6, d2Var));
        kw0 kw0Var93 = new kw0(304, org.telegram.messenger.bd.L0(2131746118), "resetRow", org.telegram.messenger.bd.L0(2131752210), org.telegram.messenger.bd.L0(2131752244), 2131232025, new nf0(8, d2Var));
        kw0 kw0Var94 = new kw0(306, org.telegram.messenger.bd.L0(2131752011), "themeHeaderRow", org.telegram.messenger.bd.L0(2131752210), 2131232025, new nf0(9, d2Var));
        kw0 kw0Var95 = new kw0(319, org.telegram.messenger.bd.L0(2131752878), null, org.telegram.messenger.bd.L0(2131752210), 2131232025, new nf0(10, d2Var));
        kw0 kw0Var96 = new kw0(320, org.telegram.messenger.bd.L0(2131751713), "createNewThemeRow", org.telegram.messenger.bd.L0(2131752210), org.telegram.messenger.bd.L0(2131752878), 2131232025, new nf0(11, d2Var));
        kw0Var96.a("tg://settings/appearance/themes/create");
        kw0 kw0Var97 = new kw0(321, org.telegram.messenger.bd.L0(2131752840), "bubbleRadiusHeaderRow", org.telegram.messenger.bd.L0(2131752210), 2131232025, new nf0(13, d2Var));
        kw0Var97.a("tg://settings/appearance/message-corners");
        kw0 kw0Var98 = new kw0(322, org.telegram.messenger.bd.L0(2131752225), "chatListHeaderRow", org.telegram.messenger.bd.L0(2131752210), 2131232025, new nf0(14, d2Var));
        kw0 kw0Var99 = new kw0(323, org.telegram.messenger.bd.L0(2131752222), "swipeGestureHeaderRow", org.telegram.messenger.bd.L0(2131752210), 2131232025, new nf0(15, d2Var));
        kw0 kw0Var100 = new kw0(324, org.telegram.messenger.bd.L0(2131754240), "appIconHeaderRow", org.telegram.messenger.bd.L0(2131752210), 2131232025, new nf0(16, d2Var));
        kw0Var100.a("tg://settings/appearance/app-icon");
        kw0 kw0Var101 = new kw0(305, org.telegram.messenger.bd.L0(2131753784), org.telegram.messenger.bd.L0(2131752210), 2131232025, new nf0(17, d2Var));
        kw0 kw0Var102 = new kw0(328, org.telegram.messenger.bd.L0(2131748257), "nextMediaTapRow", org.telegram.messenger.bd.L0(2131752210), 2131232025, new nf0(18, d2Var));
        kw0Var102.a("tg://settings/appearance/tap-for-next-media");
        kw0 kw0Var103 = new kw0(327, org.telegram.messenger.bd.L0(2131746435), "raiseToListenRow", org.telegram.messenger.bd.L0(2131752210), 2131232025, new nf0(20, d2Var));
        kw0Var103.a("tg://settings/data/raise-to-listen");
        kw0 kw0Var104 = new kw0(310, org.telegram.messenger.bd.L0(2131746433), "raiseToSpeakRow", org.telegram.messenger.bd.L0(2131752210), 2131232025, new nf0(21, d2Var));
        kw0Var104.a("tg://settings/data/raise-to-speak");
        kw0 kw0Var105 = new kw0(326, org.telegram.messenger.bd.L0(2131747440), "pauseOnMediaRow", org.telegram.messenger.bd.L0(2131752210), 2131232025, new nf0(22, d2Var));
        kw0Var105.a("tg://settings/data/pause-music");
        kw0 kw0Var106 = new kw0(325, org.telegram.messenger.bd.L0(2131748447), "bluetoothScoRow", org.telegram.messenger.bd.L0(2131752210), 2131232025, new nf0(24, d2Var));
        kw0 kw0Var107 = new kw0(308, org.telegram.messenger.bd.L0(2131751439), "directShareRow", org.telegram.messenger.bd.L0(2131752210), 2131232025, new nf0(25, d2Var));
        kw0 kw0Var108 = new kw0(311, org.telegram.messenger.bd.L0(2131745642), "sendByEnterRow", org.telegram.messenger.bd.L0(2131752210), 2131232025, new nf0(26, d2Var));
        kw0 kw0Var109 = new kw0(318, org.telegram.messenger.bd.L0(2131751368), "distanceRow", org.telegram.messenger.bd.L0(2131752210), 2131232025, new nf0(27, d2Var));
        kw0 kw0Var110 = new kw0(600, org.telegram.messenger.bd.L0(2131744867), 2131232038, new nf0(28, d2Var));
        kw0Var110.a("tg://settings/appearance/stickers-and-emoji");
        kw0 kw0Var111 = new kw0(601, org.telegram.messenger.bd.L0(2131744412), "suggestRow", org.telegram.messenger.bd.L0(2131744867), 2131232038, new nf0(29, d2Var));
        kw0 kw0Var112 = new kw0(602, org.telegram.messenger.bd.L0(2131750834), "featuredStickersHeaderRow", org.telegram.messenger.bd.L0(2131744867), 2131232038, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        return;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        return;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        return;
                    case 18:
                        d2Var.presentFragment(new t90());
                        return;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        return;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        return;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        return;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        return;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        return;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        return;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        return;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        return;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        return;
                }
            }
        });
        kw0 kw0Var113 = new kw0(603, org.telegram.messenger.bd.L0(2131748687), null, org.telegram.messenger.bd.L0(2131744867), 2131232038, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        return;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        return;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        return;
                    case 18:
                        d2Var.presentFragment(new t90());
                        return;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        return;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        return;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        return;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        return;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        return;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        return;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        return;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        return;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        return;
                }
            }
        });
        kw0 kw0Var114 = new kw0(604, org.telegram.messenger.bd.L0(2131754128), null, org.telegram.messenger.bd.L0(2131744867), 2131232038, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        return;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        return;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        return;
                    case 18:
                        d2Var.presentFragment(new t90());
                        return;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        return;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        return;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        return;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        return;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        return;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        return;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        return;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        return;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        return;
                }
            }
        });
        kw0Var114.a("tg://settings/appearance/stickers-and-emoji/archived");
        kw0 kw0Var115 = new kw0(605, org.telegram.messenger.bd.L0(2131754133), null, org.telegram.messenger.bd.L0(2131744867), 2131232038, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        return;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        return;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        return;
                    case 18:
                        d2Var.presentFragment(new t90());
                        return;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        return;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        return;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        return;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        return;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        return;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        return;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        return;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        return;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        return;
                }
            }
        });
        kw0 kw0Var116 = new kw0(606, org.telegram.messenger.bd.L0(2131749042), "largeEmojiRow", org.telegram.messenger.bd.L0(2131744867), 2131232038, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        return;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        return;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        return;
                    case 18:
                        d2Var.presentFragment(new t90());
                        return;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        return;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        return;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        return;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        return;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        return;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        return;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        return;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        return;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        return;
                }
            }
        });
        kw0Var116.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        kw0 kw0Var117 = new kw0(607, org.telegram.messenger.bd.L0(2131748730), null, org.telegram.messenger.bd.L0(2131747074), org.telegram.messenger.bd.L0(2131748858), 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        return;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        return;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        return;
                    case 18:
                        d2Var.presentFragment(new t90());
                        return;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        return;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        return;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        return;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        return;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        return;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        return;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        return;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        return;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        return;
                }
            }
        });
        kw0 kw0Var118 = new kw0(608, org.telegram.messenger.bd.L0(2131751197), null, org.telegram.messenger.bd.L0(2131744867), 2131231512, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        return;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        return;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        return;
                    case 18:
                        d2Var.presentFragment(new t90());
                        return;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        return;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        return;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        return;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        return;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        return;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        return;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        return;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        return;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        return;
                }
            }
        });
        kw0Var118.a("tg://settings/appearance/stickers-and-emoji/emoji");
        kw0 kw0Var119 = new kw0(609, org.telegram.messenger.bd.L0(2131744426), "suggestAnimatedEmojiRow", org.telegram.messenger.bd.L0(2131744867), org.telegram.messenger.bd.L0(2131751197), 2131231512, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        return;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        return;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        return;
                    case 18:
                        d2Var.presentFragment(new t90());
                        return;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        return;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        return;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        return;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        return;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        return;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        return;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        return;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        return;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        return;
                }
            }
        });
        kw0Var119.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        kw0 kw0Var120 = new kw0(610, org.telegram.messenger.bd.L0(2131750836), "featuredStickersHeaderRow", org.telegram.messenger.bd.L0(2131744867), org.telegram.messenger.bd.L0(2131751197), 2131231512, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        return;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        return;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        return;
                    case 18:
                        d2Var.presentFragment(new t90());
                        return;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        return;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        return;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        return;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        return;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        return;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        return;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        return;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        return;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        return;
                }
            }
        });
        kw0 kw0Var121 = new kw0(611, org.telegram.messenger.bd.L0(2131751351), null, org.telegram.messenger.bd.L0(2131744867), 2131232038, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        return;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        return;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        return;
                    case 18:
                        d2Var.presentFragment(new t90());
                        return;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        return;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        return;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        return;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        return;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        return;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        return;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        return;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        return;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        return;
                }
            }
        });
        kw0Var121.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        kw0 kw0Var122 = new kw0(700, org.telegram.messenger.bd.L0(2131750697), null, 2131232027, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        return;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        return;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        return;
                    case 18:
                        d2Var.presentFragment(new t90());
                        return;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        return;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        return;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        return;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        return;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        return;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        return;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        return;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        return;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        return;
                }
            }
        });
        kw0Var122.a("tg://settings/folders");
        kw0 kw0Var123 = new kw0(701, org.telegram.messenger.bd.L0(2131751717), "createFilterRow", org.telegram.messenger.bd.L0(2131750697), 2131232027, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        return;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        return;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        return;
                    case 18:
                        d2Var.presentFragment(new t90());
                        return;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        return;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        return;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        return;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        return;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        return;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        return;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        return;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        return;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        return;
                }
            }
        });
        kw0Var123.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            kw0Var5 = kw0Var123;
            kw0Var6 = kw0Var114;
            kw0Var7 = kw0Var116;
            kw0Var8 = kw0Var118;
            kw0Var9 = new kw0(800, org.telegram.messenger.bd.L0(2131744241), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    int i3 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                    switch (i3) {
                        case 0:
                            t90 t90Var = new t90();
                            d2Var2.presentFragment(t90Var);
                            t90Var.b0(360928);
                            t90Var.a0(64);
                            return;
                        case 1:
                            t90 t90Var2 = new t90();
                            d2Var2.presentFragment(t90Var2);
                            t90Var2.b0(360928);
                            t90Var2.a0(128);
                            return;
                        case 2:
                            d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            t90 t90Var3 = new t90();
                            d2Var2.presentFragment(t90Var3);
                            t90Var3.b0(360928);
                            t90Var3.a0(256);
                            return;
                        case 4:
                            t90 t90Var4 = new t90();
                            d2Var2.presentFragment(t90Var4);
                            t90Var4.b0(360928);
                            t90Var4.a0(32768);
                            return;
                        case 5:
                            t90 t90Var5 = new t90();
                            d2Var2.presentFragment(t90Var5);
                            t90Var5.a0(512);
                            return;
                        case 6:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            t90 t90Var6 = new t90();
                            d2Var2.presentFragment(t90Var6);
                            t90Var6.a0(1024);
                            return;
                        case 8:
                            t90 t90Var7 = new t90();
                            d2Var2.presentFragment(t90Var7);
                            t90Var7.a0(2048);
                            return;
                        case 9:
                            t90 t90Var8 = new t90();
                            d2Var2.presentFragment(t90Var8);
                            while (true) {
                                ArrayList arrayList = t90Var8.f49748s;
                                if (i10 < arrayList.size()) {
                                    if (((o90) arrayList.get(i10)).f48239f == 1) {
                                        t90Var8.f49742b.e1(new k2.q(t90Var8, i10, 13), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            return;
                        case 14:
                            d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                            return;
                        case 15:
                            sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                            return;
                        case 16:
                            sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                            return;
                        case 17:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            d2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            d2Var2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            d2Var2.presentFragment(PasscodeActivity.p0());
                            return;
                        case 23:
                            vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                            v0Var2.K0();
                            d2Var2.showDialog(v0Var2);
                            return;
                        case 24:
                            d2Var2.presentFragment(new g(3));
                            return;
                        case 25:
                            d2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            it0 it0Var = new it0();
                            it0Var.getMessagesController().F0(true);
                            d2Var2.presentFragment(it0Var);
                            return;
                        case 27:
                            d2Var2.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            kw0Var5 = kw0Var123;
            kw0Var6 = kw0Var114;
            kw0Var7 = kw0Var116;
            kw0Var8 = kw0Var118;
            kw0Var9 = null;
        }
        if (F(currentAccount, 0)) {
            kw0Var10 = new kw0(801, org.telegram.messenger.bd.L0(2131747006), org.telegram.messenger.bd.L0(2131744241), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    int i3 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                    switch (i3) {
                        case 0:
                            t90 t90Var = new t90();
                            d2Var2.presentFragment(t90Var);
                            t90Var.b0(360928);
                            t90Var.a0(64);
                            return;
                        case 1:
                            t90 t90Var2 = new t90();
                            d2Var2.presentFragment(t90Var2);
                            t90Var2.b0(360928);
                            t90Var2.a0(128);
                            return;
                        case 2:
                            d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            t90 t90Var3 = new t90();
                            d2Var2.presentFragment(t90Var3);
                            t90Var3.b0(360928);
                            t90Var3.a0(256);
                            return;
                        case 4:
                            t90 t90Var4 = new t90();
                            d2Var2.presentFragment(t90Var4);
                            t90Var4.b0(360928);
                            t90Var4.a0(32768);
                            return;
                        case 5:
                            t90 t90Var5 = new t90();
                            d2Var2.presentFragment(t90Var5);
                            t90Var5.a0(512);
                            return;
                        case 6:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            t90 t90Var6 = new t90();
                            d2Var2.presentFragment(t90Var6);
                            t90Var6.a0(1024);
                            return;
                        case 8:
                            t90 t90Var7 = new t90();
                            d2Var2.presentFragment(t90Var7);
                            t90Var7.a0(2048);
                            return;
                        case 9:
                            t90 t90Var8 = new t90();
                            d2Var2.presentFragment(t90Var8);
                            while (true) {
                                ArrayList arrayList = t90Var8.f49748s;
                                if (i10 < arrayList.size()) {
                                    if (((o90) arrayList.get(i10)).f48239f == 1) {
                                        t90Var8.f49742b.e1(new k2.q(t90Var8, i10, 13), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            return;
                        case 14:
                            d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                            return;
                        case 15:
                            sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                            return;
                        case 16:
                            sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                            return;
                        case 17:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            d2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            d2Var2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            d2Var2.presentFragment(PasscodeActivity.p0());
                            return;
                        case 23:
                            vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                            v0Var2.K0();
                            d2Var2.showDialog(v0Var2);
                            return;
                        case 24:
                            d2Var2.presentFragment(new g(3));
                            return;
                        case 25:
                            d2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            it0 it0Var = new it0();
                            it0Var.getMessagesController().F0(true);
                            d2Var2.presentFragment(it0Var);
                            return;
                        case 27:
                            d2Var2.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            kw0Var10 = null;
        }
        if (F(currentAccount, 11)) {
            kw0Var11 = new kw0(802, org.telegram.messenger.bd.L0(2131747015), org.telegram.messenger.bd.L0(2131744241), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    int i3 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                    switch (i3) {
                        case 0:
                            t90 t90Var = new t90();
                            d2Var2.presentFragment(t90Var);
                            t90Var.b0(360928);
                            t90Var.a0(64);
                            return;
                        case 1:
                            t90 t90Var2 = new t90();
                            d2Var2.presentFragment(t90Var2);
                            t90Var2.b0(360928);
                            t90Var2.a0(128);
                            return;
                        case 2:
                            d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            t90 t90Var3 = new t90();
                            d2Var2.presentFragment(t90Var3);
                            t90Var3.b0(360928);
                            t90Var3.a0(256);
                            return;
                        case 4:
                            t90 t90Var4 = new t90();
                            d2Var2.presentFragment(t90Var4);
                            t90Var4.b0(360928);
                            t90Var4.a0(32768);
                            return;
                        case 5:
                            t90 t90Var5 = new t90();
                            d2Var2.presentFragment(t90Var5);
                            t90Var5.a0(512);
                            return;
                        case 6:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            t90 t90Var6 = new t90();
                            d2Var2.presentFragment(t90Var6);
                            t90Var6.a0(1024);
                            return;
                        case 8:
                            t90 t90Var7 = new t90();
                            d2Var2.presentFragment(t90Var7);
                            t90Var7.a0(2048);
                            return;
                        case 9:
                            t90 t90Var8 = new t90();
                            d2Var2.presentFragment(t90Var8);
                            while (true) {
                                ArrayList arrayList = t90Var8.f49748s;
                                if (i10 < arrayList.size()) {
                                    if (((o90) arrayList.get(i10)).f48239f == 1) {
                                        t90Var8.f49742b.e1(new k2.q(t90Var8, i10, 13), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            return;
                        case 14:
                            d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                            return;
                        case 15:
                            sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                            return;
                        case 16:
                            sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                            return;
                        case 17:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            d2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            d2Var2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            d2Var2.presentFragment(PasscodeActivity.p0());
                            return;
                        case 23:
                            vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                            v0Var2.K0();
                            d2Var2.showDialog(v0Var2);
                            return;
                        case 24:
                            d2Var2.presentFragment(new g(3));
                            return;
                        case 25:
                            d2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            it0 it0Var = new it0();
                            it0Var.getMessagesController().F0(true);
                            d2Var2.presentFragment(it0Var);
                            return;
                        case 27:
                            d2Var2.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            kw0Var11 = null;
        }
        if (F(currentAccount, 1)) {
            kw0Var12 = new kw0(803, org.telegram.messenger.bd.L0(2131746972), org.telegram.messenger.bd.L0(2131744241), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            d2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            d2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            d2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            d2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                            vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            return;
                        case 5:
                            d2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 6:
                            int i3 = 0;
                            while (true) {
                                if (i3 < 4) {
                                    if (org.telegram.messenger.h10.i(i3).p()) {
                                        i3++;
                                    }
                                } else {
                                    i3 = -1;
                                }
                            }
                            if (i3 >= 0) {
                                d2Var.presentFragment(new xd0(i3));
                                return;
                            }
                            return;
                        case 7:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            d2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                            vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                            v0Var2.K0();
                            d2Var3.showDialog(v0Var2);
                            return;
                        case 15:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            d2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            d2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            d2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            d2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            d2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            d2Var.presentFragment(new z6());
                            return;
                        case 24:
                            d2Var.presentFragment(new z6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                            vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                            v0Var3.K0();
                            d2Var4.showDialog(v0Var3);
                            return;
                        case 26:
                            d2Var.presentFragment(new z6());
                            return;
                        case 27:
                            d2Var.presentFragment(new z6());
                            return;
                        case 28:
                            d2Var.presentFragment(new ht());
                            return;
                        default:
                            d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            kw0Var12 = null;
        }
        if (F(currentAccount, 2)) {
            kw0Var13 = new kw0(804, org.telegram.messenger.bd.L0(2131747020), org.telegram.messenger.bd.L0(2131744241), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            d2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            d2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            d2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            d2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                            vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            return;
                        case 5:
                            d2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 6:
                            int i3 = 0;
                            while (true) {
                                if (i3 < 4) {
                                    if (org.telegram.messenger.h10.i(i3).p()) {
                                        i3++;
                                    }
                                } else {
                                    i3 = -1;
                                }
                            }
                            if (i3 >= 0) {
                                d2Var.presentFragment(new xd0(i3));
                                return;
                            }
                            return;
                        case 7:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            d2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                            vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                            v0Var2.K0();
                            d2Var3.showDialog(v0Var2);
                            return;
                        case 15:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            d2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            d2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            d2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            d2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            d2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            d2Var.presentFragment(new z6());
                            return;
                        case 24:
                            d2Var.presentFragment(new z6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                            vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                            v0Var3.K0();
                            d2Var4.showDialog(v0Var3);
                            return;
                        case 26:
                            d2Var.presentFragment(new z6());
                            return;
                        case 27:
                            d2Var.presentFragment(new z6());
                            return;
                        case 28:
                            d2Var.presentFragment(new ht());
                            return;
                        default:
                            d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            kw0Var13 = null;
        }
        if (F(currentAccount, 8)) {
            kw0Var14 = new kw0(805, org.telegram.messenger.bd.L0(2131746970), org.telegram.messenger.bd.L0(2131744241), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            d2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            d2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            d2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            d2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                            vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            return;
                        case 5:
                            d2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 6:
                            int i3 = 0;
                            while (true) {
                                if (i3 < 4) {
                                    if (org.telegram.messenger.h10.i(i3).p()) {
                                        i3++;
                                    }
                                } else {
                                    i3 = -1;
                                }
                            }
                            if (i3 >= 0) {
                                d2Var.presentFragment(new xd0(i3));
                                return;
                            }
                            return;
                        case 7:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            d2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                            vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                            v0Var2.K0();
                            d2Var3.showDialog(v0Var2);
                            return;
                        case 15:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            d2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            d2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            d2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            d2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            d2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            d2Var.presentFragment(new z6());
                            return;
                        case 24:
                            d2Var.presentFragment(new z6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                            vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                            v0Var3.K0();
                            d2Var4.showDialog(v0Var3);
                            return;
                        case 26:
                            d2Var.presentFragment(new z6());
                            return;
                        case 27:
                            d2Var.presentFragment(new z6());
                            return;
                        case 28:
                            d2Var.presentFragment(new ht());
                            return;
                        default:
                            d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            kw0Var14 = null;
        }
        if (F(currentAccount, 3)) {
            kw0Var15 = new kw0(806, org.telegram.messenger.bd.L0(2131747000), org.telegram.messenger.bd.L0(2131744241), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            d2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 1:
                            d2Var.presentFragment(new DataAutoDownloadActivity(0));
                            return;
                        case 2:
                            d2Var.presentFragment(new DataAutoDownloadActivity(1));
                            return;
                        case 3:
                            d2Var.presentFragment(new DataAutoDownloadActivity(2));
                            return;
                        case 4:
                            d2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 5:
                            d2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 6:
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                            vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            return;
                        case 7:
                            d2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 8:
                            d2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 9:
                            d2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 10:
                            d2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 11:
                            d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            return;
                        case 12:
                            d2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 13:
                            d2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 14:
                            d2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 15:
                            d2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 16:
                            d2Var.presentFragment(new DataSettingsActivity());
                            return;
                        default:
                            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                            vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                            v0Var2.K0();
                            d2Var3.showDialog(v0Var2);
                            return;
                    }
                }
            });
        } else {
            kw0Var15 = null;
        }
        if (F(currentAccount, 4)) {
            kw0Var16 = new kw0(807, org.telegram.messenger.bd.L0(2131746991), org.telegram.messenger.bd.L0(2131744241), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            d2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 1:
                            d2Var.presentFragment(new DataAutoDownloadActivity(0));
                            return;
                        case 2:
                            d2Var.presentFragment(new DataAutoDownloadActivity(1));
                            return;
                        case 3:
                            d2Var.presentFragment(new DataAutoDownloadActivity(2));
                            return;
                        case 4:
                            d2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 5:
                            d2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 6:
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                            vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            return;
                        case 7:
                            d2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 8:
                            d2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 9:
                            d2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 10:
                            d2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 11:
                            d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            return;
                        case 12:
                            d2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 13:
                            d2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 14:
                            d2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 15:
                            d2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 16:
                            d2Var.presentFragment(new DataSettingsActivity());
                            return;
                        default:
                            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                            vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                            v0Var2.K0();
                            d2Var3.showDialog(v0Var2);
                            return;
                    }
                }
            });
        } else {
            kw0Var16 = null;
        }
        if (F(currentAccount, 5)) {
            kw0Var17 = new kw0(808, org.telegram.messenger.bd.L0(2131746984), org.telegram.messenger.bd.L0(2131744241), 2131232362, new nf0(12, d2Var));
        } else {
            kw0Var17 = null;
        }
        if (F(currentAccount, 9)) {
            kw0Var18 = new kw0(809, org.telegram.messenger.bd.L0(2131747033), org.telegram.messenger.bd.L0(2131744241), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            d2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            d2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            d2Var.presentFragment(new o(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                            vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            return;
                        case 5:
                            d2Var.presentFragment(new o(1));
                            return;
                        case 6:
                            d2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            t90 t90Var = new t90();
                            d2Var.presentFragment(t90Var);
                            t90Var.b0(3);
                            t90Var.a0(2);
                            return;
                        case 8:
                            d2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            d2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            d2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            d2Var.presentFragment(new sx0());
                            return;
                        case 12:
                            d2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                            vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                            v0Var2.K0();
                            d2Var3.showDialog(v0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                            vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                            v0Var3.K0();
                            d2Var4.showDialog(v0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                            vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                            v0Var4.K0();
                            d2Var5.showDialog(v0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                            vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                            v0Var5.K0();
                            d2Var6.showDialog(v0Var5);
                            return;
                        case 18:
                            d2Var.presentFragment(new t90());
                            return;
                        case 19:
                            t90 t90Var2 = new t90();
                            d2Var.presentFragment(t90Var2);
                            t90Var2.a0(3);
                            return;
                        case 20:
                            t90 t90Var3 = new t90();
                            d2Var.presentFragment(t90Var3);
                            t90Var3.b0(3);
                            t90Var3.a0(1);
                            return;
                        case 21:
                            d2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            t90 t90Var4 = new t90();
                            d2Var.presentFragment(t90Var4);
                            t90Var4.b0(3);
                            t90Var4.a0(2);
                            return;
                        case 23:
                            t90 t90Var5 = new t90();
                            d2Var.presentFragment(t90Var5);
                            t90Var5.a0(28700);
                            return;
                        case 24:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            t90 t90Var6 = new t90();
                            d2Var.presentFragment(t90Var6);
                            t90Var6.b0(28700);
                            t90Var6.a0(16388);
                            return;
                        case 26:
                            t90 t90Var7 = new t90();
                            d2Var.presentFragment(t90Var7);
                            t90Var7.b0(28700);
                            t90Var7.a0(8200);
                            return;
                        case 27:
                            t90 t90Var8 = new t90();
                            d2Var.presentFragment(t90Var8);
                            t90Var8.b0(28700);
                            t90Var8.a0(4112);
                            return;
                        case 28:
                            t90 t90Var9 = new t90();
                            d2Var.presentFragment(t90Var9);
                            t90Var9.a0(360928);
                            return;
                        default:
                            t90 t90Var10 = new t90();
                            d2Var.presentFragment(t90Var10);
                            t90Var10.b0(360928);
                            t90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            kw0Var18 = null;
        }
        if (F(currentAccount, 6)) {
            kw0Var19 = new kw0(810, org.telegram.messenger.bd.L0(2131746995), org.telegram.messenger.bd.L0(2131744241), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            d2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            d2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            d2Var.presentFragment(new o(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                            vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            return;
                        case 5:
                            d2Var.presentFragment(new o(1));
                            return;
                        case 6:
                            d2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            t90 t90Var = new t90();
                            d2Var.presentFragment(t90Var);
                            t90Var.b0(3);
                            t90Var.a0(2);
                            return;
                        case 8:
                            d2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            d2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            d2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            d2Var.presentFragment(new sx0());
                            return;
                        case 12:
                            d2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                            vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                            v0Var2.K0();
                            d2Var3.showDialog(v0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                            vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                            v0Var3.K0();
                            d2Var4.showDialog(v0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                            vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                            v0Var4.K0();
                            d2Var5.showDialog(v0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                            vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                            v0Var5.K0();
                            d2Var6.showDialog(v0Var5);
                            return;
                        case 18:
                            d2Var.presentFragment(new t90());
                            return;
                        case 19:
                            t90 t90Var2 = new t90();
                            d2Var.presentFragment(t90Var2);
                            t90Var2.a0(3);
                            return;
                        case 20:
                            t90 t90Var3 = new t90();
                            d2Var.presentFragment(t90Var3);
                            t90Var3.b0(3);
                            t90Var3.a0(1);
                            return;
                        case 21:
                            d2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            t90 t90Var4 = new t90();
                            d2Var.presentFragment(t90Var4);
                            t90Var4.b0(3);
                            t90Var4.a0(2);
                            return;
                        case 23:
                            t90 t90Var5 = new t90();
                            d2Var.presentFragment(t90Var5);
                            t90Var5.a0(28700);
                            return;
                        case 24:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            t90 t90Var6 = new t90();
                            d2Var.presentFragment(t90Var6);
                            t90Var6.b0(28700);
                            t90Var6.a0(16388);
                            return;
                        case 26:
                            t90 t90Var7 = new t90();
                            d2Var.presentFragment(t90Var7);
                            t90Var7.b0(28700);
                            t90Var7.a0(8200);
                            return;
                        case 27:
                            t90 t90Var8 = new t90();
                            d2Var.presentFragment(t90Var8);
                            t90Var8.b0(28700);
                            t90Var8.a0(4112);
                            return;
                        case 28:
                            t90 t90Var9 = new t90();
                            d2Var.presentFragment(t90Var9);
                            t90Var9.a0(360928);
                            return;
                        default:
                            t90 t90Var10 = new t90();
                            d2Var.presentFragment(t90Var10);
                            t90Var10.b0(360928);
                            t90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            kw0Var19 = null;
        }
        if (F(currentAccount, 7)) {
            kw0Var20 = new kw0(811, org.telegram.messenger.bd.L0(2131747030), org.telegram.messenger.bd.L0(2131744241), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            d2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            d2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            d2Var.presentFragment(new o(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                            vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            return;
                        case 5:
                            d2Var.presentFragment(new o(1));
                            return;
                        case 6:
                            d2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            t90 t90Var = new t90();
                            d2Var.presentFragment(t90Var);
                            t90Var.b0(3);
                            t90Var.a0(2);
                            return;
                        case 8:
                            d2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            d2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            d2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            d2Var.presentFragment(new sx0());
                            return;
                        case 12:
                            d2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                            vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                            v0Var2.K0();
                            d2Var3.showDialog(v0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                            vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                            v0Var3.K0();
                            d2Var4.showDialog(v0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                            vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                            v0Var4.K0();
                            d2Var5.showDialog(v0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                            vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                            v0Var5.K0();
                            d2Var6.showDialog(v0Var5);
                            return;
                        case 18:
                            d2Var.presentFragment(new t90());
                            return;
                        case 19:
                            t90 t90Var2 = new t90();
                            d2Var.presentFragment(t90Var2);
                            t90Var2.a0(3);
                            return;
                        case 20:
                            t90 t90Var3 = new t90();
                            d2Var.presentFragment(t90Var3);
                            t90Var3.b0(3);
                            t90Var3.a0(1);
                            return;
                        case 21:
                            d2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            t90 t90Var4 = new t90();
                            d2Var.presentFragment(t90Var4);
                            t90Var4.b0(3);
                            t90Var4.a0(2);
                            return;
                        case 23:
                            t90 t90Var5 = new t90();
                            d2Var.presentFragment(t90Var5);
                            t90Var5.a0(28700);
                            return;
                        case 24:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            t90 t90Var6 = new t90();
                            d2Var.presentFragment(t90Var6);
                            t90Var6.b0(28700);
                            t90Var6.a0(16388);
                            return;
                        case 26:
                            t90 t90Var7 = new t90();
                            d2Var.presentFragment(t90Var7);
                            t90Var7.b0(28700);
                            t90Var7.a0(8200);
                            return;
                        case 27:
                            t90 t90Var8 = new t90();
                            d2Var.presentFragment(t90Var8);
                            t90Var8.b0(28700);
                            t90Var8.a0(4112);
                            return;
                        case 28:
                            t90 t90Var9 = new t90();
                            d2Var.presentFragment(t90Var9);
                            t90Var9.a0(360928);
                            return;
                        default:
                            t90 t90Var10 = new t90();
                            d2Var.presentFragment(t90Var10);
                            t90Var10.b0(360928);
                            t90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            kw0Var20 = null;
        }
        if (F(currentAccount, 10)) {
            kw0Var21 = new kw0(812, org.telegram.messenger.bd.L0(2131747028), org.telegram.messenger.bd.L0(2131744241), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            d2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            d2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            d2Var.presentFragment(new o(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                            vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            return;
                        case 5:
                            d2Var.presentFragment(new o(1));
                            return;
                        case 6:
                            d2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            t90 t90Var = new t90();
                            d2Var.presentFragment(t90Var);
                            t90Var.b0(3);
                            t90Var.a0(2);
                            return;
                        case 8:
                            d2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            d2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            d2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            d2Var.presentFragment(new sx0());
                            return;
                        case 12:
                            d2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                            vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                            v0Var2.K0();
                            d2Var3.showDialog(v0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                            vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                            v0Var3.K0();
                            d2Var4.showDialog(v0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                            vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                            v0Var4.K0();
                            d2Var5.showDialog(v0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                            vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                            v0Var5.K0();
                            d2Var6.showDialog(v0Var5);
                            return;
                        case 18:
                            d2Var.presentFragment(new t90());
                            return;
                        case 19:
                            t90 t90Var2 = new t90();
                            d2Var.presentFragment(t90Var2);
                            t90Var2.a0(3);
                            return;
                        case 20:
                            t90 t90Var3 = new t90();
                            d2Var.presentFragment(t90Var3);
                            t90Var3.b0(3);
                            t90Var3.a0(1);
                            return;
                        case 21:
                            d2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            t90 t90Var4 = new t90();
                            d2Var.presentFragment(t90Var4);
                            t90Var4.b0(3);
                            t90Var4.a0(2);
                            return;
                        case 23:
                            t90 t90Var5 = new t90();
                            d2Var.presentFragment(t90Var5);
                            t90Var5.a0(28700);
                            return;
                        case 24:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            t90 t90Var6 = new t90();
                            d2Var.presentFragment(t90Var6);
                            t90Var6.b0(28700);
                            t90Var6.a0(16388);
                            return;
                        case 26:
                            t90 t90Var7 = new t90();
                            d2Var.presentFragment(t90Var7);
                            t90Var7.b0(28700);
                            t90Var7.a0(8200);
                            return;
                        case 27:
                            t90 t90Var8 = new t90();
                            d2Var.presentFragment(t90Var8);
                            t90Var8.b0(28700);
                            t90Var8.a0(4112);
                            return;
                        case 28:
                            t90 t90Var9 = new t90();
                            d2Var.presentFragment(t90Var9);
                            t90Var9.a0(360928);
                            return;
                        default:
                            t90 t90Var10 = new t90();
                            d2Var.presentFragment(t90Var10);
                            t90Var10.b0(360928);
                            t90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            kw0Var21 = null;
        }
        if (F(currentAccount, 12)) {
            kw0Var22 = new kw0(813, org.telegram.messenger.bd.L0(2131747012), org.telegram.messenger.bd.L0(2131744241), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            d2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            d2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            d2Var.presentFragment(new o(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                            vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            return;
                        case 5:
                            d2Var.presentFragment(new o(1));
                            return;
                        case 6:
                            d2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            t90 t90Var = new t90();
                            d2Var.presentFragment(t90Var);
                            t90Var.b0(3);
                            t90Var.a0(2);
                            return;
                        case 8:
                            d2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            d2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            d2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            d2Var.presentFragment(new sx0());
                            return;
                        case 12:
                            d2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                            vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                            v0Var2.K0();
                            d2Var3.showDialog(v0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                            vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                            v0Var3.K0();
                            d2Var4.showDialog(v0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                            vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                            v0Var4.K0();
                            d2Var5.showDialog(v0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                            vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                            v0Var5.K0();
                            d2Var6.showDialog(v0Var5);
                            return;
                        case 18:
                            d2Var.presentFragment(new t90());
                            return;
                        case 19:
                            t90 t90Var2 = new t90();
                            d2Var.presentFragment(t90Var2);
                            t90Var2.a0(3);
                            return;
                        case 20:
                            t90 t90Var3 = new t90();
                            d2Var.presentFragment(t90Var3);
                            t90Var3.b0(3);
                            t90Var3.a0(1);
                            return;
                        case 21:
                            d2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            t90 t90Var4 = new t90();
                            d2Var.presentFragment(t90Var4);
                            t90Var4.b0(3);
                            t90Var4.a0(2);
                            return;
                        case 23:
                            t90 t90Var5 = new t90();
                            d2Var.presentFragment(t90Var5);
                            t90Var5.a0(28700);
                            return;
                        case 24:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            t90 t90Var6 = new t90();
                            d2Var.presentFragment(t90Var6);
                            t90Var6.b0(28700);
                            t90Var6.a0(16388);
                            return;
                        case 26:
                            t90 t90Var7 = new t90();
                            d2Var.presentFragment(t90Var7);
                            t90Var7.b0(28700);
                            t90Var7.a0(8200);
                            return;
                        case 27:
                            t90 t90Var8 = new t90();
                            d2Var.presentFragment(t90Var8);
                            t90Var8.b0(28700);
                            t90Var8.a0(4112);
                            return;
                        case 28:
                            t90 t90Var9 = new t90();
                            d2Var.presentFragment(t90Var9);
                            t90Var9.a0(360928);
                            return;
                        default:
                            t90 t90Var10 = new t90();
                            d2Var.presentFragment(t90Var10);
                            t90Var10.b0(360928);
                            t90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            kw0Var22 = null;
        }
        kw0 kw0Var124 = new kw0(900, org.telegram.messenger.bd.L0(2131747074), null, 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        return;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        return;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        return;
                    case 18:
                        d2Var.presentFragment(new t90());
                        return;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        return;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        return;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        return;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        return;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        return;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        return;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        return;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        return;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        return;
                }
            }
        });
        kw0Var124.a("tg://settings/power-saving");
        kw0 kw0Var125 = new kw0(901, org.telegram.messenger.bd.L0(2131748858), org.telegram.messenger.bd.L0(2131747074), 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        return;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        return;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        return;
                    case 18:
                        d2Var.presentFragment(new t90());
                        return;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        return;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        return;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        return;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        return;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        return;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        return;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        return;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        return;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        return;
                }
            }
        });
        kw0Var125.a("tg://settings/power-saving/stickers");
        kw0 kw0Var126 = new kw0(902, org.telegram.messenger.bd.L0(2131748870), null, org.telegram.messenger.bd.L0(2131747074), org.telegram.messenger.bd.L0(2131748858), 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        return;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        return;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        return;
                    case 18:
                        d2Var.presentFragment(new t90());
                        return;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        return;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        return;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        return;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        return;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        return;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        return;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        return;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        return;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        return;
                }
            }
        });
        kw0 kw0Var127 = new kw0(903, org.telegram.messenger.bd.L0(2131748872), null, org.telegram.messenger.bd.L0(2131747074), org.telegram.messenger.bd.L0(2131748858), 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        return;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        return;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        return;
                    case 18:
                        d2Var.presentFragment(new t90());
                        return;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        return;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        return;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        return;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        return;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        return;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        return;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        return;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        return;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        return;
                }
            }
        });
        kw0 kw0Var128 = new kw0(904, org.telegram.messenger.bd.L0(2131748863), org.telegram.messenger.bd.L0(2131747074), 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        return;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        return;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        return;
                    case 18:
                        d2Var.presentFragment(new t90());
                        return;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        return;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        return;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        return;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        return;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        return;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        return;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        return;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        return;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        return;
                }
            }
        });
        kw0Var128.a("tg://settings/power-saving/emoji");
        kw0 kw0Var129 = new kw0(905, org.telegram.messenger.bd.L0(2131748870), null, org.telegram.messenger.bd.L0(2131747074), org.telegram.messenger.bd.L0(2131748863), 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        return;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        return;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        return;
                    case 18:
                        d2Var.presentFragment(new t90());
                        return;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        return;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        return;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        return;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        return;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        return;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        return;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        return;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        return;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        return;
                }
            }
        });
        kw0 kw0Var130 = new kw0(906, org.telegram.messenger.bd.L0(2131748869), null, org.telegram.messenger.bd.L0(2131747074), org.telegram.messenger.bd.L0(2131748863), 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        return;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        return;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        return;
                    case 18:
                        d2Var.presentFragment(new t90());
                        return;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        return;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        return;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        return;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        return;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        return;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        return;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        return;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        return;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        return;
                }
            }
        });
        kw0 kw0Var131 = new kw0(907, org.telegram.messenger.bd.L0(2131748872), null, org.telegram.messenger.bd.L0(2131747074), org.telegram.messenger.bd.L0(2131748863), 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        return;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        return;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        return;
                    case 18:
                        d2Var.presentFragment(new t90());
                        return;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        return;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        return;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        return;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        return;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        return;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        return;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        return;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        return;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        return;
                }
            }
        });
        kw0 kw0Var132 = new kw0(908, org.telegram.messenger.bd.L0(2131748864), org.telegram.messenger.bd.L0(2131747074), 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        return;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        return;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        return;
                    case 18:
                        d2Var.presentFragment(new t90());
                        return;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        return;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        return;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        return;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        return;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        return;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        return;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        return;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        return;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        return;
                }
            }
        });
        kw0Var132.a("tg://settings/power-saving/effects");
        kw0 kw0Var133 = new kw0(909, org.telegram.messenger.bd.L0(2131748867), null, org.telegram.messenger.bd.L0(2131747074), org.telegram.messenger.bd.L0(2131748864), 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        return;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        return;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        return;
                    case 18:
                        d2Var.presentFragment(new t90());
                        return;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        return;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        return;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        return;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        return;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        return;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        return;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        return;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        return;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        return;
                }
            }
        });
        kw0Var133.a("tg://settings/power-saving/background");
        kw0 kw0Var134 = new kw0(910, org.telegram.messenger.bd.L0(2131748855), null, org.telegram.messenger.bd.L0(2131747074), org.telegram.messenger.bd.L0(2131748864), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i3 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i3) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        return;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        return;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        return;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        return;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        return;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        return;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        return;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.f49748s;
                            if (i10 < arrayList.size()) {
                                if (((o90) arrayList.get(i10)).f48239f == 1) {
                                    t90Var8.f49742b.e1(new k2.q(t90Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        return;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        return;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        return;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        return;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        return;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        kw0 kw0Var135 = new kw0(911, org.telegram.messenger.bd.L0(2131748859), null, org.telegram.messenger.bd.L0(2131747074), org.telegram.messenger.bd.L0(2131748864), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i3 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i3) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        return;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        return;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        return;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        return;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        return;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        return;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        return;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.f49748s;
                            if (i10 < arrayList.size()) {
                                if (((o90) arrayList.get(i10)).f48239f == 1) {
                                    t90Var8.f49742b.e1(new k2.q(t90Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        return;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        return;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        return;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        return;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        return;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        if (org.telegram.messenger.az.o() >= 1) {
            kw0Var23 = new kw0(326, org.telegram.messenger.bd.L0(2131748866), null, org.telegram.messenger.bd.L0(2131747074), org.telegram.messenger.bd.L0(2131748864), 2131232019, new Runnable() {
                @Override
                public final void run() {
                    int i3 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                    switch (i3) {
                        case 0:
                            t90 t90Var = new t90();
                            d2Var2.presentFragment(t90Var);
                            t90Var.b0(360928);
                            t90Var.a0(64);
                            return;
                        case 1:
                            t90 t90Var2 = new t90();
                            d2Var2.presentFragment(t90Var2);
                            t90Var2.b0(360928);
                            t90Var2.a0(128);
                            return;
                        case 2:
                            d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            t90 t90Var3 = new t90();
                            d2Var2.presentFragment(t90Var3);
                            t90Var3.b0(360928);
                            t90Var3.a0(256);
                            return;
                        case 4:
                            t90 t90Var4 = new t90();
                            d2Var2.presentFragment(t90Var4);
                            t90Var4.b0(360928);
                            t90Var4.a0(32768);
                            return;
                        case 5:
                            t90 t90Var5 = new t90();
                            d2Var2.presentFragment(t90Var5);
                            t90Var5.a0(512);
                            return;
                        case 6:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            t90 t90Var6 = new t90();
                            d2Var2.presentFragment(t90Var6);
                            t90Var6.a0(1024);
                            return;
                        case 8:
                            t90 t90Var7 = new t90();
                            d2Var2.presentFragment(t90Var7);
                            t90Var7.a0(2048);
                            return;
                        case 9:
                            t90 t90Var8 = new t90();
                            d2Var2.presentFragment(t90Var8);
                            while (true) {
                                ArrayList arrayList = t90Var8.f49748s;
                                if (i10 < arrayList.size()) {
                                    if (((o90) arrayList.get(i10)).f48239f == 1) {
                                        t90Var8.f49742b.e1(new k2.q(t90Var8, i10, 13), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            return;
                        case 14:
                            d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                            return;
                        case 15:
                            sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                            return;
                        case 16:
                            sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                            return;
                        case 17:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            d2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            d2Var2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            d2Var2.presentFragment(PasscodeActivity.p0());
                            return;
                        case 23:
                            vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                            v0Var2.K0();
                            d2Var2.showDialog(v0Var2);
                            return;
                        case 24:
                            d2Var2.presentFragment(new g(3));
                            return;
                        case 25:
                            d2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            it0 it0Var = new it0();
                            it0Var.getMessagesController().F0(true);
                            d2Var2.presentFragment(it0Var);
                            return;
                        case 27:
                            d2Var2.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            kw0Var23 = null;
        }
        kw0 kw0Var136 = new kw0(912, org.telegram.messenger.bd.L0(2131748860), null, org.telegram.messenger.bd.L0(2131747074), org.telegram.messenger.bd.L0(2131748864), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i3 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i3) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        return;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        return;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        return;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        return;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        return;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        return;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        return;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.f49748s;
                            if (i10 < arrayList.size()) {
                                if (((o90) arrayList.get(i10)).f48239f == 1) {
                                    t90Var8.f49742b.e1(new k2.q(t90Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        return;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        return;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        return;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        return;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        return;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        kw0 kw0Var137 = new kw0(913, org.telegram.messenger.bd.L0(2131748865), org.telegram.messenger.bd.L0(2131747074), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i3 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i3) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        return;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        return;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        return;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        return;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        return;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        return;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        return;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.f49748s;
                            if (i10 < arrayList.size()) {
                                if (((o90) arrayList.get(i10)).f48239f == 1) {
                                    t90Var8.f49742b.e1(new k2.q(t90Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        return;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        return;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        return;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        return;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        return;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        kw0Var137.a("tg://settings/power-saving/call-animations");
        kw0 kw0Var138 = new kw0(214, org.telegram.messenger.bd.L0(2131748868), org.telegram.messenger.bd.L0(2131747074), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i3 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i3) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        return;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        return;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        return;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        return;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        return;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        return;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        return;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.f49748s;
                            if (i10 < arrayList.size()) {
                                if (((o90) arrayList.get(i10)).f48239f == 1) {
                                    t90Var8.f49742b.e1(new k2.q(t90Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        return;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        return;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        return;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        return;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        return;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        kw0Var138.a("tg://settings/power-saving/videos");
        kw0 kw0Var139 = new kw0(213, org.telegram.messenger.bd.L0(2131748871), org.telegram.messenger.bd.L0(2131747074), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i3 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i3) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        return;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        return;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        return;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        return;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        return;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        return;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        return;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.f49748s;
                            if (i10 < arrayList.size()) {
                                if (((o90) arrayList.get(i10)).f48239f == 1) {
                                    t90Var8.f49742b.e1(new k2.q(t90Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        return;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        return;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        return;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        return;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        return;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        kw0Var139.a("tg://settings/power-saving/gifs");
        kw0 kw0Var140 = new kw0(914, org.telegram.messenger.bd.L0(2131748854), org.telegram.messenger.bd.L0(2131747074), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i3 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i3) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        return;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        return;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        return;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        return;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        return;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        return;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        return;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.f49748s;
                            if (i10 < arrayList.size()) {
                                if (((o90) arrayList.get(i10)).f48239f == 1) {
                                    t90Var8.f49742b.e1(new k2.q(t90Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        return;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        return;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        return;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        return;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        return;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        kw0Var140.a("tg://settings/power-saving/transitions");
        kw0 kw0Var141 = new kw0(400, org.telegram.messenger.bd.L0(2131749062), 2131232030, new Runnable() {
            @Override
            public final void run() {
                int i3 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i3) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        return;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        return;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        return;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        return;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        return;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        return;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        return;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.f49748s;
                            if (i10 < arrayList.size()) {
                                if (((o90) arrayList.get(i10)).f48239f == 1) {
                                    t90Var8.f49742b.e1(new k2.q(t90Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        return;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        return;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        return;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        return;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        return;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        kw0Var141.a("tg://settings/language");
        kw0 kw0Var142 = new kw0(405, org.telegram.messenger.bd.L0(2131745337), org.telegram.messenger.bd.L0(2131749062), 2131232030, new Runnable() {
            @Override
            public final void run() {
                int i3 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i3) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        return;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        return;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        return;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        return;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        return;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        return;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        return;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.f49748s;
                            if (i10 < arrayList.size()) {
                                if (((o90) arrayList.get(i10)).f48239f == 1) {
                                    t90Var8.f49742b.e1(new k2.q(t90Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        return;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        return;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        return;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        return;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        return;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        kw0Var142.a("tg://settings/language/show-button");
        if (org.telegram.messenger.hp.s1(currentAccount).T1().s()) {
            kw0 kw0Var143 = new kw0(406, org.telegram.messenger.bd.L0(2131751359), org.telegram.messenger.bd.L0(2131749062), 2131232030, new Runnable() {
                @Override
                public final void run() {
                    int i3 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                    switch (i3) {
                        case 0:
                            t90 t90Var = new t90();
                            d2Var2.presentFragment(t90Var);
                            t90Var.b0(360928);
                            t90Var.a0(64);
                            return;
                        case 1:
                            t90 t90Var2 = new t90();
                            d2Var2.presentFragment(t90Var2);
                            t90Var2.b0(360928);
                            t90Var2.a0(128);
                            return;
                        case 2:
                            d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            t90 t90Var3 = new t90();
                            d2Var2.presentFragment(t90Var3);
                            t90Var3.b0(360928);
                            t90Var3.a0(256);
                            return;
                        case 4:
                            t90 t90Var4 = new t90();
                            d2Var2.presentFragment(t90Var4);
                            t90Var4.b0(360928);
                            t90Var4.a0(32768);
                            return;
                        case 5:
                            t90 t90Var5 = new t90();
                            d2Var2.presentFragment(t90Var5);
                            t90Var5.a0(512);
                            return;
                        case 6:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            t90 t90Var6 = new t90();
                            d2Var2.presentFragment(t90Var6);
                            t90Var6.a0(1024);
                            return;
                        case 8:
                            t90 t90Var7 = new t90();
                            d2Var2.presentFragment(t90Var7);
                            t90Var7.a0(2048);
                            return;
                        case 9:
                            t90 t90Var8 = new t90();
                            d2Var2.presentFragment(t90Var8);
                            while (true) {
                                ArrayList arrayList = t90Var8.f49748s;
                                if (i10 < arrayList.size()) {
                                    if (((o90) arrayList.get(i10)).f48239f == 1) {
                                        t90Var8.f49742b.e1(new k2.q(t90Var8, i10, 13), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            return;
                        case 14:
                            d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                            return;
                        case 15:
                            sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                            return;
                        case 16:
                            sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                            return;
                        case 17:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            d2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            d2Var2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            d2Var2.presentFragment(PasscodeActivity.p0());
                            return;
                        case 23:
                            vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                            v0Var2.K0();
                            d2Var2.showDialog(v0Var2);
                            return;
                        case 24:
                            d2Var2.presentFragment(new g(3));
                            return;
                        case 25:
                            d2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            it0 it0Var = new it0();
                            it0Var.getMessagesController().F0(true);
                            d2Var2.presentFragment(it0Var);
                            return;
                        case 27:
                            d2Var2.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
            kw0Var143.a("tg://settings/language/do-not-translate");
            kw0Var44 = kw0Var143;
        }
        kw0 kw0Var144 = new kw0(402, org.telegram.messenger.bd.L0(2131753986), org.telegram.messenger.bd.L0(2131745489), 2131232029, new Runnable() {
            @Override
            public final void run() {
                int i3 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i3) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        return;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        return;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        return;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        return;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        return;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        return;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        return;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.f49748s;
                            if (i10 < arrayList.size()) {
                                if (((o90) arrayList.get(i10)).f48239f == 1) {
                                    t90Var8.f49742b.e1(new k2.q(t90Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        return;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        return;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        return;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        return;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        return;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        kw0Var144.a("tg://settings/ask-question");
        kw0 kw0Var145 = new kw0(403, org.telegram.messenger.bd.L0(2131744252), org.telegram.messenger.bd.L0(2131745489), 2131232029, new Runnable() {
            @Override
            public final void run() {
                int i3 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i3) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        return;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        return;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        return;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        return;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        return;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        return;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        return;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.f49748s;
                            if (i10 < arrayList.size()) {
                                if (((o90) arrayList.get(i10)).f48239f == 1) {
                                    t90Var8.f49742b.e1(new k2.q(t90Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        return;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        return;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        return;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        return;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        return;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        kw0Var145.a("tg://settings/faq");
        kw0 kw0Var146 = new kw0(404, org.telegram.messenger.bd.L0(2131746791), org.telegram.messenger.bd.L0(2131745489), 2131232029, new Runnable() {
            @Override
            public final void run() {
                int i3 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i3) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        return;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        return;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        return;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        return;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        return;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        return;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        return;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.f49748s;
                            if (i10 < arrayList.size()) {
                                if (((o90) arrayList.get(i10)).f48239f == 1) {
                                    t90Var8.f49742b.e1(new k2.q(t90Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        return;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        return;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        return;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        return;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        return;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        return;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        kw0Var146.a("tg://settings/privacy-policy");
        return new kw0[]{kw0Var24, kw0Var25, kw0Var26, kw0Var27, kw0Var28, kw0Var29, kw0Var30, kw0Var31, kw0Var32, kw0Var33, kw0Var34, kw0Var35, kw0Var36, kw0Var37, kw0Var38, kw0Var39, kw0Var40, kw0Var, kw0Var42, kw0Var43, kw0Var2, kw0Var45, kw0Var46, kw0Var47, kw0Var48, kw0Var49, kw0Var50, kw0Var51, kw0Var52, kw0Var53, kw0Var3, kw0Var4, kw0Var55, kw0Var56, kw0Var57, kw0Var58, kw0Var59, kw0Var60, kw0Var61, kw0Var62, kw0Var63, kw0Var64, kw0Var65, kw0Var66, kw0Var67, kw0Var68, kw0Var69, kw0Var70, kw0Var71, kw0Var72, kw0Var73, kw0Var74, kw0Var75, kw0Var76, kw0Var77, kw0Var78, kw0Var79, kw0Var80, kw0Var81, kw0Var82, kw0Var83, kw0Var84, kw0Var85, kw0Var86, kw0Var87, kw0Var88, kw0Var89, kw0Var90, kw0Var91, kw0Var92, kw0Var93, kw0Var94, kw0Var95, kw0Var96, kw0Var97, kw0Var98, kw0Var99, kw0Var100, kw0Var101, kw0Var102, kw0Var103, kw0Var104, kw0Var105, kw0Var106, kw0Var107, kw0Var108, kw0Var109, kw0Var110, kw0Var111, kw0Var112, kw0Var113, kw0Var6, kw0Var115, kw0Var7, kw0Var117, kw0Var8, kw0Var119, kw0Var120, kw0Var121, kw0Var122, kw0Var5, kw0Var9, kw0Var10, kw0Var11, kw0Var12, kw0Var13, kw0Var14, kw0Var15, kw0Var16, kw0Var17, kw0Var18, kw0Var19, kw0Var20, kw0Var21, kw0Var22, kw0Var124, kw0Var125, kw0Var126, kw0Var127, kw0Var128, kw0Var129, kw0Var130, kw0Var131, kw0Var132, kw0Var133, kw0Var134, kw0Var135, kw0Var23, kw0Var136, kw0Var137, kw0Var138, kw0Var139, kw0Var140, kw0Var141, kw0Var142, kw0Var44, kw0Var144, kw0Var145, kw0Var146};
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f == 0) {
            return true;
        }
        return false;
    }

    public final void E(Object obj) {
        ArrayList arrayList = this.f47456w;
        int indexOf = arrayList.indexOf(obj);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
        }
        arrayList.add(0, obj);
        if (!this.f47457x) {
            f();
        }
        if (arrayList.size() > 20) {
            a1.g.y(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj2 = arrayList.get(i3);
            if (obj2 instanceof kw0) {
                ((kw0) obj2).f47042g = i3;
            } else if (obj2 instanceof org.telegram.messenger.to) {
                ((org.telegram.messenger.to) obj2).d = i3;
            }
            linkedHashSet.add(obj2.toString());
        }
        org.telegram.messenger.hp.e1().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i3 = this.f47452f;
        TLRPC.WebPage webPage = org.telegram.messenger.hp.s1(i3).f23107r2;
        this.F = webPage;
        if (webPage != null) {
            this.d.addAll(org.telegram.messenger.hp.s1(i3).f23097q2);
        }
        if (this.F == null && !this.G) {
            this.G = true;
            TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
            tL_messages_getWebPage.url = org.telegram.messenger.bd.M0(2131744250, null);
            tL_messages_getWebPage.hash = 0;
            ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getWebPage, new l(this, 21));
        }
    }

    public final void I(String str) {
        this.E = str;
        if (this.f47458y != null) {
            Utilities.f21389g.a(this.f47458y);
            this.f47458y = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.f47457x = false;
            this.f47454r.clear();
            this.f47455s.clear();
            this.f47453n.clear();
            org.telegram.ui.ActionBar.d2 d2Var = this.f47451e;
            if (d2Var instanceof ProfileActivity) {
                try {
                    ((ProfileActivity) d2Var).P.f41126b.getImageReceiver().P0(false);
                    ((ProfileActivity) this.f47451e).P.d.setText(org.telegram.messenger.bd.M0(2131745487, null));
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            f();
            return;
        }
        org.telegram.messenger.p5 p5Var = Utilities.f21389g;
        qv0 qv0Var = new qv0(2, this, str);
        this.f47458y = qv0Var;
        p5Var.e(qv0Var, 300L);
    }

    public final void J() {
        String[] strArr;
        kw0 kw0Var;
        HashMap hashMap = new HashMap();
        int i3 = 0;
        while (true) {
            kw0[] kw0VarArr = this.f47450c;
            if (i3 >= kw0VarArr.length) {
                break;
            }
            kw0 kw0Var2 = kw0VarArr[i3];
            if (kw0Var2 != null) {
                hashMap.put(Integer.valueOf(kw0Var2.f47041f), this.f47450c[i3]);
            }
            i3++;
        }
        Set<String> stringSet = org.telegram.messenger.hp.e1().getStringSet("settingsSearchRecent2", null);
        ArrayList arrayList = this.f47456w;
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
                            for (int i10 = 0; i10 < readInt323; i10++) {
                                strArr[i10] = serializedData.readString(false);
                            }
                        } else {
                            strArr = null;
                        }
                        org.telegram.messenger.to toVar = new org.telegram.messenger.to(readString, strArr, serializedData.readString(false));
                        toVar.d = readInt32;
                        arrayList.add(toVar);
                    } else if (readInt322 == 1 && (kw0Var = (kw0) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        kw0Var.f47042g = readInt32;
                        arrayList.add(kw0Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new org.telegram.ui.Components.d80(this));
    }

    @Override
    public final int b() {
        int size;
        int i3 = 0;
        if (this.f47457x) {
            int size2 = this.f47454r.size();
            if (!this.f47455s.isEmpty()) {
                i3 = this.f47455s.size() + 1;
            }
            return size2 + i3;
        }
        ArrayList arrayList = this.f47456w;
        if (arrayList.isEmpty()) {
            size = 0;
        } else {
            size = arrayList.size() + 1;
        }
        ArrayList arrayList2 = this.d;
        if (!arrayList2.isEmpty()) {
            i3 = arrayList2.size() + 1;
        }
        return size + i3;
    }

    @Override
    public final int d(int i3) {
        if (this.f47457x) {
            if (i3 < this.f47454r.size() || i3 != this.f47454r.size()) {
                return 0;
            }
        } else {
            ArrayList arrayList = this.f47456w;
            if (i3 == 0) {
                if (!arrayList.isEmpty()) {
                    return 2;
                }
            } else if (arrayList.isEmpty() || i3 != arrayList.size() + 1) {
                return 0;
            }
        }
        return 1;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        int i11 = d1Var.f55544f;
        View view = d1Var.f55540a;
        kw0 kw0Var = null;
        boolean z10 = true;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.bd.M0(2131745479, null));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.bd.M0(2131745492, null));
            return;
        }
        org.telegram.ui.Cells.u6 u6Var = (org.telegram.ui.Cells.u6) view;
        boolean z11 = false;
        if (this.f47457x) {
            if (i3 < this.f47454r.size()) {
                kw0 kw0Var2 = (kw0) this.f47454r.get(i3);
                if (i3 > 0) {
                    kw0Var = (kw0) this.f47454r.get(i3 - 1);
                }
                if (kw0Var != null && kw0Var.f47040e == kw0Var2.f47040e) {
                    i10 = 0;
                } else {
                    i10 = kw0Var2.f47040e;
                }
                CharSequence charSequence = (CharSequence) this.f47453n.get(i3);
                String[] strArr = kw0Var2.d;
                if (i3 >= this.f47454r.size() - 1) {
                    z10 = false;
                }
                u6Var.b(charSequence, strArr, i10, z10);
                return;
            }
            int f10 = k2.p1.f(1, i3, this.f47454r);
            CharSequence charSequence2 = (CharSequence) this.f47453n.get(this.f47454r.size() + f10);
            String[] strArr2 = ((org.telegram.messenger.to) this.f47455s.get(f10)).f25575b;
            if (f10 < this.f47454r.size() - 1) {
                z11 = true;
            }
            u6Var.a(charSequence2, strArr2, true, z11);
            return;
        }
        ArrayList arrayList = this.f47456w;
        if (!arrayList.isEmpty()) {
            i3--;
        }
        if (i3 < arrayList.size()) {
            Object obj = arrayList.get(i3);
            if (obj instanceof kw0) {
                kw0 kw0Var3 = (kw0) obj;
                String str = kw0Var3.f47037a;
                String[] strArr3 = kw0Var3.d;
                if (i3 >= arrayList.size() - 1) {
                    z10 = false;
                }
                u6Var.a(str, strArr3, false, z10);
                return;
            } else if (obj instanceof org.telegram.messenger.to) {
                org.telegram.messenger.to toVar = (org.telegram.messenger.to) obj;
                String str2 = toVar.f25574a;
                String[] strArr4 = toVar.f25575b;
                if (i3 < arrayList.size() - 1) {
                    z11 = true;
                }
                u6Var.a(str2, strArr4, true, z11);
                return;
            } else {
                return;
            }
        }
        int f11 = k2.p1.f(1, i3, arrayList);
        org.telegram.messenger.to toVar2 = (org.telegram.messenger.to) this.d.get(f11);
        String str3 = toVar2.f25574a;
        String[] strArr5 = toVar2.f25575b;
        if (f11 < arrayList.size() - 1) {
            z11 = true;
        }
        u6Var.a(str3, strArr5, true, z11);
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View u6Var;
        Context context = this.h;
        if (i3 != 0) {
            if (i3 != 1) {
                u6Var = new org.telegram.ui.Cells.n4(context, 16);
            } else {
                u6Var = new org.telegram.ui.Cells.x3(context, null);
            }
        } else {
            u6Var = new org.telegram.ui.Cells.u6(context);
        }
        u6Var.setLayoutParams(new u4.p0(-1, -2));
        return new u4.d1(u6Var);
    }
}
