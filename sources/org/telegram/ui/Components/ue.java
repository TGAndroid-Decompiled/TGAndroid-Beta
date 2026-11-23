package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.widget.ImageView;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ue extends AnimatorListenerAdapter {
    public final int f40321a;
    public boolean f40322b;
    public final ChatActivityEnterView f40323c;

    public ue(ChatActivityEnterView chatActivityEnterView, boolean z10, int i7) {
        this.f40321a = i7;
        this.f40323c = chatActivityEnterView;
        this.f40322b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40321a) {
            case 1:
                this.f40322b = true;
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.f40323c;
                if (animator.equals(chatActivityEnterView.f32640i3)) {
                    chatActivityEnterView.f32640i3 = null;
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
        int i7 = this.f40321a;
        int i10 = 0;
        float f10 = 0.0f;
        ChatActivityEnterView chatActivityEnterView = this.f40323c;
        switch (i7) {
            case 0:
                if (chatActivityEnterView.f32695p7) {
                    ImageView imageView = chatActivityEnterView.f32667m2;
                    if (!this.f40322b) {
                        i10 = 8;
                    }
                    imageView.setVisibility(i10);
                    return;
                }
                return;
            case 1:
                if (!this.f40322b) {
                    int i11 = ChatActivityEnterView.f32569s7;
                    chatActivityEnterView.u(1.0f);
                }
                chatActivityEnterView.R0.setRotation(0.0f);
                chatActivityEnterView.P5 = false;
                wg wgVar = chatActivityEnterView.Z0;
                if (wgVar != null) {
                    wgVar.setScaleX(1.0f);
                    chatActivityEnterView.Z0.setScaleY(1.0f);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
                if (recordCircle != null) {
                    recordCircle.P = false;
                    recordCircle.invalidate();
                }
                yu0 yu0Var = chatActivityEnterView.F5;
                if (yu0Var != null) {
                    yu0Var.a();
                }
                Bitmap bitmap = chatActivityEnterView.G5;
                if (bitmap != null) {
                    bitmap.recycle();
                    chatActivityEnterView.G5 = null;
                    return;
                }
                return;
            case 2:
                if (animator.equals(chatActivityEnterView.f32640i3)) {
                    chatActivityEnterView.f32616f2.setVisibility(8);
                    if (this.f40322b && (seVar = chatActivityEnterView.f32766z2) != null) {
                        seVar.setVisibility(8);
                    }
                    chatActivityEnterView.f32640i3 = null;
                    return;
                }
                return;
            case 3:
                chatActivityEnterView.C2 = null;
                if (!this.f40322b) {
                    chatActivityEnterView.f32766z2.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f40322b) {
                    f10 = 1.0f;
                }
                chatActivityEnterView.f32749x0 = f10;
                fg fgVar = chatActivityEnterView.V0;
                if (fgVar != null) {
                    fgVar.Z();
                    return;
                }
                return;
        }
    }

    public ue(ChatActivityEnterView chatActivityEnterView) {
        this.f40321a = 1;
        this.f40323c = chatActivityEnterView;
    }
}
