package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;
public final class oe implements ViewTreeObserver.OnPreDrawListener {
    public final int f36593a;
    public final Dialog f36594b;
    public final ChatActivityEnterView f36595c;

    public oe(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i7) {
        this.f36593a = i7;
        this.f36595c = chatActivityEnterView;
        this.f36594b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f36593a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f36595c;
                chatActivityEnterView.f31119p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f31119p0.postDelayed(new wf(this.f36594b, 19), 100L);
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f36595c;
                chatActivityEnterView2.f31119p0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f31119p0.postDelayed(new wf(this.f36594b, 19), 100L);
                return true;
        }
    }
}
