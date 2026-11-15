package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class qe implements ViewTreeObserver.OnPreDrawListener {
    public final int f38641a;
    public final Dialog f38642b;
    public final ChatActivityEnterView f38643c;

    public qe(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i7) {
        this.f38641a = i7;
        this.f38643c = chatActivityEnterView;
        this.f38642b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f38641a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f38643c;
                chatActivityEnterView.f32265q0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f32265q0.postDelayed(new dg(this.f38642b, 20), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f38643c;
                chatActivityEnterView2.f32265q0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f32265q0.postDelayed(new dg(this.f38642b, 20), 100L);
                return true;
        }
    }
}
