package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class zg0 extends FrameLayout {
    public float f33603a;
    public float f33604b;
    public boolean f33605c;
    public boolean d;
    public final PipRoundVideoView f33606e;

    public zg0(PipRoundVideoView pipRoundVideoView, Activity activity) {
        super(activity);
        this.f33606e = pipRoundVideoView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.h5 h5Var = org.telegram.ui.ActionBar.i6.f20926k3;
        if (h5Var != null) {
            h5Var.setAlpha((int) (getAlpha() * 255.0f));
            org.telegram.ui.ActionBar.i6.f20926k3.setBounds(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(125.0f), AndroidUtilities.dp(125.0f));
            org.telegram.ui.ActionBar.i6.f20926k3.draw(canvas);
            org.telegram.ui.ActionBar.i6.S1.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21063ra, false));
            org.telegram.ui.ActionBar.i6.S1.setAlpha((int) (getAlpha() * 255.0f));
            canvas.drawCircle(AndroidUtilities.dp(63.0f), AndroidUtilities.dp(63.0f), AndroidUtilities.dp(59.5f), org.telegram.ui.ActionBar.i6.S1);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f33603a = motionEvent.getRawX();
            this.f33604b = motionEvent.getRawY();
            this.d = true;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zg0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
