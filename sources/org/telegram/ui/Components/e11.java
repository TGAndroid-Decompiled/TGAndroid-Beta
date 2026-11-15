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
public final class e11 extends u41 {
    public final h6.m f34159n3;
    public final u5 f34160o3;
    public Drawable f34161p3;
    public int f34162q3;
    public final Paint f34163r3;

    public e11(Context context, int i7, x01 x01Var, y01 y01Var, y01 y01Var2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i7, 0, false, x01Var, y01Var, y01Var2, e6Var);
        this.f34159n3 = new h6.m(29);
        this.f34160o3 = new u5(this, 320L, er.h);
        this.f34163r3 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.f34160o3.d(canScrollVertically(-1));
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
            if (childAt instanceof o11) {
                o11 o11Var = (o11) childAt;
                if (o11Var.F) {
                    if (height > o11Var.getY()) {
                        height = o11Var.getY();
                        RecyclerView.R(o11Var);
                    }
                    if (f10 < o11Var.getY() + o11Var.getHeight()) {
                        f10 = o11Var.getY() + o11Var.getHeight();
                        RecyclerView.R(o11Var);
                    }
                }
            }
        }
        if (f10 > height) {
            int i11 = org.telegram.ui.ActionBar.j6.s9;
            org.telegram.ui.ActionBar.e6 e6Var = this.f40069o2;
            int w02 = org.telegram.ui.ActionBar.j6.w0(i11, e6Var);
            Paint paint = this.f34163r3;
            paint.setColor(w02);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((getWidth() - org.telegram.messenger.g0.L(56.0f)) / 2.0f, height, (org.telegram.messenger.g0.L(56.0f) + getWidth()) / 2.0f, f10);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint);
            if (this.f34161p3 == null) {
                this.f34161p3 = getContext().getResources().getDrawable(2131232202).mutate();
            }
            int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28815b9, e6Var);
            if (this.f34162q3 != w03) {
                Drawable drawable = this.f34161p3;
                this.f34162q3 = w03;
                drawable.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            }
            this.f34161p3.setBounds((int) (rectF.left + org.telegram.messenger.g0.L(4.0f)), (int) (rectF.top + org.telegram.messenger.g0.L(2.66f)), (int) (rectF.left + org.telegram.messenger.g0.L(13.66f)), (int) (rectF.top + org.telegram.messenger.g0.L(12.32f)));
            this.f34161p3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (i7 > 0) {
            canvas2.save();
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(12.0f));
            this.f34159n3.m(canvas2, rectF2, 1, d);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
