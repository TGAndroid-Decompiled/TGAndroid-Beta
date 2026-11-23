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
public final class qt implements View.OnClickListener {
    public final int f38996a;
    public final KeyEvent.Callback f38997b;
    public final Object f38998c;
    public final Object d;

    public qt(KeyEvent.Callback callback, Object obj, Object obj2, int i7) {
        this.f38996a = i7;
        this.f38997b = callback;
        this.f38998c = obj;
        this.d = obj2;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.m2 m2Var;
        View view2;
        String N0;
        boolean z10 = true;
        switch (this.f38996a) {
            case 0:
                wt wtVar = (wt) this.f38997b;
                cu0 cu0Var = (cu0) this.f38998c;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.d;
                rt rtVar = wtVar.f41719a;
                kg.k kVar = wtVar.f41720b;
                if (kVar.isEnabled() && kVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.i1 i1Var = wtVar.L;
                    if (i1Var == null || !i1Var.f29071f) {
                        if (wtVar.f41724n) {
                            rtVar.m();
                            x60 x60Var = new x60(cu0Var, i6Var, kVar, false, false, true);
                            x60Var.f41860a0 = org.telegram.messenger.g0.L(280.0f);
                            rtVar.o(null, new t90(x60Var, rtVar));
                            x60Var.X = true;
                            x60Var.a0();
                            return;
                        } else if (!wtVar.f41722e) {
                            wtVar.x(1);
                            boolean isFocused = rtVar.isFocused();
                            st stVar = wtVar.d;
                            if (rtVar.length() <= 0) {
                                z10 = false;
                            }
                            stVar.C(z10, false);
                            rtVar.requestFocus();
                            if (!isFocused) {
                                rtVar.setSelection(rtVar.length());
                                return;
                            }
                            return;
                        } else {
                            if (wtVar.f41729y) {
                                wtVar.k(true);
                                wtVar.f41729y = false;
                                wtVar.p();
                            }
                            wtVar.v();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                p10 p10Var = (p10) this.f38997b;
                p10Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) this.f38998c);
                alertDialog$Builder.f28835a.S = org.telegram.messenger.gd.N0(2131749385, null);
                alertDialog$Builder.f28835a.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131749386, null));
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131749387, null), new hy(p10Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                ((org.telegram.ui.ActionBar.g2) this.d).showDialog(alertDialog$Builder.f28835a);
                return;
            case 2:
                d80 d80Var = (d80) this.f38997b;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.f38998c;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.d;
                try {
                    if (d80Var.f34235b != null) {
                        ((ClipboardManager) org.telegram.messenger.t0.f27013b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", d80Var.f34235b));
                        if (w2Var != null && (m2Var = w2Var.f30229c) != null) {
                            new kc(m2Var, null).k(false).j();
                        } else {
                            kc.j(g2Var).j();
                        }
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 3:
                na0 na0Var = (na0) this.f38997b;
                sa0 sa0Var = (sa0) this.f38998c;
                sa0 sa0Var2 = (sa0) this.d;
                ta0 ta0Var = na0Var.f37742d0;
                org.telegram.messenger.jj jjVar = ta0Var.d;
                boolean z11 = jjVar.f24983l;
                boolean z12 = !z11;
                jjVar.f24983l = z12;
                if (!z11) {
                    if (!jjVar.f24982k) {
                        jjVar.f24982k = true;
                        ta0Var.f39891y = true;
                    }
                } else {
                    if (ta0Var.f39891y) {
                        jjVar.f24982k = false;
                    }
                    ta0Var.f39891y = false;
                }
                sa0Var.a(z12, true);
                sa0Var2.a(jjVar.f24982k, true);
                na0Var.i();
                na0Var.l(true);
                return;
            case 4:
                wc0.K0((wc0) this.f38997b, (TLRPC.ChatFull) this.f38998c, (org.telegram.ui.y40) this.d);
                return;
            case 5:
                ee0 ee0Var = (ee0) this.f38997b;
                Context context = (Context) this.f38998c;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) this.d;
                if (ee0Var.h == null) {
                    hi.q3 q3Var = new hi.q3(context, i6Var2, org.telegram.messenger.gd.N0(2131743360, null), ee0Var.f34699f);
                    ee0Var.h = q3Var;
                    q3Var.n(new eb0(ee0Var, 7));
                    ee0Var.h.f15218q1 = ee0Var.f34700n;
                }
                ee0Var.h.show();
                return;
            case 6:
                y21 y21Var = (y21) this.f38997b;
                org.telegram.messenger.cd cdVar = (org.telegram.messenger.cd) this.d;
                a31 a31Var = y21Var.f42313n;
                Runnable runnable = ((Runnable[]) this.f38998c)[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = a31Var.f33357v1;
                z21 z21Var = a31Var.I1;
                if (!TextUtils.equals(str, cdVar.f23447f)) {
                    View view3 = z21Var.d;
                    if (view3 == a31Var.f33361z1 || view3 == a31Var.f33355t1) {
                        a31Var.f33358w1 = a31Var.f33357v1;
                    }
                    w21 w21Var = y21Var.f42311e;
                    String str2 = cdVar.f23447f;
                    a31Var.f33357v1 = str2;
                    w21Var.setText(a31.L0(a31.P0(str2, null, null)));
                    if (a31Var.f33353r1 != null) {
                        view2 = a31Var.f33354s1;
                    } else {
                        view2 = a31Var.f33360y1;
                    }
                    z21Var.D(view2);
                    a31.U0(a31Var.f33357v1);
                    a31Var.Y0();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.ck ckVar = (org.telegram.ui.ck) this.f38997b;
                org.telegram.messenger.y00 y00Var = (org.telegram.messenger.y00) this.f38998c;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.d;
                long j3 = ckVar.f39170b;
                y00Var.J(j3, true, false);
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(ckVar.f39169a).O0(Long.valueOf(-j3));
                if (O0 != null && org.telegram.messenger.v3.V(O0)) {
                    N0 = org.telegram.messenger.gd.N0(2131743703, null);
                } else if (O0 != null) {
                    N0 = org.telegram.messenger.gd.N0(2131743701, null);
                } else {
                    N0 = org.telegram.messenger.gd.N0(2131743702, null);
                }
                kc.b0(ckVar.f39171c).K(2131624104, org.telegram.messenger.g0.W2(N0), org.telegram.messenger.gd.N0(2131743638, null), new sh0(21, ckVar, y00Var)).j();
                g1Var.d(true);
                return;
            default:
                org.telegram.ui.vp0 vp0Var = (org.telegram.ui.vp0) this.f38997b;
                Context context2 = (Context) this.f38998c;
                Bitmap bitmap = (Bitmap) this.d;
                if (vp0Var.f58054v1) {
                    sg.q qVar = new sg.q(context2, vp0Var.A1);
                    qVar.J0(vp0Var.f58052u1.f57335a, 2);
                    qVar.f57443s1 = new androidx.activity.n(vp0Var, bitmap, 7);
                    qVar.f57442r1 = new tg.r(vp0Var, 1);
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
