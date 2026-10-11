package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g21 extends AnimatorListenerAdapter {
    public final int f26634a;
    public final ThemeEditorView f26635b;

    public g21(ThemeEditorView themeEditorView, int i10) {
        this.f26634a = i10;
        this.f26635b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26634a) {
            case 0:
                ThemeEditorView themeEditorView = this.f26635b;
                e21 e21Var = themeEditorView.f24377a;
                if (e21Var != null) {
                    e21Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.f24377a);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f26635b;
                org.telegram.ui.ActionBar.h6.s1(themeEditorView2.f24387m, true, false, false);
                themeEditorView2.a();
                return;
        }
    }
}
