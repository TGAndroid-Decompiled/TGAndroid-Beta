package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hz0 extends AnimatorListenerAdapter {
    public final int f34503a;
    public final ThemeEditorView f34504b;

    public hz0(ThemeEditorView themeEditorView, int i7) {
        this.f34503a = i7;
        this.f34504b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34503a) {
            case 0:
                ThemeEditorView themeEditorView = this.f34504b;
                fz0 fz0Var = themeEditorView.f31574c;
                if (fz0Var != null) {
                    fz0Var.setBackground(null);
                    themeEditorView.f31579j.removeView(themeEditorView.f31574c);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f34504b;
                org.telegram.ui.ActionBar.l6.x1(themeEditorView2.f31584o, true, false, false);
                themeEditorView2.b();
                return;
        }
    }
}
