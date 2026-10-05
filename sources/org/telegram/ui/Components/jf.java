package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class jf implements ViewTreeObserver.OnPreDrawListener {
    public final int f27838a;
    public final Dialog f27839b;
    public final ChatActivityEnterView f27840c;

    public jf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f27838a = i10;
        this.f27840c = chatActivityEnterView;
        this.f27839b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f27838a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f27840c;
                chatActivityEnterView.f23944p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f23944p0.postDelayed(new qg(this.f27839b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f27840c;
                chatActivityEnterView2.f23944p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f23944p0.postDelayed(new qg(this.f27839b, 18), 100L);
                return true;
        }
    }
}
