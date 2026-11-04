package org.telegram.ui.Components;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ct implements View.OnClickListener {
    public final int f32832a;
    public final KeyEvent.Callback f32833b;
    public final Object f32834c;
    public final Object d;

    public ct(KeyEvent.Callback callback, Object obj, Object obj2, int i3) {
        this.f32832a = i3;
        this.f32833b = callback;
        this.f32834c = obj;
        this.d = obj2;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.j2 j2Var;
        View view2;
        String M0;
        boolean z10 = true;
        switch (this.f32832a) {
            case 0:
                jt jtVar = (jt) this.f32833b;
                qt0 qt0Var = (qt0) this.f32834c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                dt dtVar = jtVar.f35188a;
                lg.k kVar = jtVar.f35189b;
                if (kVar.isEnabled() && kVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.h1 h1Var = jtVar.L;
                    if (h1Var == null || !h1Var.f27556f) {
                        if (jtVar.f35193n) {
                            dtVar.m();
                            f60 f60Var = new f60(qt0Var, e6Var, kVar, false, false, true);
                            f60Var.X = org.telegram.messenger.g0.L(280.0f);
                            dtVar.o(null, new d90(f60Var, dtVar));
                            f60Var.U = true;
                            f60Var.Z();
                            return;
                        } else if (!jtVar.f35191e) {
                            jtVar.x(1);
                            boolean isFocused = dtVar.isFocused();
                            et etVar = jtVar.d;
                            if (dtVar.length() <= 0) {
                                z10 = false;
                            }
                            etVar.C(z10, false);
                            dtVar.requestFocus();
                            if (!isFocused) {
                                dtVar.setSelection(dtVar.length());
                                return;
                            }
                            return;
                        } else {
                            if (jtVar.f35198y) {
                                jtVar.k(true);
                                jtVar.f35198y = false;
                                jtVar.p();
                            }
                            jtVar.v();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                a10 a10Var = (a10) this.f32833b;
                a10Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) this.f32834c);
                alertDialog$Builder.f27343a.S = org.telegram.messenger.bd.M0(2131749569, null);
                alertDialog$Builder.f27343a.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131749570, null));
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131749571, null), new zw(a10Var, 4));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                ((org.telegram.ui.ActionBar.d2) this.d).showDialog(alertDialog$Builder.f27343a);
                return;
            case 2:
                m70 m70Var = (m70) this.f32833b;
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) this.f32834c;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.d;
                try {
                    if (m70Var.f36056b != null) {
                        ((ClipboardManager) org.telegram.messenger.t0.f25457b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", m70Var.f36056b));
                        if (t2Var != null && (j2Var = t2Var.f28589c) != null) {
                            new fc(j2Var, null).k(false).j();
                        } else {
                            fc.j(d2Var).j();
                        }
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 3:
                x90 x90Var = (x90) this.f32833b;
                ca0 ca0Var = (ca0) this.f32834c;
                ca0 ca0Var2 = (ca0) this.d;
                da0 da0Var = x90Var.f40291d0;
                org.telegram.messenger.dj djVar = da0Var.d;
                boolean z11 = djVar.f22206l;
                boolean z12 = !z11;
                djVar.f22206l = z12;
                if (!z11) {
                    if (!djVar.f22205k) {
                        djVar.f22205k = true;
                        da0Var.f33043y = true;
                    }
                } else {
                    if (da0Var.f33043y) {
                        djVar.f22205k = false;
                    }
                    da0Var.f33043y = false;
                }
                ca0Var.a(z12, true);
                ca0Var2.a(djVar.f22205k, true);
                x90Var.i();
                x90Var.l(true);
                return;
            case 4:
                hc0.J0((hc0) this.f32833b, (TLRPC.ChatFull) this.f32834c, (org.telegram.ui.r40) this.d);
                return;
            case 5:
                od0 od0Var = (od0) this.f32833b;
                Context context = (Context) this.f32834c;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) this.d;
                if (od0Var.h == null) {
                    gi.h3 h3Var = new gi.h3(context, e6Var2, org.telegram.messenger.bd.M0(2131743617, null), od0Var.f36810f);
                    od0Var.h = h3Var;
                    h3Var.n(new jb0(od0Var, 5));
                    od0Var.h.f12873n1 = od0Var.f36811n;
                }
                od0Var.h.show();
                return;
            case 6:
                d21 d21Var = (d21) this.f32833b;
                org.telegram.messenger.yc ycVar = (org.telegram.messenger.yc) this.d;
                f21 f21Var = d21Var.f32922n;
                Runnable runnable = ((Runnable[]) this.f32834c)[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = f21Var.f33673s1;
                e21 e21Var = f21Var.F1;
                if (!TextUtils.equals(str, ycVar.f26565f)) {
                    View view3 = e21Var.d;
                    if (view3 == f21Var.f33677w1 || view3 == f21Var.f33671q1) {
                        f21Var.f33674t1 = f21Var.f33673s1;
                    }
                    b21 b21Var = d21Var.f32920e;
                    String str2 = ycVar.f26565f;
                    f21Var.f33673s1 = str2;
                    b21Var.setText(f21.K0(f21.O0(str2, null, null)));
                    if (f21Var.f33669o1 != null) {
                        view2 = f21Var.f33670p1;
                    } else {
                        view2 = f21Var.f33676v1;
                    }
                    e21Var.D(view2);
                    f21.S0(f21Var.f33673s1);
                    f21Var.W0();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.xj xjVar = (org.telegram.ui.xj) this.f32833b;
                org.telegram.messenger.x00 x00Var = (org.telegram.messenger.x00) this.f32834c;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.d;
                long j10 = xjVar.f38973b;
                x00Var.J(j10, true, false);
                TLRPC.Chat M02 = org.telegram.messenger.hp.s1(xjVar.f38972a).M0(Long.valueOf(-j10));
                if (M02 != null && org.telegram.messenger.t3.V(M02)) {
                    M0 = org.telegram.messenger.bd.M0(2131743960, null);
                } else if (M02 != null) {
                    M0 = org.telegram.messenger.bd.M0(2131743958, null);
                } else {
                    M0 = org.telegram.messenger.bd.M0(2131743959, null);
                }
                fc.a0(xjVar.f38974c).K(2131624103, org.telegram.messenger.g0.X2(M0), org.telegram.messenger.bd.M0(2131743895, null), new p11(2, xjVar, x00Var)).j();
                f1Var.d(true);
                return;
            default:
                org.telegram.ui.lp0 lp0Var = (org.telegram.ui.lp0) this.f32833b;
                Context context2 = (Context) this.f32834c;
                Bitmap bitmap = (Bitmap) this.d;
                if (lp0Var.f55994v1) {
                    tg.q qVar = new tg.q(context2, lp0Var.A1);
                    qVar.I0(lp0Var.f55992u1.f55186a, 2);
                    qVar.f55290p1 = new androidx.activity.n(lp0Var, bitmap, 9);
                    qVar.f55289o1 = new ug.m(lp0Var, 1);
                    qVar.show();
                    return;
                }
                Runnable runnable2 = lp0Var.E1;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
