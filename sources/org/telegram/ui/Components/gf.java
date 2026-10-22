package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class gf implements ViewTreeObserver.OnPreDrawListener {
    public final int f26581a;
    public final Dialog f26582b;
    public final ChatActivityEnterView f26583c;

    public gf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f26581a = i10;
        this.f26583c = chatActivityEnterView;
        this.f26582b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f26581a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f26583c;
                chatActivityEnterView.f24001p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f24001p0.postDelayed(new pg(this.f26582b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f26583c;
                chatActivityEnterView2.f24001p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f24001p0.postDelayed(new pg(this.f26582b, 18), 100L);
                return true;
        }
    }
}
