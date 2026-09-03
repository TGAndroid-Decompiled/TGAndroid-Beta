package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class xe implements ViewTreeObserver.OnPreDrawListener {
    public final int f30627a;
    public final Dialog f30628b;
    public final ChatActivityEnterView f30629c;

    public xe(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f30627a = i10;
        this.f30629c = chatActivityEnterView;
        this.f30628b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f30627a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f30629c;
                chatActivityEnterView.m0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.m0.postDelayed(new fg(this.f30628b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f30629c;
                chatActivityEnterView2.m0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.m0.postDelayed(new fg(this.f30628b, 18), 100L);
                return true;
        }
    }
}
