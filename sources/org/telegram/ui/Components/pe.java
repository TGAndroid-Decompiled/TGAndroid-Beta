package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class pe implements ViewTreeObserver.OnPreDrawListener {
    public final int f36882a;
    public final Dialog f36883b;
    public final ChatActivityEnterView f36884c;

    public pe(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i7) {
        this.f36882a = i7;
        this.f36884c = chatActivityEnterView;
        this.f36883b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f36882a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f36884c;
                chatActivityEnterView.f31099p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f31099p0.postDelayed(new xf(this.f36883b, 19), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f36884c;
                chatActivityEnterView2.f31099p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f31099p0.postDelayed(new xf(this.f36883b, 19), 100L);
                return true;
        }
    }
}
