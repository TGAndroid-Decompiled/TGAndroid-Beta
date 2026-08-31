package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e11 extends AnimatorListenerAdapter {
    public final int f26370a;
    public final ThemeEditorView f26371b;

    public e11(ThemeEditorView themeEditorView, int i10) {
        this.f26370a = i10;
        this.f26371b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26370a) {
            case 0:
                ThemeEditorView themeEditorView = this.f26371b;
                c11 c11Var = themeEditorView.f25053a;
                if (c11Var != null) {
                    c11Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f25053a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f26371b;
                org.telegram.ui.ActionBar.k6.r1(themeEditorView2.f25063m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
