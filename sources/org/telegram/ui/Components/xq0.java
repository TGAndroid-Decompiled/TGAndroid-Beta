package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
public final class xq0 extends Drawable {
    public final int f32533a;
    public final ShapeDrawable f32534b;
    public final Rect f32535c;

    public xq0(vq0 vq0Var) {
        this.f32533a = 1;
        this.f32534b = org.telegram.ui.ActionBar.t6.e0(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), 0);
        this.f32535c = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f32533a) {
            case 0:
                Rect bounds = getBounds();
                Rect rect = this.f32535c;
                rect.set(bounds);
                rect.inset(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(8.0f));
                ShapeDrawable shapeDrawable = this.f32534b;
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                return;
            default:
                Rect bounds2 = getBounds();
                Rect rect2 = this.f32535c;
                rect2.set(bounds2);
                rect2.inset(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(8.0f));
                ShapeDrawable shapeDrawable2 = this.f32534b;
                shapeDrawable2.setBounds(rect2);
                shapeDrawable2.draw(canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f32533a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f32533a) {
            case 0:
                this.f32534b.setAlpha(i10);
                return;
            default:
                this.f32534b.setAlpha(i10);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f32533a;
    }

    public xq0(yq0 yq0Var) {
        this.f32533a = 0;
        int L = org.telegram.messenger.i0.L(16.0f);
        int L2 = org.telegram.messenger.i0.L(16.0f);
        int i10 = org.telegram.ui.ActionBar.t6.f20929d6;
        org.telegram.ui.ActionBar.p6 p6Var = yq0Var.f32776c;
        this.f32534b = org.telegram.ui.ActionBar.t6.e0(L, L2, org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), org.telegram.ui.ActionBar.t6.r1(0.04f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var))));
        this.f32535c = new Rect();
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
