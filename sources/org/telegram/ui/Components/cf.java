package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class cf extends AnimatorListenerAdapter {
    public final int f27147a;
    public final boolean f27148b;
    public final ChatActivityEnterView f27149c;

    public cf(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f27147a = i10;
        this.f27149c = chatActivityEnterView;
        this.f27148b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27147a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f27149c;
                if (animator.equals(chatActivityEnterView.f25957s2)) {
                    chatActivityEnterView.f25957s2 = null;
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
        switch (this.f27147a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f27149c;
                if (chatActivityEnterView.f25942p5) {
                    ImageView imageView = chatActivityEnterView.f25977w1;
                    if (this.f27148b) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    imageView.setVisibility(i10);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f27149c;
                if (animator.equals(chatActivityEnterView2.f25957s2)) {
                    chatActivityEnterView2.f25938p1.setVisibility(8);
                    if (this.f27148b && (zeVar = chatActivityEnterView2.J1) != null) {
                        zeVar.setVisibility(8);
                    }
                    chatActivityEnterView2.f25957s2 = null;
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.f27149c;
                chatActivityEnterView3.M1 = null;
                if (!this.f27148b) {
                    chatActivityEnterView3.J1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f27148b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ChatActivityEnterView chatActivityEnterView4 = this.f27149c;
                chatActivityEnterView4.f25976w0 = f7;
                dg dgVar = chatActivityEnterView4.U0;
                if (dgVar != null) {
                    dgVar.Z();
                    return;
                }
                return;
        }
    }
}
