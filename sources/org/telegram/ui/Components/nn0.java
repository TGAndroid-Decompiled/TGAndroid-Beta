package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class nn0 extends FrameLayout {
    public final xe f37861a;

    public nn0(xe xeVar, Context context) {
        super(context);
        this.f37861a = xeVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        xe xeVar = this.f37861a;
        View contentView = xeVar.getContentView();
        contentView.getLocationInWindow(r3);
        int[] iArr = {iArr[0] + xeVar.E, iArr[1] + xeVar.F};
        int[] iArr2 = new int[2];
        getLocationInWindow(iArr2);
        if ((motionEvent.getAction() != 0 || motionEvent.getX() > iArr[0]) && motionEvent.getX() < contentView.getWidth() + iArr[0] && motionEvent.getY() > iArr[1] && motionEvent.getY() < contentView.getHeight() + iArr[1]) {
            motionEvent.offsetLocation(iArr2[0] - iArr[0], (org.telegram.messenger.g0.f24004m + iArr2[1]) - iArr[1]);
            return contentView.dispatchTouchEvent(motionEvent);
        }
        if (!xeVar.A && !xeVar.D) {
            xeVar.D = true;
            xeVar.l(new r1.g[0]);
        }
        return true;
    }
}
