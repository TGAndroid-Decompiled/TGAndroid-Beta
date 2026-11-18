package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class ze implements ViewTreeObserver.OnPreDrawListener {
    public final int f42877a;
    public final Dialog f42878b;
    public final ChatActivityEnterView f42879c;

    public ze(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i7) {
        this.f42877a = i7;
        this.f42879c = chatActivityEnterView;
        this.f42878b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f42877a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f42879c;
                chatActivityEnterView.f32662q0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f32662q0.postDelayed(new lg(this.f42878b, 20), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f42879c;
                chatActivityEnterView2.f32662q0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f32662q0.postDelayed(new lg(this.f42878b, 20), 100L);
                return true;
        }
    }
}
