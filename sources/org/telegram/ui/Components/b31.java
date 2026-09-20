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
public final class b31 extends s61 {
    public final org.telegram.ui.l20 f22868f3;
    public final d6 f22869g3;
    public Drawable f22870h3;
    public int f22871i3;
    public final Paint j3;

    public b31(Context context, int i10, y21 y21Var, q21 q21Var, q21 q21Var2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, 0, false, y21Var, q21Var, q21Var2, f6Var);
        this.f22868f3 = new org.telegram.ui.l20();
        this.f22869g3 = new d6(this, 320L, qr.h);
        this.j3 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.f22869g3.e(canScrollVertically(-1));
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
            if (childAt instanceof k31) {
                k31 k31Var = (k31) childAt;
                if (k31Var.f25654y) {
                    if (height > k31Var.getY()) {
                        height = k31Var.getY();
                        RecyclerView.S(k31Var);
                    }
                    if (f7 < k31Var.getY() + k31Var.getHeight()) {
                        f7 = k31Var.getY() + k31Var.getHeight();
                        RecyclerView.S(k31Var);
                    }
                }
            }
        }
        if (f7 > height) {
            int i12 = org.telegram.ui.ActionBar.j6.f19373s9;
            org.telegram.ui.ActionBar.f6 f6Var = this.f29207p2;
            int v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
            Paint paint = this.j3;
            paint.setColor(v02);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getWidth() - AndroidUtilities.dp(56.0f)) / 2.0f, height, (AndroidUtilities.dp(56.0f) + getWidth()) / 2.0f, f7);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            if (this.f22870h3 == null) {
                this.f22870h3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19060b9, f6Var);
            if (this.f22871i3 != v03) {
                Drawable drawable = this.f22870h3;
                this.f22871i3 = v03;
                drawable.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            }
            this.f22870h3.setBounds((int) (rectF.left + AndroidUtilities.dp(4.0f)), (int) (rectF.top + AndroidUtilities.dp(2.66f)), (int) (rectF.left + AndroidUtilities.dp(13.66f)), (int) (rectF.top + AndroidUtilities.dp(12.32f)));
            this.f22870h3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (i10 > 0) {
            canvas2.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f));
            this.f22868f3.b(canvas2, rectF2, 1, e);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
