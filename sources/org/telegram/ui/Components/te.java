package org.telegram.ui.Components;

import android.app.Dialog;
import android.view.ViewTreeObserver;

public final class te implements ViewTreeObserver.OnPreDrawListener {

    public final int f32747a;

    public final Dialog f32748b;

    public final ChatActivityEnterView f32749c;

    public te(ChatActivityEnterView chatActivityEnterView, Dialog dialog, int i10) {
        this.f32747a = i10;
        this.f32749c = chatActivityEnterView;
        this.f32748b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f32747a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f32749c;
                chatActivityEnterView.f26137l0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.f26137l0.postDelayed(new bg(this.f32748b, 18), 100L);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f32749c;
                chatActivityEnterView2.f26137l0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView2.f26137l0.postDelayed(new bg(this.f32748b, 18), 100L);
                break;
        }
        return true;
    }
}
