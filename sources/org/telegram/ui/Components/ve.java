package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
public final class ve extends ImageView {
    public final int f33536a;
    public final ChatActivityEnterView f33537b;

    public ve(ChatActivityEnterView chatActivityEnterView, Context context, int i10) {
        super(context);
        this.f33536a = i10;
        this.f33537b = chatActivityEnterView;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f33536a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                post(new be(this.f33537b, 5));
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f33536a) {
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
    public final void setAlpha(float f9) {
        switch (this.f33536a) {
            case 0:
                super.setAlpha(f9);
                te teVar = this.f33537b.E1;
                if (teVar != null) {
                    teVar.setTranslationX(teVar.f32928a);
                    return;
                }
                return;
            case 1:
                super.setAlpha(f9);
                te teVar2 = this.f33537b.E1;
                if (teVar2 != null) {
                    teVar2.setTranslationX(teVar2.f32928a);
                    return;
                }
                return;
            default:
                super.setAlpha(f9);
                oe oeVar = this.f33537b.V0;
                if (oeVar != null) {
                    oeVar.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f33536a) {
            case 2:
                super.setVisibility(i10);
                oe oeVar = this.f33537b.V0;
                if (oeVar != null) {
                    oeVar.invalidate();
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
