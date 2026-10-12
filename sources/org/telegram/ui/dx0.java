package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class dx0 extends ww0 {
    public final int f36928r = 0;
    public final org.telegram.ui.Components.vm0 f36929s;

    public dx0(rg.k1 k1Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.f36929s = k1Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.c6 c6Var;
        boolean q6;
        org.telegram.ui.ActionBar.c6 c6Var2;
        switch (this.f36928r) {
            case 0:
                float dp = AndroidUtilities.dp(10.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                ImageView imageView = this.f43689c;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((ex0) this.f36929s).f37565c;
                premiumPreviewFragment.S.reset();
                premiumPreviewFragment.S.postScale(1.0f, premiumPreviewFragment.N / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.S.postTranslate(0.0f, -this.f43691f.f40149e);
                premiumPreviewFragment.R.setLocalMatrix(premiumPreviewFragment.S);
                canvas.drawRoundRect(rectF, dp, dp, premiumPreviewFragment.T);
                c6Var = ((org.telegram.ui.ActionBar.m2) premiumPreviewFragment).resourceProvider;
                if (c6Var != null) {
                    c6Var2 = ((org.telegram.ui.ActionBar.m2) premiumPreviewFragment).resourceProvider;
                    q6 = c6Var2.a();
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
                ImageView imageView2 = this.f43689c;
                rectF2.set(imageView2.getLeft(), imageView2.getTop(), imageView2.getRight(), imageView2.getBottom());
                rg.k1 k1Var = (rg.k1) this.f36929s;
                k1Var.f47531c.f47557p0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f43691f.f40149e, k1Var.f47531c.f47547e0);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), k1Var.f47531c.f47557p0.f47401f);
                super.dispatchDraw(canvas);
                return;
        }
    }

    public dx0(ex0 ex0Var, Context context) {
        super(context, null);
        this.f36929s = ex0Var;
    }
}
