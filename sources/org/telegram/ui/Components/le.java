package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.widget.ImageView;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class le extends AnimatorListenerAdapter {
    public final int f36755a;
    public boolean f36756b;
    public final ChatActivityEnterView f36757c;

    public le(ChatActivityEnterView chatActivityEnterView, boolean z10, int i7) {
        this.f36755a = i7;
        this.f36757c = chatActivityEnterView;
        this.f36756b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f36755a) {
            case 1:
                this.f36756b = true;
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.f36757c;
                if (animator.equals(chatActivityEnterView.f32157a3)) {
                    chatActivityEnterView.f32157a3 = null;
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
        je jeVar;
        int i7 = this.f36755a;
        int i10 = 0;
        float f10 = 0.0f;
        ChatActivityEnterView chatActivityEnterView = this.f36757c;
        switch (i7) {
            case 0:
                if (chatActivityEnterView.K6) {
                    ImageView imageView = chatActivityEnterView.f32186e2;
                    if (!this.f36756b) {
                        i10 = 8;
                    }
                    imageView.setVisibility(i10);
                    return;
                }
                return;
            case 1:
                if (!this.f36756b) {
                    int i11 = ChatActivityEnterView.N6;
                    chatActivityEnterView.s(1.0f);
                }
                chatActivityEnterView.R0.setRotation(0.0f);
                chatActivityEnterView.H5 = false;
                lg lgVar = chatActivityEnterView.Z0;
                if (lgVar != null) {
                    lgVar.setScaleX(1.0f);
                    chatActivityEnterView.Z0.setScaleY(1.0f);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.f32302v2;
                if (recordCircle != null) {
                    recordCircle.P = false;
                    recordCircle.invalidate();
                }
                nu0 nu0Var = chatActivityEnterView.f32321x5;
                if (nu0Var != null) {
                    nu0Var.a();
                }
                Bitmap bitmap = chatActivityEnterView.f32329y5;
                if (bitmap != null) {
                    bitmap.recycle();
                    chatActivityEnterView.f32329y5 = null;
                    return;
                }
                return;
            case 2:
                if (animator.equals(chatActivityEnterView.f32157a3)) {
                    chatActivityEnterView.X1.setVisibility(8);
                    if (this.f36756b && (jeVar = chatActivityEnterView.f32275r2) != null) {
                        jeVar.setVisibility(8);
                    }
                    chatActivityEnterView.f32157a3 = null;
                    return;
                }
                return;
            case 3:
                chatActivityEnterView.f32295u2 = null;
                if (!this.f36756b) {
                    chatActivityEnterView.f32275r2.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.f36756b) {
                    f10 = 1.0f;
                }
                chatActivityEnterView.f32316x0 = f10;
                sf sfVar = chatActivityEnterView.V0;
                if (sfVar != null) {
                    sfVar.Z();
                    return;
                }
                return;
        }
    }

    public le(ChatActivityEnterView chatActivityEnterView) {
        this.f36755a = 1;
        this.f36757c = chatActivityEnterView;
    }
}
