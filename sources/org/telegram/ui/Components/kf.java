package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class kf implements ViewTreeObserver.OnPreDrawListener {
    public final int f28055a;
    public final Dialog f28056b;
    public final ChatActivityEnterView f28057c;

    public kf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f28055a = i10;
        this.f28057c = chatActivityEnterView;
        this.f28056b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f28055a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f28057c;
                chatActivityEnterView.f23968p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f23968p0.postDelayed(new rg(this.f28056b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f28057c;
                chatActivityEnterView2.f23968p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f23968p0.postDelayed(new rg(this.f28056b, 18), 100L);
                return true;
        }
    }
}
