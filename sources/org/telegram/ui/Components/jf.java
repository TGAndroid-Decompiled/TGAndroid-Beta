package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class jf implements ViewTreeObserver.OnPreDrawListener {
    public final int f27766a;
    public final Dialog f27767b;
    public final ChatActivityEnterView f27768c;

    public jf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f27766a = i10;
        this.f27768c = chatActivityEnterView;
        this.f27767b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f27766a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f27768c;
                chatActivityEnterView.f23937p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f23937p0.postDelayed(new qg(this.f27767b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f27768c;
                chatActivityEnterView2.f23937p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f23937p0.postDelayed(new qg(this.f27767b, 18), 100L);
                return true;
        }
    }
}
