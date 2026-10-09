package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class kf implements ViewTreeObserver.OnPreDrawListener {
    public final int f27964a;
    public final Dialog f27965b;
    public final ChatActivityEnterView f27966c;

    public kf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f27964a = i10;
        this.f27966c = chatActivityEnterView;
        this.f27965b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f27964a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f27966c;
                chatActivityEnterView.f23940p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f23940p0.postDelayed(new rg(this.f27965b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f27966c;
                chatActivityEnterView2.f23940p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f23940p0.postDelayed(new rg(this.f27965b, 18), 100L);
                return true;
        }
    }
}
