package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
public final class cf extends ImageView {
    public final int f25024a;
    public final ChatActivityEnterView f25025b;

    public cf(ChatActivityEnterView chatActivityEnterView, Context context, int i10) {
        super(context);
        this.f25024a = i10;
        this.f25025b = chatActivityEnterView;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f25024a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                post(new ie(this.f25025b, 5));
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f25024a) {
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
        switch (this.f25024a) {
            case 0:
                super.setAlpha(f7);
                af afVar = this.f25025b.I1;
                if (afVar != null) {
                    afVar.setTranslationX(afVar.f24378a);
                    return;
                }
                return;
            case 1:
                super.setAlpha(f7);
                af afVar2 = this.f25025b.I1;
                if (afVar2 != null) {
                    afVar2.setTranslationX(afVar2.f24378a);
                    return;
                }
                return;
            default:
                super.setAlpha(f7);
                ve veVar = this.f25025b.Z0;
                if (veVar != null) {
                    veVar.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f25024a) {
            case 2:
                super.setVisibility(i10);
                ve veVar = this.f25025b.Z0;
                if (veVar != null) {
                    veVar.invalidate();
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
