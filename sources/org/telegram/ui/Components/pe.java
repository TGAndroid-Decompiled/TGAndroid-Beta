package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class pe implements ViewTreeObserver.OnPreDrawListener {
    public final int f36987a;
    public final Dialog f36988b;
    public final ChatActivityEnterView f36989c;

    public pe(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i7) {
        this.f36987a = i7;
        this.f36989c = chatActivityEnterView;
        this.f36988b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f36987a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f36989c;
                chatActivityEnterView.f31098p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f31098p0.postDelayed(new xf(this.f36988b, 19), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f36989c;
                chatActivityEnterView2.f31098p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f31098p0.postDelayed(new xf(this.f36988b, 19), 100L);
                return true;
        }
    }
}
