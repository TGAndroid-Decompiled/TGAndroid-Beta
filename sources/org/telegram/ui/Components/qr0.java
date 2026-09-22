package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class qr0 extends Drawable {
    public final int f27429a;
    public final ShapeDrawable f27430b;
    public final Rect f27431c;

    public qr0(nr0 nr0Var) {
        this.f27429a = 1;
        this.f27430b = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), 0);
        this.f27431c = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f27429a) {
            case 0:
                Rect bounds = getBounds();
                Rect rect = this.f27431c;
                rect.set(bounds);
                rect.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                ShapeDrawable shapeDrawable = this.f27430b;
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                return;
            default:
                Rect bounds2 = getBounds();
                Rect rect2 = this.f27431c;
                rect2.set(bounds2);
                rect2.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                ShapeDrawable shapeDrawable2 = this.f27430b;
                shapeDrawable2.setBounds(rect2);
                shapeDrawable2.draw(canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f27429a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f27429a) {
            case 0:
                this.f27430b.setAlpha(i10);
                return;
            default:
                this.f27430b.setAlpha(i10);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f27429a;
    }

    public qr0(rr0 rr0Var) {
        this.f27429a = 0;
        int dp = AndroidUtilities.dp(16.0f);
        int dp2 = AndroidUtilities.dp(16.0f);
        int i10 = org.telegram.ui.ActionBar.i6.f18834d6;
        org.telegram.ui.ActionBar.e6 e6Var = rr0Var.f27667c;
        this.f27430b = org.telegram.ui.ActionBar.i6.c0(dp, dp2, org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.v0(i10, e6Var), org.telegram.ui.ActionBar.i6.l1(0.04f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var))));
        this.f27431c = new Rect();
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
