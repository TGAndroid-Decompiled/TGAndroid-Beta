package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
public final class bf extends ImageView {
    public final int f24958a;
    public final ChatActivityEnterView f24959b;

    public bf(ChatActivityEnterView chatActivityEnterView, Context context, int i10) {
        super(context);
        this.f24958a = i10;
        this.f24959b = chatActivityEnterView;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f24958a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                post(new ie(this.f24959b, 5));
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f24958a) {
            case 2:
                if (getAlpha() <= 0.0f) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public final void setAlpha(float f7) {
        switch (this.f24958a) {
            case 0:
                super.setAlpha(f7);
                ze zeVar = this.f24959b.J1;
                if (zeVar != null) {
                    zeVar.setTranslationX(zeVar.f32886a);
                    return;
                }
                return;
            case 1:
                super.setAlpha(f7);
                ze zeVar2 = this.f24959b.J1;
                if (zeVar2 != null) {
                    zeVar2.setTranslationX(zeVar2.f32886a);
                    return;
                }
                return;
            default:
                super.setAlpha(f7);
                ue ueVar = this.f24959b.Z0;
                if (ueVar != null) {
                    ueVar.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f24958a) {
            case 2:
                super.setVisibility(i10);
                ue ueVar = this.f24959b.Z0;
                if (ueVar != null) {
                    ueVar.invalidate();
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
