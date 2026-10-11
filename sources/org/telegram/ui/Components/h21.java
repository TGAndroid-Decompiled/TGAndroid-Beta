package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h21 extends AnimatorListenerAdapter {
    public final int f26890a;
    public final ThemeEditorView f26891b;

    public h21(ThemeEditorView themeEditorView, int i10) {
        this.f26890a = i10;
        this.f26891b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26890a) {
            case 0:
                ThemeEditorView themeEditorView = this.f26891b;
                f21 f21Var = themeEditorView.f24341a;
                if (f21Var != null) {
                    f21Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f24341a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f26891b;
                org.telegram.ui.ActionBar.h6.s1(themeEditorView2.f24351m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
