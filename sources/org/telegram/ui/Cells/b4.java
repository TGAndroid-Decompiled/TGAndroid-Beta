package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.Components.ts0;
import org.telegram.ui.wq;
public final class b4 extends AnimatorListenerAdapter {
    public final int f22593a;
    public final int f22594b;
    public final Object f22595c;

    public b4(Object obj, int i10, int i11) {
        this.f22593a = i11;
        this.f22595c = obj;
        this.f22594b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        boolean z4;
        switch (this.f22593a) {
            case 0:
                e4 e4Var = (e4) this.f22595c;
                if (!e4Var.c()) {
                    e4Var.b(this.f22594b);
                }
                e4Var.f22741a0 = null;
                return;
            case 1:
                ((org.telegram.ui.Components.j6) this.f22595c).r(this.f22594b);
                return;
            case 2:
                ((org.telegram.ui.Components.w7) this.f22595c).f32657a[this.f22594b].setVisibility(8);
                return;
            case 3:
                ((qp) this.f22595c).f30456a[this.f22594b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(pr.f30184g).setStartDelay(0L).setDuration(100L).start();
                return;
            case 4:
                cy cyVar = (cy) this.f22595c;
                fg.b1 b1Var = cyVar.h;
                int i12 = 8;
                int i13 = this.f22594b;
                if (i13 == 1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                b1Var.setVisibility(i10);
                TextView textView = cyVar.f26108e;
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView.setVisibility(i11);
                TextView textView2 = cyVar.f26109f;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 5:
                rh0 rh0Var = (rh0) this.f22595c;
                rh0Var.E = null;
                rh0Var.M.f33083a1.delete(this.f22594b);
                return;
            case 6:
                wq wqVar = (wq) this.f22595c;
                ((al0) wqVar.d).f25286b.remove(this.f22594b);
                al0 al0Var = (al0) wqVar.d;
                al0Var.d = true;
                al0Var.f25285a.invalidate();
                return;
            case 7:
                ts0 ts0Var = (ts0) this.f22595c;
                ts0Var.f31450e.L1.remove(this.f22594b);
                ts0Var.f31447a.invalidate();
                return;
            case 8:
                org.telegram.ui.Components.voip.b1 b1Var2 = (org.telegram.ui.Components.voip.b1) this.f22595c;
                b1Var2.f31974x = -1;
                b1Var2.v = this.f22594b;
                b1Var2.f31972s = 0.0f;
                b1Var2.R = null;
                b1Var2.e();
                return;
            case 9:
                sh.p2 p2Var = (sh.p2) this.f22595c;
                p2Var.M.setColor(this.f22594b);
                p2Var.A();
                p2Var.f47588e.invalidate();
                org.telegram.ui.f3 f3Var = p2Var.R0;
                if (f3Var != null) {
                    if (AndroidUtilities.computePerceivedBrightness(p2Var.M.getColor()) <= 0.721f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    f3Var.b(z4, false);
                    p2Var.R0.setBackgroundColor(p2Var.M.getColor());
                }
                p2Var.F();
                return;
            case 10:
                sh.n3 n3Var = (sh.n3) this.f22595c;
                sh.i3 i3Var = n3Var.f47542n;
                if (i3Var.getWebView() != null) {
                    i3Var.getWebView().setScrollY(this.f22594b);
                }
                if (animator == n3Var.f47543r) {
                    n3Var.f47543r = null;
                    return;
                }
                return;
            default:
                wh.o4 o4Var = (wh.o4) this.f22595c;
                o4Var.T = this.f22594b;
                o4Var.U = 0.0f;
                o4Var.requestLayout();
                o4Var.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f22593a) {
            case 4:
                cy cyVar = (cy) this.f22595c;
                cyVar.h.setVisibility(0);
                cyVar.f26108e.setVisibility(0);
                cyVar.f26109f.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
