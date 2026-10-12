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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class x31 extends p71 {
    public final org.telegram.ui.l20 f32639d3;
    public final g6 f32640e3;
    public Drawable f32641f3;
    public int f32642g3;
    public final Paint f32643h3;

    public x31(Context context, int i10, u31 u31Var, n31 n31Var, n31 n31Var2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, 0, false, u31Var, n31Var, n31Var2, c6Var);
        this.f32639d3 = new org.telegram.ui.l20();
        this.f32640e3 = new g6(this, 320L, js.h);
        this.f32643h3 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e7 = this.f32640e3.e(canScrollVertically(-1));
        int i10 = (e7 > 0.0f ? 1 : (e7 == 0.0f ? 0 : -1));
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
            if (childAt instanceof g41) {
                g41 g41Var = (g41) childAt;
                if (g41Var.f26277y) {
                    if (height > g41Var.getY()) {
                        height = g41Var.getY();
                        RecyclerView.R(g41Var);
                    }
                    if (f7 < g41Var.getY() + g41Var.getHeight()) {
                        f7 = g41Var.getY() + g41Var.getHeight();
                        RecyclerView.R(g41Var);
                    }
                }
            }
        }
        if (f7 > height) {
            int i12 = org.telegram.ui.ActionBar.h6.f20841s9;
            org.telegram.ui.ActionBar.c6 c6Var = this.f32467n2;
            int w02 = org.telegram.ui.ActionBar.h6.w0(i12, c6Var);
            Paint paint = this.f32643h3;
            paint.setColor(w02);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getWidth() - AndroidUtilities.dp(56.0f)) / 2.0f, height, (AndroidUtilities.dp(56.0f) + getWidth()) / 2.0f, f7);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            if (this.f32641f3 == null) {
                this.f32641f3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20526b9, c6Var);
            if (this.f32642g3 != w03) {
                Drawable drawable = this.f32641f3;
                this.f32642g3 = w03;
                drawable.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            }
            this.f32641f3.setBounds((int) (rectF.left + AndroidUtilities.dp(4.0f)), (int) (rectF.top + AndroidUtilities.dp(2.66f)), (int) (rectF.left + AndroidUtilities.dp(13.66f)), (int) (rectF.top + AndroidUtilities.dp(12.32f)));
            this.f32641f3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (i10 > 0) {
            canvas2.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f));
            this.f32639d3.b(canvas2, rectF2, 1, e7);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
