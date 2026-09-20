package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o11 extends AnimatorListenerAdapter {
    public final int f26780a;
    public final ThemeEditorView f26781b;

    public o11(ThemeEditorView themeEditorView, int i10) {
        this.f26780a = i10;
        this.f26781b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26780a) {
            case 0:
                ThemeEditorView themeEditorView = this.f26781b;
                m11 m11Var = themeEditorView.f22430a;
                if (m11Var != null) {
                    m11Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f22430a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f26781b;
                org.telegram.ui.ActionBar.j6.r1(themeEditorView2.f22439m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
