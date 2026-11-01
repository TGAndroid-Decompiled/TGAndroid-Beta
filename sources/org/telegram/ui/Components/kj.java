package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.ui.nb1;
public final class kj extends ew0 {
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
                nb1 nb1Var = (nb1) this.L;
                super.e(z10, z11);
                float f7 = 1.0f;
                if (z11) {
                    ViewPropertyAnimator animate = ((TextView) nb1Var.f39825n.d).animate();
                    if (z10) {
                        f7 = 0.0f;
                    }
                    animate.alpha(f7).start();
                    return;
                }
                ((TextView) nb1Var.f39825n.d).animate().cancel();
                TextView textView = (TextView) nb1Var.f39825n.d;
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
                super.onMeasure(i10, org.telegram.messenger.a30.c(y3Var.e, y3Var.f49688n - y3Var.f49689r.getPaddingTop(), 1073741824));
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

    public kj(nb1 nb1Var, Context context, zz zzVar) {
        super(context, zzVar, 0, null);
        this.L = nb1Var;
    }
}
