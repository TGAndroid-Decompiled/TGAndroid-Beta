package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s01 extends AnimatorListenerAdapter {
    public final int f32433a;
    public final ThemeEditorView f32434b;

    public s01(ThemeEditorView themeEditorView, int i10) {
        this.f32433a = i10;
        this.f32434b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32433a) {
            case 0:
                ThemeEditorView themeEditorView = this.f32434b;
                q01 q01Var = themeEditorView.f26565a;
                if (q01Var != null) {
                    q01Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f26565a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f32434b;
                org.telegram.ui.ActionBar.g6.r1(themeEditorView2.f26575m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
