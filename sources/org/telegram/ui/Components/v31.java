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
public final class v31 extends s71 {
    public final org.telegram.ui.y10 f33551n3;
    public final h6 f33552o3;
    public Drawable f33553p3;
    public int f33554q3;
    public final Paint f33555r3;

    public v31(Context context, int i10, s31 s31Var, n31 n31Var, n31 n31Var2, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, 0, false, s31Var, n31Var, n31Var2, u6Var);
        this.f33551n3 = new org.telegram.ui.y10();
        this.f33552o3 = new h6(this, 320L, ds.h);
        this.f33555r3 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.f33552o3.e(canScrollVertically(-1));
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
            if (childAt instanceof e41) {
                e41 e41Var = (e41) childAt;
                if (e41Var.E) {
                    if (height > e41Var.getY()) {
                        height = e41Var.getY();
                        RecyclerView.R(e41Var);
                    }
                    if (f7 < e41Var.getY() + e41Var.getHeight()) {
                        f7 = e41Var.getY() + e41Var.getHeight();
                        RecyclerView.R(e41Var);
                    }
                }
            }
        }
        if (f7 > height) {
            int i12 = org.telegram.ui.ActionBar.y6.f23638s9;
            org.telegram.ui.ActionBar.u6 u6Var = this.f30988n2;
            int w02 = org.telegram.ui.ActionBar.y6.w0(i12, u6Var);
            Paint paint = this.f33555r3;
            paint.setColor(w02);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getWidth() - AndroidUtilities.dp(56.0f)) / 2.0f, height, (AndroidUtilities.dp(56.0f) + getWidth()) / 2.0f, f7);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            if (this.f33553p3 == null) {
                this.f33553p3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23321b9, u6Var);
            if (this.f33554q3 != w03) {
                Drawable drawable = this.f33553p3;
                this.f33554q3 = w03;
                drawable.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            }
            this.f33553p3.setBounds((int) (rectF.left + AndroidUtilities.dp(4.0f)), (int) (rectF.top + AndroidUtilities.dp(2.66f)), (int) (rectF.left + AndroidUtilities.dp(13.66f)), (int) (rectF.top + AndroidUtilities.dp(12.32f)));
            this.f33553p3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (i10 > 0) {
            canvas2.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f));
            this.f33551n3.b(canvas2, rectF2, 1, e);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
