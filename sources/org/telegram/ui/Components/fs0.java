package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class fs0 extends Drawable {
    public final int f24342a;
    public final ShapeDrawable f24343b;
    public final Rect f24344c;

    public fs0(cs0 cs0Var) {
        this.f24342a = 1;
        this.f24343b = org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), 0);
        this.f24344c = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f24342a) {
            case 0:
                Rect bounds = getBounds();
                Rect rect = this.f24344c;
                rect.set(bounds);
                rect.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                ShapeDrawable shapeDrawable = this.f24343b;
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                return;
            default:
                Rect bounds2 = getBounds();
                Rect rect2 = this.f24344c;
                rect2.set(bounds2);
                rect2.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                ShapeDrawable shapeDrawable2 = this.f24343b;
                shapeDrawable2.setBounds(rect2);
                shapeDrawable2.draw(canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f24342a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f24342a) {
            case 0:
                this.f24343b.setAlpha(i10);
                return;
            default:
                this.f24343b.setAlpha(i10);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f24342a;
    }

    public fs0(gs0 gs0Var) {
        this.f24342a = 0;
        int dp = AndroidUtilities.dp(16.0f);
        int dp2 = AndroidUtilities.dp(16.0f);
        int i10 = org.telegram.ui.ActionBar.h6.f19076d6;
        org.telegram.ui.ActionBar.d6 d6Var = gs0Var.f24669c;
        this.f24343b = org.telegram.ui.ActionBar.h6.c0(dp, dp2, org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.v0(i10, d6Var), org.telegram.ui.ActionBar.h6.l1(0.04f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var))));
        this.f24344c = new Rect();
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
