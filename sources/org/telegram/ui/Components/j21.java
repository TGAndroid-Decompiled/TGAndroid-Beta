package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j21 extends AnimatorListenerAdapter {
    public final int f29463a;
    public final ThemeEditorView f29464b;

    public j21(ThemeEditorView themeEditorView, int i10) {
        this.f29463a = i10;
        this.f29464b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29463a) {
            case 0:
                ThemeEditorView themeEditorView = this.f29464b;
                h21 h21Var = themeEditorView.f26326c;
                if (h21Var != null) {
                    h21Var.setBackground(null);
                    themeEditorView.f26330j.removeView(themeEditorView.f26326c);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f29464b;
                org.telegram.ui.ActionBar.y6.u1(themeEditorView2.f26335o, true, false, false);
                themeEditorView2.b();
                return;
        }
    }
}
