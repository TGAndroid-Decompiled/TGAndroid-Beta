package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class ym0 extends FrameLayout {
    public final ne f40684a;

    public ym0(ne neVar, Context context) {
        super(context);
        this.f40684a = neVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ne neVar = this.f40684a;
        View contentView = neVar.getContentView();
        contentView.getLocationInWindow(r3);
        int[] iArr = {iArr[0] + neVar.E, iArr[1] + neVar.F};
        int[] iArr2 = new int[2];
        getLocationInWindow(iArr2);
        if ((motionEvent.getAction() != 0 || motionEvent.getX() > iArr[0]) && motionEvent.getX() < contentView.getWidth() + iArr[0] && motionEvent.getY() > iArr[1] && motionEvent.getY() < contentView.getHeight() + iArr[1]) {
            motionEvent.offsetLocation(iArr2[0] - iArr[0], (org.telegram.messenger.g0.f22538m + iArr2[1]) - iArr[1]);
            return contentView.dispatchTouchEvent(motionEvent);
        }
        if (!neVar.A && !neVar.D) {
            neVar.D = true;
            neVar.l(new r1.g[0]);
        }
        return true;
    }
}
