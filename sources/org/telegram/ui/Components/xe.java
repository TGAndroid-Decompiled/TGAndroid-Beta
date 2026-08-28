package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class xe implements ViewTreeObserver.OnPreDrawListener {
    public final int f34665a;
    public final Dialog f34666b;
    public final ChatActivityEnterView f34667c;

    public xe(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i9) {
        this.f34665a = i9;
        this.f34667c = chatActivityEnterView;
        this.f34666b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f34665a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f34667c;
                chatActivityEnterView.f26141l0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f26141l0.postDelayed(new fg(this.f34666b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f34667c;
                chatActivityEnterView2.f26141l0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f26141l0.postDelayed(new fg(this.f34666b, 18), 100L);
                return true;
        }
    }
}
