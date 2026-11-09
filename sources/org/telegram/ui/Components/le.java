package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class le extends AnimatorListenerAdapter {
    public final int f35693a;
    public final boolean f35694b;
    public final ChatActivityEnterView f35695c;

    public le(ChatActivityEnterView chatActivityEnterView, boolean z9, int i7) {
        this.f35693a = i7;
        this.f35695c = chatActivityEnterView;
        this.f35694b = z9;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f35693a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f35695c;
                if (animator.equals(chatActivityEnterView.f31130s2)) {
                    chatActivityEnterView.f31130s2 = null;
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
        switch (this.f35693a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f35695c;
                if (chatActivityEnterView.f31113p5) {
                    ImageView imageView = chatActivityEnterView.f31150w1;
                    if (this.f35694b) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    imageView.setVisibility(i7);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f35695c;
                if (animator.equals(chatActivityEnterView2.f31130s2)) {
                    chatActivityEnterView2.f31109p1.setVisibility(8);
                    if (this.f35694b && (ieVar = chatActivityEnterView2.J1) != null) {
                        ieVar.setVisibility(8);
                    }
                    chatActivityEnterView2.f31130s2 = null;
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.f35695c;
                chatActivityEnterView3.M1 = null;
                if (!this.f35694b) {
                    chatActivityEnterView3.J1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f35694b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ChatActivityEnterView chatActivityEnterView4 = this.f35695c;
                chatActivityEnterView4.f31149w0 = f10;
                mf mfVar = chatActivityEnterView4.U0;
                if (mfVar != null) {
                    mfVar.Z();
                    return;
                }
                return;
        }
    }
}
