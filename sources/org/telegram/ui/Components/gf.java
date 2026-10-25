package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class gf implements ViewTreeObserver.OnPreDrawListener {
    public final int f28560a;
    public final Dialog f28561b;
    public final ChatActivityEnterView f28562c;

    public gf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f28560a = i10;
        this.f28562c = chatActivityEnterView;
        this.f28561b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f28560a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f28562c;
                chatActivityEnterView.f25933p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f25933p0.postDelayed(new pg(this.f28561b, 19), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f28562c;
                chatActivityEnterView2.f25933p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f25933p0.postDelayed(new pg(this.f28561b, 19), 100L);
                return true;
        }
    }
}
