package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class gf implements ViewTreeObserver.OnPreDrawListener {
    public final int f28571a;
    public final Dialog f28572b;
    public final ChatActivityEnterView f28573c;

    public gf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f28571a = i10;
        this.f28573c = chatActivityEnterView;
        this.f28572b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f28571a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f28573c;
                chatActivityEnterView.f25937p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f25937p0.postDelayed(new pg(this.f28572b, 20), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f28573c;
                chatActivityEnterView2.f25937p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f25937p0.postDelayed(new pg(this.f28572b, 20), 100L);
                return true;
        }
    }
}
