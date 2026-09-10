package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class df extends AnimatorListenerAdapter {
    public final int f22401a;
    public final boolean f22402b;
    public final ChatActivityEnterView f22403c;

    public df(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f22401a = i10;
        this.f22403c = chatActivityEnterView;
        this.f22402b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f22401a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f22403c;
                if (animator.equals(chatActivityEnterView.f20917r2)) {
                    chatActivityEnterView.f20917r2 = null;
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
        switch (this.f22401a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f22403c;
                if (chatActivityEnterView.f20884k5) {
                    ImageView imageView = chatActivityEnterView.f20937v1;
                    if (this.f22402b) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    imageView.setVisibility(i10);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f22403c;
                if (animator.equals(chatActivityEnterView2.f20917r2)) {
                    chatActivityEnterView2.f20900o1.setVisibility(8);
                    if (this.f22402b && (afVar = chatActivityEnterView2.I1) != null) {
                        afVar.setVisibility(8);
                    }
                    chatActivityEnterView2.f20917r2 = null;
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.f22403c;
                chatActivityEnterView3.L1 = null;
                if (!this.f22402b) {
                    chatActivityEnterView3.I1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f22402b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ChatActivityEnterView chatActivityEnterView4 = this.f22403c;
                chatActivityEnterView4.f20942w0 = f7;
                fg fgVar = chatActivityEnterView4.U0;
                if (fgVar != null) {
                    fgVar.a0();
                    return;
                }
                return;
        }
    }
}
