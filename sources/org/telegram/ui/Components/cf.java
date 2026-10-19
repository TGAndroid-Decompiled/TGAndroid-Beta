package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class cf extends AnimatorListenerAdapter {
    public final int f25178a;
    public final boolean f25179b;
    public final ChatActivityEnterView f25180c;

    public cf(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f25178a = i10;
        this.f25180c = chatActivityEnterView;
        this.f25179b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f25178a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f25180c;
                if (animator.equals(chatActivityEnterView.f24016s2)) {
                    chatActivityEnterView.f24016s2 = null;
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
        switch (this.f25178a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f25180c;
                if (chatActivityEnterView.f23980l5) {
                    ImageView imageView = chatActivityEnterView.f24036w1;
                    if (this.f25179b) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    imageView.setVisibility(i10);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f25180c;
                if (animator.equals(chatActivityEnterView2.f24016s2)) {
                    chatActivityEnterView2.f23998p1.setVisibility(8);
                    if (this.f25179b && (zeVar = chatActivityEnterView2.J1) != null) {
                        zeVar.setVisibility(8);
                    }
                    chatActivityEnterView2.f24016s2 = null;
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.f25180c;
                chatActivityEnterView3.M1 = null;
                if (!this.f25179b) {
                    chatActivityEnterView3.J1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f25179b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ChatActivityEnterView chatActivityEnterView4 = this.f25180c;
                chatActivityEnterView4.f24035w0 = f7;
                dg dgVar = chatActivityEnterView4.U0;
                if (dgVar != null) {
                    dgVar.Y();
                    return;
                }
                return;
        }
    }
}
