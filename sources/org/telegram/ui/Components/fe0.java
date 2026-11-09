package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.LaunchActivity;
public final class fe0 extends FrameLayout {
    public float f33642a;
    public float f33643b;
    public boolean f33644c;
    public boolean d;
    public final PipRoundVideoView f33645e;

    public fe0(PipRoundVideoView pipRoundVideoView, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f33645e = pipRoundVideoView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        fi.l3 l3Var = org.telegram.ui.ActionBar.l6.f27991k3;
        if (l3Var != null) {
            l3Var.setAlpha((int) (getAlpha() * 255.0f));
            org.telegram.ui.ActionBar.l6.f27991k3.setBounds(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(125.0f), org.telegram.messenger.g0.L(125.0f));
            org.telegram.ui.ActionBar.l6.f27991k3.draw(canvas);
            org.telegram.ui.ActionBar.l6.S1.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28128ra, false));
            org.telegram.ui.ActionBar.l6.S1.setAlpha((int) (getAlpha() * 255.0f));
            canvas.drawCircle(org.telegram.messenger.g0.L(63.0f), org.telegram.messenger.g0.L(63.0f), org.telegram.messenger.g0.L(59.5f), org.telegram.ui.ActionBar.l6.S1);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f33642a = motionEvent.getRawX();
            this.f33643b = motionEvent.getRawY();
            this.d = true;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fe0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
