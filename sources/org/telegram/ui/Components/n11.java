package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n11 extends AnimatorListenerAdapter {
    public final int f26613a;
    public final ThemeEditorView f26614b;

    public n11(ThemeEditorView themeEditorView, int i10) {
        this.f26613a = i10;
        this.f26614b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26613a) {
            case 0:
                ThemeEditorView themeEditorView = this.f26614b;
                l11 l11Var = themeEditorView.f22431a;
                if (l11Var != null) {
                    l11Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f22431a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f26614b;
                org.telegram.ui.ActionBar.h6.r1(themeEditorView2.f22440m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
