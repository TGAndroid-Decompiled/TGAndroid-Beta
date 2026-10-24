package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class af extends AnimatorListenerAdapter {
    public final int f24722a;
    public final boolean f24723b;
    public final ChatActivityEnterView f24724c;

    public af(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f24722a = i10;
        this.f24724c = chatActivityEnterView;
        this.f24723b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f24722a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f24724c;
                if (animator.equals(chatActivityEnterView.f24163s2)) {
                    chatActivityEnterView.f24163s2 = null;
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
        xe xeVar;
        float f7;
        switch (this.f24722a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f24724c;
                if (chatActivityEnterView.p5) {
                    ImageView imageView = chatActivityEnterView.f24183w1;
                    if (this.f24723b) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    imageView.setVisibility(i10);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f24724c;
                if (animator.equals(chatActivityEnterView2.f24163s2)) {
                    chatActivityEnterView2.f24144p1.setVisibility(8);
                    if (this.f24723b && (xeVar = chatActivityEnterView2.J1) != null) {
                        xeVar.setVisibility(8);
                    }
                    chatActivityEnterView2.f24163s2 = null;
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.f24724c;
                chatActivityEnterView3.M1 = null;
                if (!this.f24723b) {
                    chatActivityEnterView3.J1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f24723b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ChatActivityEnterView chatActivityEnterView4 = this.f24724c;
                chatActivityEnterView4.f24182w0 = f7;
                bg bgVar = chatActivityEnterView4.U0;
                if (bgVar != null) {
                    bgVar.Y();
                    return;
                }
                return;
        }
    }
}
