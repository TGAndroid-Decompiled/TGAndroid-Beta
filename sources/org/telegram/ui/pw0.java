package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class pw0 extends iw0 {
    public final int f42517r = 0;
    public final org.telegram.ui.Components.mm0 f42518s;

    public pw0(tg.l1 l1Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.f42518s = l1Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.u6 u6Var;
        boolean q5;
        org.telegram.ui.ActionBar.u6 u6Var2;
        switch (this.f42517r) {
            case 0:
                float dp = AndroidUtilities.dp(10.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                ImageView imageView = this.f40281c;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((qw0) this.f42518s).f42803c;
                premiumPreviewFragment.S.reset();
                premiumPreviewFragment.S.postScale(1.0f, premiumPreviewFragment.N / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.S.postTranslate(0.0f, -this.f40282f.e);
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
                ImageView imageView2 = this.f40281c;
                rectF2.set(imageView2.getLeft(), imageView2.getTop(), imageView2.getRight(), imageView2.getBottom());
                tg.l1 l1Var = (tg.l1) this.f42518s;
                l1Var.f48965c.f48982p0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f40282f.e, l1Var.f48965c.f48972e0);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), l1Var.f48965c.f48982p0.f48832f);
                super.dispatchDraw(canvas);
                return;
        }
    }

    public pw0(qw0 qw0Var, Context context) {
        super(context, null);
        this.f42518s = qw0Var;
    }
}
