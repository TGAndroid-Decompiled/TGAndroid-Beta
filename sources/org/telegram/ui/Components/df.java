package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
public final class df extends ImageView {
    public final int f23620a;
    public final ChatActivityEnterView f23621b;

    public df(ChatActivityEnterView chatActivityEnterView, Context context, int i10) {
        super(context);
        this.f23620a = i10;
        this.f23621b = chatActivityEnterView;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f23620a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                post(new ke(this.f23621b, 5));
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f23620a) {
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
        switch (this.f23620a) {
            case 0:
                super.setAlpha(f7);
                bf bfVar = this.f23621b.J1;
                if (bfVar != null) {
                    bfVar.setTranslationX(bfVar.f22928a);
                    return;
                }
                return;
            case 1:
                super.setAlpha(f7);
                bf bfVar2 = this.f23621b.J1;
                if (bfVar2 != null) {
                    bfVar2.setTranslationX(bfVar2.f22928a);
                    return;
                }
                return;
            default:
                super.setAlpha(f7);
                we weVar = this.f23621b.Z0;
                if (weVar != null) {
                    weVar.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f23620a) {
            case 2:
                super.setVisibility(i10);
                we weVar = this.f23621b.Z0;
                if (weVar != null) {
                    weVar.invalidate();
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
