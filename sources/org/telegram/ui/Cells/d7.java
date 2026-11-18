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
import org.telegram.ui.Components.mh0;
public final class d7 extends Drawable {
    public final Paint f30546a;
    public final mh0 f30547b;
    public final Drawable f30548c;
    public final org.telegram.ui.ActionBar.i6 d;
    public int f30549e;
    public int f30550f;
    public int f30551g;

    public d7(Context context, View view, boolean z10, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        Paint paint = new Paint(1);
        this.f30546a = paint;
        this.f30551g = 255;
        this.d = i6Var;
        this.f30549e = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Yk, i6Var);
        this.f30550f = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Zk, i6Var);
        paint.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), new int[]{this.f30549e, this.f30550f}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        if (z10) {
            mh0 mh0Var = new mh0(2131624238, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f), true, null);
            this.f30547b = mh0Var;
            mh0Var.R(view);
            org.telegram.messenger.g0.h3(new p0(mh0Var, 1), 450L);
            this.f30548c = null;
            return;
        }
        this.f30547b = null;
        Drawable g10 = i5.c.g(context, i7);
        this.f30548c = g10;
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
        this.f30551g = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
