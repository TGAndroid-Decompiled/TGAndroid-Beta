package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class ef implements ViewTreeObserver.OnPreDrawListener {
    public final int f23627a;
    public final Dialog f23628b;
    public final ChatActivityEnterView f23629c;

    public ef(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f23627a = i10;
        this.f23629c = chatActivityEnterView;
        this.f23628b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f23627a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f23629c;
                chatActivityEnterView.f21816p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f21816p0.postDelayed(new ng(this.f23628b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f23629c;
                chatActivityEnterView2.f21816p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f21816p0.postDelayed(new ng(this.f23628b, 18), 100L);
                return true;
        }
    }
}
