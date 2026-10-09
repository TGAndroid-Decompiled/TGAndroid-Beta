package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class ff extends AnimatorListenerAdapter {
    public final int f26358a;
    public final boolean f26359b;
    public final ChatActivityEnterView f26360c;

    public ff(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f26358a = i10;
        this.f26360c = chatActivityEnterView;
        this.f26359b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f26358a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f26360c;
                if (animator.equals(chatActivityEnterView.f23959s2)) {
                    chatActivityEnterView.f23959s2 = null;
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
        switch (this.f26358a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f26360c;
                if (chatActivityEnterView.f23923l5) {
                    ImageView imageView = chatActivityEnterView.f23979w1;
                    if (this.f26359b) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    imageView.setVisibility(i10);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f26360c;
                if (animator.equals(chatActivityEnterView2.f23959s2)) {
                    chatActivityEnterView2.f23941p1.setVisibility(8);
                    if (this.f26359b && (cfVar = chatActivityEnterView2.J1) != null) {
                        cfVar.setVisibility(8);
                    }
                    chatActivityEnterView2.f23959s2 = null;
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.f26360c;
                chatActivityEnterView3.M1 = null;
                if (!this.f26359b) {
                    chatActivityEnterView3.J1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f26359b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ChatActivityEnterView chatActivityEnterView4 = this.f26360c;
                chatActivityEnterView4.f23978w0 = f7;
                gg ggVar = chatActivityEnterView4.U0;
                if (ggVar != null) {
                    ggVar.Y();
                    return;
                }
                return;
        }
    }
}
