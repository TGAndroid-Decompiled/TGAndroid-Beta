package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class hf implements ViewTreeObserver.OnPreDrawListener {
    public final int f24792a;
    public final Dialog f24793b;
    public final ChatActivityEnterView f24794c;

    public hf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f24792a = i10;
        this.f24794c = chatActivityEnterView;
        this.f24793b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f24792a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f24794c;
                chatActivityEnterView.f22043p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f22043p0.postDelayed(new pg(this.f24793b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f24794c;
                chatActivityEnterView2.f22043p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f22043p0.postDelayed(new pg(this.f24793b, 18), 100L);
                return true;
        }
    }
}
