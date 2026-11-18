package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.TreeSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class wq implements Runnable {
    public final boolean[] E;
    public final org.telegram.messenger.x10 F;
    public final org.telegram.ui.ActionBar.x2 G;
    public final org.telegram.ui.ii H;
    public final org.telegram.ui.ActionBar.i6 I;
    public final org.telegram.ui.Cells.a9 J;
    public final Context K;
    public final boolean[] f41752a;
    public final int[] f41753b;
    public final org.telegram.ui.Cells.l3 f41754c;
    public final TreeSet d;
    public final String[] f41755e;
    public final vq f41756f;
    public final org.telegram.ui.Cells.l3 h;
    public final int[] f41757n;
    public final bi.t4 f41758r;
    public final hi.d f41759s;
    public final boolean f41760w;
    public final int f41761x;
    public final TLRPC.User f41762y;

    public wq(boolean[] zArr, int[] iArr, org.telegram.ui.Cells.l3 l3Var, TreeSet treeSet, String[] strArr, vq vqVar, org.telegram.ui.Cells.l3 l3Var2, int[] iArr2, bi.t4 t4Var, hi.d dVar, boolean z10, int i7, TLRPC.User user, boolean[] zArr2, org.telegram.messenger.x10 x10Var, org.telegram.ui.ActionBar.x2 x2Var, org.telegram.ui.ii iiVar, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.Cells.a9 a9Var, Context context) {
        this.f41752a = zArr;
        this.f41753b = iArr;
        this.f41754c = l3Var;
        this.d = treeSet;
        this.f41755e = strArr;
        this.f41756f = vqVar;
        this.h = l3Var2;
        this.f41757n = iArr2;
        this.f41758r = t4Var;
        this.f41759s = dVar;
        this.f41760w = z10;
        this.f41761x = i7;
        this.f41762y = user;
        this.E = zArr2;
        this.F = x10Var;
        this.G = x2Var;
        this.H = iiVar;
        this.I = i6Var;
        this.J = a9Var;
        this.K = context;
    }

    @Override
    public final void run() {
        final org.telegram.ui.Cells.l3 l3Var = this.h;
        org.telegram.ui.Cells.j3 j3Var = l3Var.d;
        final boolean[] zArr = this.f41752a;
        if (!zArr[0]) {
            final int[] iArr = this.f41753b;
            if (iArr[0] < 0) {
                final org.telegram.ui.Cells.l3 l3Var2 = this.f41754c;
                String charSequence = l3Var2.getText().toString();
                StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(charSequence);
                String str = "bot";
                boolean a10 = zq.a(charSequence, "bot");
                final TreeSet treeSet = this.d;
                m10.append((a10 || zq.c(charSequence, treeSet) != null) ? "" : "");
                String sb2 = m10.toString();
                final String[] strArr = this.f41755e;
                if (!TextUtils.equals(strArr[0], sb2)) {
                    this.f41756f.run();
                    return;
                }
                String trim = j3Var.getText().toString().trim();
                boolean isEmpty = TextUtils.isEmpty(trim);
                final int[] iArr2 = this.f41757n;
                if (isEmpty) {
                    int i7 = -iArr2[0];
                    iArr2[0] = i7;
                    org.telegram.messenger.g0.E3(i7, l3Var, null);
                    return;
                }
                this.f41758r.run();
                final hi.d dVar = this.f41759s;
                dVar.setLoading(true);
                dVar.setEnabled(false);
                j3Var.setEnabled(false);
                l3Var2.d.setEnabled(false);
                final TL_bots.createBot createbot = new TL_bots.createBot();
                createbot.via_deeplink = this.f41760w;
                createbot.username = strArr[0];
                createbot.name = trim;
                final int i10 = this.f41761x;
                org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i10);
                final TLRPC.User user = this.f41762y;
                createbot.manager_id = u12.s1(user);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                d3.b bVar = new d3.b(1);
                final boolean[] zArr2 = this.E;
                final org.telegram.messenger.x10 x10Var = this.F;
                final org.telegram.ui.ActionBar.x2 x2Var = this.G;
                final org.telegram.ui.ii iiVar = this.H;
                final org.telegram.ui.ActionBar.i6 i6Var = this.I;
                final org.telegram.ui.Cells.a9 a9Var = this.J;
                final Context context = this.K;
                iArr[0] = connectionsManager.sendRequestTyped(createbot, bVar, new org.telegram.messenger.q10() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        String q10;
                        String a02;
                        TLRPC.User user2 = (TLRPC.User) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (!zArr[0]) {
                            iArr[0] = -1;
                            hi.d dVar2 = dVar;
                            dVar2.setLoading(false);
                            dVar2.setEnabled(true);
                            l3Var.d.setEnabled(true);
                            l3Var2.d.setEnabled(true);
                            int i11 = i10;
                            org.telegram.ui.ActionBar.x2 x2Var2 = x2Var;
                            if (user2 != null) {
                                zArr2[0] = true;
                                org.telegram.messenger.mp.u1(i11).e4(user2, false, false);
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(user2);
                                org.telegram.messenger.tr.a0(i11).m1(arrayList, null, false, false);
                                x10Var.a(user2);
                                x2Var2.dismiss();
                            } else if (tL_error != null) {
                                String str2 = createbot.username;
                                String str3 = tL_error.text;
                                TreeSet treeSet2 = treeSet;
                                org.telegram.ui.ii iiVar2 = iiVar;
                                org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                                CharSequence d = zq.d(i11, str2, treeSet2, str3, iiVar2, i6Var2);
                                if (d != null) {
                                    strArr[0] = null;
                                    dVar2.setEnabled(false);
                                    org.telegram.ui.Cells.a9 a9Var2 = a9Var;
                                    a9Var2.setText(d);
                                    org.telegram.ui.ActionBar.u6.U(a9Var2.getTextView(), org.telegram.ui.ActionBar.n6.f29635q7, i6Var2);
                                    int[] iArr3 = iArr2;
                                    int i12 = -iArr3[0];
                                    iArr3[0] = i12;
                                    org.telegram.messenger.g0.E3(i12, a9Var2, null);
                                } else if ("BOT_CREATE_LIMIT_EXCEEDED".equalsIgnoreCase(tL_error.text)) {
                                    org.telegram.messenger.p0 p0Var = org.telegram.messenger.mp.u1(i11).A7;
                                    boolean q11 = org.telegram.messenger.j10.i(i11).q();
                                    lc lcVar = new lc(x2Var2.F, i6Var2);
                                    String M0 = org.telegram.messenger.gd.M0(2131751724, null);
                                    if (q11) {
                                        a02 = org.telegram.messenger.gd.a0(null, null, 2131751727, Integer.valueOf(((org.telegram.messenger.j0) p0Var.R.f15536b).f24764c));
                                    } else {
                                        a02 = org.telegram.messenger.gd.a0(null, null, 2131751726, Integer.valueOf(((org.telegram.messenger.j0) p0Var.R.f15536b).f24764c), Integer.valueOf(((org.telegram.messenger.j0) p0Var.Q.f15536b).f24764c));
                                    }
                                    SpannableStringBuilder O2 = org.telegram.messenger.g0.O2(a02, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.xj, i6Var2), new mo(x2Var2, 4));
                                    mg mgVar = new mg(20, x2Var2, context);
                                    int t6 = org.telegram.messenger.g0.t(O2, "@BotFather");
                                    if (t6 >= 0) {
                                        O2.setSpan(new org.telegram.ui.Cells.h(i6Var2, mgVar, 6), t6, t6 + 10, 33);
                                    }
                                    gc I = lcVar.I(2131624012, M0, O2);
                                    I.f35461j = 8000;
                                    I.j();
                                } else {
                                    String str4 = tL_error.text;
                                    if (str4 != null && str4.startsWith("FLOOD_WAIT_")) {
                                        new lc(x2Var2.F, i6Var2).I(2131624012, org.telegram.messenger.gd.M0(2131751724, null), org.telegram.messenger.gd.a0(null, null, 2131751725, org.telegram.messenger.gd.z(Integer.parseInt(tL_error.text.substring(11))))).j();
                                    } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                                        TLRPC.User user3 = user;
                                        if (!TextUtils.isEmpty(org.telegram.messenger.o10.o(user3))) {
                                            q10 = "@" + org.telegram.messenger.o10.o(user3);
                                        } else {
                                            q10 = org.telegram.messenger.o10.q(user3);
                                        }
                                        new lc(x2Var2.F, i6Var2).Q(2131624012, 36, org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.xj, i6Var2), org.telegram.messenger.gd.a0(null, null, 2131751719, q10))).j();
                                    } else {
                                        org.telegram.ui.Cells.c0.t(x2Var2.F, i6Var2, tL_error, false);
                                    }
                                }
                                org.telegram.messenger.g0.v1(x2Var2.getCurrentFocus());
                            }
                        }
                    }
                }, 1024);
            }
        }
    }
}
