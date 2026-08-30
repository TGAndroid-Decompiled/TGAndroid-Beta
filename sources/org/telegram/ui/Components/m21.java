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
public final class m21 extends g61 {
    public final org.telegram.ui.g20 c3;
    public final z5 f26926d3;
    public Drawable f26927e3;
    public int f26928f3;
    public final Paint f26929g3;

    public m21(Context context, int i10, j21 j21Var, e21 e21Var, e21 e21Var2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, 0, false, j21Var, e21Var, e21Var2, f6Var);
        this.c3 = new org.telegram.ui.g20();
        this.f26926d3 = new z5(this, 320L, nr.h);
        this.f26929g3 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.f26926d3.e(canScrollVertically(-1));
        int i10 = (e > 0.0f ? 1 : (e == 0.0f ? 0 : -1));
        if (i10 > 0) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        float height = getHeight();
        float f10 = 0.0f;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof v21) {
                v21 v21Var = (v21) childAt;
                if (v21Var.f29349y) {
                    if (height > v21Var.getY()) {
                        height = v21Var.getY();
                        RecyclerView.R(v21Var);
                    }
                    if (f10 < v21Var.getY() + v21Var.getHeight()) {
                        f10 = v21Var.getY() + v21Var.getHeight();
                        RecyclerView.R(v21Var);
                    }
                }
            }
        }
        if (f10 > height) {
            int i12 = org.telegram.ui.ActionBar.j6.s9;
            org.telegram.ui.ActionBar.f6 f6Var = this.f28750m2;
            int v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
            Paint paint = this.f26929g3;
            paint.setColor(v02);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getWidth() - AndroidUtilities.dp(56.0f)) / 2.0f, height, (AndroidUtilities.dp(56.0f) + getWidth()) / 2.0f, f10);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            if (this.f26927e3 == null) {
                this.f26927e3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19873b9, f6Var);
            if (this.f26928f3 != v03) {
                Drawable drawable = this.f26927e3;
                this.f26928f3 = v03;
                drawable.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            }
            this.f26927e3.setBounds((int) (rectF.left + AndroidUtilities.dp(4.0f)), (int) (rectF.top + AndroidUtilities.dp(2.66f)), (int) (rectF.left + AndroidUtilities.dp(13.66f)), (int) (rectF.top + AndroidUtilities.dp(12.32f)));
            this.f26927e3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (i10 > 0) {
            canvas2.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f));
            this.c3.b(canvas2, rectF2, 1, e);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
