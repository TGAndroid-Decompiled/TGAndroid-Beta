package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class ze implements ViewTreeObserver.OnPreDrawListener {
    public final int f42787a;
    public final Dialog f42788b;
    public final ChatActivityEnterView f42789c;

    public ze(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i7) {
        this.f42787a = i7;
        this.f42789c = chatActivityEnterView;
        this.f42788b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f42787a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f42789c;
                chatActivityEnterView.f32696q0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f32696q0.postDelayed(new og(this.f42788b, 20), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f42789c;
                chatActivityEnterView2.f32696q0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f32696q0.postDelayed(new og(this.f42788b, 20), 100L);
                return true;
        }
    }
}
