package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class ef implements ViewTreeObserver.OnPreDrawListener {
    public final int f23630a;
    public final Dialog f23631b;
    public final ChatActivityEnterView f23632c;

    public ef(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f23630a = i10;
        this.f23632c = chatActivityEnterView;
        this.f23631b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f23630a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f23632c;
                chatActivityEnterView.f21819p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f21819p0.postDelayed(new ng(this.f23631b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f23632c;
                chatActivityEnterView2.f21819p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f21819p0.postDelayed(new ng(this.f23631b, 18), 100L);
                return true;
        }
    }
}
