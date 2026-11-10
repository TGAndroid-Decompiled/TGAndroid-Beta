package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.TreeSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class hq implements Runnable {
    public final boolean[] D;
    public final org.telegram.messenger.c20 E;
    public final org.telegram.ui.ActionBar.w2 F;
    public final q2 G;
    public final org.telegram.ui.ActionBar.h6 H;
    public final org.telegram.ui.Cells.z8 I;
    public final Context J;
    public final boolean[] f34428a;
    public final int[] f34429b;
    public final org.telegram.ui.Cells.k3 f34430c;
    public final TreeSet d;
    public final String[] f34431e;
    public final gq f34432f;
    public final org.telegram.ui.Cells.k3 h;
    public final int[] f34433n;
    public final ai.a1 f34434r;
    public final fi.d f34435s;
    public final boolean f34436w;
    public final int f34437x;
    public final TLRPC.User f34438y;

    public hq(boolean[] zArr, int[] iArr, org.telegram.ui.Cells.k3 k3Var, TreeSet treeSet, String[] strArr, gq gqVar, org.telegram.ui.Cells.k3 k3Var2, int[] iArr2, ai.a1 a1Var, fi.d dVar, boolean z9, int i7, TLRPC.User user, boolean[] zArr2, org.telegram.messenger.c20 c20Var, org.telegram.ui.ActionBar.w2 w2Var, q2 q2Var, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Cells.z8 z8Var, Context context) {
        this.f34428a = zArr;
        this.f34429b = iArr;
        this.f34430c = k3Var;
        this.d = treeSet;
        this.f34431e = strArr;
        this.f34432f = gqVar;
        this.h = k3Var2;
        this.f34433n = iArr2;
        this.f34434r = a1Var;
        this.f34435s = dVar;
        this.f34436w = z9;
        this.f34437x = i7;
        this.f34438y = user;
        this.D = zArr2;
        this.E = c20Var;
        this.F = w2Var;
        this.G = q2Var;
        this.H = h6Var;
        this.I = z8Var;
        this.J = context;
    }

    @Override
    public final void run() {
        final org.telegram.ui.Cells.k3 k3Var = this.h;
        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
        final boolean[] zArr = this.f34428a;
        if (!zArr[0]) {
            final int[] iArr = this.f34429b;
            if (iArr[0] < 0) {
                final org.telegram.ui.Cells.k3 k3Var2 = this.f34430c;
                String charSequence = k3Var2.getText().toString();
                StringBuilder m10 = com.google.android.recaptcha.internal.a.m(charSequence);
                String str = "bot";
                boolean a10 = kq.a(charSequence, "bot");
                final TreeSet treeSet = this.d;
                m10.append((a10 || kq.c(charSequence, treeSet) != null) ? "" : "");
                String sb2 = m10.toString();
                final String[] strArr = this.f34431e;
                if (!TextUtils.equals(strArr[0], sb2)) {
                    this.f34432f.run();
                    return;
                }
                String trim = i3Var.getText().toString().trim();
                boolean isEmpty = TextUtils.isEmpty(trim);
                final int[] iArr2 = this.f34433n;
                if (isEmpty) {
                    int i7 = -iArr2[0];
                    iArr2[0] = i7;
                    org.telegram.messenger.g0.G3(i7, k3Var, null);
                    return;
                }
                this.f34434r.run();
                final fi.d dVar = this.f34435s;
                dVar.setLoading(true);
                dVar.setEnabled(false);
                i3Var.setEnabled(false);
                k3Var2.d.setEnabled(false);
                final TL_bots.createBot createbot = new TL_bots.createBot();
                createbot.via_deeplink = this.f34436w;
                createbot.username = strArr[0];
                createbot.name = trim;
                final int i10 = this.f34437x;
                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i10);
                final TLRPC.User user = this.f34438y;
                createbot.manager_id = s12.q1(user);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                d3.b bVar = new d3.b(1);
                final boolean[] zArr2 = this.D;
                final org.telegram.messenger.c20 c20Var = this.E;
                final org.telegram.ui.ActionBar.w2 w2Var = this.F;
                final q2 q2Var = this.G;
                final org.telegram.ui.ActionBar.h6 h6Var = this.H;
                final org.telegram.ui.Cells.z8 z8Var = this.I;
                final Context context = this.J;
                iArr[0] = connectionsManager.sendRequestTyped(createbot, bVar, new org.telegram.messenger.v10() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        String p10;
                        String a02;
                        TLRPC.User user2 = (TLRPC.User) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (!zArr[0]) {
                            iArr[0] = -1;
                            fi.d dVar2 = dVar;
                            dVar2.setLoading(false);
                            dVar2.setEnabled(true);
                            k3Var.d.setEnabled(true);
                            k3Var2.d.setEnabled(true);
                            int i11 = i10;
                            org.telegram.ui.ActionBar.w2 w2Var2 = w2Var;
                            if (user2 != null) {
                                zArr2[0] = true;
                                org.telegram.messenger.qp.s1(i11).X3(user2, false, false);
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(user2);
                                org.telegram.messenger.yr.a0(i11).m1(arrayList, null, false, false);
                                c20Var.a(user2);
                                w2Var2.dismiss();
                            } else if (tL_error != null) {
                                String str2 = createbot.username;
                                String str3 = tL_error.text;
                                TreeSet treeSet2 = treeSet;
                                q2 q2Var2 = q2Var;
                                org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                                CharSequence d = kq.d(i11, str2, treeSet2, str3, q2Var2, h6Var2);
                                if (d != null) {
                                    strArr[0] = null;
                                    dVar2.setEnabled(false);
                                    org.telegram.ui.Cells.z8 z8Var2 = z8Var;
                                    z8Var2.setText(d);
                                    org.telegram.ui.ActionBar.t6.U(z8Var2.getTextView(), org.telegram.ui.ActionBar.m6.f28131q7, h6Var2);
                                    int[] iArr3 = iArr2;
                                    int i12 = -iArr3[0];
                                    iArr3[0] = i12;
                                    org.telegram.messenger.g0.G3(i12, z8Var2, null);
                                } else if ("BOT_CREATE_LIMIT_EXCEEDED".equalsIgnoreCase(tL_error.text)) {
                                    org.telegram.messenger.p0 p0Var = org.telegram.messenger.qp.s1(i11).f24946x7;
                                    boolean q10 = org.telegram.messenger.p10.i(i11).q();
                                    gc gcVar = new gc(w2Var2.E, h6Var2);
                                    String M0 = org.telegram.messenger.id.M0(2131751735, null);
                                    if (q10) {
                                        a02 = org.telegram.messenger.id.a0(null, null, 2131751738, Integer.valueOf(((org.telegram.messenger.j0) p0Var.M.f13557b).f23464c));
                                    } else {
                                        a02 = org.telegram.messenger.id.a0(null, null, 2131751737, Integer.valueOf(((org.telegram.messenger.j0) p0Var.M.f13557b).f23464c), Integer.valueOf(((org.telegram.messenger.j0) p0Var.L.f13557b).f23464c));
                                    }
                                    SpannableStringBuilder O2 = org.telegram.messenger.g0.O2(a02, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.uj, h6Var2), new gp(w2Var2, 2));
                                    ro roVar = new ro(1, w2Var2, context);
                                    int t6 = org.telegram.messenger.g0.t(O2, "@BotFather");
                                    if (t6 >= 0) {
                                        O2.setSpan(new org.telegram.ui.Cells.h(h6Var2, roVar, 6), t6, t6 + 10, 33);
                                    }
                                    bc I = gcVar.I(2131624011, M0, O2);
                                    I.f32203j = 8000;
                                    I.j();
                                } else {
                                    String str4 = tL_error.text;
                                    if (str4 != null && str4.startsWith("FLOOD_WAIT_")) {
                                        new gc(w2Var2.E, h6Var2).I(2131624011, org.telegram.messenger.id.M0(2131751735, null), org.telegram.messenger.id.a0(null, null, 2131751736, org.telegram.messenger.id.z(Integer.parseInt(tL_error.text.substring(11))))).j();
                                    } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                                        TLRPC.User user3 = user;
                                        if (!TextUtils.isEmpty(org.telegram.messenger.t10.n(user3))) {
                                            p10 = "@" + org.telegram.messenger.t10.n(user3);
                                        } else {
                                            p10 = org.telegram.messenger.t10.p(user3);
                                        }
                                        new gc(w2Var2.E, h6Var2).Q(2131624011, 36, org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.uj, h6Var2), org.telegram.messenger.id.a0(null, null, 2131751730, p10))).j();
                                    } else {
                                        org.telegram.ui.Cells.f1.r(w2Var2.E, h6Var2, tL_error, false);
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
