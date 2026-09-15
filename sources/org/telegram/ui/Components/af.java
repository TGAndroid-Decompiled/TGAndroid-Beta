package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class af extends AnimatorListenerAdapter {
    public final int f22379a;
    public final boolean f22380b;
    public final ChatActivityEnterView f22381c;

    public af(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f22379a = i10;
        this.f22381c = chatActivityEnterView;
        this.f22380b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f22379a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f22381c;
                if (animator.equals(chatActivityEnterView.f21832r2)) {
                    chatActivityEnterView.f21832r2 = null;
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
        switch (this.f22379a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f22381c;
                if (chatActivityEnterView.f21799k5) {
                    ImageView imageView = chatActivityEnterView.f21852v1;
                    if (this.f22380b) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    imageView.setVisibility(i10);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f22381c;
                if (animator.equals(chatActivityEnterView2.f21832r2)) {
                    chatActivityEnterView2.f21815o1.setVisibility(8);
                    if (this.f22380b && (xeVar = chatActivityEnterView2.I1) != null) {
                        xeVar.setVisibility(8);
                    }
                    chatActivityEnterView2.f21832r2 = null;
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.f22381c;
                chatActivityEnterView3.L1 = null;
                if (!this.f22380b) {
                    chatActivityEnterView3.I1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f22380b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ChatActivityEnterView chatActivityEnterView4 = this.f22381c;
                chatActivityEnterView4.f21857w0 = f7;
                cg cgVar = chatActivityEnterView4.U0;
                if (cgVar != null) {
                    cgVar.Z();
                    return;
                }
                return;
        }
    }
}
