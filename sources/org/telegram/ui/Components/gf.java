package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class gf implements ViewTreeObserver.OnPreDrawListener {
    public final int f26562a;
    public final Dialog f26563b;
    public final ChatActivityEnterView f26564c;

    public gf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f26562a = i10;
        this.f26564c = chatActivityEnterView;
        this.f26563b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f26562a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f26564c;
                chatActivityEnterView.f24001p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f24001p0.postDelayed(new pg(this.f26563b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f26564c;
                chatActivityEnterView2.f24001p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f24001p0.postDelayed(new pg(this.f26563b, 18), 100L);
                return true;
        }
    }
}
