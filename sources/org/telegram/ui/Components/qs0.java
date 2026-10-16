package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class qs0 extends Drawable {
    public final int f28353a;
    public final ShapeDrawable f28354b;
    public final Rect f28355c;

    public qs0(ns0 ns0Var) {
        this.f28353a = 1;
        this.f28354b = org.telegram.ui.ActionBar.g6.d0(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), 0);
        this.f28355c = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f28353a) {
            case 0:
                Rect bounds = getBounds();
                Rect rect = this.f28355c;
                rect.set(bounds);
                rect.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                ShapeDrawable shapeDrawable = this.f28354b;
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                return;
            default:
                Rect bounds2 = getBounds();
                Rect rect2 = this.f28355c;
                rect2.set(bounds2);
                rect2.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                ShapeDrawable shapeDrawable2 = this.f28354b;
                shapeDrawable2.setBounds(rect2);
                shapeDrawable2.draw(canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f28353a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f28353a) {
            case 0:
                this.f28354b.setAlpha(i10);
                return;
            default:
                this.f28354b.setAlpha(i10);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f28353a;
    }

    public qs0(rs0 rs0Var) {
        this.f28353a = 0;
        int dp = AndroidUtilities.dp(16.0f);
        int dp2 = AndroidUtilities.dp(16.0f);
        int i10 = org.telegram.ui.ActionBar.g6.f19601d6;
        org.telegram.ui.ActionBar.c6 c6Var = rs0Var.f28641c;
        this.f28354b = org.telegram.ui.ActionBar.g6.d0(dp, dp2, org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), org.telegram.ui.ActionBar.g6.m1(0.04f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var))));
        this.f28355c = new Rect();
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
