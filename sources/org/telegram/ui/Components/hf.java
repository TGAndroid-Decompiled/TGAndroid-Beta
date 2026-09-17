package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class hf implements ViewTreeObserver.OnPreDrawListener {
    public final int f26717a;
    public final Dialog f26718b;
    public final ChatActivityEnterView f26719c;

    public hf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f26717a = i10;
        this.f26719c = chatActivityEnterView;
        this.f26718b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f26717a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f26719c;
                chatActivityEnterView.f23751p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f23751p0.postDelayed(new pg(this.f26718b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f26719c;
                chatActivityEnterView2.f23751p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f23751p0.postDelayed(new pg(this.f26718b, 18), 100L);
                return true;
        }
    }
}
