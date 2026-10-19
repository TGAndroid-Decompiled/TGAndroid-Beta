package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class gf implements ViewTreeObserver.OnPreDrawListener {
    public final int f26584a;
    public final Dialog f26585b;
    public final ChatActivityEnterView f26586c;

    public gf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f26584a = i10;
        this.f26586c = chatActivityEnterView;
        this.f26585b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f26584a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f26586c;
                chatActivityEnterView.f23997p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f23997p0.postDelayed(new pg(this.f26585b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f26586c;
                chatActivityEnterView2.f23997p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f23997p0.postDelayed(new pg(this.f26585b, 18), 100L);
                return true;
        }
    }
}
