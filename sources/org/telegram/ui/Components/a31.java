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
public final class a31 extends r61 {
    public final org.telegram.ui.m20 f21376f3;
    public final d6 f21377g3;
    public Drawable f21378h3;
    public int f21379i3;
    public final Paint j3;

    public a31(Context context, int i10, x21 x21Var, q21 q21Var, q21 q21Var2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, 0, false, x21Var, q21Var, q21Var2, f6Var);
        this.f21376f3 = new org.telegram.ui.m20();
        this.f21377g3 = new d6(this, 320L, wr.h);
        this.j3 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.f21377g3.e(canScrollVertically(-1));
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
            if (childAt instanceof j31) {
                j31 j31Var = (j31) childAt;
                if (j31Var.f24231y) {
                    if (height > j31Var.getY()) {
                        height = j31Var.getY();
                        RecyclerView.R(j31Var);
                    }
                    if (f7 < j31Var.getY() + j31Var.getHeight()) {
                        f7 = j31Var.getY() + j31Var.getHeight();
                        RecyclerView.R(j31Var);
                    }
                }
            }
        }
        if (f7 > height) {
            int i12 = org.telegram.ui.ActionBar.j6.f18202s9;
            org.telegram.ui.ActionBar.f6 f6Var = this.f27987p2;
            int v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
            Paint paint = this.j3;
            paint.setColor(v02);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getWidth() - AndroidUtilities.dp(56.0f)) / 2.0f, height, (AndroidUtilities.dp(56.0f) + getWidth()) / 2.0f, f7);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            if (this.f21378h3 == null) {
                this.f21378h3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17894b9, f6Var);
            if (this.f21379i3 != v03) {
                Drawable drawable = this.f21378h3;
                this.f21379i3 = v03;
                drawable.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            }
            this.f21378h3.setBounds((int) (rectF.left + AndroidUtilities.dp(4.0f)), (int) (rectF.top + AndroidUtilities.dp(2.66f)), (int) (rectF.left + AndroidUtilities.dp(13.66f)), (int) (rectF.top + AndroidUtilities.dp(12.32f)));
            this.f21378h3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (i10 > 0) {
            canvas2.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f));
            this.f21376f3.b(canvas2, rectF2, 1, e);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
