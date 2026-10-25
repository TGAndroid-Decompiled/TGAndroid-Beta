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
public final class u31 extends r71 {
    public final org.telegram.ui.w10 f33234n3;
    public final h6 f33235o3;
    public Drawable f33236p3;
    public int f33237q3;
    public final Paint f33238r3;

    public u31(Context context, int i10, r31 r31Var, m31 m31Var, m31 m31Var2, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, 0, false, r31Var, m31Var, m31Var2, u6Var);
        this.f33234n3 = new org.telegram.ui.w10();
        this.f33235o3 = new h6(this, 320L, ds.h);
        this.f33238r3 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.f33235o3.e(canScrollVertically(-1));
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
            if (childAt instanceof d41) {
                d41 d41Var = (d41) childAt;
                if (d41Var.E) {
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
            int i12 = org.telegram.ui.ActionBar.y6.f23635s9;
            org.telegram.ui.ActionBar.u6 u6Var = this.f30644n2;
            int w02 = org.telegram.ui.ActionBar.y6.w0(i12, u6Var);
            Paint paint = this.f33238r3;
            paint.setColor(w02);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getWidth() - AndroidUtilities.dp(56.0f)) / 2.0f, height, (AndroidUtilities.dp(56.0f) + getWidth()) / 2.0f, f7);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            if (this.f33236p3 == null) {
                this.f33236p3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23318b9, u6Var);
            if (this.f33237q3 != w03) {
                Drawable drawable = this.f33236p3;
                this.f33237q3 = w03;
                drawable.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            }
            this.f33236p3.setBounds((int) (rectF.left + AndroidUtilities.dp(4.0f)), (int) (rectF.top + AndroidUtilities.dp(2.66f)), (int) (rectF.left + AndroidUtilities.dp(13.66f)), (int) (rectF.top + AndroidUtilities.dp(12.32f)));
            this.f33236p3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (i10 > 0) {
            canvas2.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f));
            this.f33234n3.b(canvas2, rectF2, 1, e);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
