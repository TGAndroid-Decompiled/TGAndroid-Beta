package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class gf implements ViewTreeObserver.OnPreDrawListener {
    public final int f28562a;
    public final Dialog f28563b;
    public final ChatActivityEnterView f28564c;

    public gf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f28562a = i10;
        this.f28564c = chatActivityEnterView;
        this.f28563b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f28562a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f28564c;
                chatActivityEnterView.f25935p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f25935p0.postDelayed(new pg(this.f28563b, 19), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f28564c;
                chatActivityEnterView2.f25935p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f25935p0.postDelayed(new pg(this.f28563b, 19), 100L);
                return true;
        }
    }
}
