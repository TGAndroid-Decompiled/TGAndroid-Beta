package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z01 extends AnimatorListenerAdapter {
    public final int f33040a;
    public final ThemeEditorView f33041b;

    public z01(ThemeEditorView themeEditorView, int i10) {
        this.f33040a = i10;
        this.f33041b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33040a) {
            case 0:
                ThemeEditorView themeEditorView = this.f33041b;
                x01 x01Var = themeEditorView.f24160a;
                if (x01Var != null) {
                    x01Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f24160a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f33041b;
                org.telegram.ui.ActionBar.j6.r1(themeEditorView2.f24170m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
