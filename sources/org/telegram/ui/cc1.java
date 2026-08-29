package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class cc1 extends AnimatorListenerAdapter {
    public final int f37076a;
    public final Object f37077b;

    public cc1(Object obj, int i10) {
        this.f37076a = i10;
        this.f37077b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37076a) {
            case 10:
                ((r0.n0) this.f37077b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37076a) {
            case 0:
                qc1 qc1Var = ((ec1) this.f37077b).f37790a;
                if (!qc1Var.l1.a()) {
                    qc1Var.N1.setVisibility(8);
                    return;
                }
                return;
            case 1:
                super.onAnimationEnd(animator);
                ((rd1) this.f37077b).f42075a = null;
                return;
            case 2:
                super.onAnimationEnd(animator);
                ((xe1) this.f37077b).setScrollEnabled(true);
                return;
            case 3:
                bg1 bg1Var = (bg1) this.f37077b;
                if (animator.equals(bg1Var.f36793e.G)) {
                    bg1Var.f36793e.G = null;
                    return;
                }
                return;
            case 4:
                sg1 sg1Var = (sg1) this.f37077b;
                sg1Var.d = null;
                sg1Var.f42386a = null;
                sg1Var.f42387b = false;
                sg1Var.f42390f.f36352c.setAllowDrawCursor(true);
                return;
            case 5:
                org.telegram.ui.Components.if0 if0Var = (org.telegram.ui.Components.if0) this.f37077b;
                ((ji1) if0Var.f29385b).getClass();
                ((ji1) if0Var.f29385b).f39563c.setVisibility(4);
                return;
            case 6:
                ((org.telegram.ui.web.z0) this.f37077b).f44284s.setVisibility(8);
                return;
            case 7:
                ph.v vVar = (ph.v) this.f37077b;
                vVar.setVisibility(8);
                vVar.f46110a = null;
                return;
            case 8:
                ((ph.p2) this.f37077b).f45989y.setVisibility(8);
                return;
            case 9:
                ((ph.n3) this.f37077b).E.setVisibility(8);
                return;
            case 10:
                ((r0.n0) this.f37077b).c();
                return;
            case 11:
                super.onAnimationEnd(animator);
                tf.g gVar = (tf.g) this.f37077b;
                if (!gVar.f48265e1) {
                    gVar.f48279q0 = false;
                    gVar.f48278p0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.f48256b0 = false;
                return;
            case 12:
                ((vf.e) this.f37077b).h.setVisibility(8);
                return;
            default:
                ((CropAreaView) this.f37077b).V = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37076a) {
            case 10:
                ((r0.n0) this.f37077b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public cc1(r0.n0 n0Var, View view) {
        this.f37076a = 10;
        this.f37077b = n0Var;
    }
}
