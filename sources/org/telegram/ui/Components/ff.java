package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class ff extends AnimatorListenerAdapter {
    public final int f26407a;
    public final boolean f26408b;
    public final ChatActivityEnterView f26409c;

    public ff(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f26407a = i10;
        this.f26409c = chatActivityEnterView;
        this.f26408b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f26407a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f26409c;
                if (animator.equals(chatActivityEnterView.f23963s2)) {
                    chatActivityEnterView.f23963s2 = null;
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
        cf cfVar;
        float f7;
        switch (this.f26407a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f26409c;
                if (chatActivityEnterView.f23927l5) {
                    ImageView imageView = chatActivityEnterView.f23983w1;
                    if (this.f26408b) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    imageView.setVisibility(i10);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f26409c;
                if (animator.equals(chatActivityEnterView2.f23963s2)) {
                    chatActivityEnterView2.f23945p1.setVisibility(8);
                    if (this.f26408b && (cfVar = chatActivityEnterView2.J1) != null) {
                        cfVar.setVisibility(8);
                    }
                    chatActivityEnterView2.f23963s2 = null;
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.f26409c;
                chatActivityEnterView3.M1 = null;
                if (!this.f26408b) {
                    chatActivityEnterView3.J1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f26408b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ChatActivityEnterView chatActivityEnterView4 = this.f26409c;
                chatActivityEnterView4.f23982w0 = f7;
                gg ggVar = chatActivityEnterView4.U0;
                if (ggVar != null) {
                    ggVar.Y();
                    return;
                }
                return;
        }
    }
}
