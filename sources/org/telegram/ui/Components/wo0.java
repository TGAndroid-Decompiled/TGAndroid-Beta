package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class wo0 extends FrameLayout {
    public final ve f32806a;

    public wo0(ve veVar, Context context) {
        super(context);
        this.f32806a = veVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ve veVar = this.f32806a;
        View contentView = veVar.getContentView();
        contentView.getLocationInWindow(r3);
        int[] iArr = {iArr[0] + veVar.E, iArr[1] + veVar.F};
        int[] iArr2 = new int[2];
        getLocationInWindow(iArr2);
        if ((motionEvent.getAction() != 0 || motionEvent.getX() > iArr[0]) && motionEvent.getX() < contentView.getWidth() + iArr[0] && motionEvent.getY() > iArr[1] && motionEvent.getY() < contentView.getHeight() + iArr[1]) {
            motionEvent.offsetLocation(iArr2[0] - iArr[0], (AndroidUtilities.statusBarHeight + iArr2[1]) - iArr[1]);
            return contentView.dispatchTouchEvent(motionEvent);
        }
        if (!veVar.A && !veVar.D) {
            veVar.D = true;
            veVar.l(new o1.j[0]);
        }
        return true;
    }
}
