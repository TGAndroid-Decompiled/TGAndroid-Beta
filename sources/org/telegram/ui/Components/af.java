package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class af implements ViewTreeObserver.OnPreDrawListener {
    public final int f33468a;
    public final Dialog f33469b;
    public final ChatActivityEnterView f33470c;

    public af(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i7) {
        this.f33468a = i7;
        this.f33470c = chatActivityEnterView;
        this.f33469b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f33468a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f33470c;
                chatActivityEnterView.f32760q0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f32760q0.postDelayed(new ng(this.f33469b, 20), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f33470c;
                chatActivityEnterView2.f32760q0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f32760q0.postDelayed(new ng(this.f33469b, 20), 100L);
                return true;
        }
    }
}
