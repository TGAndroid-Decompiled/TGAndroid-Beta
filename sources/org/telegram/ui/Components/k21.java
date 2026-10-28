package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k21 extends AnimatorListenerAdapter {
    public final int f29832a;
    public final ThemeEditorView f29833b;

    public k21(ThemeEditorView themeEditorView, int i10) {
        this.f29832a = i10;
        this.f29833b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29832a) {
            case 0:
                ThemeEditorView themeEditorView = this.f29833b;
                i21 i21Var = themeEditorView.f26330c;
                if (i21Var != null) {
                    i21Var.setBackground(null);
                    themeEditorView.f26334j.removeView(themeEditorView.f26330c);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f29833b;
                org.telegram.ui.ActionBar.y6.u1(themeEditorView2.f26339o, true, false, false);
                themeEditorView2.b();
                return;
        }
    }
}
