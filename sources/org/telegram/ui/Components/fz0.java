package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fz0 extends AnimatorListenerAdapter {
    public final int f33672a;
    public final ThemeEditorView f33673b;

    public fz0(ThemeEditorView themeEditorView, int i7) {
        this.f33672a = i7;
        this.f33673b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33672a) {
            case 0:
                ThemeEditorView themeEditorView = this.f33673b;
                dz0 dz0Var = themeEditorView.f31564c;
                if (dz0Var != null) {
                    dz0Var.setBackground(null);
                    themeEditorView.f31569j.removeView(themeEditorView.f31564c);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f33673b;
                org.telegram.ui.ActionBar.k6.x1(themeEditorView2.f31574o, true, false, false);
                themeEditorView2.b();
                return;
        }
    }
}
