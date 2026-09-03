package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class te extends AnimatorListenerAdapter {
    public final int f28971a;
    public final boolean f28972b;
    public final ChatActivityEnterView f28973c;

    public te(ChatActivityEnterView chatActivityEnterView, boolean z4, int i10) {
        this.f28971a = i10;
        this.f28973c = chatActivityEnterView;
        this.f28972b = z4;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28971a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f28973c;
                if (animator.equals(chatActivityEnterView.f22785o2)) {
                    chatActivityEnterView.f22785o2 = null;
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
        qe qeVar;
        float f10;
        switch (this.f28971a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f28973c;
                if (chatActivityEnterView.f22752h5) {
                    ImageView imageView = chatActivityEnterView.f22806s1;
                    if (this.f28972b) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    imageView.setVisibility(i10);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f28973c;
                if (animator.equals(chatActivityEnterView2.f22785o2)) {
                    chatActivityEnterView2.l1.setVisibility(8);
                    if (this.f28972b && (qeVar = chatActivityEnterView2.F1) != null) {
                        qeVar.setVisibility(8);
                    }
                    chatActivityEnterView2.f22785o2 = null;
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.f28973c;
                chatActivityEnterView3.I1 = null;
                if (!this.f28972b) {
                    chatActivityEnterView3.F1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f28972b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ChatActivityEnterView chatActivityEnterView4 = this.f28973c;
                chatActivityEnterView4.f22810t0 = f10;
                uf ufVar = chatActivityEnterView4.R0;
                if (ufVar != null) {
                    ufVar.a0();
                    return;
                }
                return;
        }
    }
}
