package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class gf implements ViewTreeObserver.OnPreDrawListener {
    public final int f26555a;
    public final Dialog f26556b;
    public final ChatActivityEnterView f26557c;

    public gf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f26555a = i10;
        this.f26557c = chatActivityEnterView;
        this.f26556b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f26555a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f26557c;
                chatActivityEnterView.f23994p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f23994p0.postDelayed(new pg(this.f26556b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f26557c;
                chatActivityEnterView2.f23994p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f23994p0.postDelayed(new pg(this.f26556b, 18), 100L);
                return true;
        }
    }
}
