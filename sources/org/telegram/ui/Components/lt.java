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
public final class lt implements View.OnClickListener {
    public final int f36901a;
    public final KeyEvent.Callback f36902b;
    public final Object f36903c;
    public final Object d;

    public lt(KeyEvent.Callback callback, Object obj, Object obj2, int i7) {
        this.f36901a = i7;
        this.f36902b = callback;
        this.f36903c = obj;
        this.d = obj2;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.k2 k2Var;
        View view2;
        String M0;
        boolean z10 = true;
        switch (this.f36901a) {
            case 0:
                rt rtVar = (rt) this.f36902b;
                st0 st0Var = (st0) this.f36903c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                mt mtVar = rtVar.f39056a;
                kg.k kVar = rtVar.f39057b;
                if (kVar.isEnabled() && kVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.i1 i1Var = rtVar.L;
                    if (i1Var == null || !i1Var.f28649f) {
                        if (rtVar.f39061n) {
                            mtVar.m();
                            m60 m60Var = new m60(st0Var, e6Var, kVar, false, false, true);
                            m60Var.X = org.telegram.messenger.g0.L(280.0f);
                            mtVar.o(null, new j90(m60Var, mtVar));
                            m60Var.U = true;
                            m60Var.Z();
                            return;
                        } else if (!rtVar.f39059e) {
                            rtVar.x(1);
                            boolean isFocused = mtVar.isFocused();
                            nt ntVar = rtVar.d;
                            if (mtVar.length() <= 0) {
                                z10 = false;
                            }
                            ntVar.C(z10, false);
                            mtVar.requestFocus();
                            if (!isFocused) {
                                mtVar.setSelection(mtVar.length());
                                return;
                            }
                            return;
                        } else {
                            if (rtVar.f39066y) {
                                rtVar.k(true);
                                rtVar.f39066y = false;
                                rtVar.p();
                            }
                            rtVar.v();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                h10 h10Var = (h10) this.f36902b;
                h10Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) this.f36903c);
                alertDialog$Builder.f28392a.S = org.telegram.messenger.hd.M0(2131749561, null);
                alertDialog$Builder.f28392a.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131749562, null));
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131749563, null), new gx(h10Var, 4));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                ((org.telegram.ui.ActionBar.e2) this.d).showDialog(alertDialog$Builder.f28392a);
                return;
            case 2:
                t70 t70Var = (t70) this.f36902b;
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) this.f36903c;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.d;
                try {
                    if (t70Var.f39577b != null) {
                        ((ClipboardManager) org.telegram.messenger.t0.f26600b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", t70Var.f39577b));
                        if (u2Var != null && (k2Var = u2Var.f29685c) != null) {
                            new cc(k2Var, null).k(false).j();
                        } else {
                            cc.j(e2Var).j();
                        }
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 3:
                da0 da0Var = (da0) this.f36902b;
                ia0 ia0Var = (ia0) this.f36903c;
                ia0 ia0Var2 = (ia0) this.d;
                ja0 ja0Var = da0Var.f33900d0;
                org.telegram.messenger.kj kjVar = ja0Var.d;
                boolean z11 = kjVar.f24712l;
                boolean z12 = !z11;
                kjVar.f24712l = z12;
                if (!z11) {
                    if (!kjVar.f24711k) {
                        kjVar.f24711k = true;
                        ja0Var.f35958y = true;
                    }
                } else {
                    if (ja0Var.f35958y) {
                        kjVar.f24711k = false;
                    }
                    ja0Var.f35958y = false;
                }
                ia0Var.a(z12, true);
                ia0Var2.a(kjVar.f24711k, true);
                da0Var.i();
                da0Var.l(true);
                return;
            case 4:
                nc0.J0((nc0) this.f36902b, (TLRPC.ChatFull) this.f36903c, (org.telegram.ui.w40) this.d);
                return;
            case 5:
                ud0 ud0Var = (ud0) this.f36902b;
                Context context = (Context) this.f36903c;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) this.d;
                if (ud0Var.h == null) {
                    hi.h3 h3Var = new hi.h3(context, e6Var2, org.telegram.messenger.hd.M0(2131743607, null), ud0Var.f40003f);
                    ud0Var.h = h3Var;
                    h3Var.n(new wa0(ud0Var, 7));
                    ud0Var.h.f14371q1 = ud0Var.f40004n;
                }
                ud0Var.h.show();
                return;
            case 6:
                n21 n21Var = (n21) this.f36902b;
                org.telegram.messenger.dd ddVar = (org.telegram.messenger.dd) this.d;
                p21 p21Var = n21Var.f37440n;
                Runnable runnable = ((Runnable[]) this.f36903c)[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = p21Var.f38178v1;
                o21 o21Var = p21Var.I1;
                if (!TextUtils.equals(str, ddVar.f23062f)) {
                    View view3 = o21Var.d;
                    if (view3 == p21Var.f38182z1 || view3 == p21Var.f38176t1) {
                        p21Var.f38179w1 = p21Var.f38178v1;
                    }
                    l21 l21Var = n21Var.f37438e;
                    String str2 = ddVar.f23062f;
                    p21Var.f38178v1 = str2;
                    l21Var.setText(p21.K0(p21.O0(str2, null, null)));
                    if (p21Var.f38174r1 != null) {
                        view2 = p21Var.f38175s1;
                    } else {
                        view2 = p21Var.f38181y1;
                    }
                    o21Var.D(view2);
                    p21.T0(p21Var.f38178v1);
                    p21Var.X0();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.bk bkVar = (org.telegram.ui.bk) this.f36902b;
                org.telegram.messenger.c10 c10Var = (org.telegram.messenger.c10) this.f36903c;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.d;
                long j3 = bkVar.f34504b;
                c10Var.J(j3, true, false);
                TLRPC.Chat M02 = org.telegram.messenger.np.s1(bkVar.f34503a).M0(Long.valueOf(-j3));
                if (M02 != null && org.telegram.messenger.t3.V(M02)) {
                    M0 = org.telegram.messenger.hd.M0(2131743950, null);
                } else if (M02 != null) {
                    M0 = org.telegram.messenger.hd.M0(2131743948, null);
                } else {
                    M0 = org.telegram.messenger.hd.M0(2131743949, null);
                }
                cc.a0(bkVar.f34505c).K(2131624104, org.telegram.messenger.g0.X2(M0), org.telegram.messenger.hd.M0(2131743885, null), new hh0(22, bkVar, c10Var)).j();
                g1Var.d(true);
                return;
            default:
                org.telegram.ui.tp0 tp0Var = (org.telegram.ui.tp0) this.f36902b;
                Context context2 = (Context) this.f36903c;
                Bitmap bitmap = (Bitmap) this.d;
                if (tp0Var.f57298v1) {
                    sg.q qVar = new sg.q(context2, tp0Var.A1);
                    qVar.I0(tp0Var.f57296u1.f56644a, 2);
                    qVar.f56749s1 = new androidx.activity.n(tp0Var, bitmap, 7);
                    qVar.f56748r1 = new tg.m(tp0Var, 1);
                    qVar.show();
                    return;
                }
                Runnable runnable2 = tp0Var.E1;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
