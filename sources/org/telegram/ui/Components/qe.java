package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class qe implements ViewTreeObserver.OnPreDrawListener {
    public final int f38639a;
    public final Dialog f38640b;
    public final ChatActivityEnterView f38641c;

    public qe(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i7) {
        this.f38639a = i7;
        this.f38641c = chatActivityEnterView;
        this.f38640b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f38639a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f38641c;
                chatActivityEnterView.f32265q0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f32265q0.postDelayed(new dg(this.f38640b, 20), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f38641c;
                chatActivityEnterView2.f32265q0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f32265q0.postDelayed(new dg(this.f38640b, 20), 100L);
                return true;
        }
    }
}
