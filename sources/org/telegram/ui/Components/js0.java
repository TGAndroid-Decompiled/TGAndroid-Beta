package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class js0 extends Drawable {
    public final int f27963a;
    public final ShapeDrawable f27964b;
    public final Rect f27965c;

    public js0(gs0 gs0Var) {
        this.f27963a = 1;
        this.f27964b = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), 0);
        this.f27965c = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f27963a) {
            case 0:
                Rect bounds = getBounds();
                Rect rect = this.f27965c;
                rect.set(bounds);
                rect.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                ShapeDrawable shapeDrawable = this.f27964b;
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                return;
            default:
                Rect bounds2 = getBounds();
                Rect rect2 = this.f27965c;
                rect2.set(bounds2);
                rect2.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                ShapeDrawable shapeDrawable2 = this.f27964b;
                shapeDrawable2.setBounds(rect2);
                shapeDrawable2.draw(canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f27963a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f27963a) {
            case 0:
                this.f27964b.setAlpha(i10);
                return;
            default:
                this.f27964b.setAlpha(i10);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f27963a;
    }

    public js0(ks0 ks0Var) {
        this.f27963a = 0;
        int dp = AndroidUtilities.dp(16.0f);
        int dp2 = AndroidUtilities.dp(16.0f);
        int i10 = org.telegram.ui.ActionBar.i6.f20827d6;
        org.telegram.ui.ActionBar.d6 d6Var = ks0Var.f28286c;
        this.f27964b = org.telegram.ui.ActionBar.i6.c0(dp, dp2, org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.v0(i10, d6Var), org.telegram.ui.ActionBar.i6.l1(0.04f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, d6Var))));
        this.f27965c = new Rect();
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
