package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q11 extends AnimatorListenerAdapter {
    public final int f27478a;
    public final ThemeEditorView f27479b;

    public q11(ThemeEditorView themeEditorView, int i10) {
        this.f27478a = i10;
        this.f27479b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27478a) {
            case 0:
                ThemeEditorView themeEditorView = this.f27479b;
                o11 o11Var = themeEditorView.f22446a;
                if (o11Var != null) {
                    o11Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f22446a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f27479b;
                org.telegram.ui.ActionBar.j6.r1(themeEditorView2.f22455m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
