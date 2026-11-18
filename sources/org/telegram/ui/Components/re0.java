package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.LaunchActivity;
public final class re0 extends FrameLayout {
    public float f39112a;
    public float f39113b;
    public boolean f39114c;
    public boolean d;
    public final PipRoundVideoView f39115e;

    public re0(PipRoundVideoView pipRoundVideoView, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f39115e = pipRoundVideoView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        hi.l3 l3Var = org.telegram.ui.ActionBar.n6.f29522k3;
        if (l3Var != null) {
            l3Var.setAlpha((int) (getAlpha() * 255.0f));
            org.telegram.ui.ActionBar.n6.f29522k3.setBounds(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(125.0f), org.telegram.messenger.g0.L(125.0f));
            org.telegram.ui.ActionBar.n6.f29522k3.draw(canvas);
            org.telegram.ui.ActionBar.n6.S1.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29659ra, false));
            org.telegram.ui.ActionBar.n6.S1.setAlpha((int) (getAlpha() * 255.0f));
            canvas.drawCircle(org.telegram.messenger.g0.L(63.0f), org.telegram.messenger.g0.L(63.0f), org.telegram.messenger.g0.L(59.5f), org.telegram.ui.ActionBar.n6.S1);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f39112a = motionEvent.getRawX();
            this.f39113b = motionEvent.getRawY();
            this.d = true;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.re0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
