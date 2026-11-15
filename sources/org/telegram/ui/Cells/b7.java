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
import org.telegram.ui.Components.ch0;
public final class b7 extends Drawable {
    public final Paint f30050a;
    public final ch0 f30051b;
    public final Drawable f30052c;
    public final org.telegram.ui.ActionBar.e6 d;
    public int f30053e;
    public int f30054f;
    public int f30055g;

    public b7(Context context, View view, boolean z10, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        Paint paint = new Paint(1);
        this.f30050a = paint;
        this.f30055g = 255;
        this.d = e6Var;
        this.f30053e = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Yk, e6Var);
        this.f30054f = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Zk, e6Var);
        paint.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), new int[]{this.f30053e, this.f30054f}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        if (z10) {
            ch0 ch0Var = new ch0(2131624238, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f), true, null);
            this.f30051b = ch0Var;
            ch0Var.R(view);
            org.telegram.messenger.g0.i3(new o0(ch0Var, 1), 450L);
            this.f30052c = null;
            return;
        }
        this.f30051b = null;
        Drawable g10 = i5.c.g(context, i7);
        this.f30052c = g10;
        g10.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void draw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.b7.draw(android.graphics.Canvas):void");
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
        this.f30055g = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
