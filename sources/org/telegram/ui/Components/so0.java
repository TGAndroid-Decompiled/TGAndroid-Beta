package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class so0 extends FrameLayout {
    public final ff f30381a;

    public so0(ff ffVar, Context context) {
        super(context);
        this.f30381a = ffVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ff ffVar = this.f30381a;
        View contentView = ffVar.getContentView();
        contentView.getLocationInWindow(r3);
        int[] iArr = {iArr[0] + ffVar.E, iArr[1] + ffVar.F};
        int[] iArr2 = new int[2];
        getLocationInWindow(iArr2);
        if ((motionEvent.getAction() != 0 || motionEvent.getX() > iArr[0]) && motionEvent.getX() < contentView.getWidth() + iArr[0] && motionEvent.getY() > iArr[1] && motionEvent.getY() < contentView.getHeight() + iArr[1]) {
            motionEvent.offsetLocation(iArr2[0] - iArr[0], (AndroidUtilities.statusBarHeight + iArr2[1]) - iArr[1]);
            return contentView.dispatchTouchEvent(motionEvent);
        }
        if (!ffVar.A && !ffVar.D) {
            ffVar.D = true;
            ffVar.l(new o1.k[0]);
        }
        return true;
    }
}
