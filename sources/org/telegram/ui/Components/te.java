package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class te extends AnimatorListenerAdapter {
    public final int f32687a;
    public final boolean f32688b;
    public final ChatActivityEnterView f32689c;

    public te(ChatActivityEnterView chatActivityEnterView, boolean z10, int i9) {
        this.f32687a = i9;
        this.f32689c = chatActivityEnterView;
        this.f32688b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32687a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f32689c;
                if (animator.equals(chatActivityEnterView.f26152n2)) {
                    chatActivityEnterView.f26152n2 = null;
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
        int i9;
        qe qeVar;
        float f10;
        switch (this.f32687a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f32689c;
                if (chatActivityEnterView.f26119g5) {
                    ImageView imageView = chatActivityEnterView.f26172r1;
                    if (this.f32688b) {
                        i9 = 0;
                    } else {
                        i9 = 8;
                    }
                    imageView.setVisibility(i9);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f32689c;
                if (animator.equals(chatActivityEnterView2.f26152n2)) {
                    chatActivityEnterView2.f26137k1.setVisibility(8);
                    if (this.f32688b && (qeVar = chatActivityEnterView2.E1) != null) {
                        qeVar.setVisibility(8);
                    }
                    chatActivityEnterView2.f26152n2 = null;
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.f32689c;
                chatActivityEnterView3.H1 = null;
                if (!this.f32688b) {
                    chatActivityEnterView3.E1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f32688b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ChatActivityEnterView chatActivityEnterView4 = this.f32689c;
                chatActivityEnterView4.f26177s0 = f10;
                uf ufVar = chatActivityEnterView4.Q0;
                if (ufVar != null) {
                    ufVar.Z();
                    return;
                }
                return;
        }
    }
}
