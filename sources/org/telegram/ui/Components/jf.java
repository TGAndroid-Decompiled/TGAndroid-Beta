package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class jf implements ViewTreeObserver.OnPreDrawListener {
    public final int f27765a;
    public final Dialog f27766b;
    public final ChatActivityEnterView f27767c;

    public jf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f27765a = i10;
        this.f27767c = chatActivityEnterView;
        this.f27766b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f27765a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f27767c;
                chatActivityEnterView.f23936p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f23936p0.postDelayed(new qg(this.f27766b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f27767c;
                chatActivityEnterView2.f23936p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f23936p0.postDelayed(new qg(this.f27766b, 18), 100L);
                return true;
        }
    }
}
