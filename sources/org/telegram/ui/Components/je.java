package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
public final class je extends ImageView {
    public final int f34920a;
    public final ChatActivityEnterView f34921b;

    public je(ChatActivityEnterView chatActivityEnterView, Context context, int i7) {
        super(context);
        this.f34920a = i7;
        this.f34921b = chatActivityEnterView;
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f34920a) {
            case 0:
                super.onLayout(z9, i7, i10, i11, i12);
                post(new qd(this.f34921b, 5));
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f34920a) {
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
        switch (this.f34920a) {
            case 0:
                super.setAlpha(f10);
                he heVar = this.f34921b.J1;
                if (heVar != null) {
                    heVar.setTranslationX(heVar.f34319a);
                    return;
                }
                return;
            case 1:
                super.setAlpha(f10);
                he heVar2 = this.f34921b.J1;
                if (heVar2 != null) {
                    heVar2.setTranslationX(heVar2.f34319a);
                    return;
                }
                return;
            default:
                super.setAlpha(f10);
                ce ceVar = this.f34921b.Z0;
                if (ceVar != null) {
                    ceVar.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.f34920a) {
            case 2:
                super.setVisibility(i7);
                ce ceVar = this.f34921b.Z0;
                if (ceVar != null) {
                    ceVar.invalidate();
                    return;
                }
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }
}
