package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.TreeSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class yq implements Runnable {
    public final boolean[] E;
    public final org.telegram.messenger.x10 F;
    public final org.telegram.ui.ActionBar.w2 G;
    public final org.telegram.ui.ii H;
    public final org.telegram.ui.ActionBar.h6 I;
    public final org.telegram.ui.Cells.a9 J;
    public final Context K;
    public final boolean[] f42498a;
    public final int[] f42499b;
    public final org.telegram.ui.Cells.l3 f42500c;
    public final TreeSet d;
    public final String[] f42501e;
    public final xq f42502f;
    public final org.telegram.ui.Cells.l3 h;
    public final int[] f42503n;
    public final bi.x4 f42504r;
    public final hi.e f42505s;
    public final boolean f42506w;
    public final int f42507x;
    public final TLRPC.User f42508y;

    public yq(boolean[] zArr, int[] iArr, org.telegram.ui.Cells.l3 l3Var, TreeSet treeSet, String[] strArr, xq xqVar, org.telegram.ui.Cells.l3 l3Var2, int[] iArr2, bi.x4 x4Var, hi.e eVar, boolean z10, int i7, TLRPC.User user, boolean[] zArr2, org.telegram.messenger.x10 x10Var, org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ii iiVar, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Cells.a9 a9Var, Context context) {
        this.f42498a = zArr;
        this.f42499b = iArr;
        this.f42500c = l3Var;
        this.d = treeSet;
        this.f42501e = strArr;
        this.f42502f = xqVar;
        this.h = l3Var2;
        this.f42503n = iArr2;
        this.f42504r = x4Var;
        this.f42505s = eVar;
        this.f42506w = z10;
        this.f42507x = i7;
        this.f42508y = user;
        this.E = zArr2;
        this.F = x10Var;
        this.G = w2Var;
        this.H = iiVar;
        this.I = h6Var;
        this.J = a9Var;
        this.K = context;
    }

    @Override
    public final void run() {
        final org.telegram.ui.Cells.l3 l3Var = this.h;
        org.telegram.ui.Cells.j3 j3Var = l3Var.d;
        final boolean[] zArr = this.f42498a;
        if (!zArr[0]) {
            final int[] iArr = this.f42499b;
            if (iArr[0] < 0) {
                final org.telegram.ui.Cells.l3 l3Var2 = this.f42500c;
                String charSequence = l3Var2.getText().toString();
                StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(charSequence);
                String str = "bot";
                boolean a10 = br.a(charSequence, "bot");
                final TreeSet treeSet = this.d;
                m10.append((a10 || br.c(charSequence, treeSet) != null) ? "" : "");
                String sb2 = m10.toString();
                final String[] strArr = this.f42501e;
                if (!TextUtils.equals(strArr[0], sb2)) {
                    this.f42502f.run();
                    return;
                }
                String trim = j3Var.getText().toString().trim();
                boolean isEmpty = TextUtils.isEmpty(trim);
                final int[] iArr2 = this.f42503n;
                if (isEmpty) {
                    int i7 = -iArr2[0];
                    iArr2[0] = i7;
                    org.telegram.messenger.g0.E3(i7, l3Var, null);
                    return;
                }
                this.f42504r.run();
                final hi.e eVar = this.f42505s;
                eVar.setLoading(true);
                eVar.setEnabled(false);
                j3Var.setEnabled(false);
                l3Var2.d.setEnabled(false);
                final TL_bots.createBot createbot = new TL_bots.createBot();
                createbot.via_deeplink = this.f42506w;
                createbot.username = strArr[0];
                createbot.name = trim;
                final int i10 = this.f42507x;
                org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i10);
                final TLRPC.User user = this.f42508y;
                createbot.manager_id = u12.s1(user);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                d3.b bVar = new d3.b(1);
                final boolean[] zArr2 = this.E;
                final org.telegram.messenger.x10 x10Var = this.F;
                final org.telegram.ui.ActionBar.w2 w2Var = this.G;
                final org.telegram.ui.ii iiVar = this.H;
                final org.telegram.ui.ActionBar.h6 h6Var = this.I;
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
                            hi.e eVar2 = eVar;
                            eVar2.setLoading(false);
                            eVar2.setEnabled(true);
                            l3Var.d.setEnabled(true);
                            l3Var2.d.setEnabled(true);
                            int i11 = i10;
                            org.telegram.ui.ActionBar.w2 w2Var2 = w2Var;
                            if (user2 != null) {
                                zArr2[0] = true;
                                org.telegram.messenger.mp.u1(i11).e4(user2, false, false);
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(user2);
                                org.telegram.messenger.tr.a0(i11).m1(arrayList, null, false, false);
                                x10Var.a(user2);
                                w2Var2.dismiss();
                            } else if (tL_error != null) {
                                String str2 = createbot.username;
                                String str3 = tL_error.text;
                                TreeSet treeSet2 = treeSet;
                                org.telegram.ui.ii iiVar2 = iiVar;
                                org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                                CharSequence d = br.d(i11, str2, treeSet2, str3, iiVar2, h6Var2);
                                if (d != null) {
                                    strArr[0] = null;
                                    eVar2.setEnabled(false);
                                    org.telegram.ui.Cells.a9 a9Var2 = a9Var;
                                    a9Var2.setText(d);
                                    org.telegram.ui.ActionBar.t6.U(a9Var2.getTextView(), org.telegram.ui.ActionBar.m6.f29619q7, h6Var2);
                                    int[] iArr3 = iArr2;
                                    int i12 = -iArr3[0];
                                    iArr3[0] = i12;
                                    org.telegram.messenger.g0.E3(i12, a9Var2, null);
                                } else if ("BOT_CREATE_LIMIT_EXCEEDED".equalsIgnoreCase(tL_error.text)) {
                                    org.telegram.messenger.p0 p0Var = org.telegram.messenger.mp.u1(i11).A7;
                                    boolean q11 = org.telegram.messenger.j10.i(i11).q();
                                    lc lcVar = new lc(w2Var2.F, h6Var2);
                                    String N0 = org.telegram.messenger.gd.N0(2131751723, null);
                                    if (q11) {
                                        a02 = org.telegram.messenger.gd.a0(null, null, 2131751726, Integer.valueOf(((org.telegram.messenger.j0) p0Var.R.f15505b).f24792c));
                                    } else {
                                        a02 = org.telegram.messenger.gd.a0(null, null, 2131751725, Integer.valueOf(((org.telegram.messenger.j0) p0Var.R.f15505b).f24792c), Integer.valueOf(((org.telegram.messenger.j0) p0Var.Q.f15505b).f24792c));
                                    }
                                    SpannableStringBuilder O2 = org.telegram.messenger.g0.O2(a02, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.xj, h6Var2), new oo(w2Var2, 4));
                                    mf mfVar = new mf(22, w2Var2, context);
                                    int t6 = org.telegram.messenger.g0.t(O2, "@BotFather");
                                    if (t6 >= 0) {
                                        O2.setSpan(new org.telegram.ui.Cells.h(h6Var2, mfVar, 6), t6, t6 + 10, 33);
                                    }
                                    gc I = lcVar.I(2131624012, N0, O2);
                                    I.f35508j = 8000;
                                    I.j();
                                } else {
                                    String str4 = tL_error.text;
                                    if (str4 != null && str4.startsWith("FLOOD_WAIT_")) {
                                        new lc(w2Var2.F, h6Var2).I(2131624012, org.telegram.messenger.gd.N0(2131751723, null), org.telegram.messenger.gd.a0(null, null, 2131751724, org.telegram.messenger.gd.z(Integer.parseInt(tL_error.text.substring(11))))).j();
                                    } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                                        TLRPC.User user3 = user;
                                        if (!TextUtils.isEmpty(org.telegram.messenger.o10.o(user3))) {
                                            q10 = "@" + org.telegram.messenger.o10.o(user3);
                                        } else {
                                            q10 = org.telegram.messenger.o10.q(user3);
                                        }
                                        new lc(w2Var2.F, h6Var2).Q(2131624012, 36, org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.xj, h6Var2), org.telegram.messenger.gd.a0(null, null, 2131751718, q10))).j();
                                    } else {
                                        org.telegram.ui.Cells.c0.t(w2Var2.F, h6Var2, tL_error, false);
                                    }
                                }
                                org.telegram.messenger.g0.v1(w2Var2.getCurrentFocus());
                            }
                        }
                    }
                }, 1024);
            }
        }
    }
}
