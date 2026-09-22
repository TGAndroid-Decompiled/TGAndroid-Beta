package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class af extends AnimatorListenerAdapter {
    public final int f22376a;
    public final boolean f22377b;
    public final ChatActivityEnterView f22378c;

    public af(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f22376a = i10;
        this.f22378c = chatActivityEnterView;
        this.f22377b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f22376a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f22378c;
                if (animator.equals(chatActivityEnterView.f21829r2)) {
                    chatActivityEnterView.f21829r2 = null;
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        xe xeVar;
        float f7;
        switch (this.f22376a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f22378c;
                if (chatActivityEnterView.f21799l5) {
                    ImageView imageView = chatActivityEnterView.f21849v1;
                    if (this.f22377b) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    imageView.setVisibility(i10);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f22378c;
                if (animator.equals(chatActivityEnterView2.f21829r2)) {
                    chatActivityEnterView2.f21812o1.setVisibility(8);
                    if (this.f22377b && (xeVar = chatActivityEnterView2.I1) != null) {
                        xeVar.setVisibility(8);
                    }
                    chatActivityEnterView2.f21829r2 = null;
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.f22378c;
                chatActivityEnterView3.L1 = null;
                if (!this.f22377b) {
                    chatActivityEnterView3.I1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f22377b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ChatActivityEnterView chatActivityEnterView4 = this.f22378c;
                chatActivityEnterView4.f21854w0 = f7;
                cg cgVar = chatActivityEnterView4.U0;
                if (cgVar != null) {
                    cgVar.Y();
                    return;
                }
                return;
        }
    }
}
