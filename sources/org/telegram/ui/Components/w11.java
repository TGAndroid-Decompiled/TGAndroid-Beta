package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w11 extends AnimatorListenerAdapter {
    public final int f31977a;
    public final ThemeEditorView f31978b;

    public w11(ThemeEditorView themeEditorView, int i10) {
        this.f31977a = i10;
        this.f31978b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31977a) {
            case 0:
                ThemeEditorView themeEditorView = this.f31978b;
                u11 u11Var = themeEditorView.f24390a;
                if (u11Var != null) {
                    u11Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f24390a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f31978b;
                org.telegram.ui.ActionBar.h6.s1(themeEditorView2.f24399m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
