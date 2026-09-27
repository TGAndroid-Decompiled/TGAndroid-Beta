package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class es0 extends Drawable {
    public final int f24115a;
    public final ShapeDrawable f24116b;
    public final Rect f24117c;

    public es0(bs0 bs0Var) {
        this.f24115a = 1;
        this.f24116b = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), 0);
        this.f24117c = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f24115a) {
            case 0:
                Rect bounds = getBounds();
                Rect rect = this.f24117c;
                rect.set(bounds);
                rect.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                ShapeDrawable shapeDrawable = this.f24116b;
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                return;
            default:
                Rect bounds2 = getBounds();
                Rect rect2 = this.f24117c;
                rect2.set(bounds2);
                rect2.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                ShapeDrawable shapeDrawable2 = this.f24116b;
                shapeDrawable2.setBounds(rect2);
                shapeDrawable2.draw(canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f24115a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f24115a) {
            case 0:
                this.f24116b.setAlpha(i10);
                return;
            default:
                this.f24116b.setAlpha(i10);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f24115a;
    }

    public es0(fs0 fs0Var) {
        this.f24115a = 0;
        int dp = AndroidUtilities.dp(16.0f);
        int dp2 = AndroidUtilities.dp(16.0f);
        int i10 = org.telegram.ui.ActionBar.i6.f19057d6;
        org.telegram.ui.ActionBar.e6 e6Var = fs0Var.f24379c;
        this.f24116b = org.telegram.ui.ActionBar.i6.c0(dp, dp2, org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.v0(i10, e6Var), org.telegram.ui.ActionBar.i6.l1(0.04f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var))));
        this.f24117c = new Rect();
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
