package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b21 extends AnimatorListenerAdapter {
    public final int f23677a;
    public final ThemeEditorView f23678b;

    public b21(ThemeEditorView themeEditorView, int i10) {
        this.f23677a = i10;
        this.f23678b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23677a) {
            case 0:
                ThemeEditorView themeEditorView = this.f23678b;
                z11 z11Var = themeEditorView.f23328a;
                if (z11Var != null) {
                    z11Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f23328a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f23678b;
                org.telegram.ui.ActionBar.g6.s1(themeEditorView2.f23337m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
