package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class jf implements ViewTreeObserver.OnPreDrawListener {
    public final int f24386a;
    public final Dialog f24387b;
    public final ChatActivityEnterView f24388c;

    public jf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f24386a = i10;
        this.f24388c = chatActivityEnterView;
        this.f24387b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f24386a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f24388c;
                chatActivityEnterView.f20904p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f20904p0.postDelayed(new rg(this.f24387b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f24388c;
                chatActivityEnterView2.f20904p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f20904p0.postDelayed(new rg(this.f24387b, 18), 100L);
                return true;
        }
    }
}
