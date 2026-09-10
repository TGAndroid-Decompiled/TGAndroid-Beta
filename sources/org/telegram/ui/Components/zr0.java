package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class zr0 extends Drawable {
    public final int f29798a;
    public final ShapeDrawable f29799b;
    public final Rect f29800c;

    public zr0(wr0 wr0Var) {
        this.f29798a = 1;
        this.f29799b = org.telegram.ui.ActionBar.j6.c0(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), 0);
        this.f29800c = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f29798a) {
            case 0:
                Rect bounds = getBounds();
                Rect rect = this.f29800c;
                rect.set(bounds);
                rect.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                ShapeDrawable shapeDrawable = this.f29799b;
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                return;
            default:
                Rect bounds2 = getBounds();
                Rect rect2 = this.f29800c;
                rect2.set(bounds2);
                rect2.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                ShapeDrawable shapeDrawable2 = this.f29799b;
                shapeDrawable2.setBounds(rect2);
                shapeDrawable2.draw(canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f29798a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f29798a) {
            case 0:
                this.f29799b.setAlpha(i10);
                return;
            default:
                this.f29799b.setAlpha(i10);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f29798a;
    }

    public zr0(as0 as0Var) {
        this.f29798a = 0;
        int dp = AndroidUtilities.dp(16.0f);
        int dp2 = AndroidUtilities.dp(16.0f);
        int i10 = org.telegram.ui.ActionBar.j6.f17928d6;
        org.telegram.ui.ActionBar.f6 f6Var = as0Var.f21581c;
        this.f29799b = org.telegram.ui.ActionBar.j6.c0(dp, dp2, org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.l1(0.04f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var))));
        this.f29800c = new Rect();
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
