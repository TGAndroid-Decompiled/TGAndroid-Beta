package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y11 extends AnimatorListenerAdapter {
    public final int f32546a;
    public final ThemeEditorView f32547b;

    public y11(ThemeEditorView themeEditorView, int i10) {
        this.f32546a = i10;
        this.f32547b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32546a) {
            case 0:
                ThemeEditorView themeEditorView = this.f32547b;
                w11 w11Var = themeEditorView.f24391a;
                if (w11Var != null) {
                    w11Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f24391a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f32547b;
                org.telegram.ui.ActionBar.h6.s1(themeEditorView2.f24400m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
