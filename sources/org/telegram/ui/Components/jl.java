package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.PhotoViewer;
public final class jl extends qj0 {
    public final int f35091e3;
    public final ChatAttachAlertPhotoLayout f35092f3;

    public jl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i7) {
        super(context, g6Var);
        this.f35091e3 = i7;
        this.f35092f3 = chatAttachAlertPhotoLayout;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f35091e3) {
            case 1:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f35092f3.f39071b.V3[0] - org.telegram.messenger.g0.L(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f35091e3) {
            case 1:
                super.onLayout(z9, i7, i10, i11, i12);
                PhotoViewer.p1().r0();
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f35091e3) {
            case 1:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f35092f3.f39071b.V3[0] - org.telegram.messenger.g0.L(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f35091e3) {
            case 0:
                if (!this.f35092f3.J0) {
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
