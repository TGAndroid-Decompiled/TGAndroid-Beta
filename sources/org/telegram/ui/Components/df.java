package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class df extends AnimatorListenerAdapter {
    public final int f23650a;
    public final boolean f23651b;
    public final ChatActivityEnterView f23652c;

    public df(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f23650a = i10;
        this.f23652c = chatActivityEnterView;
        this.f23651b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f23650a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f23652c;
                if (animator.equals(chatActivityEnterView.f22061s2)) {
                    chatActivityEnterView.f22061s2 = null;
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
        switch (this.f23650a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f23652c;
                if (chatActivityEnterView.f22025l5) {
                    ImageView imageView = chatActivityEnterView.f22081w1;
                    if (this.f23651b) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    imageView.setVisibility(i10);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f23652c;
                if (animator.equals(chatActivityEnterView2.f22061s2)) {
                    chatActivityEnterView2.f22043p1.setVisibility(8);
                    if (this.f23651b && (afVar = chatActivityEnterView2.J1) != null) {
                        afVar.setVisibility(8);
                    }
                    chatActivityEnterView2.f22061s2 = null;
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.f23652c;
                chatActivityEnterView3.M1 = null;
                if (!this.f23651b) {
                    chatActivityEnterView3.J1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f23651b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ChatActivityEnterView chatActivityEnterView4 = this.f23652c;
                chatActivityEnterView4.f22080w0 = f7;
                eg egVar = chatActivityEnterView4.U0;
                if (egVar != null) {
                    egVar.Y();
                    return;
                }
                return;
        }
    }
}
