package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class bx0 extends uw0 {
    public final int f32554r = 0;
    public final org.telegram.ui.Components.ul0 f32555s;

    public bx0(rg.j1 j1Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.f32555s = j1Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f6 f6Var;
        boolean q6;
        org.telegram.ui.ActionBar.f6 f6Var2;
        switch (this.f32554r) {
            case 0:
                float dp = AndroidUtilities.dp(10.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                ImageView imageView = this.f38224c;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((cx0) this.f32555s).f32884c;
                premiumPreviewFragment.S.reset();
                premiumPreviewFragment.S.postScale(1.0f, premiumPreviewFragment.N / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.S.postTranslate(0.0f, -this.f38225f.e);
                premiumPreviewFragment.R.setLocalMatrix(premiumPreviewFragment.S);
                canvas.drawRoundRect(rectF, dp, dp, premiumPreviewFragment.T);
                f6Var = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).resourceProvider;
                if (f6Var != null) {
                    f6Var2 = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).resourceProvider;
                    q6 = f6Var2.a();
                } else {
                    q6 = org.telegram.ui.ActionBar.j6.I.q();
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
                ImageView imageView2 = this.f38224c;
                rectF2.set(imageView2.getLeft(), imageView2.getTop(), imageView2.getRight(), imageView2.getBottom());
                rg.j1 j1Var = (rg.j1) this.f32555s;
                j1Var.f42633c.f42656p0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f38225f.e, j1Var.f42633c.f42646e0);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), j1Var.f42633c.f42656p0.f42854f);
                super.dispatchDraw(canvas);
                return;
        }
    }

    public bx0(cx0 cx0Var, Context context) {
        super(context, null);
        this.f32555s = cx0Var;
    }
}
