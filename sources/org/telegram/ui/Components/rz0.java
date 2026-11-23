package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rz0 extends AnimatorListenerAdapter {
    public final int f39426a;
    public final ThemeEditorView f39427b;

    public rz0(ThemeEditorView themeEditorView, int i7) {
        this.f39426a = i7;
        this.f39427b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39426a) {
            case 0:
                ThemeEditorView themeEditorView = this.f39427b;
                pz0 pz0Var = themeEditorView.f33183c;
                if (pz0Var != null) {
                    pz0Var.setBackground(null);
                    themeEditorView.f33188j.removeView(themeEditorView.f33183c);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f39427b;
                org.telegram.ui.ActionBar.m6.x1(themeEditorView2.f33193o, true, false, false);
                themeEditorView2.b();
                return;
        }
    }
}
