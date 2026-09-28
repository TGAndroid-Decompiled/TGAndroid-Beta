package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class hf implements ViewTreeObserver.OnPreDrawListener {
    public final int f24812a;
    public final Dialog f24813b;
    public final ChatActivityEnterView f24814c;

    public hf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f24812a = i10;
        this.f24814c = chatActivityEnterView;
        this.f24813b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f24812a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f24814c;
                chatActivityEnterView.f22042p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f22042p0.postDelayed(new pg(this.f24813b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f24814c;
                chatActivityEnterView2.f22042p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f22042p0.postDelayed(new pg(this.f24813b, 18), 100L);
                return true;
        }
    }
}
