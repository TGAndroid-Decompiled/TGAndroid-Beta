package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z11 extends AnimatorListenerAdapter {
    public final int f33398a;
    public final ThemeEditorView f33399b;

    public z11(ThemeEditorView themeEditorView, int i10) {
        this.f33398a = i10;
        this.f33399b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33398a) {
            case 0:
                ThemeEditorView themeEditorView = this.f33399b;
                x11 x11Var = themeEditorView.f24354a;
                if (x11Var != null) {
                    x11Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f24354a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f33399b;
                org.telegram.ui.ActionBar.i6.r1(themeEditorView2.f24364m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
