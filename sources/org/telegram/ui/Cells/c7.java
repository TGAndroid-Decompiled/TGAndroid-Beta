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
import org.telegram.ui.Components.zg0;
public final class c7 extends Drawable {
    public final Paint f28992a;
    public final zg0 f28993b;
    public final Drawable f28994c;
    public final org.telegram.ui.ActionBar.f6 d;
    public int f28995e;
    public int f28996f;
    public int f28997g;

    public c7(Context context, View view, boolean z9, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        Paint paint = new Paint(1);
        this.f28992a = paint;
        this.f28997g = 255;
        this.d = f6Var;
        this.f28995e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Vk, f6Var);
        this.f28996f = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wk, f6Var);
        paint.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), new int[]{this.f28995e, this.f28996f}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        if (z9) {
            zg0 zg0Var = new zg0(2131624237, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f), true, null);
            this.f28993b = zg0Var;
            zg0Var.R(view);
            org.telegram.messenger.g0.i3(new o0(zg0Var, 1), 450L);
            this.f28994c = null;
            return;
        }
        this.f28993b = null;
        Drawable h = jg.g.h(context, i7);
        this.f28994c = h;
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
        this.f28997g = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
