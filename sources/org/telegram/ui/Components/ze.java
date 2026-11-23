package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class ze implements ViewTreeObserver.OnPreDrawListener {
    public final int f42744a;
    public final Dialog f42745b;
    public final ChatActivityEnterView f42746c;

    public ze(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i7) {
        this.f42744a = i7;
        this.f42746c = chatActivityEnterView;
        this.f42745b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f42744a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f42746c;
                chatActivityEnterView.f32662q0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f32662q0.postDelayed(new ng(this.f42745b, 20), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f42746c;
                chatActivityEnterView2.f32662q0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f32662q0.postDelayed(new ng(this.f42745b, 20), 100L);
                return true;
        }
    }
}
