package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c21 extends AnimatorListenerAdapter {
    public final int f23621a;
    public final ThemeEditorView f23622b;

    public c21(ThemeEditorView themeEditorView, int i10) {
        this.f23621a = i10;
        this.f23622b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23621a) {
            case 0:
                ThemeEditorView themeEditorView = this.f23622b;
                a21 a21Var = themeEditorView.f23028a;
                if (a21Var != null) {
                    a21Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f23028a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f23622b;
                org.telegram.ui.ActionBar.g6.s1(themeEditorView2.f23037m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
