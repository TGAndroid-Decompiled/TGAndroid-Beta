package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class so0 extends FrameLayout {
    public final ef f27959a;

    public so0(ef efVar, Context context) {
        super(context);
        this.f27959a = efVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ef efVar = this.f27959a;
        View contentView = efVar.getContentView();
        contentView.getLocationInWindow(r3);
        int[] iArr = {iArr[0] + efVar.E, iArr[1] + efVar.F};
        int[] iArr2 = new int[2];
        getLocationInWindow(iArr2);
        if ((motionEvent.getAction() != 0 || motionEvent.getX() > iArr[0]) && motionEvent.getX() < contentView.getWidth() + iArr[0] && motionEvent.getY() > iArr[1] && motionEvent.getY() < contentView.getHeight() + iArr[1]) {
            motionEvent.offsetLocation(iArr2[0] - iArr[0], (AndroidUtilities.statusBarHeight + iArr2[1]) - iArr[1]);
            return contentView.dispatchTouchEvent(motionEvent);
        }
        if (!efVar.A && !efVar.D) {
            efVar.D = true;
            efVar.l(new o1.k[0]);
        }
        return true;
    }
}
