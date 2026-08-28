package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
public final class se extends ImageView {
    public final int f32448a;
    public final ChatActivityEnterView f32449b;

    public se(ChatActivityEnterView chatActivityEnterView, Context context, int i9) {
        super(context);
        this.f32448a = i9;
        this.f32449b = chatActivityEnterView;
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.f32448a) {
            case 0:
                super.onLayout(z10, i9, i10, i11, i12);
                post(new yd(this.f32449b, 5));
                return;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f32448a) {
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
    public final void setAlpha(float f10) {
        switch (this.f32448a) {
            case 0:
                super.setAlpha(f10);
                qe qeVar = this.f32449b.E1;
                if (qeVar != null) {
                    qeVar.setTranslationX(qeVar.f31888a);
                    return;
                }
                return;
            case 1:
                super.setAlpha(f10);
                qe qeVar2 = this.f32449b.E1;
                if (qeVar2 != null) {
                    qeVar2.setTranslationX(qeVar2.f31888a);
                    return;
                }
                return;
            default:
                super.setAlpha(f10);
                le leVar = this.f32449b.V0;
                if (leVar != null) {
                    leVar.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void setVisibility(int i9) {
        switch (this.f32448a) {
            case 2:
                super.setVisibility(i9);
                le leVar = this.f32449b.V0;
                if (leVar != null) {
                    leVar.invalidate();
                    return;
                }
                return;
            default:
                super.setVisibility(i9);
                return;
        }
    }
}
