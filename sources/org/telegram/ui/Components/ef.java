package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class ef extends AnimatorListenerAdapter {
    public final int f23969a;
    public final boolean f23970b;
    public final ChatActivityEnterView f23971c;

    public ef(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f23969a = i10;
        this.f23971c = chatActivityEnterView;
        this.f23970b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f23969a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f23971c;
                if (animator.equals(chatActivityEnterView.f22082s2)) {
                    chatActivityEnterView.f22082s2 = null;
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
        bf bfVar;
        float f7;
        switch (this.f23969a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f23971c;
                if (chatActivityEnterView.f22046l5) {
                    ImageView imageView = chatActivityEnterView.f22102w1;
                    if (this.f23970b) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    imageView.setVisibility(i10);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f23971c;
                if (animator.equals(chatActivityEnterView2.f22082s2)) {
                    chatActivityEnterView2.f22064p1.setVisibility(8);
                    if (this.f23970b && (bfVar = chatActivityEnterView2.J1) != null) {
                        bfVar.setVisibility(8);
                    }
                    chatActivityEnterView2.f22082s2 = null;
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.f23971c;
                chatActivityEnterView3.M1 = null;
                if (!this.f23970b) {
                    chatActivityEnterView3.J1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f23970b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ChatActivityEnterView chatActivityEnterView4 = this.f23971c;
                chatActivityEnterView4.f22101w0 = f7;
                fg fgVar = chatActivityEnterView4.U0;
                if (fgVar != null) {
                    fgVar.Y();
                    return;
                }
                return;
        }
    }
}
