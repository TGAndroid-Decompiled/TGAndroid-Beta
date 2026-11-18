package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class wz0 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f41831a;

    public wz0(ThemeEditorView.EditorAlert editorAlert) {
        this.f41831a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f41831a;
        if (editorAlert.n1.getAdapter() == editorAlert.f33164t1) {
            c01 c01Var = editorAlert.f33161q1.f34556b;
            c01Var.requestFocus();
            org.telegram.messenger.g0.I3(c01Var);
        }
        editorAlert.f33158m1.setVisibility(8);
        editorAlert.f33166v1.setVisibility(8);
        editorAlert.C1 = false;
    }
}
