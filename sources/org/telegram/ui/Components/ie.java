package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
public final class ie extends ImageView {
    public final int f34679a;
    public final ChatActivityEnterView f34680b;

    public ie(ChatActivityEnterView chatActivityEnterView, Context context, int i3) {
        super(context);
        this.f34679a = i3;
        this.f34680b = chatActivityEnterView;
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.f34679a) {
            case 0:
                super.onLayout(z10, i3, i10, i11, i12);
                post(new pd(this.f34680b, 5));
                return;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f34679a) {
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
        switch (this.f34679a) {
            case 0:
                super.setAlpha(f10);
                ge geVar = this.f34680b.K1;
                if (geVar != null) {
                    geVar.setTranslationX(geVar.f34070a);
                    return;
                }
                return;
            case 1:
                super.setAlpha(f10);
                ge geVar2 = this.f34680b.K1;
                if (geVar2 != null) {
                    geVar2.setTranslationX(geVar2.f34070a);
                    return;
                }
                return;
            default:
                super.setAlpha(f10);
                be beVar = this.f34680b.f31085a1;
                if (beVar != null) {
                    beVar.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void setVisibility(int i3) {
        switch (this.f34679a) {
            case 2:
                super.setVisibility(i3);
                be beVar = this.f34680b.f31085a1;
                if (beVar != null) {
                    beVar.invalidate();
                    return;
                }
                return;
            default:
                super.setVisibility(i3);
                return;
        }
    }
}
