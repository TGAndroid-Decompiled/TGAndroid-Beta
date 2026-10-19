package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x11 extends AnimatorListenerAdapter {
    public final int f32258a;
    public final ThemeEditorView f32259b;

    public x11(ThemeEditorView themeEditorView, int i10) {
        this.f32258a = i10;
        this.f32259b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32258a) {
            case 0:
                ThemeEditorView themeEditorView = this.f32259b;
                v11 v11Var = themeEditorView.f24384a;
                if (v11Var != null) {
                    v11Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f24384a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f32259b;
                org.telegram.ui.ActionBar.h6.s1(themeEditorView2.f24393m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
