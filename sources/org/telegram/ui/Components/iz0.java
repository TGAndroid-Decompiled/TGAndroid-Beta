package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class iz0 extends AnimatorListenerAdapter {
    public final int f35817a;
    public final ThemeEditorView f35818b;

    public iz0(ThemeEditorView themeEditorView, int i7) {
        this.f35817a = i7;
        this.f35818b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35817a) {
            case 0:
                ThemeEditorView themeEditorView = this.f35818b;
                gz0 gz0Var = themeEditorView.f32750c;
                if (gz0Var != null) {
                    gz0Var.setBackground(null);
                    themeEditorView.f32755j.removeView(themeEditorView.f32750c);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f35818b;
                org.telegram.ui.ActionBar.j6.x1(themeEditorView2.f32760o, true, false, false);
                themeEditorView2.b();
                return;
        }
    }
}
