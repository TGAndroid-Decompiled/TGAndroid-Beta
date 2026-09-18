package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class gf implements ViewTreeObserver.OnPreDrawListener {
    public final int f24379a;
    public final Dialog f24380b;
    public final ChatActivityEnterView f24381c;

    public gf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f24379a = i10;
        this.f24381c = chatActivityEnterView;
        this.f24380b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f24379a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f24381c;
                chatActivityEnterView.f22005p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f22005p0.postDelayed(new og(this.f24380b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f24381c;
                chatActivityEnterView2.f22005p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f22005p0.postDelayed(new og(this.f24380b, 18), 100L);
                return true;
        }
    }
}
