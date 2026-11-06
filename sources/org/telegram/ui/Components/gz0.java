package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gz0 extends AnimatorListenerAdapter {
    public final int f34120a;
    public final ThemeEditorView f34121b;

    public gz0(ThemeEditorView themeEditorView, int i7) {
        this.f34120a = i7;
        this.f34121b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34120a) {
            case 0:
                ThemeEditorView themeEditorView = this.f34121b;
                ez0 ez0Var = themeEditorView.f31565c;
                if (ez0Var != null) {
                    ez0Var.setBackground(null);
                    themeEditorView.f31570j.removeView(themeEditorView.f31565c);
                    return;
                }
                return;
            default:
                ThemeEditorView themeEditorView2 = this.f34121b;
                org.telegram.ui.ActionBar.k6.x1(themeEditorView2.f31575o, true, false, false);
                themeEditorView2.b();
                return;
        }
    }
}
