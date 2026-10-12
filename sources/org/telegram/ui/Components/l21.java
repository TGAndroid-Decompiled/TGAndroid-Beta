package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l21 extends AnimatorListenerAdapter {
    public final int f27993a;
    public final ThemeEditorView f27994b;

    public l21(ThemeEditorView themeEditorView, int i10) {
        this.f27993a = i10;
        this.f27994b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27993a) {
            case 0:
                ThemeEditorView themeEditorView = this.f27994b;
                j21 j21Var = themeEditorView.f24127a;
                if (j21Var != null) {
                    j21Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f24127a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f27994b;
                org.telegram.ui.ActionBar.h6.s1(themeEditorView2.f24137m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
