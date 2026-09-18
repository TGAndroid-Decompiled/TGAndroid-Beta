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
public final class c31 extends t61 {
    public final org.telegram.ui.l20 f23189f3;
    public final e6 f23190g3;
    public Drawable f23191h3;
    public int f23192i3;
    public final Paint j3;

    public c31(Context context, int i10, z21 z21Var, r21 r21Var, r21 r21Var2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, 0, false, z21Var, r21Var, r21Var2, e6Var);
        this.f23189f3 = new org.telegram.ui.l20();
        this.f23190g3 = new e6(this, 320L, qr.h);
        this.j3 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.f23190g3.e(canScrollVertically(-1));
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
            if (childAt instanceof l31) {
                l31 l31Var = (l31) childAt;
                if (l31Var.f26013y) {
                    if (height > l31Var.getY()) {
                        height = l31Var.getY();
                        RecyclerView.S(l31Var);
                    }
                    if (f7 < l31Var.getY() + l31Var.getHeight()) {
                        f7 = l31Var.getY() + l31Var.getHeight();
                        RecyclerView.S(l31Var);
                    }
                }
            }
        }
        if (f7 > height) {
            int i12 = org.telegram.ui.ActionBar.j6.f19341s9;
            org.telegram.ui.ActionBar.e6 e6Var = this.f30090p2;
            int v02 = org.telegram.ui.ActionBar.j6.v0(i12, e6Var);
            Paint paint = this.j3;
            paint.setColor(v02);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getWidth() - AndroidUtilities.dp(56.0f)) / 2.0f, height, (AndroidUtilities.dp(56.0f) + getWidth()) / 2.0f, f7);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            if (this.f23191h3 == null) {
                this.f23191h3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19028b9, e6Var);
            if (this.f23192i3 != v03) {
                Drawable drawable = this.f23191h3;
                this.f23192i3 = v03;
                drawable.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            }
            this.f23191h3.setBounds((int) (rectF.left + AndroidUtilities.dp(4.0f)), (int) (rectF.top + AndroidUtilities.dp(2.66f)), (int) (rectF.left + AndroidUtilities.dp(13.66f)), (int) (rectF.top + AndroidUtilities.dp(12.32f)));
            this.f23191h3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (i10 > 0) {
            canvas2.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f));
            this.f23189f3.b(canvas2, rectF2, 1, e);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
