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
import org.telegram.ui.Components.xi0;
public final class b7 extends Drawable {
    public final Paint f24121a;
    public final xi0 f24122b;
    public final Drawable f24123c;
    public int d;

    public b7(Context context, org.telegram.ui.Components.t9 t9Var, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, t9Var, z10, R.drawable.large_repost_story, c6Var);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f9;
        canvas.save();
        canvas.translate(getBounds().left, getBounds().top);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getBounds().width(), getBounds().height());
        int i10 = this.d;
        Paint paint = this.f24121a;
        paint.setAlpha(i10);
        float min = (this.d / 255.0f) * (Math.min(getBounds().width(), getBounds().height()) / 2.0f);
        canvas.drawRoundRect(rectF, min, min, paint);
        canvas.restore();
        Drawable drawable = this.f24122b;
        if (drawable != null) {
            f9 = 20.0f;
        } else {
            f9 = 15.0f;
        }
        int dp = AndroidUtilities.dp(f9);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(getBounds().centerX() - dp, getBounds().centerY() - dp, getBounds().centerX() + dp, getBounds().centerY() + dp);
        if (drawable == null) {
            drawable = this.f24123c;
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

    public b7(Context context, View view, boolean z10, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        Paint paint = new Paint(1);
        this.f24121a = paint;
        this.d = 255;
        paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), new int[]{org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.hk, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ik, c6Var)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        if (z10) {
            xi0 xi0Var = new xi0(R.raw.story_repost, "story_repost", AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), true, null);
            this.f24122b = xi0Var;
            xi0Var.f34753r0 = view;
            AndroidUtilities.runOnUIThread(new q0(xi0Var, 1), 450L);
            this.f24123c = null;
            return;
        }
        this.f24122b = null;
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        this.f24123c = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
