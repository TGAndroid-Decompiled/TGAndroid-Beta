package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;
public final class ls0 extends fs0 {
    public final int f49029r = 1;
    public final org.telegram.ui.Components.tj0 f49030s;

    public ls0(di.i4 i4Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f49030s = i4Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.e6 e6Var;
        boolean q10;
        org.telegram.ui.ActionBar.e6 e6Var2;
        switch (this.f49029r) {
            case 0:
                float L = org.telegram.messenger.g0.L(10.0f);
                RectF rectF = org.telegram.messenger.g0.P;
                ImageView imageView = this.f47178c;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((ms0) this.f49030s).f49312c;
                premiumPreviewFragment.T.reset();
                premiumPreviewFragment.T.postScale(1.0f, premiumPreviewFragment.O / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.T.postTranslate(0.0f, -this.f47180f.f51272e);
                premiumPreviewFragment.S.setLocalMatrix(premiumPreviewFragment.T);
                canvas.drawRoundRect(rectF, L, L, premiumPreviewFragment.U);
                e6Var = ((org.telegram.ui.ActionBar.e2) premiumPreviewFragment).resourceProvider;
                if (e6Var != null) {
                    e6Var2 = ((org.telegram.ui.ActionBar.e2) premiumPreviewFragment).resourceProvider;
                    q10 = e6Var2.a();
                } else {
                    q10 = org.telegram.ui.ActionBar.j6.I.q();
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
                ImageView imageView2 = this.f47178c;
                rectF2.set(imageView2.getLeft(), imageView2.getTop(), imageView2.getRight(), imageView2.getBottom());
                di.i4 i4Var = (di.i4) this.f49030s;
                ((ug.g1) i4Var.d).f58097l2.d(0, 0.0f, 0, getMeasuredWidth(), -this.f47180f.f51272e, ((ug.g1) i4Var.d).f58087a2);
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), ((ug.g1) i4Var.d).f58097l2.f58392f);
                super.dispatchDraw(canvas);
                return;
        }
    }

    public ls0(ms0 ms0Var, Context context) {
        super(context, null);
        this.f49030s = ms0Var;
    }
}
