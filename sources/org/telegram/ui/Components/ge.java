package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class ge extends AnimatorListenerAdapter {
    public final int f26427a;
    public final boolean f26428b;
    public final ChatActivityEnterView f26429c;

    public ge(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f26427a = i10;
        this.f26429c = chatActivityEnterView;
        this.f26428b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f26427a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f26429c;
                if (animator.equals(chatActivityEnterView.f23786s2)) {
                    chatActivityEnterView.f23786s2 = null;
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
        de deVar;
        float f7;
        switch (this.f26427a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f26429c;
                if (chatActivityEnterView.p5) {
                    ImageView imageView = chatActivityEnterView.f23806w1;
                    if (this.f26428b) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    imageView.setVisibility(i10);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f26429c;
                if (animator.equals(chatActivityEnterView2.f23786s2)) {
                    chatActivityEnterView2.f23766p1.setVisibility(8);
                    if (this.f26428b && (deVar = chatActivityEnterView2.J1) != null) {
                        deVar.setVisibility(8);
                    }
                    chatActivityEnterView2.f23786s2 = null;
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.f26429c;
                chatActivityEnterView3.M1 = null;
                if (!this.f26428b) {
                    chatActivityEnterView3.J1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f26428b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ChatActivityEnterView chatActivityEnterView4 = this.f26429c;
                chatActivityEnterView4.f23805w0 = f7;
                gf gfVar = chatActivityEnterView4.U0;
                if (gfVar != null) {
                    gfVar.Z();
                    return;
                }
                return;
        }
    }
}
