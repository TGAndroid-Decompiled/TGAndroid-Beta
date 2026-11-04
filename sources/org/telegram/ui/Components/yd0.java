package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.LaunchActivity;
public final class yd0 extends FrameLayout {
    public float f40686a;
    public float f40687b;
    public boolean f40688c;
    public boolean d;
    public final PipRoundVideoView f40689e;

    public yd0(PipRoundVideoView pipRoundVideoView, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f40689e = pipRoundVideoView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        gi.k3 k3Var = org.telegram.ui.ActionBar.k6.f28004k3;
        if (k3Var != null) {
            k3Var.setAlpha((int) (getAlpha() * 255.0f));
            org.telegram.ui.ActionBar.k6.f28004k3.setBounds(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(125.0f), org.telegram.messenger.g0.L(125.0f));
            org.telegram.ui.ActionBar.k6.f28004k3.draw(canvas);
            org.telegram.ui.ActionBar.k6.S1.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28143ra, false));
            org.telegram.ui.ActionBar.k6.S1.setAlpha((int) (getAlpha() * 255.0f));
            canvas.drawCircle(org.telegram.messenger.g0.L(63.0f), org.telegram.messenger.g0.L(63.0f), org.telegram.messenger.g0.L(59.5f), org.telegram.ui.ActionBar.k6.S1);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f40686a = motionEvent.getRawX();
            this.f40687b = motionEvent.getRawY();
            this.d = true;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yd0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
