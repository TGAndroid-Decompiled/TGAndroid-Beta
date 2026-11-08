package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class b11 extends q41 {
    public final h6.m f32007m3;
    public final w5 f32008n3;
    public Drawable f32009o3;
    public int f32010p3;
    public final Paint f32011q3;

    public b11(Context context, int i7, u01 u01Var, v01 v01Var, v01 v01Var2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i7, 0, false, u01Var, v01Var, v01Var2, f6Var);
        this.f32007m3 = new h6.m(28);
        this.f32008n3 = new w5(this, 320L, xq.h);
        this.f32011q3 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.f32008n3.d(canScrollVertically(-1));
        int i7 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i7 > 0) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        float height = getHeight();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof l11) {
                l11 l11Var = (l11) childAt;
                if (l11Var.E) {
                    if (height > l11Var.getY()) {
                        height = l11Var.getY();
                        RecyclerView.R(l11Var);
                    }
                    if (f10 < l11Var.getY() + l11Var.getHeight()) {
                        f10 = l11Var.getY() + l11Var.getHeight();
                        RecyclerView.R(l11Var);
                    }
                }
            }
        }
        if (f10 > height) {
            int i11 = org.telegram.ui.ActionBar.k6.s9;
            org.telegram.ui.ActionBar.f6 f6Var = this.f36981n2;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i11, f6Var);
            Paint paint = this.f32011q3;
            paint.setColor(w02);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((getWidth() - org.telegram.messenger.g0.L(56.0f)) / 2.0f, height, (org.telegram.messenger.g0.L(56.0f) + getWidth()) / 2.0f, f10);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint);
            if (this.f32009o3 == null) {
                this.f32009o3 = getContext().getResources().getDrawable(2131232201).mutate();
            }
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27818b9, f6Var);
            if (this.f32010p3 != w03) {
                Drawable drawable = this.f32009o3;
                this.f32010p3 = w03;
                drawable.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            }
            this.f32009o3.setBounds((int) (rectF.left + org.telegram.messenger.g0.L(4.0f)), (int) (rectF.top + org.telegram.messenger.g0.L(2.66f)), (int) (rectF.left + org.telegram.messenger.g0.L(13.66f)), (int) (rectF.top + org.telegram.messenger.g0.L(12.32f)));
            this.f32009o3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (i7 > 0) {
            canvas2.save();
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(12.0f));
            this.f32007m3.m(canvas2, rectF2, 1, d);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
