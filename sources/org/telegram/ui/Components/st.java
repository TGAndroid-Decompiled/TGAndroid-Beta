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
public final class st implements View.OnClickListener {
    public final int f39686a;
    public final KeyEvent.Callback f39687b;
    public final Object f39688c;
    public final Object d;

    public st(KeyEvent.Callback callback, Object obj, Object obj2, int i7) {
        this.f39686a = i7;
        this.f39687b = callback;
        this.f39688c = obj;
        this.d = obj2;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.m2 m2Var;
        View view2;
        String N0;
        boolean z10 = true;
        switch (this.f39686a) {
            case 0:
                yt ytVar = (yt) this.f39687b;
                du0 du0Var = (du0) this.f39688c;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.d;
                tt ttVar = ytVar.f42534a;
                kg.k kVar = ytVar.f42535b;
                if (kVar.isEnabled() && kVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.i1 i1Var = ytVar.L;
                    if (i1Var == null || !i1Var.f29010f) {
                        if (ytVar.f42539n) {
                            ttVar.m();
                            a70 a70Var = new a70(du0Var, h6Var, kVar, false, false, true);
                            a70Var.f33365a0 = org.telegram.messenger.g0.L(280.0f);
                            ttVar.o(null, new w90(a70Var, ttVar));
                            a70Var.X = true;
                            a70Var.a0();
                            return;
                        } else if (!ytVar.f42537e) {
                            ytVar.x(1);
                            boolean isFocused = ttVar.isFocused();
                            ut utVar = ytVar.d;
                            if (ttVar.length() <= 0) {
                                z10 = false;
                            }
                            utVar.C(z10, false);
                            ttVar.requestFocus();
                            if (!isFocused) {
                                ttVar.setSelection(ttVar.length());
                                return;
                            }
                            return;
                        } else {
                            if (ytVar.f42544y) {
                                ytVar.k(true);
                                ytVar.f42544y = false;
                                ytVar.p();
                            }
                            ytVar.v();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                r10 r10Var = (r10) this.f39687b;
                r10Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) this.f39688c);
                alertDialog$Builder.f28777a.S = org.telegram.messenger.hd.N0(2131749385, null);
                alertDialog$Builder.f28777a.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131749386, null));
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131749387, null), new ky(r10Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                ((org.telegram.ui.ActionBar.g2) this.d).showDialog(alertDialog$Builder.f28777a);
                return;
            case 2:
                g80 g80Var = (g80) this.f39687b;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.f39688c;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.d;
                try {
                    if (g80Var.f35468b != null) {
                        ((ClipboardManager) org.telegram.messenger.t0.f26931b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", g80Var.f35468b));
                        if (w2Var != null && (m2Var = w2Var.f30179c) != null) {
                            new lc(m2Var, null).k(false).j();
                        } else {
                            lc.j(g2Var).j();
                        }
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 3:
                qa0 qa0Var = (qa0) this.f39687b;
                va0 va0Var = (va0) this.f39688c;
                va0 va0Var2 = (va0) this.d;
                wa0 wa0Var = qa0Var.f38857d0;
                org.telegram.messenger.kj kjVar = wa0Var.d;
                boolean z11 = kjVar.f25088l;
                boolean z12 = !z11;
                kjVar.f25088l = z12;
                if (!z11) {
                    if (!kjVar.f25087k) {
                        kjVar.f25087k = true;
                        wa0Var.f41746y = true;
                    }
                } else {
                    if (wa0Var.f41746y) {
                        kjVar.f25087k = false;
                    }
                    wa0Var.f41746y = false;
                }
                va0Var.a(z12, true);
                va0Var2.a(kjVar.f25087k, true);
                qa0Var.i();
                qa0Var.l(true);
                return;
            case 4:
                yc0.K0((yc0) this.f39687b, (TLRPC.ChatFull) this.f39688c, (org.telegram.ui.z40) this.d);
                return;
            case 5:
                fe0 fe0Var = (fe0) this.f39687b;
                Context context = (Context) this.f39688c;
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) this.d;
                if (fe0Var.h == null) {
                    hi.h3 h3Var = new hi.h3(context, h6Var2, org.telegram.messenger.hd.N0(2131743362, null), fe0Var.f35214f);
                    fe0Var.h = h3Var;
                    h3Var.n(new hb0(fe0Var, 7));
                    fe0Var.h.f14747q1 = fe0Var.f35215n;
                }
                fe0Var.h.show();
                return;
            case 6:
                z21 z21Var = (z21) this.f39687b;
                org.telegram.messenger.dd ddVar = (org.telegram.messenger.dd) this.d;
                b31 b31Var = z21Var.f42659n;
                Runnable runnable = ((Runnable[]) this.f39688c)[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = b31Var.f33730v1;
                a31 a31Var = b31Var.I1;
                if (!TextUtils.equals(str, ddVar.f23533f)) {
                    View view3 = a31Var.d;
                    if (view3 == b31Var.f33734z1 || view3 == b31Var.f33728t1) {
                        b31Var.f33731w1 = b31Var.f33730v1;
                    }
                    x21 x21Var = z21Var.f42657e;
                    String str2 = ddVar.f23533f;
                    b31Var.f33730v1 = str2;
                    x21Var.setText(b31.L0(b31.P0(str2, null, null)));
                    if (b31Var.f33726r1 != null) {
                        view2 = b31Var.f33727s1;
                    } else {
                        view2 = b31Var.f33733y1;
                    }
                    a31Var.D(view2);
                    b31.U0(b31Var.f33730v1);
                    b31Var.Y0();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.ck ckVar = (org.telegram.ui.ck) this.f39687b;
                org.telegram.messenger.a10 a10Var = (org.telegram.messenger.a10) this.f39688c;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.d;
                long j3 = ckVar.f39470b;
                a10Var.J(j3, true, false);
                TLRPC.Chat O0 = org.telegram.messenger.np.u1(ckVar.f39469a).O0(Long.valueOf(-j3));
                if (O0 != null && org.telegram.messenger.v3.V(O0)) {
                    N0 = org.telegram.messenger.hd.N0(2131743705, null);
                } else if (O0 != null) {
                    N0 = org.telegram.messenger.hd.N0(2131743703, null);
                } else {
                    N0 = org.telegram.messenger.hd.N0(2131743704, null);
                }
                lc.b0(ckVar.f39471c).K(2131624104, org.telegram.messenger.g0.W2(N0), org.telegram.messenger.hd.N0(2131743640, null), new fm0(19, ckVar, a10Var)).j();
                g1Var.d(true);
                return;
            default:
                org.telegram.ui.vp0 vp0Var = (org.telegram.ui.vp0) this.f39687b;
                Context context2 = (Context) this.f39688c;
                Bitmap bitmap = (Bitmap) this.d;
                if (vp0Var.f57938v1) {
                    sg.q qVar = new sg.q(context2, vp0Var.A1);
                    qVar.J0(vp0Var.f57936u1.f57263a, 2);
                    qVar.f57368s1 = new androidx.activity.n(vp0Var, bitmap, 7);
                    qVar.f57367r1 = new tg.m(vp0Var, 1);
                    qVar.show();
                    return;
                }
                Runnable runnable2 = vp0Var.E1;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
