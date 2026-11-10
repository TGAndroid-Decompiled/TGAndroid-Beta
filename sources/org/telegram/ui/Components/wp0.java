package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
public final class wp0 extends Drawable {
    public final int f40043a;
    public final ShapeDrawable f40044b;
    public final Rect f40045c;

    public wp0(up0 up0Var) {
        this.f40043a = 1;
        this.f40044b = org.telegram.ui.ActionBar.m6.e0(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), 0);
        this.f40045c = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f40043a) {
            case 0:
                Rect bounds = getBounds();
                Rect rect = this.f40045c;
                rect.set(bounds);
                rect.inset(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(8.0f));
                ShapeDrawable shapeDrawable = this.f40044b;
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                return;
            default:
                Rect bounds2 = getBounds();
                Rect rect2 = this.f40045c;
                rect2.set(bounds2);
                rect2.inset(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(8.0f));
                ShapeDrawable shapeDrawable2 = this.f40044b;
                shapeDrawable2.setBounds(rect2);
                shapeDrawable2.draw(canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f40043a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i7) {
        switch (this.f40043a) {
            case 0:
                this.f40044b.setAlpha(i7);
                return;
            default:
                this.f40044b.setAlpha(i7);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i7 = this.f40043a;
    }

    public wp0(xp0 xp0Var) {
        this.f40043a = 0;
        int L = org.telegram.messenger.g0.L(16.0f);
        int L2 = org.telegram.messenger.g0.L(16.0f);
        int i7 = org.telegram.ui.ActionBar.m6.f27890d6;
        org.telegram.ui.ActionBar.h6 h6Var = xp0Var.f40387c;
        this.f40044b = org.telegram.ui.ActionBar.m6.e0(L, L2, org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.w0(i7, h6Var), org.telegram.ui.ActionBar.m6.r1(0.04f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, h6Var))));
        this.f40045c = new Rect();
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
