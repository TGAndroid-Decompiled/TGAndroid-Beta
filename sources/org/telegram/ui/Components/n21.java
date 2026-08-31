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
public final class n21 extends i61 {
    public final org.telegram.ui.h20 c3;
    public final z5 f29379d3;
    public Drawable f29380e3;
    public int f29381f3;
    public final Paint f29382g3;

    public n21(Context context, int i10, k21 k21Var, f21 f21Var, f21 f21Var2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, 0, false, k21Var, f21Var, f21Var2, g6Var);
        this.c3 = new org.telegram.ui.h20();
        this.f29379d3 = new z5(this, 320L, pr.h);
        this.f29382g3 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e6 = this.f29379d3.e(canScrollVertically(-1));
        int i10 = (e6 > 0.0f ? 1 : (e6 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        float height = getHeight();
        float f10 = 0.0f;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof w21) {
                w21 w21Var = (w21) childAt;
                if (w21Var.f32624y) {
                    if (height > w21Var.getY()) {
                        height = w21Var.getY();
                        RecyclerView.R(w21Var);
                    }
                    if (f10 < w21Var.getY() + w21Var.getHeight()) {
                        f10 = w21Var.getY() + w21Var.getHeight();
                        RecyclerView.R(w21Var);
                    }
                }
            }
        }
        if (f10 > height) {
            int i12 = org.telegram.ui.ActionBar.k6.s9;
            org.telegram.ui.ActionBar.g6 g6Var = this.f31383m2;
            int v02 = org.telegram.ui.ActionBar.k6.v0(i12, g6Var);
            Paint paint = this.f29382g3;
            paint.setColor(v02);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getWidth() - AndroidUtilities.dp(56.0f)) / 2.0f, height, (AndroidUtilities.dp(56.0f) + getWidth()) / 2.0f, f10);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            if (this.f29380e3 == null) {
                this.f29380e3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int v03 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21626b9, g6Var);
            if (this.f29381f3 != v03) {
                Drawable drawable = this.f29380e3;
                this.f29381f3 = v03;
                drawable.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            }
            this.f29380e3.setBounds((int) (rectF.left + AndroidUtilities.dp(4.0f)), (int) (rectF.top + AndroidUtilities.dp(2.66f)), (int) (rectF.left + AndroidUtilities.dp(13.66f)), (int) (rectF.top + AndroidUtilities.dp(12.32f)));
            this.f29380e3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (i10 > 0) {
            canvas2.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f));
            this.c3.b(canvas2, rectF2, 1, e6);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
