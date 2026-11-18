package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class ve implements s61, qj0 {
    public final ChatActivityEnterView f40595a;

    public ve(ChatActivityEnterView chatActivityEnterView) {
        this.f40595a = chatActivityEnterView;
    }

    public void a() {
        ChatActivityEnterView chatActivityEnterView = this.f40595a;
        ValueAnimator valueAnimator = chatActivityEnterView.A5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        chatActivityEnterView.C5 = 0.0f;
        chatActivityEnterView.B5 = 0.0f;
        ph0 ph0Var = chatActivityEnterView.f32600h1;
        if (ph0Var != null) {
            ph0Var.setRotation(0.0f);
            ph0 ph0Var2 = chatActivityEnterView.f32600h1;
            ph0Var2.setPivotX(ph0Var2.getWidth() / 2.0f);
            ph0 ph0Var3 = chatActivityEnterView.f32600h1;
            ph0Var3.setPivotY(ph0Var3.getHeight() / 2.0f);
            if (chatActivityEnterView.f32600h1.getAnimatedDrawable() == chatActivityEnterView.f32726y5) {
                chatActivityEnterView.f32600h1.setProgress(0.0f);
            }
        }
        org.telegram.ui.ci ciVar = chatActivityEnterView.f32718x5;
        chatActivityEnterView.f32718x5 = null;
        if (ciVar != null) {
            ciVar.run();
        }
    }

    @Override
    public boolean c(int i7, View view) {
        if (view instanceof ki.x) {
            ChatActivityEnterView chatActivityEnterView = this.f40595a;
            chatActivityEnterView.setFieldText(((ki.x) view).getCommand() + " ");
            chatActivityEnterView.f32643n0.c();
            return true;
        }
        return false;
    }
}
