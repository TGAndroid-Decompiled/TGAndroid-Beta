package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class gf implements ViewTreeObserver.OnPreDrawListener {
    public final int f24514a;
    public final Dialog f24515b;
    public final ChatActivityEnterView f24516c;

    public gf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f24514a = i10;
        this.f24516c = chatActivityEnterView;
        this.f24515b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f24514a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f24516c;
                chatActivityEnterView.f22056p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f22056p0.postDelayed(new og(this.f24515b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f24516c;
                chatActivityEnterView2.f22056p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f22056p0.postDelayed(new og(this.f24515b, 18), 100L);
                return true;
        }
    }
}
