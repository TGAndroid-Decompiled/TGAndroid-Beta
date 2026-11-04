package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fz0 extends AnimatorListenerAdapter {
    public final int f33897a;
    public final ThemeEditorView f33898b;

    public fz0(ThemeEditorView themeEditorView, int i3) {
        this.f33897a = i3;
        this.f33898b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33897a) {
            case 0:
                ThemeEditorView themeEditorView = this.f33898b;
                dz0 dz0Var = themeEditorView.f31643c;
                if (dz0Var != null) {
                    dz0Var.setBackground(null);
                    themeEditorView.f31648j.removeView(themeEditorView.f31643c);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f33898b;
                org.telegram.ui.ActionBar.k6.x1(themeEditorView2.f31653o, true, false, false);
                themeEditorView2.b();
                return;
        }
    }
}
