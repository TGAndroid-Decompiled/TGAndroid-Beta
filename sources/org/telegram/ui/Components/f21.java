package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f21 extends AnimatorListenerAdapter {
    public final int f26218a;
    public final ThemeEditorView f26219b;

    public f21(ThemeEditorView themeEditorView, int i10) {
        this.f26218a = i10;
        this.f26219b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26218a) {
            case 0:
                ThemeEditorView themeEditorView = this.f26219b;
                d21 d21Var = themeEditorView.f24349a;
                if (d21Var != null) {
                    d21Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f24349a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f26219b;
                org.telegram.ui.ActionBar.i6.s1(themeEditorView2.f24359m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
