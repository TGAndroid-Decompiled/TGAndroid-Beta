package org.telegram.ui;

import android.view.animation.OvershootInterpolator;
public final class j30 extends yg.b {
    public final OvershootInterpolator d;
    public int f38005e;
    public final d60 f38006f;

    public j30(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f38006f = d60Var;
        this.d = new OvershootInterpolator(1.5f);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j30.dispatchDraw(android.graphics.Canvas):void");
    }
}
