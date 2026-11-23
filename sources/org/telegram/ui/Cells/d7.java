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
import org.telegram.ui.Components.oh0;
public final class d7 extends Drawable {
    public final Paint f30577a;
    public final oh0 f30578b;
    public final Drawable f30579c;
    public final org.telegram.ui.ActionBar.h6 d;
    public int f30580e;
    public int f30581f;
    public int f30582g;

    public d7(Context context, View view, boolean z10, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        Paint paint = new Paint(1);
        this.f30577a = paint;
        this.f30582g = 255;
        this.d = h6Var;
        this.f30580e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Yk, h6Var);
        this.f30581f = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Zk, h6Var);
        paint.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), new int[]{this.f30580e, this.f30581f}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        if (z10) {
            oh0 oh0Var = new oh0(2131624238, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f), true, null);
            this.f30578b = oh0Var;
            oh0Var.R(view);
            org.telegram.messenger.g0.h3(new p0(oh0Var, 1), 450L);
            this.f30579c = null;
            return;
        }
        this.f30578b = null;
        Drawable g10 = i5.c.g(context, i7);
        this.f30579c = g10;
        g10.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void draw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.d7.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(56.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(56.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f30582g = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
