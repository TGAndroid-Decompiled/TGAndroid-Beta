package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a21 extends AnimatorListenerAdapter {
    public final int f24609a;
    public final ThemeEditorView f24610b;

    public a21(ThemeEditorView themeEditorView, int i10) {
        this.f24609a = i10;
        this.f24610b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24609a) {
            case 0:
                ThemeEditorView themeEditorView = this.f24610b;
                y11 y11Var = themeEditorView.f24536c;
                if (y11Var != null) {
                    y11Var.setBackground(null);
                    themeEditorView.f24540j.removeView(themeEditorView.f24536c);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f24610b;
                org.telegram.ui.ActionBar.k6.u1(themeEditorView2.f24545o, true, false, false);
                themeEditorView2.b();
                return;
        }
    }
}
