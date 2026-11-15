package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class iz0 extends AnimatorListenerAdapter {
    public final int f35804a;
    public final ThemeEditorView f35805b;

    public iz0(ThemeEditorView themeEditorView, int i7) {
        this.f35804a = i7;
        this.f35805b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35804a) {
            case 0:
                ThemeEditorView themeEditorView = this.f35805b;
                gz0 gz0Var = themeEditorView.f32750c;
                if (gz0Var != null) {
                    gz0Var.setBackground(null);
                    themeEditorView.f32755j.removeView(themeEditorView.f32750c);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f35805b;
                org.telegram.ui.ActionBar.j6.x1(themeEditorView2.f32760o, true, false, false);
                themeEditorView2.b();
                return;
        }
    }
}
