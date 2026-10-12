package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l21 extends AnimatorListenerAdapter {
    public final int f28008a;
    public final ThemeEditorView f28009b;

    public l21(ThemeEditorView themeEditorView, int i10) {
        this.f28008a = i10;
        this.f28009b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28008a) {
            case 0:
                ThemeEditorView themeEditorView = this.f28009b;
                j21 j21Var = themeEditorView.f24126a;
                if (j21Var != null) {
                    j21Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f24126a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f28009b;
                org.telegram.ui.ActionBar.h6.s1(themeEditorView2.f24136m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
