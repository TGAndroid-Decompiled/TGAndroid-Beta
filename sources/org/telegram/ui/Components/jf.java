package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class jf implements ViewTreeObserver.OnPreDrawListener {
    public final int f25987a;
    public final Dialog f25988b;
    public final ChatActivityEnterView f25989c;

    public jf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f25987a = i10;
        this.f25989c = chatActivityEnterView;
        this.f25988b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f25987a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f25989c;
                chatActivityEnterView.f22639p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f22639p0.postDelayed(new qg(this.f25988b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f25989c;
                chatActivityEnterView2.f22639p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f22639p0.postDelayed(new qg(this.f25988b, 18), 100L);
                return true;
        }
    }
}
