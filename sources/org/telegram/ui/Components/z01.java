package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z01 extends AnimatorListenerAdapter {
    public final int f33068a;
    public final ThemeEditorView f33069b;

    public z01(ThemeEditorView themeEditorView, int i10) {
        this.f33068a = i10;
        this.f33069b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33068a) {
            case 0:
                ThemeEditorView themeEditorView = this.f33069b;
                x01 x01Var = themeEditorView.f24188a;
                if (x01Var != null) {
                    x01Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f24188a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f33069b;
                org.telegram.ui.ActionBar.j6.r1(themeEditorView2.f24198m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
