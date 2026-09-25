package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class hf implements ViewTreeObserver.OnPreDrawListener {
    public final int f24762a;
    public final Dialog f24763b;
    public final ChatActivityEnterView f24764c;

    public hf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f24762a = i10;
        this.f24764c = chatActivityEnterView;
        this.f24763b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f24762a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f24764c;
                chatActivityEnterView.f22042p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f22042p0.postDelayed(new pg(this.f24763b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f24764c;
                chatActivityEnterView2.f22042p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f22042p0.postDelayed(new pg(this.f24763b, 18), 100L);
                return true;
        }
    }
}
