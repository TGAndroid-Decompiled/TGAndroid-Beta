package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y11 extends AnimatorListenerAdapter {
    public final int f33025a;
    public final ThemeEditorView f33026b;

    public y11(ThemeEditorView themeEditorView, int i10) {
        this.f33025a = i10;
        this.f33026b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33025a) {
            case 0:
                ThemeEditorView themeEditorView = this.f33026b;
                w11 w11Var = themeEditorView.f24346a;
                if (w11Var != null) {
                    w11Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f24346a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f33026b;
                org.telegram.ui.ActionBar.i6.r1(themeEditorView2.f24356m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
