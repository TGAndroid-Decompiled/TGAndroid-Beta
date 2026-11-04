package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.PhotoViewer;
public final class il extends tj0 {
    public final int f34736f3;
    public final ChatAttachAlertPhotoLayout f34737g3;

    public il(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, e6Var);
        this.f34736f3 = i3;
        this.f34737g3 = chatAttachAlertPhotoLayout;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f34736f3) {
            case 1:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f34737g3.f38416b.W3[0] - org.telegram.messenger.g0.L(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.f34736f3) {
            case 1:
                super.onLayout(z10, i3, i10, i11, i12);
                PhotoViewer.v1().z0();
                return;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f34736f3) {
            case 1:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f34737g3.f38416b.W3[0] - org.telegram.messenger.g0.L(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f34736f3) {
            case 0:
                if (!this.f34737g3.K0) {
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
