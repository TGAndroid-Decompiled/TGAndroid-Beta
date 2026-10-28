package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.yj0;
public final class j7 extends Drawable {
    public final Paint f24294a;
    public final yj0 f24295b;
    public final Drawable f24296c;
    public final org.telegram.ui.ActionBar.u6 d;
    public int e;
    public int f24297f;
    public int f24298g;

    public j7(Context context, org.telegram.ui.Components.y9 y9Var, boolean z10, org.telegram.ui.ActionBar.u6 u6Var) {
        this(context, y9Var, z10, R.drawable.large_repost_story, u6Var);
    }

    @Override
    public final void draw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.j7.draw(android.graphics.Canvas):void");
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
        this.f24298g = i10;
    }

    public j7(Context context, View view, boolean z10, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        Paint paint = new Paint(1);
        this.f24294a = paint;
        this.f24298g = 255;
        this.d = u6Var;
        this.e = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.hk, u6Var);
        this.f24297f = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.ik, u6Var);
        paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), new int[]{this.e, this.f24297f}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        if (z10) {
            yj0 yj0Var = new yj0(R.raw.story_repost, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), true, null);
            this.f24295b = yj0Var;
            yj0Var.R(view);
            AndroidUtilities.runOnUIThread(new q0(yj0Var, 1), 450L);
            this.f24296c = null;
            return;
        }
        this.f24295b = null;
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        this.f24296c = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
