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
public final class t31 extends l71 {
    public final org.telegram.ui.j20 f30968d3;
    public final g6 f30969e3;
    public Drawable f30970f3;
    public int f30971g3;
    public final Paint f30972h3;

    public t31(Context context, int i10, q31 q31Var, i31 i31Var, i31 i31Var2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, 0, false, q31Var, i31Var, i31Var2, e6Var);
        this.f30968d3 = new org.telegram.ui.j20();
        this.f30969e3 = new g6(this, 320L, is.h);
        this.f30972h3 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e7 = this.f30969e3.e(canScrollVertically(-1));
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
            if (childAt instanceof c41) {
                c41 c41Var = (c41) childAt;
                if (c41Var.f25187y) {
                    if (height > c41Var.getY()) {
                        height = c41Var.getY();
                        RecyclerView.R(c41Var);
                    }
                    if (f7 < c41Var.getY() + c41Var.getHeight()) {
                        f7 = c41Var.getY() + c41Var.getHeight();
                        RecyclerView.R(c41Var);
                    }
                }
            }
        }
        if (f7 > height) {
            int i12 = org.telegram.ui.ActionBar.i6.f21080s9;
            org.telegram.ui.ActionBar.e6 e6Var = this.f30511n2;
            int w02 = org.telegram.ui.ActionBar.i6.w0(i12, e6Var);
            Paint paint = this.f30972h3;
            paint.setColor(w02);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getWidth() - AndroidUtilities.dp(56.0f)) / 2.0f, height, (AndroidUtilities.dp(56.0f) + getWidth()) / 2.0f, f7);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            if (this.f30970f3 == null) {
                this.f30970f3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20767b9, e6Var);
            if (this.f30971g3 != w03) {
                Drawable drawable = this.f30970f3;
                this.f30971g3 = w03;
                drawable.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            }
            this.f30970f3.setBounds((int) (rectF.left + AndroidUtilities.dp(4.0f)), (int) (rectF.top + AndroidUtilities.dp(2.66f)), (int) (rectF.left + AndroidUtilities.dp(13.66f)), (int) (rectF.top + AndroidUtilities.dp(12.32f)));
            this.f30970f3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (i10 > 0) {
            canvas2.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f));
            this.f30968d3.b(canvas2, rectF2, 1, e7);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
