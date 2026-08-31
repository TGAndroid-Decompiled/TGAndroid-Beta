package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class xe implements ViewTreeObserver.OnPreDrawListener {
    public final int f33053a;
    public final Dialog f33054b;
    public final ChatActivityEnterView f33055c;

    public xe(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f33053a = i10;
        this.f33055c = chatActivityEnterView;
        this.f33054b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f33053a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f33055c;
                chatActivityEnterView.m0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.m0.postDelayed(new fg(this.f33054b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f33055c;
                chatActivityEnterView2.m0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.m0.postDelayed(new fg(this.f33054b, 18), 100L);
                return true;
        }
    }
}
