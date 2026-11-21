package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.LaunchActivity;
public final class te0 extends FrameLayout {
    public float f39886a;
    public float f39887b;
    public boolean f39888c;
    public boolean d;
    public final PipRoundVideoView f39889e;

    public te0(PipRoundVideoView pipRoundVideoView, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f39889e = pipRoundVideoView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        hi.k3 k3Var = org.telegram.ui.ActionBar.m6.f29504k3;
        if (k3Var != null) {
            k3Var.setAlpha((int) (getAlpha() * 255.0f));
            org.telegram.ui.ActionBar.m6.f29504k3.setBounds(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(125.0f), org.telegram.messenger.g0.L(125.0f));
            org.telegram.ui.ActionBar.m6.f29504k3.draw(canvas);
            org.telegram.ui.ActionBar.m6.S1.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29641ra, false));
            org.telegram.ui.ActionBar.m6.S1.setAlpha((int) (getAlpha() * 255.0f));
            canvas.drawCircle(org.telegram.messenger.g0.L(63.0f), org.telegram.messenger.g0.L(63.0f), org.telegram.messenger.g0.L(59.5f), org.telegram.ui.ActionBar.m6.S1);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f39886a = motionEvent.getRawX();
            this.f39887b = motionEvent.getRawY();
            this.d = true;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.te0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
