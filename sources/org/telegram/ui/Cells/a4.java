package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.ss0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zx;
import org.telegram.ui.xq;
public final class a4 extends AnimatorListenerAdapter {
    public final int f20796a;
    public final int f20797b;
    public final Object f20798c;

    public a4(Object obj, int i10, int i11) {
        this.f20796a = i11;
        this.f20798c = obj;
        this.f20797b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        boolean z4;
        switch (this.f20796a) {
            case 0:
                d4 d4Var = (d4) this.f20798c;
                if (!d4Var.c()) {
                    d4Var.b(this.f20797b);
                }
                d4Var.f20919a0 = null;
                return;
            case 1:
                ((org.telegram.ui.Components.j6) this.f20798c).r(this.f20797b);
                return;
            case 2:
                ((org.telegram.ui.Components.w7) this.f20798c).f30162a[this.f20797b].setVisibility(8);
                return;
            case 3:
                ((np) this.f20798c).f27344a[this.f20797b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(mr.f27123g).setStartDelay(0L).setDuration(100L).start();
                return;
            case 4:
                zx zxVar = (zx) this.f20798c;
                eg.c1 c1Var = zxVar.h;
                int i12 = 8;
                int i13 = this.f20797b;
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
                TextView textView2 = zxVar.f31495f;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 5:
                qh0 qh0Var = (qh0) this.f20798c;
                qh0Var.E = null;
                qh0Var.M.f30259a1.delete(this.f20797b);
                return;
            case 6:
                xq xqVar = (xq) this.f20798c;
                ((yk0) xqVar.d).f31046b.remove(this.f20797b);
                yk0 yk0Var = (yk0) xqVar.d;
                yk0Var.d = true;
                yk0Var.f31045a.invalidate();
                return;
            case 7:
                ss0 ss0Var = (ss0) this.f20798c;
                ss0Var.e.L1.remove(this.f20797b);
                ss0Var.f28802a.invalidate();
                return;
            case 8:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.f20798c;
                a1Var.f29533x = -1;
                a1Var.v = this.f20797b;
                a1Var.f29531s = 0.0f;
                a1Var.R = null;
                a1Var.e();
                return;
            case 9:
                rh.p2 p2Var = (rh.p2) this.f20798c;
                p2Var.M.setColor(this.f20797b);
                p2Var.A();
                p2Var.e.invalidate();
                org.telegram.ui.h3 h3Var = p2Var.R0;
                if (h3Var != null) {
                    if (AndroidUtilities.computePerceivedBrightness(p2Var.M.getColor()) <= 0.721f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    h3Var.b(z4, false);
                    p2Var.R0.setBackgroundColor(p2Var.M.getColor());
                }
                p2Var.F();
                return;
            case 10:
                rh.n3 n3Var = (rh.n3) this.f20798c;
                rh.i3 i3Var = n3Var.f43693n;
                if (i3Var.getWebView() != null) {
                    i3Var.getWebView().setScrollY(this.f20797b);
                }
                if (animator == n3Var.f43694r) {
                    n3Var.f43694r = null;
                    return;
                }
                return;
            default:
                vh.p4 p4Var = (vh.p4) this.f20798c;
                p4Var.T = this.f20797b;
                p4Var.U = 0.0f;
                p4Var.requestLayout();
                p4Var.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f20796a) {
            case 4:
                zx zxVar = (zx) this.f20798c;
                zxVar.h.setVisibility(0);
                zxVar.e.setVisibility(0);
                zxVar.f31495f.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
