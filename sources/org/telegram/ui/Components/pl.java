package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.PhotoViewer;
public final class pl extends tk0 {
    public final int f29378e3;
    public final ChatAttachAlertPhotoLayout f29379f3;

    public pl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(context, p6Var);
        this.f29378e3 = i10;
        this.f29379f3 = chatAttachAlertPhotoLayout;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f29378e3) {
            case 1:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f29379f3.f30947b.V3[0] - org.telegram.messenger.i0.L(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f29378e3) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer.v1().z0();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f29378e3) {
            case 1:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f29379f3.f30947b.V3[0] - org.telegram.messenger.i0.L(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f29378e3) {
            case 0:
                if (!this.f29379f3.J0) {
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
