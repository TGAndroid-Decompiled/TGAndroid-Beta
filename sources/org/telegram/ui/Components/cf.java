package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class cf extends AnimatorListenerAdapter {
    public final int f25185a;
    public final boolean f25186b;
    public final ChatActivityEnterView f25187c;

    public cf(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f25185a = i10;
        this.f25187c = chatActivityEnterView;
        this.f25186b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f25185a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f25187c;
                if (animator.equals(chatActivityEnterView.f24021s2)) {
                    chatActivityEnterView.f24021s2 = null;
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
        switch (this.f25185a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f25187c;
                if (chatActivityEnterView.f23985l5) {
                    ImageView imageView = chatActivityEnterView.f24041w1;
                    if (this.f25186b) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    imageView.setVisibility(i10);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f25187c;
                if (animator.equals(chatActivityEnterView2.f24021s2)) {
                    chatActivityEnterView2.f24003p1.setVisibility(8);
                    if (this.f25186b && (zeVar = chatActivityEnterView2.J1) != null) {
                        zeVar.setVisibility(8);
                    }
                    chatActivityEnterView2.f24021s2 = null;
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.f25187c;
                chatActivityEnterView3.M1 = null;
                if (!this.f25186b) {
                    chatActivityEnterView3.J1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f25186b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ChatActivityEnterView chatActivityEnterView4 = this.f25187c;
                chatActivityEnterView4.f24040w0 = f7;
                dg dgVar = chatActivityEnterView4.U0;
                if (dgVar != null) {
                    dgVar.Y();
                    return;
                }
                return;
        }
    }
}
