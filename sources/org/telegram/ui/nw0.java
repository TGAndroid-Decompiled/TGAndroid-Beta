package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class nw0 extends gw0 {
    public final int f42014r = 0;
    public final org.telegram.ui.Components.lm0 f42015s;

    public nw0(tg.l1 l1Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.f42015s = l1Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.u6 u6Var;
        boolean q5;
        org.telegram.ui.ActionBar.u6 u6Var2;
        switch (this.f42014r) {
            case 0:
                float dp = AndroidUtilities.dp(10.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                ImageView imageView = this.f39793c;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((ow0) this.f42015s).f42302c;
                premiumPreviewFragment.S.reset();
                premiumPreviewFragment.S.postScale(1.0f, premiumPreviewFragment.N / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.S.postTranslate(0.0f, -this.f39794f.e);
                premiumPreviewFragment.R.setLocalMatrix(premiumPreviewFragment.S);
                canvas.drawRoundRect(rectF, dp, dp, premiumPreviewFragment.T);
                u6Var = ((org.telegram.ui.ActionBar.r2) premiumPreviewFragment).resourceProvider;
                if (u6Var != null) {
                    u6Var2 = ((org.telegram.ui.ActionBar.r2) premiumPreviewFragment).resourceProvider;
                    q5 = u6Var2.a();
                } else {
                    q5 = org.telegram.ui.ActionBar.y6.I.q();
                }
                if (q5) {
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
                ImageView imageView2 = this.f39793c;
                rectF2.set(imageView2.getLeft(), imageView2.getTop(), imageView2.getRight(), imageView2.getBottom());
                tg.l1 l1Var = (tg.l1) this.f42015s;
                l1Var.f48930c.f48947p0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f39794f.e, l1Var.f48930c.f48937e0);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), l1Var.f48930c.f48947p0.f48797f);
                super.dispatchDraw(canvas);
                return;
        }
    }

    public nw0(ow0 ow0Var, Context context) {
        super(context, null);
        this.f42015s = ow0Var;
    }
}
