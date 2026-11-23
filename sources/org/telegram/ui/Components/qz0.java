package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qz0 extends AnimatorListenerAdapter {
    public final int f39132a;
    public final ThemeEditorView f39133b;

    public qz0(ThemeEditorView themeEditorView, int i7) {
        this.f39132a = i7;
        this.f39133b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39132a) {
            case 0:
                ThemeEditorView themeEditorView = this.f39133b;
                oz0 oz0Var = themeEditorView.f33247c;
                if (oz0Var != null) {
                    oz0Var.setBackground(null);
                    themeEditorView.f33252j.removeView(themeEditorView.f33247c);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f39133b;
                org.telegram.ui.ActionBar.n6.x1(themeEditorView2.f33257o, true, false, false);
                themeEditorView2.b();
                return;
        }
    }
}
