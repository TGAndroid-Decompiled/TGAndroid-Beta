package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
public final class se extends ImageView {
    public final int f31042a;
    public final ChatActivityEnterView f31043b;

    public se(ChatActivityEnterView chatActivityEnterView, Context context, int i10) {
        super(context);
        this.f31042a = i10;
        this.f31043b = chatActivityEnterView;
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f31042a) {
            case 0:
                super.onLayout(z4, i10, i11, i12, i13);
                post(new yd(this.f31043b, 5));
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f31042a) {
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
        switch (this.f31042a) {
            case 0:
                super.setAlpha(f10);
                qe qeVar = this.f31043b.F1;
                if (qeVar != null) {
                    qeVar.setTranslationX(qeVar.f30375a);
                    return;
                }
                return;
            case 1:
                super.setAlpha(f10);
                qe qeVar2 = this.f31043b.F1;
                if (qeVar2 != null) {
                    qeVar2.setTranslationX(qeVar2.f30375a);
                    return;
                }
                return;
            default:
                super.setAlpha(f10);
                le leVar = this.f31043b.W0;
                if (leVar != null) {
                    leVar.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f31042a) {
            case 2:
                super.setVisibility(i10);
                le leVar = this.f31043b.W0;
                if (leVar != null) {
                    leVar.invalidate();
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
