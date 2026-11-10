package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gz0 extends AnimatorListenerAdapter {
    public final int f34104a;
    public final ThemeEditorView f34105b;

    public gz0(ThemeEditorView themeEditorView, int i7) {
        this.f34104a = i7;
        this.f34105b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34104a) {
            case 0:
                ThemeEditorView themeEditorView = this.f34105b;
                ez0 ez0Var = themeEditorView.f31585c;
                if (ez0Var != null) {
                    ez0Var.setBackground(null);
                    themeEditorView.f31590j.removeView(themeEditorView.f31585c);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f34105b;
                org.telegram.ui.ActionBar.m6.x1(themeEditorView2.f31595o, true, false, false);
                themeEditorView2.b();
                return;
        }
    }
}
