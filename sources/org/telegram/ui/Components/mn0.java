package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class mn0 extends FrameLayout {
    public final ye f37505a;

    public mn0(ye yeVar, Context context) {
        super(context);
        this.f37505a = yeVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ye yeVar = this.f37505a;
        View contentView = yeVar.getContentView();
        contentView.getLocationInWindow(r3);
        int[] iArr = {iArr[0] + yeVar.E, iArr[1] + yeVar.F};
        int[] iArr2 = new int[2];
        getLocationInWindow(iArr2);
        if ((motionEvent.getAction() != 0 || motionEvent.getX() > iArr[0]) && motionEvent.getX() < contentView.getWidth() + iArr[0] && motionEvent.getY() > iArr[1] && motionEvent.getY() < contentView.getHeight() + iArr[1]) {
            motionEvent.offsetLocation(iArr2[0] - iArr[0], (org.telegram.messenger.g0.f24220m + iArr2[1]) - iArr[1]);
            return contentView.dispatchTouchEvent(motionEvent);
        }
        if (!yeVar.A && !yeVar.D) {
            yeVar.D = true;
            yeVar.l(new r1.g[0]);
        }
        return true;
    }
}
