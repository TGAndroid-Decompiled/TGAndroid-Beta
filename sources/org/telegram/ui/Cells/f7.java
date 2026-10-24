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
import org.telegram.ui.Components.xj0;
public final class f7 extends Drawable {
    public final Paint f22376a;
    public final xj0 f22377b;
    public final Drawable f22378c;
    public final org.telegram.ui.ActionBar.g6 d;
    public int e;
    public int f22379f;
    public int f22380g;

    public f7(Context context, org.telegram.ui.Components.u9 u9Var, boolean z10, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, u9Var, z10, R.drawable.large_repost_story, g6Var);
    }

    @Override
    public final void draw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f7.draw(android.graphics.Canvas):void");
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
        this.f22380g = i10;
    }

    public f7(Context context, View view, boolean z10, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        Paint paint = new Paint(1);
        this.f22376a = paint;
        this.f22380g = 255;
        this.d = g6Var;
        this.e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.hk, g6Var);
        this.f22379f = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ik, g6Var);
        paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), new int[]{this.e, this.f22379f}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        if (z10) {
            xj0 xj0Var = new xj0(R.raw.story_repost, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), true, null);
            this.f22377b = xj0Var;
            xj0Var.R(view);
            AndroidUtilities.runOnUIThread(new q0(xj0Var, 1), 450L);
            this.f22378c = null;
            return;
        }
        this.f22377b = null;
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        this.f22378c = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
