package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class iw0 extends bw0 {
    public final int f38398r = 0;
    public final org.telegram.ui.Components.km0 f38399s;

    public iw0(sg.l1 l1Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.f38399s = l1Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.g6 g6Var;
        boolean q6;
        org.telegram.ui.ActionBar.g6 g6Var2;
        switch (this.f38398r) {
            case 0:
                float dp = AndroidUtilities.dp(10.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                ImageView imageView = this.f36152c;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((jw0) this.f38399s).f38697c;
                premiumPreviewFragment.S.reset();
                premiumPreviewFragment.S.postScale(1.0f, premiumPreviewFragment.N / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.S.postTranslate(0.0f, -this.f36153f.e);
                premiumPreviewFragment.R.setLocalMatrix(premiumPreviewFragment.S);
                canvas.drawRoundRect(rectF, dp, dp, premiumPreviewFragment.T);
                g6Var = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).resourceProvider;
                if (g6Var != null) {
                    g6Var2 = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).resourceProvider;
                    q6 = g6Var2.a();
                } else {
                    q6 = org.telegram.ui.ActionBar.k6.I.q();
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
                ImageView imageView2 = this.f36152c;
                rectF2.set(imageView2.getLeft(), imageView2.getTop(), imageView2.getRight(), imageView2.getBottom());
                sg.l1 l1Var = (sg.l1) this.f38399s;
                l1Var.f46751c.f46768p0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f36153f.e, l1Var.f46751c.f46758e0);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), l1Var.f46751c.f46768p0.f46618f);
                super.dispatchDraw(canvas);
                return;
        }
    }

    public iw0(jw0 jw0Var, Context context) {
        super(context, null);
        this.f38399s = jw0Var;
    }
}
