package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class hf implements ViewTreeObserver.OnPreDrawListener {
    public final int f24761a;
    public final Dialog f24762b;
    public final ChatActivityEnterView f24763c;

    public hf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f24761a = i10;
        this.f24763c = chatActivityEnterView;
        this.f24762b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f24761a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f24763c;
                chatActivityEnterView.f22041p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f22041p0.postDelayed(new pg(this.f24762b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f24763c;
                chatActivityEnterView2.f22041p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f22041p0.postDelayed(new pg(this.f24762b, 18), 100L);
                return true;
        }
    }
}
