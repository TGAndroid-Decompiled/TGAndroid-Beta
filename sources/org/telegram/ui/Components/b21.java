package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b21 extends AnimatorListenerAdapter {
    public final int f24938a;
    public final ThemeEditorView f24939b;

    public b21(ThemeEditorView themeEditorView, int i10) {
        this.f24938a = i10;
        this.f24939b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24938a) {
            case 0:
                ThemeEditorView themeEditorView = this.f24939b;
                z11 z11Var = themeEditorView.f24535c;
                if (z11Var != null) {
                    z11Var.setBackground(null);
                    themeEditorView.f24539j.removeView(themeEditorView.f24535c);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f24939b;
                org.telegram.ui.ActionBar.k6.u1(themeEditorView2.f24544o, true, false, false);
                themeEditorView2.b();
                return;
        }
    }
}
