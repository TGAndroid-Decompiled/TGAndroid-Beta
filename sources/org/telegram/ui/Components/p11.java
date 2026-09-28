package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p11 extends AnimatorListenerAdapter {
    public final int f27221a;
    public final ThemeEditorView f27222b;

    public p11(ThemeEditorView themeEditorView, int i10) {
        this.f27221a = i10;
        this.f27222b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27221a) {
            case 0:
                ThemeEditorView themeEditorView = this.f27222b;
                n11 n11Var = themeEditorView.f22431a;
                if (n11Var != null) {
                    n11Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f22431a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f27222b;
                org.telegram.ui.ActionBar.h6.r1(themeEditorView2.f22440m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
