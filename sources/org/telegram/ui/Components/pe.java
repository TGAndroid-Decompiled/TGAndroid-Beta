package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class pe implements ViewTreeObserver.OnPreDrawListener {
    public final int f36999a;
    public final Dialog f37000b;
    public final ChatActivityEnterView f37001c;

    public pe(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i7) {
        this.f36999a = i7;
        this.f37001c = chatActivityEnterView;
        this.f37000b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f36999a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f37001c;
                chatActivityEnterView.f31108p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f31108p0.postDelayed(new xf(this.f37000b, 19), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f37001c;
                chatActivityEnterView2.f31108p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f31108p0.postDelayed(new xf(this.f37000b, 19), 100L);
                return true;
        }
    }
}
