package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class hf implements ViewTreeObserver.OnPreDrawListener {
    public final int f26716a;
    public final Dialog f26717b;
    public final ChatActivityEnterView f26718c;

    public hf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f26716a = i10;
        this.f26718c = chatActivityEnterView;
        this.f26717b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f26716a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f26718c;
                chatActivityEnterView.f23750p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f23750p0.postDelayed(new pg(this.f26717b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f26718c;
                chatActivityEnterView2.f23750p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f23750p0.postDelayed(new pg(this.f26717b, 18), 100L);
                return true;
        }
    }
}
