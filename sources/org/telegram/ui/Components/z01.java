package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z01 extends AnimatorListenerAdapter {
    public final int f33067a;
    public final ThemeEditorView f33068b;

    public z01(ThemeEditorView themeEditorView, int i10) {
        this.f33067a = i10;
        this.f33068b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33067a) {
            case 0:
                ThemeEditorView themeEditorView = this.f33068b;
                x01 x01Var = themeEditorView.f24187a;
                if (x01Var != null) {
                    x01Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f24187a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f33068b;
                org.telegram.ui.ActionBar.j6.r1(themeEditorView2.f24197m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
