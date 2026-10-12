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
import org.telegram.ui.Components.yj0;
public final class f7 extends Drawable {
    public final Paint f21176a;
    public final yj0 f21177b;
    public final Drawable f21178c;
    public int d;

    public f7(Context context, org.telegram.ui.Components.z9 z9Var, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, z9Var, z10, R.drawable.large_repost_story, c6Var);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        canvas.save();
        canvas.translate(getBounds().left, getBounds().top);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getBounds().width(), getBounds().height());
        int i10 = this.d;
        Paint paint = this.f21176a;
        paint.setAlpha(i10);
        float min = (this.d / 255.0f) * (Math.min(getBounds().width(), getBounds().height()) / 2.0f);
        canvas.drawRoundRect(rectF, min, min, paint);
        canvas.restore();
        Drawable drawable = this.f21177b;
        if (drawable != null) {
            f7 = 20.0f;
        } else {
            f7 = 15.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(getBounds().centerX() - dp, getBounds().centerY() - dp, getBounds().centerX() + dp, getBounds().centerY() + dp);
        if (drawable == null) {
            drawable = this.f21178c;
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

    public f7(Context context, View view, boolean z10, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        Paint paint = new Paint(1);
        this.f21176a = paint;
        this.d = 255;
        paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), new int[]{org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.hk, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.ik, c6Var)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        if (z10) {
            yj0 yj0Var = new yj0(R.raw.story_repost, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), true, null);
            this.f21177b = yj0Var;
            yj0Var.R(view);
            AndroidUtilities.runOnUIThread(new s0(yj0Var, 1), 450L);
            this.f21178c = null;
            return;
        }
        this.f21177b = null;
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        this.f21178c = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
