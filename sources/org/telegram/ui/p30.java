package org.telegram.ui;

import android.view.animation.OvershootInterpolator;
public final class p30 extends kh.b {
    public final OvershootInterpolator d;
    public int e;
    public final k60 f36525f;

    public p30(k60 k60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f36525f = k60Var;
        this.d = new OvershootInterpolator(1.5f);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p30.dispatchDraw(android.graphics.Canvas):void");
    }
}
