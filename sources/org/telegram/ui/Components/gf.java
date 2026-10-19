package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class gf implements ViewTreeObserver.OnPreDrawListener {
    public final int f26582a;
    public final Dialog f26583b;
    public final ChatActivityEnterView f26584c;

    public gf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f26582a = i10;
        this.f26584c = chatActivityEnterView;
        this.f26583b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f26582a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f26584c;
                chatActivityEnterView.f23995p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f23995p0.postDelayed(new pg(this.f26583b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f26584c;
                chatActivityEnterView2.f23995p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f23995p0.postDelayed(new pg(this.f26583b, 18), 100L);
                return true;
        }
    }
}
