package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qf extends AnimatorListenerAdapter {
    public final boolean f28151a;
    public final float f28152b;
    public final float f28153c;
    public final float d;
    public final float e;
    public final ChatActivityEnterView f28154f;

    public qf(ChatActivityEnterView chatActivityEnterView, boolean z4, float f10, float f11, float f12, float f13) {
        this.f28154f = chatActivityEnterView;
        this.f28151a = z4;
        this.f28152b = f10;
        this.f28153c = f11;
        this.d = f12;
        this.e = f13;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f28154f;
        boolean z4 = this.f28151a;
        if (z4) {
            int i11 = ChatActivityEnterView.f22702j5;
            chatActivityEnterView.b0();
        }
        zo0 zo0Var = chatActivityEnterView.m0;
        if (zo0Var != null) {
            if (z4) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            zo0Var.setVisibility(i10);
            chatActivityEnterView.m0.setAlpha(this.d);
            chatActivityEnterView.m0.setTranslationX(this.e);
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
        if (!this.f28151a) {
            ChatActivityEnterView chatActivityEnterView = this.f28154f;
            zo0 zo0Var = chatActivityEnterView.m0;
            if (zo0Var != null) {
                zo0Var.setVisibility(8);
            }
            chatActivityEnterView.N0.setTranslationX(0.0f);
            chatActivityEnterView.D = 0.0f;
            chatActivityEnterView.J1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f10;
        boolean z4 = this.f28151a;
        ChatActivityEnterView chatActivityEnterView = this.f28154f;
        if (z4) {
            int i10 = ChatActivityEnterView.f22702j5;
            chatActivityEnterView.b0();
            chatActivityEnterView.m0.setVisibility(0);
        }
        zo0 zo0Var = chatActivityEnterView.m0;
        if (zo0Var != null) {
            zo0Var.setAlpha(this.f28152b);
            chatActivityEnterView.m0.setTranslationX(this.f28153c);
            f10 = chatActivityEnterView.m0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.N0.setTranslationX(f10);
        chatActivityEnterView.D = f10;
        chatActivityEnterView.J1();
        rh.z zVar = chatActivityEnterView.f22753i0;
        if (zVar != null && zVar.getTag() == null) {
            chatActivityEnterView.f22838y0.clear();
        }
    }
}
