package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class ff extends AnimatorListenerAdapter {
    public final int f26048a;
    public final boolean f26049b;
    public final ChatActivityEnterView f26050c;

    public ff(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f26048a = i10;
        this.f26050c = chatActivityEnterView;
        this.f26049b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f26048a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f26050c;
                if (animator.equals(chatActivityEnterView.f23728s2)) {
                    chatActivityEnterView.f23728s2 = null;
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
        switch (this.f26048a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f26050c;
                if (chatActivityEnterView.O5) {
                    ImageView imageView = chatActivityEnterView.f23752w1;
                    if (this.f26049b) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    imageView.setVisibility(i10);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f26050c;
                if (animator.equals(chatActivityEnterView2.f23728s2)) {
                    chatActivityEnterView2.f23708p1.setVisibility(8);
                    if (this.f26049b && (cfVar = chatActivityEnterView2.J1) != null) {
                        cfVar.setVisibility(8);
                    }
                    chatActivityEnterView2.f23728s2 = null;
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.f26050c;
                chatActivityEnterView3.M1 = null;
                if (!this.f26049b) {
                    chatActivityEnterView3.J1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f26049b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ChatActivityEnterView chatActivityEnterView4 = this.f26050c;
                chatActivityEnterView4.f23751w0 = f7;
                ig igVar = chatActivityEnterView4.U0;
                if (igVar != null) {
                    igVar.Y();
                    return;
                }
                return;
        }
    }
}
