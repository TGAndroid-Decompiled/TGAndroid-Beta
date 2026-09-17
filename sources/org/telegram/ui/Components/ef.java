package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class ef implements ViewTreeObserver.OnPreDrawListener {
    public final int f23544a;
    public final Dialog f23545b;
    public final ChatActivityEnterView f23546c;

    public ef(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f23544a = i10;
        this.f23546c = chatActivityEnterView;
        this.f23545b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f23544a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f23546c;
                chatActivityEnterView.f21829p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f21829p0.postDelayed(new ng(this.f23545b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f23546c;
                chatActivityEnterView2.f21829p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f21829p0.postDelayed(new ng(this.f23545b, 18), 100L);
                return true;
        }
    }
}
