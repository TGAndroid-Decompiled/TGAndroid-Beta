package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class hf implements ViewTreeObserver.OnPreDrawListener {
    public final int f24780a;
    public final Dialog f24781b;
    public final ChatActivityEnterView f24782c;

    public hf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f24780a = i10;
        this.f24782c = chatActivityEnterView;
        this.f24781b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f24780a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f24782c;
                chatActivityEnterView.f22041p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f22041p0.postDelayed(new pg(this.f24781b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f24782c;
                chatActivityEnterView2.f22041p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f22041p0.postDelayed(new pg(this.f24781b, 18), 100L);
                return true;
        }
    }
}
