package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class ef extends AnimatorListenerAdapter {
    public final int f26063a;
    public final boolean f26064b;
    public final ChatActivityEnterView f26065c;

    public ef(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f26063a = i10;
        this.f26065c = chatActivityEnterView;
        this.f26064b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f26063a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f26065c;
                if (animator.equals(chatActivityEnterView.f23956s2)) {
                    chatActivityEnterView.f23956s2 = null;
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
        bf bfVar;
        float f7;
        switch (this.f26063a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f26065c;
                if (chatActivityEnterView.f23920l5) {
                    ImageView imageView = chatActivityEnterView.f23976w1;
                    if (this.f26064b) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    imageView.setVisibility(i10);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f26065c;
                if (animator.equals(chatActivityEnterView2.f23956s2)) {
                    chatActivityEnterView2.f23938p1.setVisibility(8);
                    if (this.f26064b && (bfVar = chatActivityEnterView2.J1) != null) {
                        bfVar.setVisibility(8);
                    }
                    chatActivityEnterView2.f23956s2 = null;
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.f26065c;
                chatActivityEnterView3.M1 = null;
                if (!this.f26064b) {
                    chatActivityEnterView3.J1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f26064b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ChatActivityEnterView chatActivityEnterView4 = this.f26065c;
                chatActivityEnterView4.f23975w0 = f7;
                fg fgVar = chatActivityEnterView4.U0;
                if (fgVar != null) {
                    fgVar.X();
                    return;
                }
                return;
        }
    }
}
