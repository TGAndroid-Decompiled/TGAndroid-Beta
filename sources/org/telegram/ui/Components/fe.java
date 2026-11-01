package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
public final class fe extends ImageView {
    public final int f26134a;
    public final ChatActivityEnterView f26135b;

    public fe(ChatActivityEnterView chatActivityEnterView, Context context, int i10) {
        super(context);
        this.f26134a = i10;
        this.f26135b = chatActivityEnterView;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f26134a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                post(new ld(this.f26135b, 5));
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f26134a) {
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
        switch (this.f26134a) {
            case 0:
                super.setAlpha(f7);
                de deVar = this.f26135b.J1;
                if (deVar != null) {
                    deVar.setTranslationX(deVar.f25470a);
                    return;
                }
                return;
            case 1:
                super.setAlpha(f7);
                de deVar2 = this.f26135b.J1;
                if (deVar2 != null) {
                    deVar2.setTranslationX(deVar2.f25470a);
                    return;
                }
                return;
            default:
                super.setAlpha(f7);
                yd ydVar = this.f26135b.Z0;
                if (ydVar != null) {
                    ydVar.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f26134a) {
            case 2:
                super.setVisibility(i10);
                yd ydVar = this.f26135b.Z0;
                if (ydVar != null) {
                    ydVar.invalidate();
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
