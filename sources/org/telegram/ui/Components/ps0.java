package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class ps0 extends Drawable {
    public final int f29655a;
    public final ShapeDrawable f29656b;
    public final Rect f29657c;

    public ps0(ms0 ms0Var) {
        this.f29655a = 1;
        this.f29656b = org.telegram.ui.ActionBar.k6.d0(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), 0);
        this.f29657c = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f29655a) {
            case 0:
                Rect bounds = getBounds();
                Rect rect = this.f29657c;
                rect.set(bounds);
                rect.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                ShapeDrawable shapeDrawable = this.f29656b;
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                return;
            default:
                Rect bounds2 = getBounds();
                Rect rect2 = this.f29657c;
                rect2.set(bounds2);
                rect2.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                ShapeDrawable shapeDrawable2 = this.f29656b;
                shapeDrawable2.setBounds(rect2);
                shapeDrawable2.draw(canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f29655a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f29655a) {
            case 0:
                this.f29656b.setAlpha(i10);
                return;
            default:
                this.f29656b.setAlpha(i10);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f29655a;
    }

    public ps0(qs0 qs0Var) {
        this.f29655a = 0;
        int dp = AndroidUtilities.dp(16.0f);
        int dp2 = AndroidUtilities.dp(16.0f);
        int i10 = org.telegram.ui.ActionBar.k6.f21184d6;
        org.telegram.ui.ActionBar.g6 g6Var = qs0Var.f29990c;
        this.f29656b = org.telegram.ui.ActionBar.k6.d0(dp, dp2, org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.w0(i10, g6Var), org.telegram.ui.ActionBar.k6.o1(0.04f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, g6Var))));
        this.f29657c = new Rect();
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
