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
import org.telegram.ui.Components.mi0;
public final class d7 extends Drawable {
    public final Paint f24226a;
    public final mi0 f24227b;
    public final Drawable f24228c;
    public int d;

    public d7(Context context, org.telegram.ui.Components.o9 o9Var, boolean z10, org.telegram.ui.ActionBar.b6 b6Var) {
        this(context, o9Var, z10, R.drawable.large_repost_story, b6Var);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        canvas.save();
        canvas.translate(getBounds().left, getBounds().top);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getBounds().width(), getBounds().height());
        int i9 = this.d;
        Paint paint = this.f24226a;
        paint.setAlpha(i9);
        float min = (this.d / 255.0f) * (Math.min(getBounds().width(), getBounds().height()) / 2.0f);
        canvas.drawRoundRect(rectF, min, min, paint);
        canvas.restore();
        Drawable drawable = this.f24227b;
        if (drawable != null) {
            f10 = 20.0f;
        } else {
            f10 = 15.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(getBounds().centerX() - dp, getBounds().centerY() - dp, getBounds().centerX() + dp, getBounds().centerY() + dp);
        if (drawable == null) {
            drawable = this.f24228c;
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
    public final void setAlpha(int i9) {
        this.d = i9;
    }

    public d7(Context context, View view, boolean z10, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        Paint paint = new Paint(1);
        this.f24226a = paint;
        this.d = 255;
        paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), new int[]{org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.hk, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ik, b6Var)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        if (z10) {
            mi0 mi0Var = new mi0(R.raw.story_repost, "story_repost", AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), true, null);
            this.f24227b = mi0Var;
            mi0Var.f30863r0 = view;
            AndroidUtilities.runOnUIThread(new q0(mi0Var, 1), 450L);
            this.f24228c = null;
            return;
        }
        this.f24227b = null;
        Drawable mutate = context.getResources().getDrawable(i9).mutate();
        this.f24228c = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
