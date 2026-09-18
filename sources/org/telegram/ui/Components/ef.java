package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class ef implements ViewTreeObserver.OnPreDrawListener {
    public final int f23547a;
    public final Dialog f23548b;
    public final ChatActivityEnterView f23549c;

    public ef(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f23547a = i10;
        this.f23549c = chatActivityEnterView;
        this.f23548b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f23547a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f23549c;
                chatActivityEnterView.f21832p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f21832p0.postDelayed(new ng(this.f23548b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f23549c;
                chatActivityEnterView2.f21832p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f21832p0.postDelayed(new ng(this.f23548b, 18), 100L);
                return true;
        }
    }
}
