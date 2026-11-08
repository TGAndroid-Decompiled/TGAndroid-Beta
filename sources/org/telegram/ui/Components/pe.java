package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class pe implements ViewTreeObserver.OnPreDrawListener {
    public final int f36908a;
    public final Dialog f36909b;
    public final ChatActivityEnterView f36910c;

    public pe(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i7) {
        this.f36908a = i7;
        this.f36910c = chatActivityEnterView;
        this.f36909b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f36908a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f36910c;
                chatActivityEnterView.f31103p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f31103p0.postDelayed(new xf(this.f36909b, 19), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f36910c;
                chatActivityEnterView2.f31103p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f31103p0.postDelayed(new xf(this.f36909b, 19), 100L);
                return true;
        }
    }
}
