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
public final class o11 extends g51 {
    public final i61 f37985n3;
    public final c6 f37986o3;
    public Drawable f37987p3;
    public int f37988q3;
    public final Paint f37989r3;

    public o11(Context context, int i7, h11 h11Var, i11 i11Var, i11 i11Var2, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i7, 0, false, h11Var, i11Var, i11Var2, i6Var);
        this.f37985n3 = new i61(1);
        this.f37986o3 = new c6(this, 320L, kr.h);
        this.f37989r3 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.f37986o3.d(canScrollVertically(-1));
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
            if (childAt instanceof y11) {
                y11 y11Var = (y11) childAt;
                if (y11Var.F) {
                    if (height > y11Var.getY()) {
                        height = y11Var.getY();
                        RecyclerView.R(y11Var);
                    }
                    if (f10 < y11Var.getY() + y11Var.getHeight()) {
                        f10 = y11Var.getY() + y11Var.getHeight();
                        RecyclerView.R(y11Var);
                    }
                }
            }
        }
        if (f10 > height) {
            int i11 = org.telegram.ui.ActionBar.n6.s9;
            org.telegram.ui.ActionBar.i6 i6Var = this.f34767o2;
            int w02 = org.telegram.ui.ActionBar.n6.w0(i11, i6Var);
            Paint paint = this.f37989r3;
            paint.setColor(w02);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((getWidth() - org.telegram.messenger.g0.L(56.0f)) / 2.0f, height, (org.telegram.messenger.g0.L(56.0f) + getWidth()) / 2.0f, f10);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint);
            if (this.f37987p3 == null) {
                this.f37987p3 = getContext().getResources().getDrawable(2131232206).mutate();
            }
            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29417b9, i6Var);
            if (this.f37988q3 != w03) {
                Drawable drawable = this.f37987p3;
                this.f37988q3 = w03;
                drawable.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            }
            this.f37987p3.setBounds((int) (rectF.left + org.telegram.messenger.g0.L(4.0f)), (int) (rectF.top + org.telegram.messenger.g0.L(2.66f)), (int) (rectF.left + org.telegram.messenger.g0.L(13.66f)), (int) (rectF.top + org.telegram.messenger.g0.L(12.32f)));
            this.f37987p3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (i7 > 0) {
            canvas2.save();
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(12.0f));
            this.f37985n3.u(canvas2, rectF2, 1, d);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
