package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class hf implements ViewTreeObserver.OnPreDrawListener {
    public final int f24831a;
    public final Dialog f24832b;
    public final ChatActivityEnterView f24833c;

    public hf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f24831a = i10;
        this.f24833c = chatActivityEnterView;
        this.f24832b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f24831a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f24833c;
                chatActivityEnterView.f22044p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f22044p0.postDelayed(new pg(this.f24832b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f24833c;
                chatActivityEnterView2.f22044p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f22044p0.postDelayed(new pg(this.f24832b, 18), 100L);
                return true;
        }
    }
}
