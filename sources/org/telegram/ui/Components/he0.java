package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.LaunchActivity;
public final class he0 extends FrameLayout {
    public float f35220a;
    public float f35221b;
    public boolean f35222c;
    public boolean d;
    public final PipRoundVideoView f35223e;

    public he0(PipRoundVideoView pipRoundVideoView, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f35223e = pipRoundVideoView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        hi.k3 k3Var = org.telegram.ui.ActionBar.j6.f28975k3;
        if (k3Var != null) {
            k3Var.setAlpha((int) (getAlpha() * 255.0f));
            org.telegram.ui.ActionBar.j6.f28975k3.setBounds(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(125.0f), org.telegram.messenger.g0.L(125.0f));
            org.telegram.ui.ActionBar.j6.f28975k3.draw(canvas);
            org.telegram.ui.ActionBar.j6.S1.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29112ra, false));
            org.telegram.ui.ActionBar.j6.S1.setAlpha((int) (getAlpha() * 255.0f));
            canvas.drawCircle(org.telegram.messenger.g0.L(63.0f), org.telegram.messenger.g0.L(63.0f), org.telegram.messenger.g0.L(59.5f), org.telegram.ui.ActionBar.j6.S1);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f35220a = motionEvent.getRawX();
            this.f35221b = motionEvent.getRawY();
            this.d = true;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.he0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
