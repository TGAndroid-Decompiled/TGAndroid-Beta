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
public final class d31 extends u61 {
    public final org.telegram.ui.g20 f23512m3;
    public final e6 f23513n3;
    public Drawable f23514o3;
    public int f23515p3;
    public final Paint f23516q3;

    public d31(Context context, int i10, a31 a31Var, s21 s21Var, s21 s21Var2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, 0, false, a31Var, s21Var, s21Var2, d6Var);
        this.f23512m3 = new org.telegram.ui.g20();
        this.f23513n3 = new e6(this, 320L, tr.h);
        this.f23516q3 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.f23513n3.e(canScrollVertically(-1));
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
            if (childAt instanceof m31) {
                m31 m31Var = (m31) childAt;
                if (m31Var.f26200y) {
                    if (height > m31Var.getY()) {
                        height = m31Var.getY();
                        RecyclerView.R(m31Var);
                    }
                    if (f7 < m31Var.getY() + m31Var.getHeight()) {
                        f7 = m31Var.getY() + m31Var.getHeight();
                        RecyclerView.R(m31Var);
                    }
                }
            }
        }
        if (f7 > height) {
            int i12 = org.telegram.ui.ActionBar.h6.f19355s9;
            org.telegram.ui.ActionBar.d6 d6Var = this.f31015p2;
            int v02 = org.telegram.ui.ActionBar.h6.v0(i12, d6Var);
            Paint paint = this.f23516q3;
            paint.setColor(v02);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getWidth() - AndroidUtilities.dp(56.0f)) / 2.0f, height, (AndroidUtilities.dp(56.0f) + getWidth()) / 2.0f, f7);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            if (this.f23514o3 == null) {
                this.f23514o3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19042b9, d6Var);
            if (this.f23515p3 != v03) {
                Drawable drawable = this.f23514o3;
                this.f23515p3 = v03;
                drawable.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            }
            this.f23514o3.setBounds((int) (rectF.left + AndroidUtilities.dp(4.0f)), (int) (rectF.top + AndroidUtilities.dp(2.66f)), (int) (rectF.left + AndroidUtilities.dp(13.66f)), (int) (rectF.top + AndroidUtilities.dp(12.32f)));
            this.f23514o3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (i10 > 0) {
            canvas2.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f));
            this.f23512m3.b(canvas2, rectF2, 1, e);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
