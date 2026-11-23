package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class we implements w61, sj0 {
    public final ChatActivityEnterView f41620a;

    public we(ChatActivityEnterView chatActivityEnterView) {
        this.f41620a = chatActivityEnterView;
    }

    public void a() {
        ChatActivityEnterView chatActivityEnterView = this.f41620a;
        ValueAnimator valueAnimator = chatActivityEnterView.C5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        chatActivityEnterView.E5 = 0.0f;
        chatActivityEnterView.D5 = 0.0f;
        qh0 qh0Var = chatActivityEnterView.f32695h1;
        if (qh0Var != null) {
            qh0Var.setRotation(0.0f);
            qh0 qh0Var2 = chatActivityEnterView.f32695h1;
            qh0Var2.setPivotX(qh0Var2.getWidth() / 2.0f);
            qh0 qh0Var3 = chatActivityEnterView.f32695h1;
            qh0Var3.setPivotY(qh0Var3.getHeight() / 2.0f);
            if (chatActivityEnterView.f32695h1.getAnimatedDrawable() == chatActivityEnterView.A5) {
                chatActivityEnterView.f32695h1.setProgress(0.0f);
            }
        }
        xd xdVar = chatActivityEnterView.f32833z5;
        chatActivityEnterView.f32833z5 = null;
        if (xdVar != null) {
            xdVar.run();
        }
    }

    @Override
    public boolean b(int i7, View view) {
        if (view instanceof ki.w) {
            ChatActivityEnterView chatActivityEnterView = this.f41620a;
            chatActivityEnterView.setFieldText(((ki.w) view).getCommand() + " ");
            chatActivityEnterView.f32738n0.c();
            return true;
        }
        return false;
    }
}
