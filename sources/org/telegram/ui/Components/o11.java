package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o11 extends AnimatorListenerAdapter {
    public final int f26908a;
    public final ThemeEditorView f26909b;

    public o11(ThemeEditorView themeEditorView, int i10) {
        this.f26908a = i10;
        this.f26909b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26908a) {
            case 0:
                ThemeEditorView themeEditorView = this.f26909b;
                m11 m11Var = themeEditorView.f22431a;
                if (m11Var != null) {
                    m11Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f22431a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f26909b;
                org.telegram.ui.ActionBar.h6.r1(themeEditorView2.f22440m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
