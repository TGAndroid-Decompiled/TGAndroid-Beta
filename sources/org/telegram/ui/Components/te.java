package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class te extends AnimatorListenerAdapter {
    public final int f31331a;
    public final boolean f31332b;
    public final ChatActivityEnterView f31333c;

    public te(ChatActivityEnterView chatActivityEnterView, boolean z4, int i10) {
        this.f31331a = i10;
        this.f31333c = chatActivityEnterView;
        this.f31332b = z4;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31331a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f31333c;
                if (animator.equals(chatActivityEnterView.f24652o2)) {
                    chatActivityEnterView.f24652o2 = null;
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
        qe qeVar;
        float f10;
        switch (this.f31331a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f31333c;
                if (chatActivityEnterView.f24619h5) {
                    ImageView imageView = chatActivityEnterView.f24673s1;
                    if (this.f31332b) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    imageView.setVisibility(i10);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f31333c;
                if (animator.equals(chatActivityEnterView2.f24652o2)) {
                    chatActivityEnterView2.l1.setVisibility(8);
                    if (this.f31332b && (qeVar = chatActivityEnterView2.F1) != null) {
                        qeVar.setVisibility(8);
                    }
                    chatActivityEnterView2.f24652o2 = null;
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.f31333c;
                chatActivityEnterView3.I1 = null;
                if (!this.f31332b) {
                    chatActivityEnterView3.F1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f31332b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ChatActivityEnterView chatActivityEnterView4 = this.f31333c;
                chatActivityEnterView4.f24677t0 = f10;
                uf ufVar = chatActivityEnterView4.R0;
                if (ufVar != null) {
                    ufVar.a0();
                    return;
                }
                return;
        }
    }
}
