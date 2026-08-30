package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.Components.ss0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.Components.zx;
import org.telegram.ui.vq;
public final class b4 extends AnimatorListenerAdapter {
    public final int f20865a;
    public final int f20866b;
    public final Object f20867c;

    public b4(Object obj, int i10, int i11) {
        this.f20865a = i11;
        this.f20867c = obj;
        this.f20866b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        boolean z4;
        switch (this.f20865a) {
            case 0:
                e4 e4Var = (e4) this.f20867c;
                if (!e4Var.c()) {
                    e4Var.b(this.f20866b);
                }
                e4Var.f21002a0 = null;
                return;
            case 1:
                ((org.telegram.ui.Components.j6) this.f20867c).r(this.f20866b);
                return;
            case 2:
                ((org.telegram.ui.Components.w7) this.f20867c).f30255a[this.f20866b].setVisibility(8);
                return;
            case 3:
                ((op) this.f20867c).f27636a[this.f20866b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(nr.f27347g).setStartDelay(0L).setDuration(100L).start();
                return;
            case 4:
                zx zxVar = (zx) this.f20867c;
                eg.c1 c1Var = zxVar.h;
                int i12 = 8;
                int i13 = this.f20866b;
                if (i13 == 1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                c1Var.setVisibility(i10);
                TextView textView = zxVar.e;
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView.setVisibility(i11);
                TextView textView2 = zxVar.f31467f;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 5:
                ph0 ph0Var = (ph0) this.f20867c;
                ph0Var.E = null;
                ph0Var.M.f29471a1.delete(this.f20866b);
                return;
            case 6:
                vq vqVar = (vq) this.f20867c;
                ((zk0) vqVar.d).f31375b.remove(this.f20866b);
                zk0 zk0Var = (zk0) vqVar.d;
                zk0Var.d = true;
                zk0Var.f31374a.invalidate();
                return;
            case 7:
                ss0 ss0Var = (ss0) this.f20867c;
                ss0Var.e.L1.remove(this.f20866b);
                ss0Var.f28811a.invalidate();
                return;
            case 8:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.f20867c;
                a1Var.f29561x = -1;
                a1Var.v = this.f20866b;
                a1Var.f29559s = 0.0f;
                a1Var.R = null;
                a1Var.e();
                return;
            case 9:
                rh.q2 q2Var = (rh.q2) this.f20867c;
                q2Var.M.setColor(this.f20866b);
                q2Var.A();
                q2Var.e.invalidate();
                org.telegram.ui.f3 f3Var = q2Var.R0;
                if (f3Var != null) {
                    if (AndroidUtilities.computePerceivedBrightness(q2Var.M.getColor()) <= 0.721f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    f3Var.b(z4, false);
                    q2Var.R0.setBackgroundColor(q2Var.M.getColor());
                }
                q2Var.F();
                return;
            case 10:
                rh.o3 o3Var = (rh.o3) this.f20867c;
                rh.j3 j3Var = o3Var.f43641n;
                if (j3Var.getWebView() != null) {
                    j3Var.getWebView().setScrollY(this.f20866b);
                }
                if (animator == o3Var.f43642r) {
                    o3Var.f43642r = null;
                    return;
                }
                return;
            default:
                vh.o4 o4Var = (vh.o4) this.f20867c;
                o4Var.T = this.f20866b;
                o4Var.U = 0.0f;
                o4Var.requestLayout();
                o4Var.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f20865a) {
            case 4:
                zx zxVar = (zx) this.f20867c;
                zxVar.h.setVisibility(0);
                zxVar.e.setVisibility(0);
                zxVar.f31467f.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
