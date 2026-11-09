package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
public final class xp0 extends Drawable {
    public final int f40455a;
    public final ShapeDrawable f40456b;
    public final Rect f40457c;

    public xp0(vp0 vp0Var) {
        this.f40455a = 1;
        this.f40456b = org.telegram.ui.ActionBar.l6.e0(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), 0);
        this.f40457c = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f40455a) {
            case 0:
                Rect bounds = getBounds();
                Rect rect = this.f40457c;
                rect.set(bounds);
                rect.inset(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(8.0f));
                ShapeDrawable shapeDrawable = this.f40456b;
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                return;
            default:
                Rect bounds2 = getBounds();
                Rect rect2 = this.f40457c;
                rect2.set(bounds2);
                rect2.inset(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(8.0f));
                ShapeDrawable shapeDrawable2 = this.f40456b;
                shapeDrawable2.setBounds(rect2);
                shapeDrawable2.draw(canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f40455a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i7) {
        switch (this.f40455a) {
            case 0:
                this.f40456b.setAlpha(i7);
                return;
            default:
                this.f40456b.setAlpha(i7);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i7 = this.f40455a;
    }

    public xp0(yp0 yp0Var) {
        this.f40455a = 0;
        int L = org.telegram.messenger.g0.L(16.0f);
        int L2 = org.telegram.messenger.g0.L(16.0f);
        int i7 = org.telegram.ui.ActionBar.l6.f27865d6;
        org.telegram.ui.ActionBar.g6 g6Var = yp0Var.f40792c;
        this.f40456b = org.telegram.ui.ActionBar.l6.e0(L, L2, org.telegram.ui.ActionBar.l6.w(org.telegram.ui.ActionBar.l6.w0(i7, g6Var), org.telegram.ui.ActionBar.l6.r1(0.04f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.G6, g6Var))));
        this.f40457c = new Rect();
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
