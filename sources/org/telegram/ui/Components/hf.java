package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class hf implements ViewTreeObserver.OnPreDrawListener {
    public final int f24811a;
    public final Dialog f24812b;
    public final ChatActivityEnterView f24813c;

    public hf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f24811a = i10;
        this.f24813c = chatActivityEnterView;
        this.f24812b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f24811a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f24813c;
                chatActivityEnterView.f22041p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f22041p0.postDelayed(new pg(this.f24812b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f24813c;
                chatActivityEnterView2.f22041p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f22041p0.postDelayed(new pg(this.f24812b, 18), 100L);
                return true;
        }
    }
}
