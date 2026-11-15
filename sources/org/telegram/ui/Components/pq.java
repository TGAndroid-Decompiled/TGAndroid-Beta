package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.TreeSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class pq implements Runnable {
    public final boolean[] E;
    public final org.telegram.messenger.z10 F;
    public final org.telegram.ui.ActionBar.u2 G;
    public final a2 H;
    public final org.telegram.ui.ActionBar.e6 I;
    public final org.telegram.ui.Cells.y8 J;
    public final Context K;
    public final boolean[] f38383a;
    public final int[] f38384b;
    public final org.telegram.ui.Cells.k3 f38385c;
    public final TreeSet d;
    public final String[] f38386e;
    public final oq f38387f;
    public final org.telegram.ui.Cells.k3 h;
    public final int[] f38388n;
    public final ci.p0 f38389r;
    public final hi.d f38390s;
    public final boolean f38391w;
    public final int f38392x;
    public final TLRPC.User f38393y;

    public pq(boolean[] zArr, int[] iArr, org.telegram.ui.Cells.k3 k3Var, TreeSet treeSet, String[] strArr, oq oqVar, org.telegram.ui.Cells.k3 k3Var2, int[] iArr2, ci.p0 p0Var, hi.d dVar, boolean z10, int i7, TLRPC.User user, boolean[] zArr2, org.telegram.messenger.z10 z10Var, org.telegram.ui.ActionBar.u2 u2Var, a2 a2Var, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Cells.y8 y8Var, Context context) {
        this.f38383a = zArr;
        this.f38384b = iArr;
        this.f38385c = k3Var;
        this.d = treeSet;
        this.f38386e = strArr;
        this.f38387f = oqVar;
        this.h = k3Var2;
        this.f38388n = iArr2;
        this.f38389r = p0Var;
        this.f38390s = dVar;
        this.f38391w = z10;
        this.f38392x = i7;
        this.f38393y = user;
        this.E = zArr2;
        this.F = z10Var;
        this.G = u2Var;
        this.H = a2Var;
        this.I = e6Var;
        this.J = y8Var;
        this.K = context;
    }

    @Override
    public final void run() {
        final org.telegram.ui.Cells.k3 k3Var = this.h;
        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
        final boolean[] zArr = this.f38383a;
        if (!zArr[0]) {
            final int[] iArr = this.f38384b;
            if (iArr[0] < 0) {
                final org.telegram.ui.Cells.k3 k3Var2 = this.f38385c;
                String charSequence = k3Var2.getText().toString();
                StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(charSequence);
                String str = "bot";
                boolean a10 = sq.a(charSequence, "bot");
                final TreeSet treeSet = this.d;
                m10.append((a10 || sq.c(charSequence, treeSet) != null) ? "" : "");
                String sb2 = m10.toString();
                final String[] strArr = this.f38386e;
                if (!TextUtils.equals(strArr[0], sb2)) {
                    this.f38387f.run();
                    return;
                }
                String trim = i3Var.getText().toString().trim();
                boolean isEmpty = TextUtils.isEmpty(trim);
                final int[] iArr2 = this.f38388n;
                if (isEmpty) {
                    int i7 = -iArr2[0];
                    iArr2[0] = i7;
                    org.telegram.messenger.g0.F3(i7, k3Var, null);
                    return;
                }
                this.f38389r.run();
                final hi.d dVar = this.f38390s;
                dVar.setLoading(true);
                dVar.setEnabled(false);
                i3Var.setEnabled(false);
                k3Var2.d.setEnabled(false);
                final TL_bots.createBot createbot = new TL_bots.createBot();
                createbot.via_deeplink = this.f38391w;
                createbot.username = strArr[0];
                createbot.name = trim;
                final int i10 = this.f38392x;
                org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i10);
                final TLRPC.User user = this.f38393y;
                createbot.manager_id = s12.q1(user);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                d3.b bVar = new d3.b(1);
                final boolean[] zArr2 = this.E;
                final org.telegram.messenger.z10 z10Var = this.F;
                final org.telegram.ui.ActionBar.u2 u2Var = this.G;
                final a2 a2Var = this.H;
                final org.telegram.ui.ActionBar.e6 e6Var = this.I;
                final org.telegram.ui.Cells.y8 y8Var = this.J;
                final Context context = this.K;
                iArr[0] = connectionsManager.sendRequestTyped(createbot, bVar, new org.telegram.messenger.s10() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        String p10;
                        String a02;
                        TLRPC.User user2 = (TLRPC.User) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (!zArr[0]) {
                            iArr[0] = -1;
                            hi.d dVar2 = dVar;
                            dVar2.setLoading(false);
                            dVar2.setEnabled(true);
                            k3Var.d.setEnabled(true);
                            k3Var2.d.setEnabled(true);
                            int i11 = i10;
                            org.telegram.ui.ActionBar.u2 u2Var2 = u2Var;
                            if (user2 != null) {
                                zArr2[0] = true;
                                org.telegram.messenger.np.s1(i11).X3(user2, false, false);
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(user2);
                                org.telegram.messenger.vr.a0(i11).m1(arrayList, null, false, false);
                                z10Var.a(user2);
                                u2Var2.dismiss();
                            } else if (tL_error != null) {
                                String str2 = createbot.username;
                                String str3 = tL_error.text;
                                TreeSet treeSet2 = treeSet;
                                a2 a2Var2 = a2Var;
                                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                                CharSequence d = sq.d(i11, str2, treeSet2, str3, a2Var2, e6Var2);
                                if (d != null) {
                                    strArr[0] = null;
                                    dVar2.setEnabled(false);
                                    org.telegram.ui.Cells.y8 y8Var2 = y8Var;
                                    y8Var2.setText(d);
                                    org.telegram.ui.ActionBar.q6.U(y8Var2.getTextView(), org.telegram.ui.ActionBar.j6.f29090q7, e6Var2);
                                    int[] iArr3 = iArr2;
                                    int i12 = -iArr3[0];
                                    iArr3[0] = i12;
                                    org.telegram.messenger.g0.F3(i12, y8Var2, null);
                                } else if ("BOT_CREATE_LIMIT_EXCEEDED".equalsIgnoreCase(tL_error.text)) {
                                    org.telegram.messenger.p0 p0Var = org.telegram.messenger.np.s1(i11).f25451y7;
                                    boolean q10 = org.telegram.messenger.m10.i(i11).q();
                                    cc ccVar = new cc(u2Var2.F, e6Var2);
                                    String M0 = org.telegram.messenger.hd.M0(2131751735, null);
                                    if (q10) {
                                        a02 = org.telegram.messenger.hd.a0(null, null, 2131751738, Integer.valueOf(((org.telegram.messenger.j0) p0Var.M.f15881b).f24498c));
                                    } else {
                                        a02 = org.telegram.messenger.hd.a0(null, null, 2131751737, Integer.valueOf(((org.telegram.messenger.j0) p0Var.M.f15881b).f24498c), Integer.valueOf(((org.telegram.messenger.j0) p0Var.L.f15881b).f24498c));
                                    }
                                    SpannableStringBuilder O2 = org.telegram.messenger.g0.O2(a02, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.xj, e6Var2), new fo(u2Var2, 4));
                                    od odVar = new od(24, u2Var2, context);
                                    int t6 = org.telegram.messenger.g0.t(O2, "@BotFather");
                                    if (t6 >= 0) {
                                        O2.setSpan(new org.telegram.ui.Cells.h(e6Var2, odVar, 6), t6, t6 + 10, 33);
                                    }
                                    xb I = ccVar.I(2131624012, M0, O2);
                                    I.f41635j = 8000;
                                    I.j();
                                } else {
                                    String str4 = tL_error.text;
                                    if (str4 != null && str4.startsWith("FLOOD_WAIT_")) {
                                        new cc(u2Var2.F, e6Var2).I(2131624012, org.telegram.messenger.hd.M0(2131751735, null), org.telegram.messenger.hd.a0(null, null, 2131751736, org.telegram.messenger.hd.z(Integer.parseInt(tL_error.text.substring(11))))).j();
                                    } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                                        TLRPC.User user3 = user;
                                        if (!TextUtils.isEmpty(org.telegram.messenger.q10.n(user3))) {
                                            p10 = "@" + org.telegram.messenger.q10.n(user3);
                                        } else {
                                            p10 = org.telegram.messenger.q10.p(user3);
                                        }
                                        new cc(u2Var2.F, e6Var2).Q(2131624012, 36, org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.xj, e6Var2), org.telegram.messenger.hd.a0(null, null, 2131751730, p10))).j();
                                    } else {
                                        org.telegram.ui.Cells.y0.q(u2Var2.F, e6Var2, tL_error, false);
                                    }
                                }
                                org.telegram.messenger.g0.v1(u2Var2.getCurrentFocus());
                            }
                        }
                    }
                }, 1024);
            }
        }
    }
}
