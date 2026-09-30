package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q11 extends AnimatorListenerAdapter {
    public final int f27518a;
    public final ThemeEditorView f27519b;

    public q11(ThemeEditorView themeEditorView, int i10) {
        this.f27518a = i10;
        this.f27519b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27518a) {
            case 0:
                ThemeEditorView themeEditorView = this.f27519b;
                o11 o11Var = themeEditorView.f22453a;
                if (o11Var != null) {
                    o11Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f22453a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f27519b;
                org.telegram.ui.ActionBar.h6.r1(themeEditorView2.f22462m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
