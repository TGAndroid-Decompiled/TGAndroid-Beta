package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.TreeSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class sq implements Runnable {
    public final boolean[] D;
    public final org.telegram.messenger.q20 E;
    public final org.telegram.ui.ActionBar.z2 F;
    public final qq G;
    public final org.telegram.ui.ActionBar.p6 H;
    public final org.telegram.ui.Cells.b9 I;
    public final Context J;
    public final boolean[] f30330a;
    public final int[] f30331b;
    public final org.telegram.ui.Cells.m3 f30332c;
    public final TreeSet d;
    public final String[] e;
    public final rq f30333f;
    public final org.telegram.ui.Cells.m3 h;
    public final int[] f30334n;
    public final ag.g3 f30335r;
    public final vh.d f30336s;
    public final boolean f30337w;
    public final int f30338x;
    public final TLRPC.User f30339y;

    public sq(boolean[] zArr, int[] iArr, org.telegram.ui.Cells.m3 m3Var, TreeSet treeSet, String[] strArr, rq rqVar, org.telegram.ui.Cells.m3 m3Var2, int[] iArr2, ag.g3 g3Var, vh.d dVar, boolean z10, int i10, TLRPC.User user, boolean[] zArr2, org.telegram.messenger.q20 q20Var, org.telegram.ui.ActionBar.z2 z2Var, qq qqVar, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.Cells.b9 b9Var, Context context) {
        this.f30330a = zArr;
        this.f30331b = iArr;
        this.f30332c = m3Var;
        this.d = treeSet;
        this.e = strArr;
        this.f30333f = rqVar;
        this.h = m3Var2;
        this.f30334n = iArr2;
        this.f30335r = g3Var;
        this.f30336s = dVar;
        this.f30337w = z10;
        this.f30338x = i10;
        this.f30339y = user;
        this.D = zArr2;
        this.E = q20Var;
        this.F = z2Var;
        this.G = qqVar;
        this.H = p6Var;
        this.I = b9Var;
        this.J = context;
    }

    @Override
    public final void run() {
        final org.telegram.ui.Cells.m3 m3Var = this.h;
        org.telegram.ui.Cells.k3 k3Var = m3Var.d;
        final boolean[] zArr = this.f30330a;
        if (!zArr[0]) {
            final int[] iArr = this.f30331b;
            if (iArr[0] < 0) {
                final org.telegram.ui.Cells.m3 m3Var2 = this.f30332c;
                String charSequence = m3Var2.getText().toString();
                StringBuilder t10 = a1.g.t(charSequence);
                String str = "bot";
                boolean a2 = vq.a(charSequence, "bot");
                final TreeSet treeSet = this.d;
                t10.append((a2 || vq.c(charSequence, treeSet) != null) ? "" : "");
                String sb2 = t10.toString();
                final String[] strArr = this.e;
                if (!TextUtils.equals(strArr[0], sb2)) {
                    this.f30333f.run();
                    return;
                }
                String trim = k3Var.getText().toString().trim();
                boolean isEmpty = TextUtils.isEmpty(trim);
                final int[] iArr2 = this.f30334n;
                if (isEmpty) {
                    int i10 = -iArr2[0];
                    iArr2[0] = i10;
                    org.telegram.messenger.i0.F3(i10, m3Var, null);
                    return;
                }
                this.f30335r.run();
                final vh.d dVar = this.f30336s;
                dVar.setLoading(true);
                dVar.setEnabled(false);
                k3Var.setEnabled(false);
                m3Var2.d.setEnabled(false);
                final TL_bots.createBot createbot = new TL_bots.createBot();
                createbot.via_deeplink = this.f30337w;
                createbot.username = strArr[0];
                createbot.name = trim;
                final int i11 = this.f30338x;
                org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i11);
                final TLRPC.User user = this.f30339y;
                createbot.manager_id = r12.p1(user);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                a3.b bVar = new a3.b(1);
                final boolean[] zArr2 = this.D;
                final org.telegram.messenger.q20 q20Var = this.E;
                final org.telegram.ui.ActionBar.z2 z2Var = this.F;
                final qq qqVar = this.G;
                final org.telegram.ui.ActionBar.p6 p6Var = this.H;
                final org.telegram.ui.Cells.b9 b9Var = this.I;
                final Context context = this.J;
                iArr[0] = connectionsManager.sendRequestTyped(createbot, bVar, new org.telegram.messenger.j20() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        String p5;
                        String a02;
                        TLRPC.User user2 = (TLRPC.User) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (!zArr[0]) {
                            iArr[0] = -1;
                            vh.d dVar2 = dVar;
                            dVar2.setLoading(false);
                            dVar2.setEnabled(true);
                            m3Var.d.setEnabled(true);
                            m3Var2.d.setEnabled(true);
                            int i12 = i11;
                            org.telegram.ui.ActionBar.z2 z2Var2 = z2Var;
                            if (user2 != null) {
                                zArr2[0] = true;
                                org.telegram.messenger.vp.r1(i12).U3(user2, false, false);
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(user2);
                                org.telegram.messenger.hs.a0(i12).m1(arrayList, null, false, false);
                                q20Var.a(user2);
                                z2Var2.dismiss();
                            } else if (tL_error != null) {
                                String str2 = createbot.username;
                                String str3 = tL_error.text;
                                TreeSet treeSet2 = treeSet;
                                qq qqVar2 = qqVar;
                                org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                                CharSequence d = vq.d(i12, str2, treeSet2, str3, qqVar2, p6Var2);
                                if (d != null) {
                                    strArr[0] = null;
                                    dVar2.setEnabled(false);
                                    org.telegram.ui.Cells.b9 b9Var2 = b9Var;
                                    b9Var2.setText(d);
                                    org.telegram.ui.ActionBar.a7.V(b9Var2.getTextView(), org.telegram.ui.ActionBar.t6.f21170q7, p6Var2);
                                    int[] iArr3 = iArr2;
                                    int i13 = -iArr3[0];
                                    iArr3[0] = i13;
                                    org.telegram.messenger.i0.F3(i13, b9Var2, null);
                                } else if ("BOT_CREATE_LIMIT_EXCEEDED".equalsIgnoreCase(tL_error.text)) {
                                    org.telegram.messenger.s0 s0Var = org.telegram.messenger.vp.r1(i12).f18957y7;
                                    boolean q6 = org.telegram.messenger.d20.i(i12).q();
                                    cc ccVar = new cc(z2Var2.E, p6Var2);
                                    String L0 = org.telegram.messenger.cd.L0(2131751736, null);
                                    if (q6) {
                                        a02 = org.telegram.messenger.cd.a0(null, null, 2131751739, Integer.valueOf(((org.telegram.messenger.l0) s0Var.M.f10700a).f16658c));
                                    } else {
                                        a02 = org.telegram.messenger.cd.a0(null, null, 2131751738, Integer.valueOf(((org.telegram.messenger.l0) s0Var.M.f10700a).f16658c), Integer.valueOf(((org.telegram.messenger.l0) s0Var.L.f10700a).f16658c));
                                    }
                                    SpannableStringBuilder N2 = org.telegram.messenger.i0.N2(a02, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.uj, p6Var2), new ho(z2Var2, 4));
                                    cd cdVar = new cd(24, z2Var2, context);
                                    int t11 = org.telegram.messenger.i0.t(N2, "@BotFather");
                                    if (t11 >= 0) {
                                        N2.setSpan(new org.telegram.ui.Cells.h(p6Var2, cdVar, 6), t11, t11 + 10, 33);
                                    }
                                    wb I = ccVar.I(2131624011, L0, N2);
                                    I.f32135j = 8000;
                                    I.j();
                                } else {
                                    String str4 = tL_error.text;
                                    if (str4 != null && str4.startsWith("FLOOD_WAIT_")) {
                                        new cc(z2Var2.E, p6Var2).I(2131624011, org.telegram.messenger.cd.L0(2131751736, null), org.telegram.messenger.cd.a0(null, null, 2131751737, org.telegram.messenger.cd.z(Integer.parseInt(tL_error.text.substring(11))))).j();
                                    } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                                        TLRPC.User user3 = user;
                                        if (!TextUtils.isEmpty(org.telegram.messenger.h20.n(user3))) {
                                            p5 = "@" + org.telegram.messenger.h20.n(user3);
                                        } else {
                                            p5 = org.telegram.messenger.h20.p(user3);
                                        }
                                        new cc(z2Var2.E, p6Var2).Q(2131624011, 36, org.telegram.messenger.i0.O2(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.uj, p6Var2), org.telegram.messenger.cd.a0(null, null, 2131751731, p5))).j();
                                    } else {
                                        org.telegram.ui.Cells.f1.s(z2Var2.E, p6Var2, tL_error, false);
                                    }
                                }
                                org.telegram.messenger.i0.v1(z2Var2.getCurrentFocus());
                            }
                        }
                    }
                }, 1024);
            }
        }
    }
}
