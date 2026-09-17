package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class hf implements ViewTreeObserver.OnPreDrawListener {
    public final int f26744a;
    public final Dialog f26745b;
    public final ChatActivityEnterView f26746c;

    public hf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f26744a = i10;
        this.f26746c = chatActivityEnterView;
        this.f26745b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f26744a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f26746c;
                chatActivityEnterView.f23778p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f23778p0.postDelayed(new pg(this.f26745b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f26746c;
                chatActivityEnterView2.f23778p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f23778p0.postDelayed(new pg(this.f26745b, 18), 100L);
                return true;
        }
    }
}
