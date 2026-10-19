package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class cf extends AnimatorListenerAdapter {
    public final int f25176a;
    public final boolean f25177b;
    public final ChatActivityEnterView f25178c;

    public cf(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f25176a = i10;
        this.f25178c = chatActivityEnterView;
        this.f25177b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f25176a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f25178c;
                if (animator.equals(chatActivityEnterView.f24014s2)) {
                    chatActivityEnterView.f24014s2 = null;
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
        switch (this.f25176a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f25178c;
                if (chatActivityEnterView.f23978l5) {
                    ImageView imageView = chatActivityEnterView.f24034w1;
                    if (this.f25177b) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    imageView.setVisibility(i10);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f25178c;
                if (animator.equals(chatActivityEnterView2.f24014s2)) {
                    chatActivityEnterView2.f23996p1.setVisibility(8);
                    if (this.f25177b && (zeVar = chatActivityEnterView2.J1) != null) {
                        zeVar.setVisibility(8);
                    }
                    chatActivityEnterView2.f24014s2 = null;
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.f25178c;
                chatActivityEnterView3.M1 = null;
                if (!this.f25177b) {
                    chatActivityEnterView3.J1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f25177b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ChatActivityEnterView chatActivityEnterView4 = this.f25178c;
                chatActivityEnterView4.f24033w0 = f7;
                dg dgVar = chatActivityEnterView4.U0;
                if (dgVar != null) {
                    dgVar.Y();
                    return;
                }
                return;
        }
    }
}
