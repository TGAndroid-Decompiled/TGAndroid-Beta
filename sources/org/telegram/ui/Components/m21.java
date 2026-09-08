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
public final class m21 extends d61 {
    public final org.telegram.ui.l20 f28384f3;
    public final e6 f28385g3;
    public Drawable f28386h3;
    public int f28387i3;
    public final Paint j3;

    public m21(Context context, int i10, j21 j21Var, b21 b21Var, b21 b21Var2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, 0, false, j21Var, b21Var, b21Var2, f6Var);
        this.f28384f3 = new org.telegram.ui.l20();
        this.f28385g3 = new e6(this, 320L, pr.h);
        this.j3 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e7 = this.f28385g3.e(canScrollVertically(-1));
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
            if (childAt instanceof v21) {
                v21 v21Var = (v21) childAt;
                if (v21Var.f31098y) {
                    if (height > v21Var.getY()) {
                        height = v21Var.getY();
                        RecyclerView.R(v21Var);
                    }
                    if (f7 < v21Var.getY() + v21Var.getHeight()) {
                        f7 = v21Var.getY() + v21Var.getHeight();
                        RecyclerView.R(v21Var);
                    }
                }
            }
        }
        if (f7 > height) {
            int i12 = org.telegram.ui.ActionBar.j6.f20965s9;
            org.telegram.ui.ActionBar.f6 f6Var = this.f28251p2;
            int v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
            Paint paint = this.j3;
            paint.setColor(v02);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getWidth() - AndroidUtilities.dp(56.0f)) / 2.0f, height, (AndroidUtilities.dp(56.0f) + getWidth()) / 2.0f, f7);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            if (this.f28386h3 == null) {
                this.f28386h3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20656b9, f6Var);
            if (this.f28387i3 != v03) {
                Drawable drawable = this.f28386h3;
                this.f28387i3 = v03;
                drawable.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            }
            this.f28386h3.setBounds((int) (rectF.left + AndroidUtilities.dp(4.0f)), (int) (rectF.top + AndroidUtilities.dp(2.66f)), (int) (rectF.left + AndroidUtilities.dp(13.66f)), (int) (rectF.top + AndroidUtilities.dp(12.32f)));
            this.f28386h3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (i10 > 0) {
            canvas2.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f));
            this.f28384f3.b(canvas2, rectF2, 1, e7);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
