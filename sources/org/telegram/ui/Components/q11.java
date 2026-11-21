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
public final class q11 extends h51 {
    public final h6.m f38758n3;
    public final d6 f38759o3;
    public Drawable f38760p3;
    public int f38761q3;
    public final Paint f38762r3;

    public q11(Context context, int i7, j11 j11Var, k11 k11Var, k11 k11Var2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, i7, 0, false, j11Var, k11Var, k11Var2, h6Var);
        this.f38758n3 = new h6.m(29);
        this.f38759o3 = new d6(this, 320L, nr.h);
        this.f38762r3 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.f38759o3.d(canScrollVertically(-1));
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
            if (childAt instanceof a21) {
                a21 a21Var = (a21) childAt;
                if (a21Var.F) {
                    if (height > a21Var.getY()) {
                        height = a21Var.getY();
                        RecyclerView.R(a21Var);
                    }
                    if (f10 < a21Var.getY() + a21Var.getHeight()) {
                        f10 = a21Var.getY() + a21Var.getHeight();
                        RecyclerView.R(a21Var);
                    }
                }
            }
        }
        if (f10 > height) {
            int i11 = org.telegram.ui.ActionBar.m6.s9;
            org.telegram.ui.ActionBar.h6 h6Var = this.f34875o2;
            int w02 = org.telegram.ui.ActionBar.m6.w0(i11, h6Var);
            Paint paint = this.f38762r3;
            paint.setColor(w02);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((getWidth() - org.telegram.messenger.g0.L(56.0f)) / 2.0f, height, (org.telegram.messenger.g0.L(56.0f) + getWidth()) / 2.0f, f10);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint);
            if (this.f38760p3 == null) {
                this.f38760p3 = getContext().getResources().getDrawable(2131232203).mutate();
            }
            int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29344b9, h6Var);
            if (this.f38761q3 != w03) {
                Drawable drawable = this.f38760p3;
                this.f38761q3 = w03;
                drawable.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            }
            this.f38760p3.setBounds((int) (rectF.left + org.telegram.messenger.g0.L(4.0f)), (int) (rectF.top + org.telegram.messenger.g0.L(2.66f)), (int) (rectF.left + org.telegram.messenger.g0.L(13.66f)), (int) (rectF.top + org.telegram.messenger.g0.L(12.32f)));
            this.f38760p3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (i7 > 0) {
            canvas2.save();
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(12.0f));
            this.f38758n3.n(canvas2, rectF2, 1, d);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
