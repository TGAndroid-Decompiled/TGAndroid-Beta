package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class me implements h61, ij0 {
    public final ChatActivityEnterView f37238a;

    public me(ChatActivityEnterView chatActivityEnterView) {
        this.f37238a = chatActivityEnterView;
    }

    public void a() {
        ChatActivityEnterView chatActivityEnterView = this.f37238a;
        ValueAnimator valueAnimator = chatActivityEnterView.f32298u5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        chatActivityEnterView.f32313w5 = 0.0f;
        chatActivityEnterView.f32305v5 = 0.0f;
        fh0 fh0Var = chatActivityEnterView.f32207h1;
        if (fh0Var != null) {
            fh0Var.setRotation(0.0f);
            fh0 fh0Var2 = chatActivityEnterView.f32207h1;
            fh0Var2.setPivotX(fh0Var2.getWidth() / 2.0f);
            fh0 fh0Var3 = chatActivityEnterView.f32207h1;
            fh0Var3.setPivotY(fh0Var3.getHeight() / 2.0f);
            if (chatActivityEnterView.f32207h1.getAnimatedDrawable() == chatActivityEnterView.s5) {
                chatActivityEnterView.f32207h1.setProgress(0.0f);
            }
        }
        od odVar = chatActivityEnterView.f32278r5;
        chatActivityEnterView.f32278r5 = null;
        if (odVar != null) {
            odVar.run();
        }
    }

    @Override
    public boolean b(int i7, View view) {
        if (view instanceof ki.y) {
            ChatActivityEnterView chatActivityEnterView = this.f37238a;
            chatActivityEnterView.setFieldText(((ki.y) view).getCommand() + " ");
            chatActivityEnterView.f32246n0.c();
            return true;
        }
        return false;
    }
}
