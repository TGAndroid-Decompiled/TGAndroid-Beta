package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class ve implements v61, sj0 {
    public final ChatActivityEnterView f40813a;

    public ve(ChatActivityEnterView chatActivityEnterView) {
        this.f40813a = chatActivityEnterView;
    }

    public void a() {
        ChatActivityEnterView chatActivityEnterView = this.f40813a;
        ValueAnimator valueAnimator = chatActivityEnterView.C5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        chatActivityEnterView.E5 = 0.0f;
        chatActivityEnterView.D5 = 0.0f;
        rh0 rh0Var = chatActivityEnterView.f32631h1;
        if (rh0Var != null) {
            rh0Var.setRotation(0.0f);
            rh0 rh0Var2 = chatActivityEnterView.f32631h1;
            rh0Var2.setPivotX(rh0Var2.getWidth() / 2.0f);
            rh0 rh0Var3 = chatActivityEnterView.f32631h1;
            rh0Var3.setPivotY(rh0Var3.getHeight() / 2.0f);
            if (chatActivityEnterView.f32631h1.getAnimatedDrawable() == chatActivityEnterView.A5) {
                chatActivityEnterView.f32631h1.setProgress(0.0f);
            }
        }
        mf mfVar = chatActivityEnterView.f32769z5;
        chatActivityEnterView.f32769z5 = null;
        if (mfVar != null) {
            mfVar.run();
        }
    }

    @Override
    public boolean c(int i7, View view) {
        if (view instanceof ki.w) {
            ChatActivityEnterView chatActivityEnterView = this.f40813a;
            chatActivityEnterView.setFieldText(((ki.w) view).getCommand() + " ");
            chatActivityEnterView.f32674n0.c();
            return true;
        }
        return false;
    }
}
