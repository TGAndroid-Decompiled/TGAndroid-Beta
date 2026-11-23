package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class ze implements ViewTreeObserver.OnPreDrawListener {
    public final int f42786a;
    public final Dialog f42787b;
    public final ChatActivityEnterView f42788c;

    public ze(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i7) {
        this.f42786a = i7;
        this.f42788c = chatActivityEnterView;
        this.f42787b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f42786a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f42788c;
                chatActivityEnterView.f32696q0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f32696q0.postDelayed(new og(this.f42787b, 20), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f42788c;
                chatActivityEnterView2.f32696q0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f32696q0.postDelayed(new og(this.f42787b, 20), 100L);
                return true;
        }
    }
}
