package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class hf implements ViewTreeObserver.OnPreDrawListener {
    public final int f24735a;
    public final Dialog f24736b;
    public final ChatActivityEnterView f24737c;

    public hf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f24735a = i10;
        this.f24737c = chatActivityEnterView;
        this.f24736b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f24735a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f24737c;
                chatActivityEnterView.f22027p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f22027p0.postDelayed(new pg(this.f24736b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f24737c;
                chatActivityEnterView2.f22027p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f22027p0.postDelayed(new pg(this.f24736b, 18), 100L);
                return true;
        }
    }
}
