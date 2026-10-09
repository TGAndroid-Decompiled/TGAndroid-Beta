package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class xp0 extends FrameLayout {
    public final hf f32989a;

    public xp0(hf hfVar, Context context) {
        super(context);
        this.f32989a = hfVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        hf hfVar = this.f32989a;
        View contentView = hfVar.getContentView();
        contentView.getLocationInWindow(r3);
        int[] iArr = {iArr[0] + hfVar.E, iArr[1] + hfVar.F};
        int[] iArr2 = new int[2];
        getLocationInWindow(iArr2);
        if ((motionEvent.getAction() != 0 || motionEvent.getX() > iArr[0]) && motionEvent.getX() < contentView.getWidth() + iArr[0] && motionEvent.getY() > iArr[1] && motionEvent.getY() < contentView.getHeight() + iArr[1]) {
            motionEvent.offsetLocation(iArr2[0] - iArr[0], (AndroidUtilities.statusBarHeight + iArr2[1]) - iArr[1]);
            return contentView.dispatchTouchEvent(motionEvent);
        }
        if (!hfVar.A && !hfVar.D) {
            hfVar.D = true;
            hfVar.l(new o1.k[0]);
        }
        return true;
    }
}
