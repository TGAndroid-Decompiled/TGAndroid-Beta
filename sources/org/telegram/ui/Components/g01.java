package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g01 extends AnimatorListenerAdapter {
    public final int f28622a;
    public final ThemeEditorView f28623b;

    public g01(ThemeEditorView themeEditorView, int i9) {
        this.f28622a = i9;
        this.f28623b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28622a) {
            case 0:
                ThemeEditorView themeEditorView = this.f28623b;
                e01 e01Var = themeEditorView.f26554a;
                if (e01Var != null) {
                    e01Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f26554a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f28623b;
                org.telegram.ui.ActionBar.f6.r1(themeEditorView2.f26564m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
