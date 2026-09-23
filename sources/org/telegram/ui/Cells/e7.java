package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.yi0;
public final class e7 extends Drawable {
    public final Paint f19964a;
    public final yi0 f19965b;
    public final Drawable f19966c;
    public int d;

    public e7(Context context, org.telegram.ui.Components.w9 w9Var, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, w9Var, z10, R.drawable.large_repost_story, d6Var);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        canvas.save();
        canvas.translate(getBounds().left, getBounds().top);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getBounds().width(), getBounds().height());
        int i10 = this.d;
        Paint paint = this.f19964a;
        paint.setAlpha(i10);
        float min = (this.d / 255.0f) * (Math.min(getBounds().width(), getBounds().height()) / 2.0f);
        canvas.drawRoundRect(rectF, min, min, paint);
        canvas.restore();
        Drawable drawable = this.f19965b;
        if (drawable != null) {
            f7 = 20.0f;
        } else {
            f7 = 15.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(getBounds().centerX() - dp, getBounds().centerY() - dp, getBounds().centerX() + dp, getBounds().centerY() + dp);
        if (drawable == null) {
            drawable = this.f19966c;
        }
        if (drawable != null) {
            drawable.setBounds(rect);
            drawable.setAlpha(this.d);
            drawable.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(56.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(56.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
    }

    public e7(Context context, View view, boolean z10, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        Paint paint = new Paint(1);
        this.f19964a = paint;
        this.d = 255;
        paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), new int[]{org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.hk, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.ik, d6Var)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        if (z10) {
            yi0 yi0Var = new yi0(R.raw.story_repost, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), true, null);
            this.f19965b = yi0Var;
            yi0Var.R(view);
            AndroidUtilities.runOnUIThread(new q0(yi0Var, 1), 450L);
            this.f19966c = null;
            return;
        }
        this.f19965b = null;
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        this.f19966c = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
