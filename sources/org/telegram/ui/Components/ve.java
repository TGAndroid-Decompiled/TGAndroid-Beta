package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class ve implements v61, sj0 {
    public final ChatActivityEnterView f40811a;

    public ve(ChatActivityEnterView chatActivityEnterView) {
        this.f40811a = chatActivityEnterView;
    }

    public void a() {
        ChatActivityEnterView chatActivityEnterView = this.f40811a;
        ValueAnimator valueAnimator = chatActivityEnterView.C5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        chatActivityEnterView.E5 = 0.0f;
        chatActivityEnterView.D5 = 0.0f;
        rh0 rh0Var = chatActivityEnterView.f32628h1;
        if (rh0Var != null) {
            rh0Var.setRotation(0.0f);
            rh0 rh0Var2 = chatActivityEnterView.f32628h1;
            rh0Var2.setPivotX(rh0Var2.getWidth() / 2.0f);
            rh0 rh0Var3 = chatActivityEnterView.f32628h1;
            rh0Var3.setPivotY(rh0Var3.getHeight() / 2.0f);
            if (chatActivityEnterView.f32628h1.getAnimatedDrawable() == chatActivityEnterView.A5) {
                chatActivityEnterView.f32628h1.setProgress(0.0f);
            }
        }
        mf mfVar = chatActivityEnterView.f32766z5;
        chatActivityEnterView.f32766z5 = null;
        if (mfVar != null) {
            mfVar.run();
        }
    }

    @Override
    public boolean c(int i7, View view) {
        if (view instanceof ki.w) {
            ChatActivityEnterView chatActivityEnterView = this.f40811a;
            chatActivityEnterView.setFieldText(((ki.w) view).getCommand() + " ");
            chatActivityEnterView.f32671n0.c();
            return true;
        }
        return false;
    }
}
