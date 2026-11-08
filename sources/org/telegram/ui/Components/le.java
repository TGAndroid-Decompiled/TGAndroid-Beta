package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class le extends AnimatorListenerAdapter {
    public final int f35680a;
    public final boolean f35681b;
    public final ChatActivityEnterView f35682c;

    public le(ChatActivityEnterView chatActivityEnterView, boolean z9, int i7) {
        this.f35680a = i7;
        this.f35682c = chatActivityEnterView;
        this.f35681b = z9;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f35680a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f35682c;
                if (animator.equals(chatActivityEnterView.f31125s2)) {
                    chatActivityEnterView.f31125s2 = null;
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
        ie ieVar;
        float f10;
        switch (this.f35680a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f35682c;
                if (chatActivityEnterView.f31108p5) {
                    ImageView imageView = chatActivityEnterView.f31145w1;
                    if (this.f35681b) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    imageView.setVisibility(i7);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f35682c;
                if (animator.equals(chatActivityEnterView2.f31125s2)) {
                    chatActivityEnterView2.f31104p1.setVisibility(8);
                    if (this.f35681b && (ieVar = chatActivityEnterView2.J1) != null) {
                        ieVar.setVisibility(8);
                    }
                    chatActivityEnterView2.f31125s2 = null;
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.f35682c;
                chatActivityEnterView3.M1 = null;
                if (!this.f35681b) {
                    chatActivityEnterView3.J1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f35681b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ChatActivityEnterView chatActivityEnterView4 = this.f35682c;
                chatActivityEnterView4.f31144w0 = f10;
                mf mfVar = chatActivityEnterView4.U0;
                if (mfVar != null) {
                    mfVar.Z();
                    return;
                }
                return;
        }
    }
}
