package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.LaunchActivity;
public final class ee0 extends FrameLayout {
    public float f33232a;
    public float f33233b;
    public boolean f33234c;
    public boolean d;
    public final PipRoundVideoView f33235e;

    public ee0(PipRoundVideoView pipRoundVideoView, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f33235e = pipRoundVideoView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        fi.l3 l3Var = org.telegram.ui.ActionBar.k6.f27975k3;
        if (l3Var != null) {
            l3Var.setAlpha((int) (getAlpha() * 255.0f));
            org.telegram.ui.ActionBar.k6.f27975k3.setBounds(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(125.0f), org.telegram.messenger.g0.L(125.0f));
            org.telegram.ui.ActionBar.k6.f27975k3.draw(canvas);
            org.telegram.ui.ActionBar.k6.S1.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28112ra, false));
            org.telegram.ui.ActionBar.k6.S1.setAlpha((int) (getAlpha() * 255.0f));
            canvas.drawCircle(org.telegram.messenger.g0.L(63.0f), org.telegram.messenger.g0.L(63.0f), org.telegram.messenger.g0.L(59.5f), org.telegram.ui.ActionBar.k6.S1);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f33232a = motionEvent.getRawX();
            this.f33233b = motionEvent.getRawY();
            this.d = true;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ee0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
