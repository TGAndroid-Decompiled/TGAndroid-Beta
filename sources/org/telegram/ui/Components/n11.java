package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n11 extends AnimatorListenerAdapter {
    public final int f25368a;
    public final ThemeEditorView f25369b;

    public n11(ThemeEditorView themeEditorView, int i10) {
        this.f25368a = i10;
        this.f25369b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25368a) {
            case 0:
                ThemeEditorView themeEditorView = this.f25369b;
                l11 l11Var = themeEditorView.f21294a;
                if (l11Var != null) {
                    l11Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f21294a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f25369b;
                org.telegram.ui.ActionBar.j6.r1(themeEditorView2.f21303m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
