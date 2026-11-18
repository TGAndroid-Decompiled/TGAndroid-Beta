package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.widget.ImageView;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ue extends AnimatorListenerAdapter {
    public final int f40315a;
    public boolean f40316b;
    public final ChatActivityEnterView f40317c;

    public ue(ChatActivityEnterView chatActivityEnterView, boolean z10, int i7) {
        this.f40315a = i7;
        this.f40317c = chatActivityEnterView;
        this.f40316b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40315a) {
            case 1:
                this.f40316b = true;
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.f40317c;
                if (animator.equals(chatActivityEnterView.f32594g3)) {
                    chatActivityEnterView.f32594g3 = null;
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
        se seVar;
        int i7 = this.f40315a;
        int i10 = 0;
        float f10 = 0.0f;
        ChatActivityEnterView chatActivityEnterView = this.f40317c;
        switch (i7) {
            case 0:
                if (chatActivityEnterView.f32627k7) {
                    ImageView imageView = chatActivityEnterView.f32622k2;
                    if (!this.f40316b) {
                        i10 = 8;
                    }
                    imageView.setVisibility(i10);
                    return;
                }
                return;
            case 1:
                if (!this.f40316b) {
                    int i11 = ChatActivityEnterView.f32538n7;
                    chatActivityEnterView.u(1.0f);
                }
                chatActivityEnterView.R0.setRotation(0.0f);
                chatActivityEnterView.N5 = false;
                ug ugVar = chatActivityEnterView.Z0;
                if (ugVar != null) {
                    ugVar.setScaleX(1.0f);
                    chatActivityEnterView.Z0.setScaleY(1.0f);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.B2;
                if (recordCircle != null) {
                    recordCircle.P = false;
                    recordCircle.invalidate();
                }
                vu0 vu0Var = chatActivityEnterView.D5;
                if (vu0Var != null) {
                    vu0Var.a();
                }
                Bitmap bitmap = chatActivityEnterView.E5;
                if (bitmap != null) {
                    bitmap.recycle();
                    chatActivityEnterView.E5 = null;
                    return;
                }
                return;
            case 2:
                if (animator.equals(chatActivityEnterView.f32594g3)) {
                    chatActivityEnterView.d2.setVisibility(8);
                    if (this.f40316b && (seVar = chatActivityEnterView.f32715x2) != null) {
                        seVar.setVisibility(8);
                    }
                    chatActivityEnterView.f32594g3 = null;
                    return;
                }
                return;
            case 3:
                chatActivityEnterView.A2 = null;
                if (!this.f40316b) {
                    chatActivityEnterView.f32715x2.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f40316b) {
                    f10 = 1.0f;
                }
                chatActivityEnterView.f32713x0 = f10;
                cg cgVar = chatActivityEnterView.V0;
                if (cgVar != null) {
                    cgVar.Z();
                    return;
                }
                return;
        }
    }

    public ue(ChatActivityEnterView chatActivityEnterView) {
        this.f40315a = 1;
        this.f40317c = chatActivityEnterView;
    }
}
