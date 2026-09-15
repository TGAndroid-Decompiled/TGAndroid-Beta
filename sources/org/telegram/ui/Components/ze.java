package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
public final class ze extends ImageView {
    public final int f30584a;
    public final ChatActivityEnterView f30585b;

    public ze(ChatActivityEnterView chatActivityEnterView, Context context, int i10) {
        super(context);
        this.f30584a = i10;
        this.f30585b = chatActivityEnterView;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f30584a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                post(new ge(this.f30585b, 5));
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f30584a) {
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
        switch (this.f30584a) {
            case 0:
                super.setAlpha(f7);
                xe xeVar = this.f30585b.I1;
                if (xeVar != null) {
                    xeVar.setTranslationX(xeVar.f29924a);
                    return;
                }
                return;
            case 1:
                super.setAlpha(f7);
                xe xeVar2 = this.f30585b.I1;
                if (xeVar2 != null) {
                    xeVar2.setTranslationX(xeVar2.f29924a);
                    return;
                }
                return;
            default:
                super.setAlpha(f7);
                se seVar = this.f30585b.Z0;
                if (seVar != null) {
                    seVar.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f30584a) {
            case 2:
                super.setVisibility(i10);
                se seVar = this.f30585b.Z0;
                if (seVar != null) {
                    seVar.invalidate();
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
