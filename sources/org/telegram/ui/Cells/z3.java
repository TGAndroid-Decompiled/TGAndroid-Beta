package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.ks0;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.vx;
import org.telegram.ui.pq;
public final class z3 extends AnimatorListenerAdapter {
    public final int f26038a;
    public final int f26039b;
    public final Object f26040c;

    public z3(Object obj, int i10, int i11) {
        this.f26038a = i11;
        this.f26040c = obj;
        this.f26039b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        boolean z10;
        switch (this.f26038a) {
            case 0:
                c4 c4Var = (c4) this.f26040c;
                if (!c4Var.c()) {
                    c4Var.b(this.f26039b);
                }
                c4Var.W = null;
                return;
            case 1:
                ((org.telegram.ui.Components.n6) this.f26040c).r(this.f26039b);
                return;
            case 2:
                ((org.telegram.ui.Components.a8) this.f26040c).f26684a[this.f26039b].setVisibility(8);
                return;
            case 3:
                ((kp) this.f26040c).f30121a[this.f26039b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(jr.f29801g).setStartDelay(0L).setDuration(100L).start();
                return;
            case 4:
                vx vxVar = (vx) this.f26040c;
                cg.d1 d1Var = vxVar.h;
                int i12 = 8;
                int i13 = this.f26039b;
                if (i13 == 1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                d1Var.setVisibility(i10);
                TextView textView = vxVar.f34208e;
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView.setVisibility(i11);
                TextView textView2 = vxVar.f34209f;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 5:
                eh0 eh0Var = (eh0) this.f26040c;
                eh0Var.D = null;
                eh0Var.L.Z0.delete(this.f26039b);
                return;
            case 6:
                pq pqVar = (pq) this.f26040c;
                ((pk0) pqVar.d).f31699b.remove(this.f26039b);
                pk0 pk0Var = (pk0) pqVar.d;
                pk0Var.d = true;
                pk0Var.f31698a.invalidate();
                return;
            case 7:
                ks0 ks0Var = (ks0) this.f26040c;
                ks0Var.f30144e.K1.remove(this.f26039b);
                ks0Var.f30141a.invalidate();
                return;
            case 8:
                org.telegram.ui.Components.voip.b1 b1Var = (org.telegram.ui.Components.voip.b1) this.f26040c;
                b1Var.f33629x = -1;
                b1Var.v = this.f26039b;
                b1Var.f33627s = 0.0f;
                b1Var.Q = null;
                b1Var.e();
                return;
            case 9:
                ph.p2 p2Var = (ph.p2) this.f26040c;
                p2Var.L.setColor(this.f26039b);
                p2Var.A();
                p2Var.f45963e.invalidate();
                org.telegram.ui.h3 h3Var = p2Var.Q0;
                if (h3Var != null) {
                    if (AndroidUtilities.computePerceivedBrightness(p2Var.L.getColor()) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    h3Var.b(z10, false);
                    p2Var.Q0.setBackgroundColor(p2Var.L.getColor());
                }
                p2Var.F();
                return;
            case 10:
                ph.n3 n3Var = (ph.n3) this.f26040c;
                ph.i3 i3Var = n3Var.f45917n;
                if (i3Var.getWebView() != null) {
                    i3Var.getWebView().setScrollY(this.f26039b);
                }
                if (animator == n3Var.f45918r) {
                    n3Var.f45918r = null;
                    return;
                }
                return;
            default:
                th.m4 m4Var = (th.m4) this.f26040c;
                m4Var.S = this.f26039b;
                m4Var.T = 0.0f;
                m4Var.requestLayout();
                m4Var.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f26038a) {
            case 4:
                vx vxVar = (vx) this.f26040c;
                vxVar.h.setVisibility(0);
                vxVar.f34208e.setVisibility(0);
                vxVar.f34209f.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
