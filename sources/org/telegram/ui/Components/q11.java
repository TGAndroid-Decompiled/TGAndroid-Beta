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
public final class q11 extends i51 {
    public final org.telegram.ui.s10 f31810b3;
    public final y5 f31811c3;
    public Drawable f31812d3;
    public int f31813e3;
    public final Paint f31814f3;

    public q11(Context context, int i9, n11 n11Var, i11 i11Var, i11 i11Var2, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, i9, 0, false, n11Var, i11Var, i11Var2, b6Var);
        this.f31810b3 = new org.telegram.ui.s10();
        this.f31811c3 = new y5(this, 320L, gr.h);
        this.f31814f3 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e10 = this.f31811c3.e(canScrollVertically(-1));
        int i9 = (e10 > 0.0f ? 1 : (e10 == 0.0f ? 0 : -1));
        if (i9 > 0) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        float height = getHeight();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof a21) {
                a21 a21Var = (a21) childAt;
                if (a21Var.f26644y) {
                    if (height > a21Var.getY()) {
                        height = a21Var.getY();
                        RecyclerView.R(a21Var);
                    }
                    if (f10 < a21Var.getY() + a21Var.getHeight()) {
                        f10 = a21Var.getY() + a21Var.getHeight();
                        RecyclerView.R(a21Var);
                    }
                }
            }
        }
        if (f10 > height) {
            int i11 = org.telegram.ui.ActionBar.f6.f23270s9;
            org.telegram.ui.ActionBar.b6 b6Var = this.f34260l2;
            int v02 = org.telegram.ui.ActionBar.f6.v0(i11, b6Var);
            Paint paint = this.f31814f3;
            paint.setColor(v02);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getWidth() - AndroidUtilities.dp(56.0f)) / 2.0f, height, (AndroidUtilities.dp(56.0f) + getWidth()) / 2.0f, f10);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            if (this.f31812d3 == null) {
                this.f31812d3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f22968b9, b6Var);
            if (this.f31813e3 != v03) {
                Drawable drawable = this.f31812d3;
                this.f31813e3 = v03;
                drawable.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            }
            this.f31812d3.setBounds((int) (rectF.left + AndroidUtilities.dp(4.0f)), (int) (rectF.top + AndroidUtilities.dp(2.66f)), (int) (rectF.left + AndroidUtilities.dp(13.66f)), (int) (rectF.top + AndroidUtilities.dp(12.32f)));
            this.f31812d3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (i9 > 0) {
            canvas2.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f));
            this.f31810b3.b(canvas2, rectF2, 1, e10);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
