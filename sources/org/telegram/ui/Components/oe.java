package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;

public final class oe extends ImageView {

    public final int f31266a;

    public final ChatActivityEnterView f31267b;

    public oe(ChatActivityEnterView chatActivityEnterView, Context context, int i10) {
        super(context);
        this.f31266a = i10;
        this.f31267b = chatActivityEnterView;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f31266a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                post(new ud(this.f31267b, 5));
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f31266a) {
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
        switch (this.f31266a) {
            case 0:
                super.setAlpha(f10);
                me meVar = this.f31267b.E1;
                if (meVar != null) {
                    meVar.setTranslationX(meVar.f30654a);
                }
                break;
            case 1:
                super.setAlpha(f10);
                me meVar2 = this.f31267b.E1;
                if (meVar2 != null) {
                    meVar2.setTranslationX(meVar2.f30654a);
                }
                break;
            default:
                super.setAlpha(f10);
                he heVar = this.f31267b.V0;
                if (heVar != null) {
                    heVar.invalidate();
                }
                break;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f31266a) {
            case 2:
                super.setVisibility(i10);
                he heVar = this.f31267b.V0;
                if (heVar != null) {
                    heVar.invalidate();
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }
}
