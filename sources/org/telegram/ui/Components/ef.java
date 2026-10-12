package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
public final class ef extends ImageView {
    public final int f25681a;
    public final ChatActivityEnterView f25682b;

    public ef(ChatActivityEnterView chatActivityEnterView, Context context, int i10) {
        super(context);
        this.f25681a = i10;
        this.f25682b = chatActivityEnterView;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f25681a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                post(new ie(this.f25682b, 9));
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f25681a) {
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
        switch (this.f25681a) {
            case 0:
                super.setAlpha(f7);
                cf cfVar = this.f25682b.J1;
                if (cfVar != null) {
                    cfVar.setTranslationX(cfVar.f24935a);
                    return;
                }
                return;
            case 1:
                super.setAlpha(f7);
                cf cfVar2 = this.f25682b.J1;
                if (cfVar2 != null) {
                    cfVar2.setTranslationX(cfVar2.f24935a);
                    return;
                }
                return;
            default:
                super.setAlpha(f7);
                xe xeVar = this.f25682b.Z0;
                if (xeVar != null) {
                    xeVar.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f25681a) {
            case 2:
                super.setVisibility(i10);
                xe xeVar = this.f25682b.Z0;
                if (xeVar != null) {
                    xeVar.invalidate();
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
