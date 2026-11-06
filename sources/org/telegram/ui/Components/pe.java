package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class pe implements ViewTreeObserver.OnPreDrawListener {
    public final int f36866a;
    public final Dialog f36867b;
    public final ChatActivityEnterView f36868c;

    public pe(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i7) {
        this.f36866a = i7;
        this.f36868c = chatActivityEnterView;
        this.f36867b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f36866a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f36868c;
                chatActivityEnterView.f31098p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f31098p0.postDelayed(new xf(this.f36867b, 19), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f36868c;
                chatActivityEnterView2.f31098p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f31098p0.postDelayed(new xf(this.f36867b, 19), 100L);
                return true;
        }
    }
}
