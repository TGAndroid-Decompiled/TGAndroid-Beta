package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rz0 extends AnimatorListenerAdapter {
    public final int f39417a;
    public final ThemeEditorView f39418b;

    public rz0(ThemeEditorView themeEditorView, int i7) {
        this.f39417a = i7;
        this.f39418b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39417a) {
            case 0:
                ThemeEditorView themeEditorView = this.f39418b;
                pz0 pz0Var = themeEditorView.f33180c;
                if (pz0Var != null) {
                    pz0Var.setBackground(null);
                    themeEditorView.f33185j.removeView(themeEditorView.f33180c);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f39418b;
                org.telegram.ui.ActionBar.m6.x1(themeEditorView2.f33190o, true, false, false);
                themeEditorView2.b();
                return;
        }
    }
}
