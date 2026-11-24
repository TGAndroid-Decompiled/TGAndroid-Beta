package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class y extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert a;

    public y(ThemeEditorView.EditorAlert editorAlert) {
        this.a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.a;
        if (editorAlert.m1.getAdapter() == editorAlert.s1) {
            e0 e0Var = editorAlert.p1.b;
            e0Var.requestFocus();
            gm.E3(e0Var);
        }
        editorAlert.l1.setVisibility(8);
        editorAlert.u1.setVisibility(8);
        editorAlert.B1 = false;
    }
}
