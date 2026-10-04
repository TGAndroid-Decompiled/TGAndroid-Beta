package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class jf implements ViewTreeObserver.OnPreDrawListener {
    public final int f27771a;
    public final Dialog f27772b;
    public final ChatActivityEnterView f27773c;

    public jf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f27771a = i10;
        this.f27773c = chatActivityEnterView;
        this.f27772b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f27771a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f27773c;
                chatActivityEnterView.f23941p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f23941p0.postDelayed(new qg(this.f27772b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f27773c;
                chatActivityEnterView2.f23941p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f23941p0.postDelayed(new qg(this.f27772b, 18), 100L);
                return true;
        }
    }
}
