package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class bn0 extends FrameLayout {
    public final le f32329a;

    public bn0(le leVar, Context context) {
        super(context);
        this.f32329a = leVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        le leVar = this.f32329a;
        View contentView = leVar.getContentView();
        contentView.getLocationInWindow(r3);
        int[] iArr = {iArr[0] + leVar.E, iArr[1] + leVar.F};
        int[] iArr2 = new int[2];
        getLocationInWindow(iArr2);
        if ((motionEvent.getAction() != 0 || motionEvent.getX() > iArr[0]) && motionEvent.getX() < contentView.getWidth() + iArr[0] && motionEvent.getY() > iArr[1] && motionEvent.getY() < contentView.getHeight() + iArr[1]) {
            motionEvent.offsetLocation(iArr2[0] - iArr[0], (org.telegram.messenger.g0.f22602m + iArr2[1]) - iArr[1]);
            return contentView.dispatchTouchEvent(motionEvent);
        }
        if (!leVar.A && !leVar.D) {
            leVar.D = true;
            leVar.l(new q1.g[0]);
        }
        return true;
    }
}
