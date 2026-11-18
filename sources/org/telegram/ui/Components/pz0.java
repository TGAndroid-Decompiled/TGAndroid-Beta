package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pz0 extends AnimatorListenerAdapter {
    public final int f38650a;
    public final ThemeEditorView f38651b;

    public pz0(ThemeEditorView themeEditorView, int i7) {
        this.f38650a = i7;
        this.f38651b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38650a) {
            case 0:
                ThemeEditorView themeEditorView = this.f38651b;
                nz0 nz0Var = themeEditorView.f33147c;
                if (nz0Var != null) {
                    nz0Var.setBackground(null);
                    themeEditorView.f33152j.removeView(themeEditorView.f33147c);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f38651b;
                org.telegram.ui.ActionBar.n6.x1(themeEditorView2.f33157o, true, false, false);
                themeEditorView2.b();
                return;
        }
    }
}
