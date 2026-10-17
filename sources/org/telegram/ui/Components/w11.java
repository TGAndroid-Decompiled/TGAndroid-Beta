package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w11 extends AnimatorListenerAdapter {
    public final int f31970a;
    public final ThemeEditorView f31971b;

    public w11(ThemeEditorView themeEditorView, int i10) {
        this.f31970a = i10;
        this.f31971b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31970a) {
            case 0:
                ThemeEditorView themeEditorView = this.f31971b;
                u11 u11Var = themeEditorView.f24383a;
                if (u11Var != null) {
                    u11Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f24383a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f31971b;
                org.telegram.ui.ActionBar.h6.s1(themeEditorView2.f24392m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
