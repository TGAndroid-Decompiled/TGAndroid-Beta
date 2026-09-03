package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d11 extends AnimatorListenerAdapter {
    public final int f26118a;
    public final ThemeEditorView f26119b;

    public d11(ThemeEditorView themeEditorView, int i10) {
        this.f26118a = i10;
        this.f26119b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26118a) {
            case 0:
                ThemeEditorView themeEditorView = this.f26119b;
                b11 b11Var = themeEditorView.f25055a;
                if (b11Var != null) {
                    b11Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f25055a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f26119b;
                org.telegram.ui.ActionBar.k6.r1(themeEditorView2.f25065m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
