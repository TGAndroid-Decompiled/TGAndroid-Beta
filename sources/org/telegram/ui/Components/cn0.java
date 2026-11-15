package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class cn0 extends FrameLayout {
    public final oe f33638a;

    public cn0(oe oeVar, Context context) {
        super(context);
        this.f33638a = oeVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        oe oeVar = this.f33638a;
        View contentView = oeVar.getContentView();
        contentView.getLocationInWindow(r3);
        int[] iArr = {iArr[0] + oeVar.E, iArr[1] + oeVar.F};
        int[] iArr2 = new int[2];
        getLocationInWindow(iArr2);
        if ((motionEvent.getAction() != 0 || motionEvent.getX() > iArr[0]) && motionEvent.getX() < contentView.getWidth() + iArr[0] && motionEvent.getY() > iArr[1] && motionEvent.getY() < contentView.getHeight() + iArr[1]) {
            motionEvent.offsetLocation(iArr2[0] - iArr[0], (org.telegram.messenger.g0.f23603m + iArr2[1]) - iArr[1]);
            return contentView.dispatchTouchEvent(motionEvent);
        }
        if (!oeVar.A && !oeVar.D) {
            oeVar.D = true;
            oeVar.l(new r1.g[0]);
        }
        return true;
    }
}
