package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class af implements ViewTreeObserver.OnPreDrawListener {
    public final int f26758a;
    public final Dialog f26759b;
    public final ChatActivityEnterView f26760c;

    public af(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f26758a = i10;
        this.f26760c = chatActivityEnterView;
        this.f26759b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f26758a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f26760c;
                chatActivityEnterView.f26152l0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f26152l0.postDelayed(new ig(this.f26759b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f26760c;
                chatActivityEnterView2.f26152l0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f26152l0.postDelayed(new ig(this.f26759b, 18), 100L);
                return true;
        }
    }
}
