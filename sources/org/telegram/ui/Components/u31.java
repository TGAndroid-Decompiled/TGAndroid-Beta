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
public final class u31 extends m71 {
    public final org.telegram.ui.i20 f31222d3;
    public final g6 f31223e3;
    public Drawable f31224f3;
    public int f31225g3;
    public final Paint f31226h3;

    public u31(Context context, int i10, r31 r31Var, j31 j31Var, j31 j31Var2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, 0, false, r31Var, j31Var, j31Var2, d6Var);
        this.f31222d3 = new org.telegram.ui.i20();
        this.f31223e3 = new g6(this, 320L, is.h);
        this.f31226h3 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e7 = this.f31223e3.e(canScrollVertically(-1));
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
            if (childAt instanceof d41) {
                d41 d41Var = (d41) childAt;
                if (d41Var.f25440y) {
                    if (height > d41Var.getY()) {
                        height = d41Var.getY();
                        RecyclerView.R(d41Var);
                    }
                    if (f7 < d41Var.getY() + d41Var.getHeight()) {
                        f7 = d41Var.getY() + d41Var.getHeight();
                        RecyclerView.R(d41Var);
                    }
                }
            }
        }
        if (f7 > height) {
            int i12 = org.telegram.ui.ActionBar.h6.f21066s9;
            org.telegram.ui.ActionBar.d6 d6Var = this.f30807n2;
            int w02 = org.telegram.ui.ActionBar.h6.w0(i12, d6Var);
            Paint paint = this.f31226h3;
            paint.setColor(w02);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getWidth() - AndroidUtilities.dp(56.0f)) / 2.0f, height, (AndroidUtilities.dp(56.0f) + getWidth()) / 2.0f, f7);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            if (this.f31224f3 == null) {
                this.f31224f3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20752b9, d6Var);
            if (this.f31225g3 != w03) {
                Drawable drawable = this.f31224f3;
                this.f31225g3 = w03;
                drawable.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            }
            this.f31224f3.setBounds((int) (rectF.left + AndroidUtilities.dp(4.0f)), (int) (rectF.top + AndroidUtilities.dp(2.66f)), (int) (rectF.left + AndroidUtilities.dp(13.66f)), (int) (rectF.top + AndroidUtilities.dp(12.32f)));
            this.f31224f3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (i10 > 0) {
            canvas2.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f));
            this.f31222d3.b(canvas2, rectF2, 1, e7);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
