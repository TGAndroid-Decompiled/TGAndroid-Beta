package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class nf implements ViewTreeObserver.OnPreDrawListener {
    public final int f28780a;
    public final Dialog f28781b;
    public final ChatActivityEnterView f28782c;

    public nf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f28780a = i10;
        this.f28782c = chatActivityEnterView;
        this.f28781b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f28780a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f28782c;
                chatActivityEnterView.f23708p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f23708p0.postDelayed(new tg(this.f28781b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f28782c;
                chatActivityEnterView2.f23708p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f23708p0.postDelayed(new tg(this.f28781b, 18), 100L);
                return true;
        }
    }
}
