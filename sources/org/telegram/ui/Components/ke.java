package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class ke extends AnimatorListenerAdapter {
    public final int f35295a;
    public final boolean f35296b;
    public final ChatActivityEnterView f35297c;

    public ke(ChatActivityEnterView chatActivityEnterView, boolean z9, int i7) {
        this.f35295a = i7;
        this.f35297c = chatActivityEnterView;
        this.f35296b = z9;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f35295a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f35297c;
                if (animator.equals(chatActivityEnterView.f31141s2)) {
                    chatActivityEnterView.f31141s2 = null;
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
        int i7;
        he heVar;
        float f10;
        switch (this.f35295a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f35297c;
                if (chatActivityEnterView.f31124p5) {
                    ImageView imageView = chatActivityEnterView.f31161w1;
                    if (this.f35296b) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    imageView.setVisibility(i7);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f35297c;
                if (animator.equals(chatActivityEnterView2.f31141s2)) {
                    chatActivityEnterView2.f31120p1.setVisibility(8);
                    if (this.f35296b && (heVar = chatActivityEnterView2.J1) != null) {
                        heVar.setVisibility(8);
                    }
                    chatActivityEnterView2.f31141s2 = null;
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.f35297c;
                chatActivityEnterView3.M1 = null;
                if (!this.f35296b) {
                    chatActivityEnterView3.J1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f35296b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ChatActivityEnterView chatActivityEnterView4 = this.f35297c;
                chatActivityEnterView4.f31160w0 = f10;
                lf lfVar = chatActivityEnterView4.U0;
                if (lfVar != null) {
                    lfVar.Z();
                    return;
                }
                return;
        }
    }
}
