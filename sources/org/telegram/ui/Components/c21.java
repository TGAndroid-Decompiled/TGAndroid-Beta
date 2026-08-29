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
public final class c21 extends u51 {
    public final org.telegram.ui.u10 f27287b3;
    public final d6 c3;
    public Drawable f27288d3;
    public int f27289e3;
    public final Paint f27290f3;

    public c21(Context context, int i10, z11 z11Var, u11 u11Var, u11 u11Var2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, 0, false, z11Var, u11Var, u11Var2, c6Var);
        this.f27287b3 = new org.telegram.ui.u10();
        this.c3 = new d6(this, 320L, jr.h);
        this.f27290f3 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e10 = this.c3.e(canScrollVertically(-1));
        int i10 = (e10 > 0.0f ? 1 : (e10 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        float height = getHeight();
        float f9 = 0.0f;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof l21) {
                l21 l21Var = (l21) childAt;
                if (l21Var.f30218y) {
                    if (height > l21Var.getY()) {
                        height = l21Var.getY();
                        RecyclerView.R(l21Var);
                    }
                    if (f9 < l21Var.getY() + l21Var.getHeight()) {
                        f9 = l21Var.getY() + l21Var.getHeight();
                        RecyclerView.R(l21Var);
                    }
                }
            }
        }
        if (f9 > height) {
            int i12 = org.telegram.ui.ActionBar.g6.f23330s9;
            org.telegram.ui.ActionBar.c6 c6Var = this.f29709l2;
            int v02 = org.telegram.ui.ActionBar.g6.v0(i12, c6Var);
            Paint paint = this.f27290f3;
            paint.setColor(v02);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getWidth() - AndroidUtilities.dp(56.0f)) / 2.0f, height, (AndroidUtilities.dp(56.0f) + getWidth()) / 2.0f, f9);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            if (this.f27288d3 == null) {
                this.f27288d3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23030b9, c6Var);
            if (this.f27289e3 != v03) {
                Drawable drawable = this.f27288d3;
                this.f27289e3 = v03;
                drawable.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            }
            this.f27288d3.setBounds((int) (rectF.left + AndroidUtilities.dp(4.0f)), (int) (rectF.top + AndroidUtilities.dp(2.66f)), (int) (rectF.left + AndroidUtilities.dp(13.66f)), (int) (rectF.top + AndroidUtilities.dp(12.32f)));
            this.f27288d3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (i10 > 0) {
            canvas2.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f));
            this.f27287b3.b(canvas2, rectF2, 1, e10);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
