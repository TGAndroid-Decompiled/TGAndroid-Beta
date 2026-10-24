package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ug0 extends FrameLayout {
    public float f31120a;
    public float f31121b;
    public boolean f31122c;
    public boolean d;
    public final PipRoundVideoView e;

    public ug0(PipRoundVideoView pipRoundVideoView, Activity activity) {
        super(activity);
        this.e = pipRoundVideoView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l5 l5Var = org.telegram.ui.ActionBar.k6.f21308k3;
        if (l5Var != null) {
            l5Var.setAlpha((int) (getAlpha() * 255.0f));
            org.telegram.ui.ActionBar.k6.f21308k3.setBounds(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(125.0f), AndroidUtilities.dp(125.0f));
            org.telegram.ui.ActionBar.k6.f21308k3.draw(canvas);
            org.telegram.ui.ActionBar.k6.S1.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21445ra, false));
            org.telegram.ui.ActionBar.k6.S1.setAlpha((int) (getAlpha() * 255.0f));
            canvas.drawCircle(AndroidUtilities.dp(63.0f), AndroidUtilities.dp(63.0f), AndroidUtilities.dp(59.5f), org.telegram.ui.ActionBar.k6.S1);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f31120a = motionEvent.getRawX();
            this.f31121b = motionEvent.getRawY();
            this.d = true;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ug0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
