package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class ax0 extends tw0 {
    public final int f36198r = 0;
    public final org.telegram.ui.Components.rm0 f36199s;

    public ax0(rg.k1 k1Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.f36199s = k1Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.d6 d6Var;
        boolean q6;
        org.telegram.ui.ActionBar.d6 d6Var2;
        switch (this.f36198r) {
            case 0:
                float dp = AndroidUtilities.dp(10.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                ImageView imageView = this.f42283c;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((bx0) this.f36199s).f36467c;
                premiumPreviewFragment.S.reset();
                premiumPreviewFragment.S.postScale(1.0f, premiumPreviewFragment.N / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.S.postTranslate(0.0f, -this.f42285f.f39140e);
                premiumPreviewFragment.R.setLocalMatrix(premiumPreviewFragment.S);
                canvas.drawRoundRect(rectF, dp, dp, premiumPreviewFragment.T);
                d6Var = ((org.telegram.ui.ActionBar.m2) premiumPreviewFragment).resourceProvider;
                if (d6Var != null) {
                    d6Var2 = ((org.telegram.ui.ActionBar.m2) premiumPreviewFragment).resourceProvider;
                    q6 = d6Var2.a();
                } else {
                    q6 = org.telegram.ui.ActionBar.h6.I.q();
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
                ImageView imageView2 = this.f42283c;
                rectF2.set(imageView2.getLeft(), imageView2.getTop(), imageView2.getRight(), imageView2.getBottom());
                rg.k1 k1Var = (rg.k1) this.f36199s;
                k1Var.f47399c.f47425p0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f42285f.f39140e, k1Var.f47399c.f47415e0);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), k1Var.f47399c.f47425p0.f47269f);
                super.dispatchDraw(canvas);
                return;
        }
    }

    public ax0(bx0 bx0Var, Context context) {
        super(context, null);
        this.f36199s = bx0Var;
    }
}
