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
    public final int f38893a;
    public final KeyEvent.Callback f38894b;
    public final Object f38895c;
    public final Object d;

    public qt(KeyEvent.Callback callback, Object obj, Object obj2, int i7) {
        this.f38893a = i7;
        this.f38894b = callback;
        this.f38895c = obj;
        this.d = obj2;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.n2 n2Var;
        View view2;
        String M0;
        boolean z10 = true;
        switch (this.f38893a) {
            case 0:
                wt wtVar = (wt) this.f38894b;
                au0 au0Var = (au0) this.f38895c;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.d;
                rt rtVar = wtVar.f41786a;
                kg.k kVar = wtVar.f41787b;
                if (kVar.isEnabled() && kVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.j1 j1Var = wtVar.L;
                    if (j1Var == null || !j1Var.f29024f) {
                        if (wtVar.f41791n) {
                            rtVar.m();
                            y60 y60Var = new y60(au0Var, i6Var, kVar, false, false, true);
                            y60Var.f42343a0 = org.telegram.messenger.g0.L(280.0f);
                            rtVar.o(null, new u90(y60Var, rtVar));
                            y60Var.X = true;
                            y60Var.a0();
                            return;
                        } else if (!wtVar.f41789e) {
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
                            if (wtVar.f41796y) {
                                wtVar.k(true);
                                wtVar.f41796y = false;
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
                o10 o10Var = (o10) this.f38894b;
                o10Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) this.f38895c);
                alertDialog$Builder.f28746a.S = org.telegram.messenger.gd.M0(2131749386, null);
                alertDialog$Builder.f28746a.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131749387, null));
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131749388, null), new iy(o10Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                ((org.telegram.ui.ActionBar.h2) this.d).showDialog(alertDialog$Builder.f28746a);
                return;
            case 2:
                e80 e80Var = (e80) this.f38894b;
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) this.f38895c;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.d;
                try {
                    if (e80Var.f34640b != null) {
                        ((ClipboardManager) org.telegram.messenger.t0.f26915b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", e80Var.f34640b));
                        if (x2Var != null && (n2Var = x2Var.f30195c) != null) {
                            new lc(n2Var, null).k(false).j();
                        } else {
                            lc.j(h2Var).j();
                        }
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 3:
                oa0 oa0Var = (oa0) this.f38894b;
                ta0 ta0Var = (ta0) this.f38895c;
                ta0 ta0Var2 = (ta0) this.d;
                ua0 ua0Var = oa0Var.f38045d0;
                org.telegram.messenger.jj jjVar = ua0Var.d;
                boolean z11 = jjVar.f24876l;
                boolean z12 = !z11;
                jjVar.f24876l = z12;
                if (!z11) {
                    if (!jjVar.f24875k) {
                        jjVar.f24875k = true;
                        ua0Var.f40287y = true;
                    }
                } else {
                    if (ua0Var.f40287y) {
                        jjVar.f24875k = false;
                    }
                    ua0Var.f40287y = false;
                }
                ta0Var.a(z12, true);
                ta0Var2.a(jjVar.f24875k, true);
                oa0Var.i();
                oa0Var.l(true);
                return;
            case 4:
                xc0.K0((xc0) this.f38894b, (TLRPC.ChatFull) this.f38895c, (org.telegram.ui.z40) this.d);
                return;
            case 5:
                ee0 ee0Var = (ee0) this.f38894b;
                Context context = (Context) this.f38895c;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) this.d;
                if (ee0Var.h == null) {
                    hi.i3 i3Var = new hi.i3(context, i6Var2, org.telegram.messenger.gd.M0(2131743370, null), ee0Var.f34685f);
                    ee0Var.h = i3Var;
                    i3Var.n(new gb0(ee0Var, 7));
                    ee0Var.h.f14760q1 = ee0Var.f34686n;
                }
                ee0Var.h.show();
                return;
            case 6:
                w21 w21Var = (w21) this.f38894b;
                org.telegram.messenger.cd cdVar = (org.telegram.messenger.cd) this.d;
                y21 y21Var = w21Var.f41548n;
                Runnable runnable = ((Runnable[]) this.f38895c)[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = y21Var.f42282v1;
                x21 x21Var = y21Var.I1;
                if (!TextUtils.equals(str, cdVar.f23335f)) {
                    View view3 = x21Var.d;
                    if (view3 == y21Var.f42286z1 || view3 == y21Var.f42280t1) {
                        y21Var.f42283w1 = y21Var.f42282v1;
                    }
                    u21 u21Var = w21Var.f41546e;
                    String str2 = cdVar.f23335f;
                    y21Var.f42282v1 = str2;
                    u21Var.setText(y21.L0(y21.P0(str2, null, null)));
                    if (y21Var.f42278r1 != null) {
                        view2 = y21Var.f42279s1;
                    } else {
                        view2 = y21Var.f42285y1;
                    }
                    x21Var.D(view2);
                    y21.U0(y21Var.f42282v1);
                    y21Var.Y0();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.ck ckVar = (org.telegram.ui.ck) this.f38894b;
                org.telegram.messenger.z00 z00Var = (org.telegram.messenger.z00) this.f38895c;
                org.telegram.ui.ActionBar.h1 h1Var = (org.telegram.ui.ActionBar.h1) this.d;
                long j3 = ckVar.f38256b;
                z00Var.J(j3, true, false);
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(ckVar.f38255a).O0(Long.valueOf(-j3));
                if (O0 != null && org.telegram.messenger.v3.V(O0)) {
                    M0 = org.telegram.messenger.gd.M0(2131743713, null);
                } else if (O0 != null) {
                    M0 = org.telegram.messenger.gd.M0(2131743711, null);
                } else {
                    M0 = org.telegram.messenger.gd.M0(2131743712, null);
                }
                lc.b0(ckVar.f38257c).K(2131624104, org.telegram.messenger.g0.W2(M0), org.telegram.messenger.gd.M0(2131743648, null), new hn0(17, ckVar, z00Var)).j();
                h1Var.d(true);
                return;
            default:
                org.telegram.ui.vp0 vp0Var = (org.telegram.ui.vp0) this.f38894b;
                Context context2 = (Context) this.f38895c;
                Bitmap bitmap = (Bitmap) this.d;
                if (vp0Var.f57880v1) {
                    sg.q qVar = new sg.q(context2, vp0Var.A1);
                    qVar.J0(vp0Var.f57878u1.f57218a, 2);
                    qVar.f57323s1 = new androidx.activity.n(vp0Var, bitmap, 7);
                    qVar.f57322r1 = new tg.m(vp0Var, 1);
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
