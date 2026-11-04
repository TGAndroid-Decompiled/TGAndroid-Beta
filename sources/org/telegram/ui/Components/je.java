package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class je extends AnimatorListenerAdapter {
    public final int f35047a;
    public final boolean f35048b;
    public final ChatActivityEnterView f35049c;

    public je(ChatActivityEnterView chatActivityEnterView, boolean z10, int i3) {
        this.f35047a = i3;
        this.f35049c = chatActivityEnterView;
        this.f35048b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f35047a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f35049c;
                if (animator.equals(chatActivityEnterView.f31200t2)) {
                    chatActivityEnterView.f31200t2 = null;
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
        int i3;
        ge geVar;
        float f10;
        switch (this.f35047a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f35049c;
                if (chatActivityEnterView.f31184q5) {
                    ImageView imageView = chatActivityEnterView.f31221x1;
                    if (this.f35048b) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                    imageView.setVisibility(i3);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f35049c;
                if (animator.equals(chatActivityEnterView2.f31200t2)) {
                    chatActivityEnterView2.f31180q1.setVisibility(8);
                    if (this.f35048b && (geVar = chatActivityEnterView2.K1) != null) {
                        geVar.setVisibility(8);
                    }
                    chatActivityEnterView2.f31200t2 = null;
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.f35049c;
                chatActivityEnterView3.N1 = null;
                if (!this.f35048b) {
                    chatActivityEnterView3.K1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f35048b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ChatActivityEnterView chatActivityEnterView4 = this.f35049c;
                chatActivityEnterView4.f31220x0 = f10;
                kf kfVar = chatActivityEnterView4.V0;
                if (kfVar != null) {
                    kfVar.Z();
                    return;
                }
                return;
        }
    }
}
