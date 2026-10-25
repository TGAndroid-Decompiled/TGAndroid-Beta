package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ug0 extends FrameLayout {
    public float f33400a;
    public float f33401b;
    public boolean f33402c;
    public boolean d;
    public final PipRoundVideoView e;

    public ug0(PipRoundVideoView pipRoundVideoView, Activity activity) {
        super(activity);
        this.e = pipRoundVideoView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        fi.u3 u3Var = org.telegram.ui.ActionBar.y6.f23479k3;
        if (u3Var != null) {
            u3Var.setAlpha((int) (getAlpha() * 255.0f));
            org.telegram.ui.ActionBar.y6.f23479k3.setBounds(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(125.0f), AndroidUtilities.dp(125.0f));
            org.telegram.ui.ActionBar.y6.f23479k3.draw(canvas);
            org.telegram.ui.ActionBar.y6.S1.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23616ra, false));
            org.telegram.ui.ActionBar.y6.S1.setAlpha((int) (getAlpha() * 255.0f));
            canvas.drawCircle(AndroidUtilities.dp(63.0f), AndroidUtilities.dp(63.0f), AndroidUtilities.dp(59.5f), org.telegram.ui.ActionBar.y6.S1);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f33400a = motionEvent.getRawX();
            this.f33401b = motionEvent.getRawY();
            this.d = true;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ug0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
