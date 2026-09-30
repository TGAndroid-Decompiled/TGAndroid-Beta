package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class jf implements ViewTreeObserver.OnPreDrawListener {
    public final int f25433a;
    public final Dialog f25434b;
    public final ChatActivityEnterView f25435c;

    public jf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f25433a = i10;
        this.f25435c = chatActivityEnterView;
        this.f25434b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f25433a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f25435c;
                chatActivityEnterView.f22063p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f22063p0.postDelayed(new qg(this.f25434b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f25435c;
                chatActivityEnterView2.f22063p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f22063p0.postDelayed(new qg(this.f25434b, 18), 100L);
                return true;
        }
    }
}
