package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class fm extends mm0 {
    public final int f28274f3;
    public final ChatAttachAlertPhotoLayout f28275g3;

    public fm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, u6Var);
        this.f28274f3 = i10;
        this.f28275g3 = chatAttachAlertPhotoLayout;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f28274f3) {
            case 1:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f28275g3.f30215b.f33019e2[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f28274f3) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer.u1().z0();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28274f3) {
            case 1:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f28275g3.f30215b.f33019e2[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f28274f3) {
            case 0:
                if (!this.f28275g3.J0) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }
}
