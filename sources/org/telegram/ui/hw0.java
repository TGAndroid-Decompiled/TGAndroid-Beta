package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class hw0 extends aw0 {
    public final int f37659r = 0;
    public final org.telegram.ui.Components.hm0 f37660s;

    public hw0(sg.l1 l1Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.f37660s = l1Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.d6 d6Var;
        boolean q6;
        org.telegram.ui.ActionBar.d6 d6Var2;
        switch (this.f37659r) {
            case 0:
                float dp = AndroidUtilities.dp(10.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                ImageView imageView = this.f35494c;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((iw0) this.f37660s).f37989c;
                premiumPreviewFragment.S.reset();
                premiumPreviewFragment.S.postScale(1.0f, premiumPreviewFragment.N / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.S.postTranslate(0.0f, -this.f35495f.e);
                premiumPreviewFragment.R.setLocalMatrix(premiumPreviewFragment.S);
                canvas.drawRoundRect(rectF, dp, dp, premiumPreviewFragment.T);
                d6Var = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).resourceProvider;
                if (d6Var != null) {
                    d6Var2 = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).resourceProvider;
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
                ImageView imageView2 = this.f35494c;
                rectF2.set(imageView2.getLeft(), imageView2.getTop(), imageView2.getRight(), imageView2.getBottom());
                sg.l1 l1Var = (sg.l1) this.f37660s;
                l1Var.f46318c.f46334p0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f35495f.e, l1Var.f46318c.f46324e0);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), l1Var.f46318c.f46334p0.f46184f);
                super.dispatchDraw(canvas);
                return;
        }
    }

    public hw0(iw0 iw0Var, Context context) {
        super(context, null);
        this.f37660s = iw0Var;
    }
}
