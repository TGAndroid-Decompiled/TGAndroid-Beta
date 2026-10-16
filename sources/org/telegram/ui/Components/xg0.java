package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class xg0 extends FrameLayout {
    public float f30931a;
    public float f30932b;
    public boolean f30933c;
    public boolean d;
    public final PipRoundVideoView e;

    public xg0(PipRoundVideoView pipRoundVideoView, Activity activity) {
        super(activity);
        this.e = pipRoundVideoView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f5 f5Var = org.telegram.ui.ActionBar.g6.f19725k3;
        if (f5Var != null) {
            f5Var.setAlpha((int) (getAlpha() * 255.0f));
            org.telegram.ui.ActionBar.g6.f19725k3.setBounds(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(125.0f), AndroidUtilities.dp(125.0f));
            org.telegram.ui.ActionBar.g6.f19725k3.draw(canvas);
            org.telegram.ui.ActionBar.g6.S1.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19862ra, false));
            org.telegram.ui.ActionBar.g6.S1.setAlpha((int) (getAlpha() * 255.0f));
            canvas.drawCircle(AndroidUtilities.dp(63.0f), AndroidUtilities.dp(63.0f), AndroidUtilities.dp(59.5f), org.telegram.ui.ActionBar.g6.S1);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f30931a = motionEvent.getRawX();
            this.f30932b = motionEvent.getRawY();
            this.d = true;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xg0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
