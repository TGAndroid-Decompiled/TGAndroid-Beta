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
import org.telegram.ui.Components.oi0;

public final class a7 extends Drawable {

    public final Paint f24066a;

    public final oi0 f24067b;

    public final Drawable f24068c;
    public int d;

    public a7(Context context, org.telegram.ui.Components.n9 n9Var, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, n9Var, z10, R.drawable.large_repost_story, c6Var);
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(getBounds().left, getBounds().top);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getBounds().width(), getBounds().height());
        int i10 = this.d;
        Paint paint = this.f24066a;
        paint.setAlpha(i10);
        float fMin = (this.d / 255.0f) * (Math.min(getBounds().width(), getBounds().height()) / 2.0f);
        canvas.drawRoundRect(rectF, fMin, fMin, paint);
        canvas.restore();
        Drawable drawable = this.f24067b;
        int iDp = AndroidUtilities.dp(drawable != null ? 20.0f : 15.0f);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(getBounds().centerX() - iDp, getBounds().centerY() - iDp, getBounds().centerX() + iDp, getBounds().centerY() + iDp);
        if (drawable == null) {
            drawable = this.f24068c;
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

    public a7(Context context, View view, boolean z10, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        Paint paint = new Paint(1);
        this.f24066a = paint;
        this.d = 255;
        paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), new int[]{org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.hk, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ik, c6Var)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        if (!z10) {
            this.f24067b = null;
            Drawable drawableMutate = context.getResources().getDrawable(i10).mutate();
            this.f24068c = drawableMutate;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            return;
        }
        oi0 oi0Var = new oi0(R.raw.story_repost, "story_repost", AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), true, null);
        this.f24067b = oi0Var;
        oi0Var.f31328r0 = view;
        AndroidUtilities.runOnUIThread(new q0(oi0Var, 1), 450L);
        this.f24068c = null;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
