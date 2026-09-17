package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class to0 extends FrameLayout {
    public final cf f28172a;

    public to0(cf cfVar, Context context) {
        super(context);
        this.f28172a = cfVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        cf cfVar = this.f28172a;
        View contentView = cfVar.getContentView();
        contentView.getLocationInWindow(r3);
        int[] iArr = {iArr[0] + cfVar.E, iArr[1] + cfVar.F};
        int[] iArr2 = new int[2];
        getLocationInWindow(iArr2);
        if ((motionEvent.getAction() != 0 || motionEvent.getX() > iArr[0]) && motionEvent.getX() < contentView.getWidth() + iArr[0] && motionEvent.getY() > iArr[1] && motionEvent.getY() < contentView.getHeight() + iArr[1]) {
            motionEvent.offsetLocation(iArr2[0] - iArr[0], (AndroidUtilities.statusBarHeight + iArr2[1]) - iArr[1]);
            return contentView.dispatchTouchEvent(motionEvent);
        }
        if (!cfVar.A && !cfVar.D) {
            cfVar.D = true;
            cfVar.l(new o1.k[0]);
        }
        return true;
    }
}
