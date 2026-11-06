package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class le extends AnimatorListenerAdapter {
    public final int f35637a;
    public final boolean f35638b;
    public final ChatActivityEnterView f35639c;

    public le(ChatActivityEnterView chatActivityEnterView, boolean z9, int i7) {
        this.f35637a = i7;
        this.f35639c = chatActivityEnterView;
        this.f35638b = z9;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f35637a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f35639c;
                if (animator.equals(chatActivityEnterView.f31120s2)) {
                    chatActivityEnterView.f31120s2 = null;
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
        switch (this.f35637a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f35639c;
                if (chatActivityEnterView.f31103p5) {
                    ImageView imageView = chatActivityEnterView.f31140w1;
                    if (this.f35638b) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    imageView.setVisibility(i7);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f35639c;
                if (animator.equals(chatActivityEnterView2.f31120s2)) {
                    chatActivityEnterView2.f31099p1.setVisibility(8);
                    if (this.f35638b && (ieVar = chatActivityEnterView2.J1) != null) {
                        ieVar.setVisibility(8);
                    }
                    chatActivityEnterView2.f31120s2 = null;
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.f35639c;
                chatActivityEnterView3.M1 = null;
                if (!this.f35638b) {
                    chatActivityEnterView3.J1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f35638b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ChatActivityEnterView chatActivityEnterView4 = this.f35639c;
                chatActivityEnterView4.f31139w0 = f10;
                mf mfVar = chatActivityEnterView4.U0;
                if (mfVar != null) {
                    mfVar.Z();
                    return;
                }
                return;
        }
    }
}
