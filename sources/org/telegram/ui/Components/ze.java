package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class ze implements ViewTreeObserver.OnPreDrawListener {
    public final int f42783a;
    public final Dialog f42784b;
    public final ChatActivityEnterView f42785c;

    public ze(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i7) {
        this.f42783a = i7;
        this.f42785c = chatActivityEnterView;
        this.f42784b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f42783a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f42785c;
                chatActivityEnterView.f32693q0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f32693q0.postDelayed(new og(this.f42784b, 20), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f42785c;
                chatActivityEnterView2.f32693q0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f32693q0.postDelayed(new og(this.f42784b, 20), 100L);
                return true;
        }
    }
}
