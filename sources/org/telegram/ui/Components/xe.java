package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class xe implements ViewTreeObserver.OnPreDrawListener {
    public final int f33047a;
    public final Dialog f33048b;
    public final ChatActivityEnterView f33049c;

    public xe(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f33047a = i10;
        this.f33049c = chatActivityEnterView;
        this.f33048b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f33047a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f33049c;
                chatActivityEnterView.m0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.m0.postDelayed(new fg(this.f33048b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f33049c;
                chatActivityEnterView2.m0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.m0.postDelayed(new fg(this.f33048b, 18), 100L);
                return true;
        }
    }
}
