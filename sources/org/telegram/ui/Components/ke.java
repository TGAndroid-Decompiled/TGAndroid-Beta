package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class ke implements ViewTreeObserver.OnPreDrawListener {
    public final int f27828a;
    public final Dialog f27829b;
    public final ChatActivityEnterView f27830c;

    public ke(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f27828a = i10;
        this.f27830c = chatActivityEnterView;
        this.f27829b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f27828a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f27830c;
                chatActivityEnterView.f23765p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f23765p0.postDelayed(new tf(this.f27829b, 20), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f27830c;
                chatActivityEnterView2.f23765p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f23765p0.postDelayed(new tf(this.f27829b, 20), 100L);
                return true;
        }
    }
}
