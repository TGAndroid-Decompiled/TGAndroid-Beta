package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g21 extends AnimatorListenerAdapter {
    public final int f26585a;
    public final ThemeEditorView f26586b;

    public g21(ThemeEditorView themeEditorView, int i10) {
        this.f26585a = i10;
        this.f26586b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26585a) {
            case 0:
                ThemeEditorView themeEditorView = this.f26586b;
                e21 e21Var = themeEditorView.f24353a;
                if (e21Var != null) {
                    e21Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f24353a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f26586b;
                org.telegram.ui.ActionBar.i6.s1(themeEditorView2.f24363m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
