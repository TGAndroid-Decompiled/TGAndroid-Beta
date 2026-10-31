package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class zn0 extends FrameLayout {
    public final ie f33134a;

    public zn0(ie ieVar, Context context) {
        super(context);
        this.f33134a = ieVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ie ieVar = this.f33134a;
        View contentView = ieVar.getContentView();
        contentView.getLocationInWindow(r3);
        int[] iArr = {iArr[0] + ieVar.E, iArr[1] + ieVar.F};
        int[] iArr2 = new int[2];
        getLocationInWindow(iArr2);
        if ((motionEvent.getAction() != 0 || motionEvent.getX() > iArr[0]) && motionEvent.getX() < contentView.getWidth() + iArr[0] && motionEvent.getY() > iArr[1] && motionEvent.getY() < contentView.getHeight() + iArr[1]) {
            motionEvent.offsetLocation(iArr2[0] - iArr[0], (org.telegram.messenger.i0.f16020m + iArr2[1]) - iArr[1]);
            return contentView.dispatchTouchEvent(motionEvent);
        }
        if (!ieVar.A && !ieVar.D) {
            ieVar.D = true;
            ieVar.l(new o1.j[0]);
        }
        return true;
    }
}
