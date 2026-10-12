package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class at0 extends Drawable {
    public final int f24474a;
    public final ShapeDrawable f24475b;
    public final Rect f24476c;

    public at0(xs0 xs0Var) {
        this.f24474a = 1;
        this.f24475b = org.telegram.ui.ActionBar.h6.d0(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), 0);
        this.f24476c = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f24474a) {
            case 0:
                Rect bounds = getBounds();
                Rect rect = this.f24476c;
                rect.set(bounds);
                rect.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                ShapeDrawable shapeDrawable = this.f24475b;
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                return;
            default:
                Rect bounds2 = getBounds();
                Rect rect2 = this.f24476c;
                rect2.set(bounds2);
                rect2.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                ShapeDrawable shapeDrawable2 = this.f24475b;
                shapeDrawable2.setBounds(rect2);
                shapeDrawable2.draw(canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f24474a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f24474a) {
            case 0:
                this.f24475b.setAlpha(i10);
                return;
            default:
                this.f24475b.setAlpha(i10);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f24474a;
    }

    public at0(bt0 bt0Var) {
        this.f24474a = 0;
        int dp = AndroidUtilities.dp(16.0f);
        int dp2 = AndroidUtilities.dp(16.0f);
        int i10 = org.telegram.ui.ActionBar.h6.f20560d6;
        org.telegram.ui.ActionBar.c6 c6Var = bt0Var.f24733c;
        this.f24475b = org.telegram.ui.ActionBar.h6.d0(dp, dp2, org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.w0(i10, c6Var), org.telegram.ui.ActionBar.h6.m1(0.04f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, c6Var))));
        this.f24476c = new Rect();
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
