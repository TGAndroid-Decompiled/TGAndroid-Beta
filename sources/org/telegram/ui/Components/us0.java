package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class us0 extends Drawable {
    public final int f31609a;
    public final ShapeDrawable f31610b;
    public final Rect f31611c;

    public us0(rs0 rs0Var) {
        this.f31609a = 1;
        this.f31610b = org.telegram.ui.ActionBar.i6.d0(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), 0);
        this.f31611c = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f31609a) {
            case 0:
                Rect bounds = getBounds();
                Rect rect = this.f31611c;
                rect.set(bounds);
                rect.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                ShapeDrawable shapeDrawable = this.f31610b;
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                return;
            default:
                Rect bounds2 = getBounds();
                Rect rect2 = this.f31611c;
                rect2.set(bounds2);
                rect2.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                ShapeDrawable shapeDrawable2 = this.f31610b;
                shapeDrawable2.setBounds(rect2);
                shapeDrawable2.draw(canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f31609a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f31609a) {
            case 0:
                this.f31610b.setAlpha(i10);
                return;
            default:
                this.f31610b.setAlpha(i10);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f31609a;
    }

    public us0(vs0 vs0Var) {
        this.f31609a = 0;
        int dp = AndroidUtilities.dp(16.0f);
        int dp2 = AndroidUtilities.dp(16.0f);
        int i10 = org.telegram.ui.ActionBar.i6.f20797d6;
        org.telegram.ui.ActionBar.e6 e6Var = vs0Var.f32456c;
        this.f31610b = org.telegram.ui.ActionBar.i6.d0(dp, dp2, org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.w0(i10, e6Var), org.telegram.ui.ActionBar.i6.m1(0.04f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var))));
        this.f31611c = new Rect();
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
