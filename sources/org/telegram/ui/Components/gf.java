package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class gf implements ViewTreeObserver.OnPreDrawListener {
    public final int f26578a;
    public final Dialog f26579b;
    public final ChatActivityEnterView f26580c;

    public gf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f26578a = i10;
        this.f26580c = chatActivityEnterView;
        this.f26579b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f26578a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f26580c;
                chatActivityEnterView.f23998p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f23998p0.postDelayed(new pg(this.f26579b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f26580c;
                chatActivityEnterView2.f23998p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f23998p0.postDelayed(new pg(this.f26579b, 18), 100L);
                return true;
        }
    }
}
