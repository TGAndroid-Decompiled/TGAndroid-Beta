package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class ef extends AnimatorListenerAdapter {
    public final int f24691a;
    public final boolean f24692b;
    public final ChatActivityEnterView f24693c;

    public ef(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f24691a = i10;
        this.f24693c = chatActivityEnterView;
        this.f24692b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f24691a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f24693c;
                if (animator.equals(chatActivityEnterView.f22958s2)) {
                    chatActivityEnterView.f22958s2 = null;
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
        switch (this.f24691a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f24693c;
                if (chatActivityEnterView.f22922l5) {
                    ImageView imageView = chatActivityEnterView.f22978w1;
                    if (this.f24692b) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    imageView.setVisibility(i10);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f24693c;
                if (animator.equals(chatActivityEnterView2.f22958s2)) {
                    chatActivityEnterView2.f22940p1.setVisibility(8);
                    if (this.f24692b && (bfVar = chatActivityEnterView2.J1) != null) {
                        bfVar.setVisibility(8);
                    }
                    chatActivityEnterView2.f22958s2 = null;
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.f24693c;
                chatActivityEnterView3.M1 = null;
                if (!this.f24692b) {
                    chatActivityEnterView3.J1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f24692b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ChatActivityEnterView chatActivityEnterView4 = this.f24693c;
                chatActivityEnterView4.f22977w0 = f7;
                fg fgVar = chatActivityEnterView4.U0;
                if (fgVar != null) {
                    fgVar.Y();
                    return;
                }
                return;
        }
    }
}
