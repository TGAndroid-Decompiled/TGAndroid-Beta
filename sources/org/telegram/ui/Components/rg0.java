package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class rg0 extends FrameLayout {
    public float f29933a;
    public float f29934b;
    public boolean f29935c;
    public boolean d;
    public final PipRoundVideoView e;

    public rg0(PipRoundVideoView pipRoundVideoView, Activity activity) {
        super(activity);
        this.e = pipRoundVideoView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.h5 h5Var = org.telegram.ui.ActionBar.h6.f21118k3;
        if (h5Var != null) {
            h5Var.setAlpha((int) (getAlpha() * 255.0f));
            org.telegram.ui.ActionBar.h6.f21118k3.setBounds(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(125.0f), AndroidUtilities.dp(125.0f));
            org.telegram.ui.ActionBar.h6.f21118k3.draw(canvas);
            org.telegram.ui.ActionBar.h6.S1.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21255ra, false));
            org.telegram.ui.ActionBar.h6.S1.setAlpha((int) (getAlpha() * 255.0f));
            canvas.drawCircle(AndroidUtilities.dp(63.0f), AndroidUtilities.dp(63.0f), AndroidUtilities.dp(59.5f), org.telegram.ui.ActionBar.h6.S1);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f29933a = motionEvent.getRawX();
            this.f29934b = motionEvent.getRawY();
            this.d = true;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rg0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
