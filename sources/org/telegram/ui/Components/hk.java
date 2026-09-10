package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.ui.ig1;
public final class hk extends jx0 {
    public final int K = 2;
    public final Object L;

    public hk(tk tkVar, Context context, a10 a10Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, a10Var, 1, f6Var);
        this.L = tkVar;
    }

    @Override
    public void e(boolean z10, boolean z11) {
        switch (this.K) {
            case 1:
                ig1 ig1Var = (ig1) this.L;
                super.e(z10, z11);
                float f7 = 1.0f;
                if (z11) {
                    ViewPropertyAnimator animate = ig1Var.f33709n.f38992a.animate();
                    if (z10) {
                        f7 = 0.0f;
                    }
                    animate.alpha(f7).start();
                    return;
                }
                ig1Var.f33709n.f38992a.animate().cancel();
                TextView textView = ig1Var.f33709n.f38992a;
                if (z10) {
                    f7 = 0.0f;
                }
                textView.setAlpha(f7);
                return;
            default:
                super.e(z10, z11);
                return;
        }
    }

    @Override
    public float getTranslationY() {
        switch (this.K) {
            case 0:
                return super.getTranslationY() - ((tk) this.L).M;
            default:
                return super.getTranslationY();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.K) {
            case 2:
                zh.z3 z3Var = ((zh.v3) this.L).d;
                super.onMeasure(i10, org.telegram.messenger.em.d(z3Var.e, z3Var.f49141n - z3Var.f49142r.getPaddingTop(), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.K) {
            case 0:
                super.setTranslationY(f7 + ((tk) this.L).M);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    public hk(int i10, Context context, zh.b bVar, zh.v3 v3Var) {
        super(context, null, i10, bVar);
        this.L = v3Var;
    }

    public hk(ig1 ig1Var, Context context, a10 a10Var) {
        super(context, a10Var, 0, null);
        this.L = ig1Var;
    }
}
