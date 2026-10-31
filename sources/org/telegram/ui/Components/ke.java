package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class ke implements ViewTreeObserver.OnPreDrawListener {
    public final int f27735a;
    public final Dialog f27736b;
    public final ChatActivityEnterView f27737c;

    public ke(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f27735a = i10;
        this.f27737c = chatActivityEnterView;
        this.f27736b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f27735a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f27737c;
                chatActivityEnterView.f23764p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f23764p0.postDelayed(new tf(this.f27736b, 20), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f27737c;
                chatActivityEnterView2.f23764p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f23764p0.postDelayed(new tf(this.f27736b, 20), 100L);
                return true;
        }
    }
}
