package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d11 extends AnimatorListenerAdapter {
    public final int f24105a;
    public final ThemeEditorView f24106b;

    public d11(ThemeEditorView themeEditorView, int i10) {
        this.f24105a = i10;
        this.f24106b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24105a) {
            case 0:
                ThemeEditorView themeEditorView = this.f24106b;
                b11 b11Var = themeEditorView.f23166a;
                if (b11Var != null) {
                    b11Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f23166a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f24106b;
                org.telegram.ui.ActionBar.j6.r1(themeEditorView2.f23175m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
