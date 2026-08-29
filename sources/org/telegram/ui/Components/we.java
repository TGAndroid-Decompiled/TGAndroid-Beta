package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class we extends AnimatorListenerAdapter {
    public final int f34391a;
    public final boolean f34392b;
    public final ChatActivityEnterView f34393c;

    public we(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f34391a = i10;
        this.f34393c = chatActivityEnterView;
        this.f34392b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f34391a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f34393c;
                if (animator.equals(chatActivityEnterView.f26163n2)) {
                    chatActivityEnterView.f26163n2 = null;
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
        te teVar;
        float f9;
        switch (this.f34391a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f34393c;
                if (chatActivityEnterView.f26130g5) {
                    ImageView imageView = chatActivityEnterView.f26183r1;
                    if (this.f34392b) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    imageView.setVisibility(i10);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f34393c;
                if (animator.equals(chatActivityEnterView2.f26163n2)) {
                    chatActivityEnterView2.f26148k1.setVisibility(8);
                    if (this.f34392b && (teVar = chatActivityEnterView2.E1) != null) {
                        teVar.setVisibility(8);
                    }
                    chatActivityEnterView2.f26163n2 = null;
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.f34393c;
                chatActivityEnterView3.H1 = null;
                if (!this.f34392b) {
                    chatActivityEnterView3.E1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f34392b) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                ChatActivityEnterView chatActivityEnterView4 = this.f34393c;
                chatActivityEnterView4.f26188s0 = f9;
                xf xfVar = chatActivityEnterView4.Q0;
                if (xfVar != null) {
                    xfVar.a0();
                    return;
                }
                return;
        }
    }
}
