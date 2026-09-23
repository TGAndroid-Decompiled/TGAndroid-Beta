package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class gf implements ViewTreeObserver.OnPreDrawListener {
    public final int f24273a;
    public final Dialog f24274b;
    public final ChatActivityEnterView f24275c;

    public gf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f24273a = i10;
        this.f24275c = chatActivityEnterView;
        this.f24274b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f24273a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f24275c;
                chatActivityEnterView.f21790p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f21790p0.postDelayed(new og(this.f24274b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f24275c;
                chatActivityEnterView2.f21790p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f21790p0.postDelayed(new og(this.f24274b, 18), 100L);
                return true;
        }
    }
}
