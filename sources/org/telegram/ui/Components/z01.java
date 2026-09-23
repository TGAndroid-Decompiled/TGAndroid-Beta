package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z01 extends AnimatorListenerAdapter {
    public final int f30499a;
    public final ThemeEditorView f30500b;

    public z01(ThemeEditorView themeEditorView, int i10) {
        this.f30499a = i10;
        this.f30500b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30499a) {
            case 0:
                ThemeEditorView themeEditorView = this.f30500b;
                x01 x01Var = themeEditorView.f22180a;
                if (x01Var != null) {
                    x01Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f22180a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f30500b;
                org.telegram.ui.ActionBar.h6.r1(themeEditorView2.f22189m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
