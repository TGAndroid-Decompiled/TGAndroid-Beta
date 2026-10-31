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
public final class e21 extends u51 {
    public final li.k f25628m3;
    public final t5 f25629n3;
    public Drawable f25630o3;
    public int f25631p3;
    public final Paint f25632q3;

    public e21(Context context, int i10, v11 v11Var, w11 w11Var, w11 w11Var2, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, i10, 0, false, v11Var, w11Var, w11Var2, p6Var);
        this.f25628m3 = new li.k(23);
        this.f25629n3 = new t5(this, 320L, gr.h);
        this.f25632q3 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.f25629n3.d(canScrollVertically(-1));
        int i10 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i10 > 0) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        float height = getHeight();
        float f7 = 0.0f;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof n21) {
                n21 n21Var = (n21) childAt;
                if (n21Var.E) {
                    if (height > n21Var.getY()) {
                        height = n21Var.getY();
                        RecyclerView.R(n21Var);
                    }
                    if (f7 < n21Var.getY() + n21Var.getHeight()) {
                        f7 = n21Var.getY() + n21Var.getHeight();
                        RecyclerView.R(n21Var);
                    }
                }
            }
        }
        if (f7 > height) {
            int i12 = org.telegram.ui.ActionBar.t6.f21207s9;
            org.telegram.ui.ActionBar.p6 p6Var = this.f30625n2;
            int w02 = org.telegram.ui.ActionBar.t6.w0(i12, p6Var);
            Paint paint = this.f25632q3;
            paint.setColor(w02);
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set((getWidth() - org.telegram.messenger.i0.L(56.0f)) / 2.0f, height, (org.telegram.messenger.i0.L(56.0f) + getWidth()) / 2.0f, f7);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paint);
            if (this.f25630o3 == null) {
                this.f25630o3 = getContext().getResources().getDrawable(2131232200).mutate();
            }
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20894b9, p6Var);
            if (this.f25631p3 != w03) {
                Drawable drawable = this.f25630o3;
                this.f25631p3 = w03;
                drawable.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            }
            this.f25630o3.setBounds((int) (rectF.left + org.telegram.messenger.i0.L(4.0f)), (int) (rectF.top + org.telegram.messenger.i0.L(2.66f)), (int) (rectF.left + org.telegram.messenger.i0.L(13.66f)), (int) (rectF.top + org.telegram.messenger.i0.L(12.32f)));
            this.f25630o3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (i10 > 0) {
            canvas2.save();
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(0.0f, 0.0f, getWidth(), org.telegram.messenger.i0.L(12.0f));
            this.f25628m3.o(canvas2, rectF2, 1, d);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
