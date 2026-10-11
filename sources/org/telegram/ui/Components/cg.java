package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cg extends AnimatorListenerAdapter {
    public final boolean f25203a;
    public final float f25204b;
    public final float f25205c;
    public final float d;
    public final float f25206e;
    public final ChatActivityEnterView f25207f;

    public cg(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f25207f = chatActivityEnterView;
        this.f25203a = z10;
        this.f25204b = f7;
        this.f25205c = f10;
        this.d = f11;
        this.f25206e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f25207f;
        boolean z10 = this.f25203a;
        if (z10) {
            int i11 = ChatActivityEnterView.f23842n5;
            chatActivityEnterView.Z();
        }
        dq0 dq0Var = chatActivityEnterView.f23932p0;
        if (dq0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            dq0Var.setVisibility(i10);
            chatActivityEnterView.f23932p0.setAlpha(this.d);
            chatActivityEnterView.f23932p0.setTranslationX(this.f25206e);
            f7 = chatActivityEnterView.f23932p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.H1();
        chatActivityEnterView.requestLayout();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f25203a) {
            ChatActivityEnterView chatActivityEnterView = this.f25207f;
            dq0 dq0Var = chatActivityEnterView.f23932p0;
            if (dq0Var != null) {
                dq0Var.setVisibility(8);
            }
            chatActivityEnterView.Q0.setTranslationX(0.0f);
            chatActivityEnterView.G = 0.0f;
            chatActivityEnterView.H1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f7;
        boolean z10 = this.f25203a;
        ChatActivityEnterView chatActivityEnterView = this.f25207f;
        if (z10) {
            int i10 = ChatActivityEnterView.f23842n5;
            chatActivityEnterView.Z();
            chatActivityEnterView.f23932p0.setVisibility(0);
        }
        dq0 dq0Var = chatActivityEnterView.f23932p0;
        if (dq0Var != null) {
            dq0Var.setAlpha(this.f25204b);
            chatActivityEnterView.f23932p0.setTranslationX(this.f25205c);
            f7 = chatActivityEnterView.f23932p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.H1();
        ei.c0 c0Var = chatActivityEnterView.f23912l0;
        if (c0Var != null && c0Var.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
