package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p11 extends AnimatorListenerAdapter {
    public final int f27245a;
    public final ThemeEditorView f27246b;

    public p11(ThemeEditorView themeEditorView, int i10) {
        this.f27245a = i10;
        this.f27246b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27245a) {
            case 0:
                ThemeEditorView themeEditorView = this.f27246b;
                n11 n11Var = themeEditorView.f22434a;
                if (n11Var != null) {
                    n11Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f22434a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f27246b;
                org.telegram.ui.ActionBar.i6.r1(themeEditorView2.f22443m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
