package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;
public final class es0 extends yr0 {
    public final int f45026r = 1;
    public final org.telegram.ui.Components.sj0 f45027s;

    public es0(ci.r4 r4Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f45027s = r4Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.e6 e6Var;
        boolean q10;
        org.telegram.ui.ActionBar.e6 e6Var2;
        switch (this.f45026r) {
            case 0:
                float L = org.telegram.messenger.g0.L(10.0f);
                RectF rectF = org.telegram.messenger.g0.P;
                ImageView imageView = this.f52388c;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((fs0) this.f45027s).f45364c;
                premiumPreviewFragment.T.reset();
                premiumPreviewFragment.T.postScale(1.0f, premiumPreviewFragment.O / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.T.postTranslate(0.0f, -this.f52390f.f47433e);
                premiumPreviewFragment.S.setLocalMatrix(premiumPreviewFragment.T);
                canvas.drawRoundRect(rectF, L, L, premiumPreviewFragment.U);
                e6Var = ((org.telegram.ui.ActionBar.d2) premiumPreviewFragment).resourceProvider;
                if (e6Var != null) {
                    e6Var2 = ((org.telegram.ui.ActionBar.d2) premiumPreviewFragment).resourceProvider;
                    q10 = e6Var2.a();
                } else {
                    q10 = org.telegram.ui.ActionBar.k6.I.q();
                }
                if (q10) {
                    float L2 = org.telegram.messenger.g0.L(1.0f);
                    premiumPreviewFragment.R.setStrokeWidth(L2);
                    canvas.save();
                    canvas.translate(rectF.left, rectF.top);
                    rectF.offset(-rectF.left, -rectF.top);
                    float f10 = L2 / 2.0f;
                    rectF.inset(f10, f10);
                    canvas.drawRoundRect(rectF, L, L, premiumPreviewFragment.R);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
            default:
                RectF rectF2 = org.telegram.messenger.g0.P;
                ImageView imageView2 = this.f52388c;
                rectF2.set(imageView2.getLeft(), imageView2.getTop(), imageView2.getRight(), imageView2.getBottom());
                ci.r4 r4Var = (ci.r4) this.f45027s;
                ((vg.h1) r4Var.d).f56631i2.d(0, 0.0f, 0, getMeasuredWidth(), -this.f52390f.f47433e, ((vg.h1) r4Var.d).X1);
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), ((vg.h1) r4Var.d).f56631i2.f56911f);
                super.dispatchDraw(canvas);
                return;
        }
    }

    public es0(fs0 fs0Var, Context context) {
        super(context, null);
        this.f45027s = fs0Var;
    }
}
