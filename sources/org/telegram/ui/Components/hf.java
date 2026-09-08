package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class hf implements ViewTreeObserver.OnPreDrawListener {
    public final int f26743a;
    public final Dialog f26744b;
    public final ChatActivityEnterView f26745c;

    public hf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f26743a = i10;
        this.f26745c = chatActivityEnterView;
        this.f26744b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f26743a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f26745c;
                chatActivityEnterView.f23777p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f23777p0.postDelayed(new pg(this.f26744b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f26745c;
                chatActivityEnterView2.f23777p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f23777p0.postDelayed(new pg(this.f26744b, 18), 100L);
                return true;
        }
    }
}
