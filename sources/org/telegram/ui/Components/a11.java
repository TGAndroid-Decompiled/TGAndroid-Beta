package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a11 extends AnimatorListenerAdapter {
    public final int f22277a;
    public final ThemeEditorView f22278b;

    public a11(ThemeEditorView themeEditorView, int i10) {
        this.f22277a = i10;
        this.f22278b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22277a) {
            case 0:
                ThemeEditorView themeEditorView = this.f22278b;
                y01 y01Var = themeEditorView.f22206a;
                if (y01Var != null) {
                    y01Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f22206a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f22278b;
                org.telegram.ui.ActionBar.i6.r1(themeEditorView2.f22215m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
