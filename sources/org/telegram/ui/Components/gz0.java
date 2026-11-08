package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gz0 extends AnimatorListenerAdapter {
    public final int f34053a;
    public final ThemeEditorView f34054b;

    public gz0(ThemeEditorView themeEditorView, int i7) {
        this.f34053a = i7;
        this.f34054b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34053a) {
            case 0:
                ThemeEditorView themeEditorView = this.f34054b;
                ez0 ez0Var = themeEditorView.f31569c;
                if (ez0Var != null) {
                    ez0Var.setBackground(null);
                    themeEditorView.f31574j.removeView(themeEditorView.f31569c);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f34054b;
                org.telegram.ui.ActionBar.k6.x1(themeEditorView2.f31579o, true, false, false);
                themeEditorView2.b();
                return;
        }
    }
}
