package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class ym0 extends FrameLayout {
    public final me f40618a;

    public ym0(me meVar, Context context) {
        super(context);
        this.f40618a = meVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        me meVar = this.f40618a;
        View contentView = meVar.getContentView();
        contentView.getLocationInWindow(r3);
        int[] iArr = {iArr[0] + meVar.E, iArr[1] + meVar.F};
        int[] iArr2 = new int[2];
        getLocationInWindow(iArr2);
        if ((motionEvent.getAction() != 0 || motionEvent.getX() > iArr[0]) && motionEvent.getX() < contentView.getWidth() + iArr[0] && motionEvent.getY() > iArr[1] && motionEvent.getY() < contentView.getHeight() + iArr[1]) {
            motionEvent.offsetLocation(iArr2[0] - iArr[0], (org.telegram.messenger.g0.f22561m + iArr2[1]) - iArr[1]);
            return contentView.dispatchTouchEvent(motionEvent);
        }
        if (!meVar.A && !meVar.D) {
            meVar.D = true;
            meVar.l(new r1.g[0]);
        }
        return true;
    }
}
