package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p11 extends AnimatorListenerAdapter {
    public final int f27087a;
    public final ThemeEditorView f27088b;

    public p11(ThemeEditorView themeEditorView, int i10) {
        this.f27087a = i10;
        this.f27088b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27087a) {
            case 0:
                ThemeEditorView themeEditorView = this.f27088b;
                n11 n11Var = themeEditorView.f22395a;
                if (n11Var != null) {
                    n11Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f22395a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f27088b;
                org.telegram.ui.ActionBar.j6.r1(themeEditorView2.f22404m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
