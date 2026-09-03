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
import org.telegram.ui.Components.gj0;
public final class c7 extends Drawable {
    public final Paint f20880a;
    public final gj0 f20881b;
    public final Drawable f20882c;
    public int d;

    public c7(Context context, org.telegram.ui.Components.p9 p9Var, boolean z4, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, p9Var, z4, R.drawable.large_repost_story, f6Var);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        canvas.save();
        canvas.translate(getBounds().left, getBounds().top);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getBounds().width(), getBounds().height());
        int i10 = this.d;
        Paint paint = this.f20880a;
        paint.setAlpha(i10);
        float min = (this.d / 255.0f) * (Math.min(getBounds().width(), getBounds().height()) / 2.0f);
        canvas.drawRoundRect(rectF, min, min, paint);
        canvas.restore();
        Drawable drawable = this.f20881b;
        if (drawable != null) {
            f10 = 20.0f;
        } else {
            f10 = 15.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(getBounds().centerX() - dp, getBounds().centerY() - dp, getBounds().centerX() + dp, getBounds().centerY() + dp);
        if (drawable == null) {
            drawable = this.f20882c;
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

    public c7(Context context, View view, boolean z4, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        Paint paint = new Paint(1);
        this.f20880a = paint;
        this.d = 255;
        paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), new int[]{org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.hk, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ik, f6Var)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        if (z4) {
            gj0 gj0Var = new gj0(R.raw.story_repost, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), true, null);
            this.f20881b = gj0Var;
            gj0Var.f25176s0 = view;
            AndroidUtilities.runOnUIThread(new q0(gj0Var, 1), 450L);
            this.f20882c = null;
            return;
        }
        this.f20881b = null;
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        this.f20882c = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
