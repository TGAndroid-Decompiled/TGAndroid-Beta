package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class xs0 extends Drawable {
    public final int f34810a;
    public final ShapeDrawable f34811b;
    public final Rect f34812c;

    public xs0(vs0 vs0Var) {
        this.f34810a = 1;
        this.f34811b = org.telegram.ui.ActionBar.y6.d0(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), 0);
        this.f34812c = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f34810a) {
            case 0:
                Rect bounds = getBounds();
                Rect rect = this.f34812c;
                rect.set(bounds);
                rect.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                ShapeDrawable shapeDrawable = this.f34811b;
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                return;
            default:
                Rect bounds2 = getBounds();
                Rect rect2 = this.f34812c;
                rect2.set(bounds2);
                rect2.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                ShapeDrawable shapeDrawable2 = this.f34811b;
                shapeDrawable2.setBounds(rect2);
                shapeDrawable2.draw(canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f34810a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f34810a) {
            case 0:
                this.f34811b.setAlpha(i10);
                return;
            default:
                this.f34811b.setAlpha(i10);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f34810a;
    }

    public xs0(ys0 ys0Var) {
        this.f34810a = 0;
        int dp = AndroidUtilities.dp(16.0f);
        int dp2 = AndroidUtilities.dp(16.0f);
        int i10 = org.telegram.ui.ActionBar.y6.f23354d6;
        org.telegram.ui.ActionBar.u6 u6Var = ys0Var.f35134c;
        this.f34811b = org.telegram.ui.ActionBar.y6.d0(dp, dp2, org.telegram.ui.ActionBar.y6.v(org.telegram.ui.ActionBar.y6.w0(i10, u6Var), org.telegram.ui.ActionBar.y6.o1(0.04f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, u6Var))));
        this.f34812c = new Rect();
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
