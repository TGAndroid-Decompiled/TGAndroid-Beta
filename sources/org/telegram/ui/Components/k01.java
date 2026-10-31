package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k01 extends AnimatorListenerAdapter {
    public final int f27592a;
    public final ThemeEditorView f27593b;

    public k01(ThemeEditorView themeEditorView, int i10) {
        this.f27592a = i10;
        this.f27593b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27592a) {
            case 0:
                ThemeEditorView themeEditorView = this.f27593b;
                i01 i01Var = themeEditorView.f24210c;
                if (i01Var != null) {
                    i01Var.setBackground(null);
                    themeEditorView.f24214j.removeView(themeEditorView.f24210c);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f27593b;
                org.telegram.ui.ActionBar.t6.x1(themeEditorView2.f24219o, true, false, false);
                themeEditorView2.b();
                return;
        }
    }
}
