package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.widget.ImageView;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ve extends AnimatorListenerAdapter {
    public final int f40664a;
    public boolean f40665b;
    public final ChatActivityEnterView f40666c;

    public ve(ChatActivityEnterView chatActivityEnterView, boolean z10, int i7) {
        this.f40664a = i7;
        this.f40666c = chatActivityEnterView;
        this.f40665b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40664a) {
            case 1:
                this.f40665b = true;
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.f40666c;
                if (animator.equals(chatActivityEnterView.f32704i3)) {
                    chatActivityEnterView.f32704i3 = null;
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
        te teVar;
        int i7 = this.f40664a;
        int i10 = 0;
        float f10 = 0.0f;
        ChatActivityEnterView chatActivityEnterView = this.f40666c;
        switch (i7) {
            case 0:
                if (chatActivityEnterView.f32759p7) {
                    ImageView imageView = chatActivityEnterView.f32731m2;
                    if (!this.f40665b) {
                        i10 = 8;
                    }
                    imageView.setVisibility(i10);
                    return;
                }
                return;
            case 1:
                if (!this.f40665b) {
                    int i11 = ChatActivityEnterView.f32633s7;
                    chatActivityEnterView.u(1.0f);
                }
                chatActivityEnterView.R0.setRotation(0.0f);
                chatActivityEnterView.P5 = false;
                vg vgVar = chatActivityEnterView.Z0;
                if (vgVar != null) {
                    vgVar.setScaleX(1.0f);
                    chatActivityEnterView.Z0.setScaleY(1.0f);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
                if (recordCircle != null) {
                    recordCircle.P = false;
                    recordCircle.invalidate();
                }
                xu0 xu0Var = chatActivityEnterView.F5;
                if (xu0Var != null) {
                    xu0Var.a();
                }
                Bitmap bitmap = chatActivityEnterView.G5;
                if (bitmap != null) {
                    bitmap.recycle();
                    chatActivityEnterView.G5 = null;
                    return;
                }
                return;
            case 2:
                if (animator.equals(chatActivityEnterView.f32704i3)) {
                    chatActivityEnterView.f32680f2.setVisibility(8);
                    if (this.f40665b && (teVar = chatActivityEnterView.f32830z2) != null) {
                        teVar.setVisibility(8);
                    }
                    chatActivityEnterView.f32704i3 = null;
                    return;
                }
                return;
            case 3:
                chatActivityEnterView.C2 = null;
                if (!this.f40665b) {
                    chatActivityEnterView.f32830z2.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f40665b) {
                    f10 = 1.0f;
                }
                chatActivityEnterView.f32813x0 = f10;
                eg egVar = chatActivityEnterView.V0;
                if (egVar != null) {
                    egVar.Z();
                    return;
                }
                return;
        }
    }

    public ve(ChatActivityEnterView chatActivityEnterView) {
        this.f40664a = 1;
        this.f40666c = chatActivityEnterView;
    }
}
