package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class df extends AnimatorListenerAdapter {
    public final int f25376a;
    public final boolean f25377b;
    public final ChatActivityEnterView f25378c;

    public df(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f25376a = i10;
        this.f25378c = chatActivityEnterView;
        this.f25377b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f25376a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f25378c;
                if (animator.equals(chatActivityEnterView.f23763r2)) {
                    chatActivityEnterView.f23763r2 = null;
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
        af afVar;
        float f7;
        switch (this.f25376a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f25378c;
                if (chatActivityEnterView.f23730k5) {
                    ImageView imageView = chatActivityEnterView.f23783v1;
                    if (this.f25377b) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    imageView.setVisibility(i10);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f25378c;
                if (animator.equals(chatActivityEnterView2.f23763r2)) {
                    chatActivityEnterView2.f23746o1.setVisibility(8);
                    if (this.f25377b && (afVar = chatActivityEnterView2.I1) != null) {
                        afVar.setVisibility(8);
                    }
                    chatActivityEnterView2.f23763r2 = null;
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.f25378c;
                chatActivityEnterView3.L1 = null;
                if (!this.f25377b) {
                    chatActivityEnterView3.I1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f25377b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ChatActivityEnterView chatActivityEnterView4 = this.f25378c;
                chatActivityEnterView4.f23788w0 = f7;
                eg egVar = chatActivityEnterView4.U0;
                if (egVar != null) {
                    egVar.a0();
                    return;
                }
                return;
        }
    }
}
