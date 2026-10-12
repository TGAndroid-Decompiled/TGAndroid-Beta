package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class nf implements ViewTreeObserver.OnPreDrawListener {
    public final int f28791a;
    public final Dialog f28792b;
    public final ChatActivityEnterView f28793c;

    public nf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f28791a = i10;
        this.f28793c = chatActivityEnterView;
        this.f28792b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f28791a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f28793c;
                chatActivityEnterView.f23707p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f23707p0.postDelayed(new tg(this.f28792b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f28793c;
                chatActivityEnterView2.f23707p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f23707p0.postDelayed(new tg(this.f28792b, 18), 100L);
                return true;
        }
    }
}
