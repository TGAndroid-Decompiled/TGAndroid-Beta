package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class kf implements ViewTreeObserver.OnPreDrawListener {
    public final int f28008a;
    public final Dialog f28009b;
    public final ChatActivityEnterView f28010c;

    public kf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f28008a = i10;
        this.f28010c = chatActivityEnterView;
        this.f28009b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f28008a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f28010c;
                chatActivityEnterView.f23944p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f23944p0.postDelayed(new rg(this.f28009b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f28010c;
                chatActivityEnterView2.f23944p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f23944p0.postDelayed(new rg(this.f28009b, 18), 100L);
                return true;
        }
    }
}
