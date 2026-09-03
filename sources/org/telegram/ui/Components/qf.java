package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qf extends AnimatorListenerAdapter {
    public final boolean f30395a;
    public final float f30396b;
    public final float f30397c;
    public final float d;
    public final float f30398e;
    public final ChatActivityEnterView f30399f;

    public qf(ChatActivityEnterView chatActivityEnterView, boolean z4, float f10, float f11, float f12, float f13) {
        this.f30399f = chatActivityEnterView;
        this.f30395a = z4;
        this.f30396b = f10;
        this.f30397c = f11;
        this.d = f12;
        this.f30398e = f13;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f30399f;
        boolean z4 = this.f30395a;
        if (z4) {
            int i11 = ChatActivityEnterView.f24570j5;
            chatActivityEnterView.b0();
        }
        ap0 ap0Var = chatActivityEnterView.m0;
        if (ap0Var != null) {
            if (z4) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            ap0Var.setVisibility(i10);
            chatActivityEnterView.m0.setAlpha(this.d);
            chatActivityEnterView.m0.setTranslationX(this.f30398e);
            f10 = chatActivityEnterView.m0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.N0.setTranslationX(f10);
        chatActivityEnterView.D = f10;
        chatActivityEnterView.J1();
        chatActivityEnterView.requestLayout();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f30395a) {
            ChatActivityEnterView chatActivityEnterView = this.f30399f;
            ap0 ap0Var = chatActivityEnterView.m0;
            if (ap0Var != null) {
                ap0Var.setVisibility(8);
            }
            chatActivityEnterView.N0.setTranslationX(0.0f);
            chatActivityEnterView.D = 0.0f;
            chatActivityEnterView.J1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f10;
        boolean z4 = this.f30395a;
        ChatActivityEnterView chatActivityEnterView = this.f30399f;
        if (z4) {
            int i10 = ChatActivityEnterView.f24570j5;
            chatActivityEnterView.b0();
            chatActivityEnterView.m0.setVisibility(0);
        }
        ap0 ap0Var = chatActivityEnterView.m0;
        if (ap0Var != null) {
            ap0Var.setAlpha(this.f30396b);
            chatActivityEnterView.m0.setTranslationX(this.f30397c);
            f10 = chatActivityEnterView.m0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.N0.setTranslationX(f10);
        chatActivityEnterView.D = f10;
        chatActivityEnterView.J1();
        sh.z zVar = chatActivityEnterView.f24622i0;
        if (zVar != null && zVar.getTag() == null) {
            chatActivityEnterView.f24707y0.clear();
        }
    }
}
