package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a11 extends AnimatorListenerAdapter {
    public final int f22280a;
    public final ThemeEditorView f22281b;

    public a11(ThemeEditorView themeEditorView, int i10) {
        this.f22280a = i10;
        this.f22281b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22280a) {
            case 0:
                ThemeEditorView themeEditorView = this.f22281b;
                y01 y01Var = themeEditorView.f22209a;
                if (y01Var != null) {
                    y01Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f22209a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f22281b;
                org.telegram.ui.ActionBar.i6.r1(themeEditorView2.f22218m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
