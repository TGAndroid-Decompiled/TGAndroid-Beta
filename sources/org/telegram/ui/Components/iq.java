package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.TreeSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class iq implements Runnable {
    public final boolean[] E;
    public final org.telegram.messenger.u10 F;
    public final org.telegram.ui.ActionBar.t2 G;
    public final o2 H;
    public final org.telegram.ui.ActionBar.e6 I;
    public final org.telegram.ui.Cells.y8 J;
    public final Context K;
    public final boolean[] f34786a;
    public final int[] f34787b;
    public final org.telegram.ui.Cells.k3 f34788c;
    public final TreeSet d;
    public final String[] f34789e;
    public final hq f34790f;
    public final org.telegram.ui.Cells.k3 h;
    public final int[] f34791n;
    public final bi.q0 f34792r;
    public final gi.d f34793s;
    public final boolean f34794w;
    public final int f34795x;
    public final TLRPC.User f34796y;

    public iq(boolean[] zArr, int[] iArr, org.telegram.ui.Cells.k3 k3Var, TreeSet treeSet, String[] strArr, hq hqVar, org.telegram.ui.Cells.k3 k3Var2, int[] iArr2, bi.q0 q0Var, gi.d dVar, boolean z10, int i3, TLRPC.User user, boolean[] zArr2, org.telegram.messenger.u10 u10Var, org.telegram.ui.ActionBar.t2 t2Var, o2 o2Var, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Cells.y8 y8Var, Context context) {
        this.f34786a = zArr;
        this.f34787b = iArr;
        this.f34788c = k3Var;
        this.d = treeSet;
        this.f34789e = strArr;
        this.f34790f = hqVar;
        this.h = k3Var2;
        this.f34791n = iArr2;
        this.f34792r = q0Var;
        this.f34793s = dVar;
        this.f34794w = z10;
        this.f34795x = i3;
        this.f34796y = user;
        this.E = zArr2;
        this.F = u10Var;
        this.G = t2Var;
        this.H = o2Var;
        this.I = e6Var;
        this.J = y8Var;
        this.K = context;
    }

    @Override
    public final void run() {
        final org.telegram.ui.Cells.k3 k3Var = this.h;
        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
        final boolean[] zArr = this.f34786a;
        if (!zArr[0]) {
            final int[] iArr = this.f34787b;
            if (iArr[0] < 0) {
                final org.telegram.ui.Cells.k3 k3Var2 = this.f34788c;
                String charSequence = k3Var2.getText().toString();
                StringBuilder l10 = com.google.android.recaptcha.internal.a.l(charSequence);
                String str = "bot";
                boolean a10 = lq.a(charSequence, "bot");
                final TreeSet treeSet = this.d;
                l10.append((a10 || lq.c(charSequence, treeSet) != null) ? "" : "");
                String sb2 = l10.toString();
                final String[] strArr = this.f34789e;
                if (!TextUtils.equals(strArr[0], sb2)) {
                    this.f34790f.run();
                    return;
                }
                String trim = i3Var.getText().toString().trim();
                boolean isEmpty = TextUtils.isEmpty(trim);
                final int[] iArr2 = this.f34791n;
                if (isEmpty) {
                    int i3 = -iArr2[0];
                    iArr2[0] = i3;
                    org.telegram.messenger.g0.G3(i3, k3Var, null);
                    return;
                }
                this.f34792r.run();
                final gi.d dVar = this.f34793s;
                dVar.setLoading(true);
                dVar.setEnabled(false);
                i3Var.setEnabled(false);
                k3Var2.d.setEnabled(false);
                final TL_bots.createBot createbot = new TL_bots.createBot();
                createbot.via_deeplink = this.f34794w;
                createbot.username = strArr[0];
                createbot.name = trim;
                final int i10 = this.f34795x;
                org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i10);
                final TLRPC.User user = this.f34796y;
                createbot.manager_id = s12.q1(user);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                c3.b bVar = new c3.b(1);
                final boolean[] zArr2 = this.E;
                final org.telegram.messenger.u10 u10Var = this.F;
                final org.telegram.ui.ActionBar.t2 t2Var = this.G;
                final o2 o2Var = this.H;
                final org.telegram.ui.ActionBar.e6 e6Var = this.I;
                final org.telegram.ui.Cells.y8 y8Var = this.J;
                final Context context = this.K;
                iArr[0] = connectionsManager.sendRequestTyped(createbot, bVar, new org.telegram.messenger.n10() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        String p10;
                        String a02;
                        TLRPC.User user2 = (TLRPC.User) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (!zArr[0]) {
                            iArr[0] = -1;
                            gi.d dVar2 = dVar;
                            dVar2.setLoading(false);
                            dVar2.setEnabled(true);
                            k3Var.d.setEnabled(true);
                            k3Var2.d.setEnabled(true);
                            int i11 = i10;
                            org.telegram.ui.ActionBar.t2 t2Var2 = t2Var;
                            if (user2 != null) {
                                zArr2[0] = true;
                                org.telegram.messenger.hp.s1(i11).X3(user2, false, false);
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(user2);
                                org.telegram.messenger.qr.a0(i11).m1(arrayList, null, false, false);
                                u10Var.a(user2);
                                t2Var2.dismiss();
                            } else if (tL_error != null) {
                                String str2 = createbot.username;
                                String str3 = tL_error.text;
                                TreeSet treeSet2 = treeSet;
                                o2 o2Var2 = o2Var;
                                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                                CharSequence d = lq.d(i11, str2, treeSet2, str3, o2Var2, e6Var2);
                                if (d != null) {
                                    strArr[0] = null;
                                    dVar2.setEnabled(false);
                                    org.telegram.ui.Cells.y8 y8Var2 = y8Var;
                                    y8Var2.setText(d);
                                    org.telegram.ui.ActionBar.r6.V(y8Var2.getTextView(), org.telegram.ui.ActionBar.k6.f28122q7, e6Var2);
                                    int[] iArr3 = iArr2;
                                    int i12 = -iArr3[0];
                                    iArr3[0] = i12;
                                    org.telegram.messenger.g0.G3(i12, y8Var2, null);
                                } else if ("BOT_CREATE_LIMIT_EXCEEDED".equalsIgnoreCase(tL_error.text)) {
                                    org.telegram.messenger.p0 p0Var = org.telegram.messenger.hp.s1(i11).f23167x7;
                                    boolean q10 = org.telegram.messenger.h10.i(i11).q();
                                    fc fcVar = new fc(t2Var2.F, e6Var2);
                                    String M0 = org.telegram.messenger.bd.M0(2131751736, null);
                                    if (q10) {
                                        a02 = org.telegram.messenger.bd.a0(null, null, 2131751739, Integer.valueOf(((org.telegram.messenger.j0) p0Var.M.f13798b).f23620c));
                                    } else {
                                        a02 = org.telegram.messenger.bd.a0(null, null, 2131751738, Integer.valueOf(((org.telegram.messenger.j0) p0Var.M.f13798b).f23620c), Integer.valueOf(((org.telegram.messenger.j0) p0Var.L.f13798b).f23620c));
                                    }
                                    SpannableStringBuilder O2 = org.telegram.messenger.g0.O2(a02, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, e6Var2), new gp(t2Var2, 2));
                                    cl clVar = new cl(5, t2Var2, context);
                                    int t10 = org.telegram.messenger.g0.t(O2, "@BotFather");
                                    if (t10 >= 0) {
                                        O2.setSpan(new org.telegram.ui.Cells.h(e6Var2, clVar, 6), t10, t10 + 10, 33);
                                    }
                                    ac I = fcVar.I(2131624011, M0, O2);
                                    I.f31792j = 8000;
                                    I.j();
                                } else {
                                    String str4 = tL_error.text;
                                    if (str4 != null && str4.startsWith("FLOOD_WAIT_")) {
                                        new fc(t2Var2.F, e6Var2).I(2131624011, org.telegram.messenger.bd.M0(2131751736, null), org.telegram.messenger.bd.a0(null, null, 2131751737, org.telegram.messenger.bd.z(Integer.parseInt(tL_error.text.substring(11))))).j();
                                    } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                                        TLRPC.User user3 = user;
                                        if (!TextUtils.isEmpty(org.telegram.messenger.l10.n(user3))) {
                                            p10 = "@" + org.telegram.messenger.l10.n(user3);
                                        } else {
                                            p10 = org.telegram.messenger.l10.p(user3);
                                        }
                                        new fc(t2Var2.F, e6Var2).Q(2131624011, 36, org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, e6Var2), org.telegram.messenger.bd.a0(null, null, 2131751731, p10))).j();
                                    } else {
                                        org.telegram.ui.Cells.f1.v(t2Var2.F, e6Var2, tL_error, false);
                                    }
                                }
                                org.telegram.messenger.g0.v1(t2Var2.getCurrentFocus());
                            }
                        }
                    }
                }, 1024);
            }
        }
    }
}
