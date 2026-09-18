package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class cf extends AnimatorListenerAdapter {
    public final int f23264a;
    public final boolean f23265b;
    public final ChatActivityEnterView f23266c;

    public cf(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f23264a = i10;
        this.f23266c = chatActivityEnterView;
        this.f23265b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f23264a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f23266c;
                if (animator.equals(chatActivityEnterView.f22018r2)) {
                    chatActivityEnterView.f22018r2 = null;
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
        ze zeVar;
        float f7;
        switch (this.f23264a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f23266c;
                if (chatActivityEnterView.f21985k5) {
                    ImageView imageView = chatActivityEnterView.f22038v1;
                    if (this.f23265b) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    imageView.setVisibility(i10);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f23266c;
                if (animator.equals(chatActivityEnterView2.f22018r2)) {
                    chatActivityEnterView2.f22001o1.setVisibility(8);
                    if (this.f23265b && (zeVar = chatActivityEnterView2.I1) != null) {
                        zeVar.setVisibility(8);
                    }
                    chatActivityEnterView2.f22018r2 = null;
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.f23266c;
                chatActivityEnterView3.L1 = null;
                if (!this.f23265b) {
                    chatActivityEnterView3.I1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f23265b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ChatActivityEnterView chatActivityEnterView4 = this.f23266c;
                chatActivityEnterView4.f22043w0 = f7;
                dg dgVar = chatActivityEnterView4.U0;
                if (dgVar != null) {
                    dgVar.Y();
                    return;
                }
                return;
        }
    }
}
