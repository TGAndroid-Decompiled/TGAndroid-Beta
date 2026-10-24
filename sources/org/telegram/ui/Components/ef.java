package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class ef implements ViewTreeObserver.OnPreDrawListener {
    public final int f26027a;
    public final Dialog f26028b;
    public final ChatActivityEnterView f26029c;

    public ef(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f26027a = i10;
        this.f26029c = chatActivityEnterView;
        this.f26028b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f26027a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f26029c;
                chatActivityEnterView.f24143p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f24143p0.postDelayed(new ng(this.f26028b, 19), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f26029c;
                chatActivityEnterView2.f24143p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f24143p0.postDelayed(new ng(this.f26028b, 19), 100L);
                return true;
        }
    }
}
