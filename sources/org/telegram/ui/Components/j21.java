package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j21 extends AnimatorListenerAdapter {
    public final int f29465a;
    public final ThemeEditorView f29466b;

    public j21(ThemeEditorView themeEditorView, int i10) {
        this.f29465a = i10;
        this.f29466b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29465a) {
            case 0:
                ThemeEditorView themeEditorView = this.f29466b;
                h21 h21Var = themeEditorView.f26328c;
                if (h21Var != null) {
                    h21Var.setBackground(null);
                    themeEditorView.f26332j.removeView(themeEditorView.f26328c);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f29466b;
                org.telegram.ui.ActionBar.y6.u1(themeEditorView2.f26337o, true, false, false);
                themeEditorView2.b();
                return;
        }
    }
}
