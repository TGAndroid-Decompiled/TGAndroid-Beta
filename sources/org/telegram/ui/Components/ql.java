package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.PhotoViewer;
public final class ql extends uj0 {
    public final int f38698f3;
    public final ChatAttachAlertPhotoLayout f38699g3;

    public ql(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, e6Var);
        this.f38698f3 = i7;
        this.f38699g3 = chatAttachAlertPhotoLayout;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f38698f3) {
            case 1:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f38699g3.f33609b.Z3[0] - org.telegram.messenger.g0.L(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f38698f3) {
            case 1:
                super.onLayout(z10, i7, i10, i11, i12);
                PhotoViewer.p1().r0();
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f38698f3) {
            case 1:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f38699g3.f33609b.Z3[0] - org.telegram.messenger.g0.L(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f38698f3) {
            case 0:
                if (!this.f38699g3.K0) {
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
