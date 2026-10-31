package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class ge extends AnimatorListenerAdapter {
    public final int f26362a;
    public final boolean f26363b;
    public final ChatActivityEnterView f26364c;

    public ge(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f26362a = i10;
        this.f26364c = chatActivityEnterView;
        this.f26363b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f26362a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f26364c;
                if (animator.equals(chatActivityEnterView.f23785s2)) {
                    chatActivityEnterView.f23785s2 = null;
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
        switch (this.f26362a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f26364c;
                if (chatActivityEnterView.p5) {
                    ImageView imageView = chatActivityEnterView.f23805w1;
                    if (this.f26363b) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    imageView.setVisibility(i10);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f26364c;
                if (animator.equals(chatActivityEnterView2.f23785s2)) {
                    chatActivityEnterView2.f23765p1.setVisibility(8);
                    if (this.f26363b && (deVar = chatActivityEnterView2.J1) != null) {
                        deVar.setVisibility(8);
                    }
                    chatActivityEnterView2.f23785s2 = null;
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.f26364c;
                chatActivityEnterView3.M1 = null;
                if (!this.f26363b) {
                    chatActivityEnterView3.J1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f26363b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ChatActivityEnterView chatActivityEnterView4 = this.f26364c;
                chatActivityEnterView4.f23804w0 = f7;
                gf gfVar = chatActivityEnterView4.U0;
                if (gfVar != null) {
                    gfVar.Z();
                    return;
                }
                return;
        }
    }
}
