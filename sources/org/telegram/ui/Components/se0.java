package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.LaunchActivity;
public final class se0 extends FrameLayout {
    public float f39586a;
    public float f39587b;
    public boolean f39588c;
    public boolean d;
    public final PipRoundVideoView f39589e;

    public se0(PipRoundVideoView pipRoundVideoView, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f39589e = pipRoundVideoView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        hi.t3 t3Var = org.telegram.ui.ActionBar.n6.f29577k3;
        if (t3Var != null) {
            t3Var.setAlpha((int) (getAlpha() * 255.0f));
            org.telegram.ui.ActionBar.n6.f29577k3.setBounds(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(125.0f), org.telegram.messenger.g0.L(125.0f));
            org.telegram.ui.ActionBar.n6.f29577k3.draw(canvas);
            org.telegram.ui.ActionBar.n6.S1.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29714ra, false));
            org.telegram.ui.ActionBar.n6.S1.setAlpha((int) (getAlpha() * 255.0f));
            canvas.drawCircle(org.telegram.messenger.g0.L(63.0f), org.telegram.messenger.g0.L(63.0f), org.telegram.messenger.g0.L(59.5f), org.telegram.ui.ActionBar.n6.S1);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f39586a = motionEvent.getRawX();
            this.f39587b = motionEvent.getRawY();
            this.d = true;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.se0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
