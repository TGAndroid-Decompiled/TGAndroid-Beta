package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y11 extends AnimatorListenerAdapter {
    public final int f32541a;
    public final ThemeEditorView f32542b;

    public y11(ThemeEditorView themeEditorView, int i10) {
        this.f32541a = i10;
        this.f32542b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32541a) {
            case 0:
                ThemeEditorView themeEditorView = this.f32542b;
                w11 w11Var = themeEditorView.f24387a;
                if (w11Var != null) {
                    w11Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f24387a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f32542b;
                org.telegram.ui.ActionBar.h6.s1(themeEditorView2.f24396m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
