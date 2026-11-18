package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;
public final class ps0 extends js0 {
    public final int f50923r = 1;
    public final org.telegram.ui.Components.bk0 f50924s;

    public ps0(di.l4 l4Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.f50924s = l4Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.i6 i6Var;
        boolean q10;
        org.telegram.ui.ActionBar.i6 i6Var2;
        switch (this.f50923r) {
            case 0:
                float L = org.telegram.messenger.g0.L(10.0f);
                RectF rectF = org.telegram.messenger.g0.P;
                ImageView imageView = this.f49053c;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((qs0) this.f50924s).f51293c;
                premiumPreviewFragment.T.reset();
                premiumPreviewFragment.T.postScale(1.0f, premiumPreviewFragment.O / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.T.postTranslate(0.0f, -this.f49055f.f53472e);
                premiumPreviewFragment.S.setLocalMatrix(premiumPreviewFragment.T);
                canvas.drawRoundRect(rectF, L, L, premiumPreviewFragment.U);
                i6Var = ((org.telegram.ui.ActionBar.h2) premiumPreviewFragment).resourceProvider;
                if (i6Var != null) {
                    i6Var2 = ((org.telegram.ui.ActionBar.h2) premiumPreviewFragment).resourceProvider;
                    q10 = i6Var2.d();
                } else {
                    q10 = org.telegram.ui.ActionBar.n6.I.q();
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
                ImageView imageView2 = this.f49053c;
                rectF2.set(imageView2.getLeft(), imageView2.getTop(), imageView2.getRight(), imageView2.getBottom());
                di.l4 l4Var = (di.l4) this.f50924s;
                ((ug.i1) l4Var.d).f58688l2.d(0, 0.0f, 0, getMeasuredWidth(), -this.f49055f.f53472e, ((ug.i1) l4Var.d).f58678a2);
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), ((ug.i1) l4Var.d).f58688l2.f58607f);
                super.dispatchDraw(canvas);
                return;
        }
    }

    public ps0(qs0 qs0Var, Context context) {
        super(context, null);
        this.f50924s = qs0Var;
    }
}
