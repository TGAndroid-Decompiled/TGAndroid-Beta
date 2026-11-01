package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class qz extends AnimatorListenerAdapter {
    public final int f29841a;
    public final int f29842b;
    public final float f29843c;
    public final View d;

    public qz(View view, int i10, float f7, int i11) {
        this.f29841a = i11;
        this.d = view;
        this.f29842b = i10;
        this.f29843c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f29841a) {
            case 0:
                rz rzVar = (rz) this.d;
                int i10 = this.f29842b;
                if (i10 == 5) {
                    f7 = 0.0f;
                } else {
                    f7 = -this.f29843c;
                }
                rzVar.b(f7, i10 + 1);
                rzVar.D = 0.0f;
                rzVar.invalidate();
                return;
            case 1:
                ((org.telegram.ui.web.l1) this.d).c(this.f29842b, this.f29843c, false);
                return;
            default:
                rh.v8 v8Var = (rh.v8) this.d;
                v8Var.f47615c0 = this.f29843c;
                if (v8Var.getValue() != this.f29842b) {
                    v8Var.e(v8Var.getValue());
                }
                v8Var.invalidate();
                return;
        }
    }

    public qz(rh.v8 v8Var, float f7, int i10) {
        this.f29841a = 2;
        this.d = v8Var;
        this.f29843c = f7;
        this.f29842b = i10;
    }
}
