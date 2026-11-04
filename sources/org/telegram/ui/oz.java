package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
public final class oz extends View implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.g6 f48383a;
    public gh.g f48384b;
    public String f48385c;

    public oz(Activity activity) {
        super(activity);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(true, false, false);
        this.f48383a = g6Var;
        g6Var.u(-1);
        g6Var.f33983b = 17;
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.w(org.telegram.messenger.g0.L(14.0f));
        g6Var.setCallback(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        org.telegram.ui.Components.g6 g6Var = this.f48383a;
        int N = (int) (org.telegram.messenger.g0.N(30.0f) + g6Var.c());
        int width = (getWidth() - N) / 2;
        int i3 = N + width;
        gh.g gVar = this.f48384b;
        if (gVar != null) {
            gVar.setBounds(width, 0, i3, getHeight());
            this.f48384b.draw(canvas);
        }
        g6Var.draw(canvas);
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        this.f48383a.setBounds(0, 0, i3, i10);
    }

    @Override
    public final void updateColors() {
        gh.g gVar = this.f48384b;
        if (gVar != null) {
            gVar.updateColors();
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f48383a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
