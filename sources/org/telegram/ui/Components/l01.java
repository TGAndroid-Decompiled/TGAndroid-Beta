package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l01 extends AnimatorListenerAdapter {
    public final int f28009a;
    public final ThemeEditorView f28010b;

    public l01(ThemeEditorView themeEditorView, int i10) {
        this.f28009a = i10;
        this.f28010b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28009a) {
            case 0:
                ThemeEditorView themeEditorView = this.f28010b;
                j01 j01Var = themeEditorView.f24211c;
                if (j01Var != null) {
                    j01Var.setBackground(null);
                    themeEditorView.f24215j.removeView(themeEditorView.f24211c);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f28010b;
                org.telegram.ui.ActionBar.t6.x1(themeEditorView2.f24220o, true, false, false);
                themeEditorView2.b();
                return;
        }
    }
}
