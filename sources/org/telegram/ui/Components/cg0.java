package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class cg0 extends FrameLayout {
    public float f23941a;
    public float f23942b;
    public boolean f23943c;
    public boolean d;
    public final PipRoundVideoView e;

    public cg0(PipRoundVideoView pipRoundVideoView, Activity activity) {
        super(activity);
        this.e = pipRoundVideoView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.i5 i5Var = org.telegram.ui.ActionBar.j6.f20003k3;
        if (i5Var != null) {
            i5Var.setAlpha((int) (getAlpha() * 255.0f));
            org.telegram.ui.ActionBar.j6.f20003k3.setBounds(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(125.0f), AndroidUtilities.dp(125.0f));
            org.telegram.ui.ActionBar.j6.f20003k3.draw(canvas);
            org.telegram.ui.ActionBar.j6.S1.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20136ra, false));
            org.telegram.ui.ActionBar.j6.S1.setAlpha((int) (getAlpha() * 255.0f));
            canvas.drawCircle(AndroidUtilities.dp(63.0f), AndroidUtilities.dp(63.0f), AndroidUtilities.dp(59.5f), org.telegram.ui.ActionBar.j6.S1);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f23941a = motionEvent.getRawX();
            this.f23942b = motionEvent.getRawY();
            this.d = true;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cg0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
