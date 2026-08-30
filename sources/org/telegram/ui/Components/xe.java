package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class xe implements ViewTreeObserver.OnPreDrawListener {
    public final int f30665a;
    public final Dialog f30666b;
    public final ChatActivityEnterView f30667c;

    public xe(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f30665a = i10;
        this.f30667c = chatActivityEnterView;
        this.f30666b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f30665a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f30667c;
                chatActivityEnterView.m0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.m0.postDelayed(new fg(this.f30666b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f30667c;
                chatActivityEnterView2.m0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.m0.postDelayed(new fg(this.f30666b, 18), 100L);
                return true;
        }
    }
}
