package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.ui.pb1;
public final class kj extends dw0 {
    public final int K = 2;
    public final Object L;

    public kj(xj xjVar, Context context, zz zzVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, zzVar, 1, p6Var);
        this.L = xjVar;
    }

    @Override
    public void e(boolean z10, boolean z11) {
        switch (this.K) {
            case 1:
                pb1 pb1Var = (pb1) this.L;
                super.e(z10, z11);
                float f7 = 1.0f;
                if (z11) {
                    ViewPropertyAnimator animate = ((TextView) pb1Var.f40594n.d).animate();
                    if (z10) {
                        f7 = 0.0f;
                    }
                    animate.alpha(f7).start();
                    return;
                }
                ((TextView) pb1Var.f40594n.d).animate().cancel();
                TextView textView = (TextView) pb1Var.f40594n.d;
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
                return super.getTranslationY() - ((xj) this.L).M;
            default:
                return super.getTranslationY();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.K) {
            case 2:
                th.y3 y3Var = ((th.u3) this.L).d;
                super.onMeasure(i10, org.telegram.messenger.z20.c(y3Var.e, y3Var.f49674n - y3Var.f49675r.getPaddingTop(), 1073741824));
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
                super.setTranslationY(f7 + ((xj) this.L).M);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    public kj(int i10, Context context, th.b bVar, th.u3 u3Var) {
        super(context, null, i10, bVar);
        this.L = u3Var;
    }

    public kj(pb1 pb1Var, Context context, zz zzVar) {
        super(context, zzVar, 0, null);
        this.L = pb1Var;
    }
}
