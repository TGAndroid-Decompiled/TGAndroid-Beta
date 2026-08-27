package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class co0 extends FrameLayout {

    public final re f27523a;

    public co0(re reVar, Context context) {
        super(context);
        this.f27523a = reVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        re reVar = this.f27523a;
        View contentView = reVar.getContentView();
        int[] iArr = new int[2];
        contentView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] + reVar.E;
        iArr[1] = iArr[1] + reVar.F;
        int[] iArr2 = new int[2];
        getLocationInWindow(iArr2);
        if (motionEvent.getAction() != 0 || motionEvent.getX() > iArr[0]) {
            if (motionEvent.getX() < contentView.getWidth() + iArr[0] && motionEvent.getY() > iArr[1]) {
                if (motionEvent.getY() < contentView.getHeight() + iArr[1]) {
                    motionEvent.offsetLocation(iArr2[0] - iArr[0], (AndroidUtilities.statusBarHeight + iArr2[1]) - iArr[1]);
                    return contentView.dispatchTouchEvent(motionEvent);
                }
            }
        }
        if (!reVar.A && !reVar.D) {
            reVar.D = true;
            reVar.l(new o1.j[0]);
        }
        return true;
    }
}
