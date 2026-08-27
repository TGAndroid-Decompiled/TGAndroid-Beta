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

public final class t11 extends k51 {

    public final org.telegram.ui.v10 f32622b3;

    public final y5 f32623c3;

    public Drawable f32624d3;

    public int f32625e3;

    public final Paint f32626f3;

    public t11(Context context, int i10, q11 q11Var, k11 k11Var, k11 k11Var2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, 0, false, q11Var, k11Var, k11Var2, c6Var);
        this.f32622b3 = new org.telegram.ui.v10();
        this.f32623c3 = new y5(this, 320L, er.h);
        this.f32626f3 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float fE = this.f32623c3.e(canScrollVertically(-1));
        if (fE > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        float height = getHeight();
        float y10 = 0.0f;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof c21) {
                c21 c21Var = (c21) childAt;
                if (c21Var.f27311y) {
                    if (height > c21Var.getY()) {
                        height = c21Var.getY();
                        RecyclerView.R(c21Var);
                    }
                    if (y10 < c21Var.getY() + c21Var.getHeight()) {
                        y10 = c21Var.getY() + c21Var.getHeight();
                        RecyclerView.R(c21Var);
                    }
                }
            }
        }
        if (y10 > height) {
            int i11 = org.telegram.ui.ActionBar.g6.f23323s9;
            org.telegram.ui.ActionBar.c6 c6Var = this.f35277l2;
            int iV0 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
            Paint paint = this.f32626f3;
            paint.setColor(iV0);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getWidth() - AndroidUtilities.dp(56.0f)) / 2.0f, height, (AndroidUtilities.dp(56.0f) + getWidth()) / 2.0f, y10);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            if (this.f32624d3 == null) {
                this.f32624d3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23020b9, c6Var);
            if (this.f32625e3 != iV1) {
                Drawable drawable = this.f32624d3;
                this.f32625e3 = iV1;
                drawable.setColorFilter(new PorterDuffColorFilter(iV1, PorterDuff.Mode.SRC_IN));
            }
            this.f32624d3.setBounds((int) (rectF.left + AndroidUtilities.dp(4.0f)), (int) (rectF.top + AndroidUtilities.dp(2.66f)), (int) (rectF.left + AndroidUtilities.dp(13.66f)), (int) (rectF.top + AndroidUtilities.dp(12.32f)));
            this.f32624d3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (fE > 0.0f) {
            canvas2.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f));
            this.f32622b3.b(canvas2, rectF2, 1, fE);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
