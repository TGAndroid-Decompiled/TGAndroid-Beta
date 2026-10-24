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
public final class k31 extends i71 {
    public final org.telegram.ui.w10 f27849g3;
    public final d6 f27850h3;
    public Drawable f27851i3;
    public int f27852j3;
    public final Paint f27853k3;

    public k31(Context context, int i10, h31 h31Var, c31 c31Var, c31 c31Var2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, 0, false, h31Var, c31Var, c31Var2, g6Var);
        this.f27849g3 = new org.telegram.ui.w10();
        this.f27850h3 = new d6(this, 320L, zr.h);
        this.f27853k3 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.f27850h3.e(canScrollVertically(-1));
        int i10 = (e > 0.0f ? 1 : (e == 0.0f ? 0 : -1));
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
            if (childAt instanceof u31) {
                u31 u31Var = (u31) childAt;
                if (u31Var.E) {
                    if (height > u31Var.getY()) {
                        height = u31Var.getY();
                        RecyclerView.R(u31Var);
                    }
                    if (f7 < u31Var.getY() + u31Var.getHeight()) {
                        f7 = u31Var.getY() + u31Var.getHeight();
                        RecyclerView.R(u31Var);
                    }
                }
            }
        }
        if (f7 > height) {
            int i12 = org.telegram.ui.ActionBar.k6.f21464s9;
            org.telegram.ui.ActionBar.g6 g6Var = this.f28396n2;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i12, g6Var);
            Paint paint = this.f27853k3;
            paint.setColor(w02);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getWidth() - AndroidUtilities.dp(56.0f)) / 2.0f, height, (AndroidUtilities.dp(56.0f) + getWidth()) / 2.0f, f7);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            if (this.f27851i3 == null) {
                this.f27851i3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21148b9, g6Var);
            if (this.f27852j3 != w03) {
                Drawable drawable = this.f27851i3;
                this.f27852j3 = w03;
                drawable.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            }
            this.f27851i3.setBounds((int) (rectF.left + AndroidUtilities.dp(4.0f)), (int) (rectF.top + AndroidUtilities.dp(2.66f)), (int) (rectF.left + AndroidUtilities.dp(13.66f)), (int) (rectF.top + AndroidUtilities.dp(12.32f)));
            this.f27851i3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (i10 > 0) {
            canvas2.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f));
            this.f27849g3.b(canvas2, rectF2, 1, e);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
