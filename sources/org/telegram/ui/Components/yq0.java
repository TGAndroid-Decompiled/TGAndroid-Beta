package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
public final class yq0 extends Drawable {
    public final int f32889a;
    public final ShapeDrawable f32890b;
    public final Rect f32891c;

    public yq0(wq0 wq0Var) {
        this.f32889a = 1;
        this.f32890b = org.telegram.ui.ActionBar.t6.e0(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), 0);
        this.f32891c = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f32889a) {
            case 0:
                Rect bounds = getBounds();
                Rect rect = this.f32891c;
                rect.set(bounds);
                rect.inset(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(8.0f));
                ShapeDrawable shapeDrawable = this.f32890b;
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                return;
            default:
                Rect bounds2 = getBounds();
                Rect rect2 = this.f32891c;
                rect2.set(bounds2);
                rect2.inset(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(8.0f));
                ShapeDrawable shapeDrawable2 = this.f32890b;
                shapeDrawable2.setBounds(rect2);
                shapeDrawable2.draw(canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f32889a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f32889a) {
            case 0:
                this.f32890b.setAlpha(i10);
                return;
            default:
                this.f32890b.setAlpha(i10);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f32889a;
    }

    public yq0(zq0 zq0Var) {
        this.f32889a = 0;
        int L = org.telegram.messenger.i0.L(16.0f);
        int L2 = org.telegram.messenger.i0.L(16.0f);
        int i10 = org.telegram.ui.ActionBar.t6.f20930d6;
        org.telegram.ui.ActionBar.p6 p6Var = zq0Var.f33211c;
        this.f32890b = org.telegram.ui.ActionBar.t6.e0(L, L2, org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), org.telegram.ui.ActionBar.t6.r1(0.04f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var))));
        this.f32891c = new Rect();
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
