package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rz0 extends AnimatorListenerAdapter {
    public final int f39382a;
    public final ThemeEditorView f39383b;

    public rz0(ThemeEditorView themeEditorView, int i7) {
        this.f39382a = i7;
        this.f39383b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39382a) {
            case 0:
                ThemeEditorView themeEditorView = this.f39383b;
                pz0 pz0Var = themeEditorView.f33149c;
                if (pz0Var != null) {
                    pz0Var.setBackground(null);
                    themeEditorView.f33154j.removeView(themeEditorView.f33149c);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f39383b;
                org.telegram.ui.ActionBar.m6.x1(themeEditorView2.f33159o, true, false, false);
                themeEditorView2.b();
                return;
        }
    }
}
