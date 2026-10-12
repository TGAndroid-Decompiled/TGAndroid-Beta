package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class jf implements ViewTreeObserver.OnPreDrawListener {
    public final int f26346a;
    public final Dialog f26347b;
    public final ChatActivityEnterView f26348c;

    public jf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f26346a = i10;
        this.f26348c = chatActivityEnterView;
        this.f26347b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f26346a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f26348c;
                chatActivityEnterView.f22939p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f22939p0.postDelayed(new qg(this.f26347b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f26348c;
                chatActivityEnterView2.f22939p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f22939p0.postDelayed(new qg(this.f26347b, 18), 100L);
                return true;
        }
    }
}
