package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class tl extends ll0 {
    public final int X2;
    public final ChatAttachAlertPhotoLayout Y2;

    public tl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.X2 = i10;
        this.Y2 = chatAttachAlertPhotoLayout;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.X2) {
            case 1:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.Y2.f28753b.f31266b2[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.X2) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer.t1().y0();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.X2) {
            case 1:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.Y2.f28753b.f31266b2[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.X2) {
            case 0:
                if (!this.Y2.J0) {
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
