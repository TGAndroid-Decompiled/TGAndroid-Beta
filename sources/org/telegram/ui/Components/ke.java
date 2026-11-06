package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
public final class ke extends ImageView {
    public final int f35258a;
    public final ChatActivityEnterView f35259b;

    public ke(ChatActivityEnterView chatActivityEnterView, Context context, int i7) {
        super(context);
        this.f35258a = i7;
        this.f35259b = chatActivityEnterView;
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f35258a) {
            case 0:
                super.onLayout(z9, i7, i10, i11, i12);
                post(new rd(this.f35259b, 5));
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f35258a) {
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
        switch (this.f35258a) {
            case 0:
                super.setAlpha(f10);
                ie ieVar = this.f35259b.J1;
                if (ieVar != null) {
                    ieVar.setTranslationX(ieVar.f34592a);
                    return;
                }
                return;
            case 1:
                super.setAlpha(f10);
                ie ieVar2 = this.f35259b.J1;
                if (ieVar2 != null) {
                    ieVar2.setTranslationX(ieVar2.f34592a);
                    return;
                }
                return;
            default:
                super.setAlpha(f10);
                de deVar = this.f35259b.Z0;
                if (deVar != null) {
                    deVar.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.f35258a) {
            case 2:
                super.setVisibility(i7);
                de deVar = this.f35259b.Z0;
                if (deVar != null) {
                    deVar.invalidate();
                    return;
                }
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }
}
