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
import org.telegram.ui.Components.ah0;
public final class c7 extends Drawable {
    public final Paint f28999a;
    public final ah0 f29000b;
    public final Drawable f29001c;
    public final org.telegram.ui.ActionBar.g6 d;
    public int f29002e;
    public int f29003f;
    public int f29004g;

    public c7(Context context, View view, boolean z9, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        Paint paint = new Paint(1);
        this.f28999a = paint;
        this.f29004g = 255;
        this.d = g6Var;
        this.f29002e = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Vk, g6Var);
        this.f29003f = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Wk, g6Var);
        paint.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), new int[]{this.f29002e, this.f29003f}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        if (z9) {
            ah0 ah0Var = new ah0(2131624237, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f), true, null);
            this.f29000b = ah0Var;
            ah0Var.R(view);
            org.telegram.messenger.g0.i3(new o0(ah0Var, 1), 450L);
            this.f29001c = null;
            return;
        }
        this.f29000b = null;
        Drawable h = jg.g.h(context, i7);
        this.f29001c = h;
        h.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void draw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.c7.draw(android.graphics.Canvas):void");
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
        this.f29004g = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
