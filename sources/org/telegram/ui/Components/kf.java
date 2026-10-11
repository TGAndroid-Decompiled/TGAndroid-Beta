package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class kf implements ViewTreeObserver.OnPreDrawListener {
    public final int f27957a;
    public final Dialog f27958b;
    public final ChatActivityEnterView f27959c;

    public kf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f27957a = i10;
        this.f27959c = chatActivityEnterView;
        this.f27958b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f27957a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f27959c;
                chatActivityEnterView.f23932p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f23932p0.postDelayed(new rg(this.f27958b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f27959c;
                chatActivityEnterView2.f23932p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f23932p0.postDelayed(new rg(this.f27958b, 18), 100L);
                return true;
        }
    }
}
