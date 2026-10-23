package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class gf implements ViewTreeObserver.OnPreDrawListener {
    public final int f26601a;
    public final Dialog f26602b;
    public final ChatActivityEnterView f26603c;

    public gf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f26601a = i10;
        this.f26603c = chatActivityEnterView;
        this.f26602b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f26601a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f26603c;
                chatActivityEnterView.f24142p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f24142p0.postDelayed(new pg(this.f26602b, 19), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f26603c;
                chatActivityEnterView2.f24142p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f24142p0.postDelayed(new pg(this.f26602b, 19), 100L);
                return true;
        }
    }
}
