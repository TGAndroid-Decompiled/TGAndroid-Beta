package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x11 extends AnimatorListenerAdapter {
    public final int f32260a;
    public final ThemeEditorView f32261b;

    public x11(ThemeEditorView themeEditorView, int i10) {
        this.f32260a = i10;
        this.f32261b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32260a) {
            case 0:
                ThemeEditorView themeEditorView = this.f32261b;
                v11 v11Var = themeEditorView.f24386a;
                if (v11Var != null) {
                    v11Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f24386a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f32261b;
                org.telegram.ui.ActionBar.h6.s1(themeEditorView2.f24395m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
