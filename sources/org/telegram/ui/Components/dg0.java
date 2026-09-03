package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class dg0 extends FrameLayout {
    public float f26268a;
    public float f26269b;
    public boolean f26270c;
    public boolean d;
    public final PipRoundVideoView f26271e;

    public dg0(PipRoundVideoView pipRoundVideoView, Activity activity) {
        super(activity);
        this.f26271e = pipRoundVideoView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.j5 j5Var = org.telegram.ui.ActionBar.k6.f21784k3;
        if (j5Var != null) {
            j5Var.setAlpha((int) (getAlpha() * 255.0f));
            org.telegram.ui.ActionBar.k6.f21784k3.setBounds(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(125.0f), AndroidUtilities.dp(125.0f));
            org.telegram.ui.ActionBar.k6.f21784k3.draw(canvas);
            org.telegram.ui.ActionBar.k6.S1.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21918ra, false));
            org.telegram.ui.ActionBar.k6.S1.setAlpha((int) (getAlpha() * 255.0f));
            canvas.drawCircle(AndroidUtilities.dp(63.0f), AndroidUtilities.dp(63.0f), AndroidUtilities.dp(59.5f), org.telegram.ui.ActionBar.k6.S1);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f26268a = motionEvent.getRawX();
            this.f26269b = motionEvent.getRawY();
            this.d = true;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dg0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
