package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class mp0 extends FrameLayout {
    public final gf f28759a;

    public mp0(gf gfVar, Context context) {
        super(context);
        this.f28759a = gfVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        gf gfVar = this.f28759a;
        View contentView = gfVar.getContentView();
        contentView.getLocationInWindow(r3);
        int[] iArr = {iArr[0] + gfVar.E, iArr[1] + gfVar.F};
        int[] iArr2 = new int[2];
        getLocationInWindow(iArr2);
        if ((motionEvent.getAction() != 0 || motionEvent.getX() > iArr[0]) && motionEvent.getX() < contentView.getWidth() + iArr[0] && motionEvent.getY() > iArr[1] && motionEvent.getY() < contentView.getHeight() + iArr[1]) {
            motionEvent.offsetLocation(iArr2[0] - iArr[0], (AndroidUtilities.statusBarHeight + iArr2[1]) - iArr[1]);
            return contentView.dispatchTouchEvent(motionEvent);
        }
        if (!gfVar.A && !gfVar.D) {
            gfVar.D = true;
            gfVar.l(new o1.k[0]);
        }
        return true;
    }
}
