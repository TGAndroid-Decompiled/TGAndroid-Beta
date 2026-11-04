package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class ne implements ViewTreeObserver.OnPreDrawListener {
    public final int f36493a;
    public final Dialog f36494b;
    public final ChatActivityEnterView f36495c;

    public ne(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i3) {
        this.f36493a = i3;
        this.f36495c = chatActivityEnterView;
        this.f36494b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f36493a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f36495c;
                chatActivityEnterView.f31179q0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f31179q0.postDelayed(new vf(this.f36494b, 19), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f36495c;
                chatActivityEnterView2.f31179q0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f31179q0.postDelayed(new vf(this.f36494b, 19), 100L);
                return true;
        }
    }
}
