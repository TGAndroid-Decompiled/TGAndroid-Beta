package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bf extends AnimatorListenerAdapter {
    public final boolean f32227a;
    public final ChatActivityEnterView f32228b;

    public bf(ChatActivityEnterView chatActivityEnterView, boolean z9) {
        this.f32228b = chatActivityEnterView;
        this.f32227a = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f32228b;
        if (animator.equals(chatActivityEnterView.f31146t2)) {
            chatActivityEnterView.f31146t2 = null;
        }
        chatActivityEnterView.w0();
        chatActivityEnterView.f31093k1.setAlpha(1.0f);
        chatActivityEnterView.f31093k1.setTranslationX(0.0f);
        zf zfVar = chatActivityEnterView.O1;
        if (zfVar != null && org.telegram.messenger.iz.O < 3) {
            ChatActivityEnterView chatActivityEnterView2 = zfVar.f40935b0;
            chatActivityEnterView2.f31060e4 = true;
            chatActivityEnterView2.f31067f4 = System.currentTimeMillis();
        }
        we weVar = chatActivityEnterView.E0;
        if (weVar != null) {
            weVar.setAlpha(0.0f);
        }
        if (this.f32227a) {
            ji0 ji0Var = chatActivityEnterView.f31076h1;
            if (ji0Var != null) {
                ji0Var.setVisibility(8);
            }
            td tdVar = chatActivityEnterView.f31057e1;
            if (tdVar != null) {
                tdVar.setVisibility(8);
            }
            chatActivityEnterView.w0();
        }
    }
}
