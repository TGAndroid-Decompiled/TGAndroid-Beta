package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class gf implements ViewTreeObserver.OnPreDrawListener {
    public final int f24338a;
    public final Dialog f24339b;
    public final ChatActivityEnterView f24340c;

    public gf(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f24338a = i10;
        this.f24340c = chatActivityEnterView;
        this.f24339b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f24338a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f24340c;
                chatActivityEnterView.f22040p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f22040p0.postDelayed(new og(this.f24339b, 18), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f24340c;
                chatActivityEnterView2.f22040p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f22040p0.postDelayed(new og(this.f24339b, 18), 100L);
                return true;
        }
    }
}
