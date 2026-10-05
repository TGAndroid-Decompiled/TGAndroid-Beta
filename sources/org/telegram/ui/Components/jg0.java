package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class jg0 extends FrameLayout {
    public float f27844a;
    public float f27845b;
    public boolean f27846c;
    public boolean d;
    public final PipRoundVideoView f27847e;

    public jg0(PipRoundVideoView pipRoundVideoView, Activity activity) {
        super(activity);
        this.f27847e = pipRoundVideoView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.g5 g5Var = org.telegram.ui.ActionBar.i6.f20953k3;
        if (g5Var != null) {
            g5Var.setAlpha((int) (getAlpha() * 255.0f));
            org.telegram.ui.ActionBar.i6.f20953k3.setBounds(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(125.0f), AndroidUtilities.dp(125.0f));
            org.telegram.ui.ActionBar.i6.f20953k3.draw(canvas);
            org.telegram.ui.ActionBar.i6.S1.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21091ra, false));
            org.telegram.ui.ActionBar.i6.S1.setAlpha((int) (getAlpha() * 255.0f));
            canvas.drawCircle(AndroidUtilities.dp(63.0f), AndroidUtilities.dp(63.0f), AndroidUtilities.dp(59.5f), org.telegram.ui.ActionBar.i6.S1);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f27844a = motionEvent.getRawX();
            this.f27845b = motionEvent.getRawY();
            this.d = true;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jg0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
