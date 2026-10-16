package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class hx0 extends ax0 {
    public final int f36663r = 0;
    public final org.telegram.ui.Components.lm0 f36664s;

    public hx0(sg.l1 l1Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.f36664s = l1Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.c6 c6Var;
        boolean q6;
        org.telegram.ui.ActionBar.c6 c6Var2;
        switch (this.f36663r) {
            case 0:
                float dp = AndroidUtilities.dp(10.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                ImageView imageView = this.f34114c;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((ix0) this.f36664s).f36886c;
                premiumPreviewFragment.S.reset();
                premiumPreviewFragment.S.postScale(1.0f, premiumPreviewFragment.N / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.S.postTranslate(0.0f, -this.f34115f.e);
                premiumPreviewFragment.R.setLocalMatrix(premiumPreviewFragment.S);
                canvas.drawRoundRect(rectF, dp, dp, premiumPreviewFragment.T);
                c6Var = ((org.telegram.ui.ActionBar.m2) premiumPreviewFragment).resourceProvider;
                if (c6Var != null) {
                    c6Var2 = ((org.telegram.ui.ActionBar.m2) premiumPreviewFragment).resourceProvider;
                    q6 = c6Var2.a();
                } else {
                    q6 = org.telegram.ui.ActionBar.g6.I.q();
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
                ImageView imageView2 = this.f34114c;
                rectF2.set(imageView2.getLeft(), imageView2.getTop(), imageView2.getRight(), imageView2.getBottom());
                sg.l1 l1Var = (sg.l1) this.f36664s;
                l1Var.f45249c.f45266p0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f34115f.e, l1Var.f45249c.f45256e0);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), l1Var.f45249c.f45266p0.f45117f);
                super.dispatchDraw(canvas);
                return;
        }
    }

    public hx0(ix0 ix0Var, Context context) {
        super(context, null);
        this.f36664s = ix0Var;
    }
}
