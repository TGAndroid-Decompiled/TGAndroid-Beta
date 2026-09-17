package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z01 extends AnimatorListenerAdapter {
    public final int f33041a;
    public final ThemeEditorView f33042b;

    public z01(ThemeEditorView themeEditorView, int i10) {
        this.f33041a = i10;
        this.f33042b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33041a) {
            case 0:
                ThemeEditorView themeEditorView = this.f33042b;
                x01 x01Var = themeEditorView.f24161a;
                if (x01Var != null) {
                    x01Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f24161a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f33042b;
                org.telegram.ui.ActionBar.j6.r1(themeEditorView2.f24171m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
