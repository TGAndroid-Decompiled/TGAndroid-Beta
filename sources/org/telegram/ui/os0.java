package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;
public final class os0 extends is0 {
    public final int f48534r = 1;
    public final org.telegram.ui.Components.oj0 f48535s;

    public os0(bi.k5 k5Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.f48535s = k5Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f6 f6Var;
        boolean q10;
        org.telegram.ui.ActionBar.f6 f6Var2;
        switch (this.f48534r) {
            case 0:
                float L = org.telegram.messenger.g0.L(10.0f);
                RectF rectF = org.telegram.messenger.g0.P;
                ImageView imageView = this.f46739c;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((ps0) this.f48535s).f48951c;
                premiumPreviewFragment.S.reset();
                premiumPreviewFragment.S.postScale(1.0f, premiumPreviewFragment.N / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.S.postTranslate(0.0f, -this.f46741f.f50769e);
                premiumPreviewFragment.R.setLocalMatrix(premiumPreviewFragment.S);
                canvas.drawRoundRect(rectF, L, L, premiumPreviewFragment.T);
                f6Var = ((org.telegram.ui.ActionBar.f2) premiumPreviewFragment).resourceProvider;
                if (f6Var != null) {
                    f6Var2 = ((org.telegram.ui.ActionBar.f2) premiumPreviewFragment).resourceProvider;
                    q10 = f6Var2.a();
                } else {
                    q10 = org.telegram.ui.ActionBar.k6.I.q();
                }
                if (q10) {
                    float L2 = org.telegram.messenger.g0.L(1.0f);
                    premiumPreviewFragment.Q.setStrokeWidth(L2);
                    canvas.save();
                    canvas.translate(rectF.left, rectF.top);
                    rectF.offset(-rectF.left, -rectF.top);
                    float f10 = L2 / 2.0f;
                    rectF.inset(f10, f10);
                    canvas.drawRoundRect(rectF, L, L, premiumPreviewFragment.Q);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
            default:
                RectF rectF2 = org.telegram.messenger.g0.P;
                ImageView imageView2 = this.f46739c;
                rectF2.set(imageView2.getLeft(), imageView2.getTop(), imageView2.getRight(), imageView2.getBottom());
                bi.k5 k5Var = (bi.k5) this.f48535s;
                ((ug.f1) k5Var.d).f56569h2.d(0, 0.0f, 0, getMeasuredWidth(), -this.f46741f.f50769e, ((ug.f1) k5Var.d).W1);
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), ((ug.f1) k5Var.d).f56569h2.f56869f);
                super.dispatchDraw(canvas);
                return;
        }
    }

    public os0(ps0 ps0Var, Context context) {
        super(context, null);
        this.f48535s = ps0Var;
    }
}
