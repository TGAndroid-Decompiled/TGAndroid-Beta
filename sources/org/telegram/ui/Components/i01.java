package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class i01 extends AnimatorListenerAdapter {

    public final int f29194a;

    public final ThemeEditorView f29195b;

    public i01(ThemeEditorView themeEditorView, int i10) {
        this.f29194a = i10;
        this.f29195b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) throws Throwable {
        switch (this.f29194a) {
            case 0:
                ThemeEditorView themeEditorView = this.f29195b;
                g01 g01Var = themeEditorView.f26550a;
                if (g01Var != null) {
                    g01Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f26550a);
                }
                break;
            default:
                ThemeEditorView themeEditorView2 = this.f29195b;
                org.telegram.ui.ActionBar.g6.r1(themeEditorView2.f26560m, true, false, false);
                themeEditorView2.a();
                break;
        }
    }
}
