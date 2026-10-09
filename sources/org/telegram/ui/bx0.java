package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class bx0 extends uw0 {
    public final int f36454r = 0;
    public final org.telegram.ui.Components.pm0 f36455s;

    public bx0(rg.k1 k1Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f36455s = k1Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.e6 e6Var;
        boolean q6;
        org.telegram.ui.ActionBar.e6 e6Var2;
        switch (this.f36454r) {
            case 0:
                float dp = AndroidUtilities.dp(10.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                ImageView imageView = this.f42571c;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((cx0) this.f36455s).f36746c;
                premiumPreviewFragment.S.reset();
                premiumPreviewFragment.S.postScale(1.0f, premiumPreviewFragment.N / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.S.postTranslate(0.0f, -this.f42573f.f39366e);
                premiumPreviewFragment.R.setLocalMatrix(premiumPreviewFragment.S);
                canvas.drawRoundRect(rectF, dp, dp, premiumPreviewFragment.T);
                e6Var = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).resourceProvider;
                if (e6Var != null) {
                    e6Var2 = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).resourceProvider;
                    q6 = e6Var2.a();
                } else {
                    q6 = org.telegram.ui.ActionBar.i6.I.q();
                }
                if (q6) {
                    float dp2 = AndroidUtilities.dp(1.0f);
                    premiumPreviewFragment.Q.setStrokeWidth(dp2);
                    canvas.save();
                    canvas.translate(rectF.left, rectF.top);
                    rectF.offset(-rectF.left, -rectF.top);
                    float f7 = dp2 / 2.0f;
                    rectF.inset(f7, f7);
                    canvas.drawRoundRect(rectF, dp, dp, premiumPreviewFragment.Q);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
            default:
                RectF rectF2 = AndroidUtilities.rectTmp;
                ImageView imageView2 = this.f42571c;
                rectF2.set(imageView2.getLeft(), imageView2.getTop(), imageView2.getRight(), imageView2.getBottom());
                rg.k1 k1Var = (rg.k1) this.f36455s;
                k1Var.f47307c.f47333p0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f42573f.f39366e, k1Var.f47307c.f47323e0);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), k1Var.f47307c.f47333p0.f47177f);
                super.dispatchDraw(canvas);
                return;
        }
    }

    public bx0(cx0 cx0Var, Context context) {
        super(context, null);
        this.f36455s = cx0Var;
    }
}
