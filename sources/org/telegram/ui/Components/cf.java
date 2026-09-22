package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class cf extends AnimatorListenerAdapter {
    public final int f23349a;
    public final boolean f23350b;
    public final ChatActivityEnterView f23351c;

    public cf(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f23349a = i10;
        this.f23351c = chatActivityEnterView;
        this.f23350b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f23349a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f23351c;
                if (animator.equals(chatActivityEnterView.f22075s2)) {
                    chatActivityEnterView.f22075s2 = null;
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
        switch (this.f23349a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f23351c;
                if (chatActivityEnterView.f22039l5) {
                    ImageView imageView = chatActivityEnterView.f22095w1;
                    if (this.f23350b) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    imageView.setVisibility(i10);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f23351c;
                if (animator.equals(chatActivityEnterView2.f22075s2)) {
                    chatActivityEnterView2.f22057p1.setVisibility(8);
                    if (this.f23350b && (zeVar = chatActivityEnterView2.J1) != null) {
                        zeVar.setVisibility(8);
                    }
                    chatActivityEnterView2.f22075s2 = null;
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.f23351c;
                chatActivityEnterView3.M1 = null;
                if (!this.f23350b) {
                    chatActivityEnterView3.J1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f23350b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ChatActivityEnterView chatActivityEnterView4 = this.f23351c;
                chatActivityEnterView4.f22094w0 = f7;
                dg dgVar = chatActivityEnterView4.U0;
                if (dgVar != null) {
                    dgVar.Y();
                    return;
                }
                return;
        }
    }
}
