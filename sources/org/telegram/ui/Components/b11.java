package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b11 extends AnimatorListenerAdapter {
    public final int f22537a;
    public final ThemeEditorView f22538b;

    public b11(ThemeEditorView themeEditorView, int i10) {
        this.f22537a = i10;
        this.f22538b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22537a) {
            case 0:
                ThemeEditorView themeEditorView = this.f22538b;
                z01 z01Var = themeEditorView.f22222a;
                if (z01Var != null) {
                    z01Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f22222a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f22538b;
                org.telegram.ui.ActionBar.j6.r1(themeEditorView2.f22231m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
