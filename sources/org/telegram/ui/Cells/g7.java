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
import org.telegram.ui.Components.bi0;
public final class g7 extends Drawable {
    public final Paint f21927a;
    public final bi0 f21928b;
    public final Drawable f21929c;
    public final org.telegram.ui.ActionBar.p6 d;
    public int e;
    public int f21930f;
    public int f21931g;

    public g7(Context context, View view, boolean z10, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        Paint paint = new Paint(1);
        this.f21927a = paint;
        this.f21931g = 255;
        this.d = p6Var;
        this.e = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Vk, p6Var);
        this.f21930f = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wk, p6Var);
        paint.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(56.0f), org.telegram.messenger.i0.L(56.0f), new int[]{this.e, this.f21930f}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        if (z10) {
            bi0 bi0Var = new bi0(2131624235, org.telegram.messenger.i0.L(42.0f), org.telegram.messenger.i0.L(42.0f), true, null);
            this.f21928b = bi0Var;
            bi0Var.R(view);
            org.telegram.messenger.i0.h3(new o0(bi0Var, 1), 450L);
            this.f21929c = null;
            return;
        }
        this.f21928b = null;
        Drawable f7 = i0.a.f(context, i10);
        this.f21929c = f7;
        f7.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void draw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.g7.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(56.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(56.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f21931g = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
