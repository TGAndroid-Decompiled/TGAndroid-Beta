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
public final class l31 extends c71 {
    public final org.telegram.ui.k20 f28271m3;
    public final e6 f28272n3;
    public Drawable f28273o3;
    public int f28274p3;
    public final Paint f28275q3;

    public l31(Context context, int i10, i31 i31Var, a31 a31Var, a31 a31Var2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, 0, false, i31Var, a31Var, a31Var2, d6Var);
        this.f28271m3 = new org.telegram.ui.k20();
        this.f28272n3 = new e6(this, 320L, tr.h);
        this.f28275q3 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e7 = this.f28272n3.e(canScrollVertically(-1));
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
            if (childAt instanceof u31) {
                u31 u31Var = (u31) childAt;
                if (u31Var.f31283y) {
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
            int i12 = org.telegram.ui.ActionBar.i6.f21100s9;
            org.telegram.ui.ActionBar.d6 d6Var = this.f33545p2;
            int v02 = org.telegram.ui.ActionBar.i6.v0(i12, d6Var);
            Paint paint = this.f28275q3;
            paint.setColor(v02);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getWidth() - AndroidUtilities.dp(56.0f)) / 2.0f, height, (AndroidUtilities.dp(56.0f) + getWidth()) / 2.0f, f7);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            if (this.f28273o3 == null) {
                this.f28273o3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int v03 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20783b9, d6Var);
            if (this.f28274p3 != v03) {
                Drawable drawable = this.f28273o3;
                this.f28274p3 = v03;
                drawable.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            }
            this.f28273o3.setBounds((int) (rectF.left + AndroidUtilities.dp(4.0f)), (int) (rectF.top + AndroidUtilities.dp(2.66f)), (int) (rectF.left + AndroidUtilities.dp(13.66f)), (int) (rectF.top + AndroidUtilities.dp(12.32f)));
            this.f28273o3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (i10 > 0) {
            canvas2.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f));
            this.f28271m3.b(canvas2, rectF2, 1, e7);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
