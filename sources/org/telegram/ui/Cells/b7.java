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
    public final Paint f28997a;
    public final ch0 f28998b;
    public final Drawable f28999c;
    public final org.telegram.ui.ActionBar.e6 d;
    public int f29000e;
    public int f29001f;
    public int f29002g;

    public b7(Context context, View view, boolean z10, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        Paint paint = new Paint(1);
        this.f28997a = paint;
        this.f29002g = 255;
        this.d = e6Var;
        this.f29000e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Vk, e6Var);
        this.f29001f = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wk, e6Var);
        paint.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), new int[]{this.f29000e, this.f29001f}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        if (z10) {
            ch0 ch0Var = new ch0(2131624237, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f), true, null);
            this.f28998b = ch0Var;
            ch0Var.R(view);
            org.telegram.messenger.g0.i3(new o0(ch0Var, 1), 450L);
            this.f28999c = null;
            return;
        }
        this.f28998b = null;
        Drawable g7 = k2.p1.g(context, i3);
        this.f28999c = g7;
        g7.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
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
    public final void setAlpha(int i3) {
        this.f29002g = i3;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
