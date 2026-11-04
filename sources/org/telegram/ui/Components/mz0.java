package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class mz0 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f36277a;

    public mz0(ThemeEditorView.EditorAlert editorAlert) {
        this.f36277a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f36277a;
        if (editorAlert.k1.getAdapter() == editorAlert.f31659q1) {
            sz0 sz0Var = editorAlert.f31656n1.f38914b;
            sz0Var.requestFocus();
            org.telegram.messenger.g0.K3(sz0Var);
        }
        editorAlert.f31654j1.setVisibility(8);
        editorAlert.f31661s1.setVisibility(8);
        editorAlert.f31668z1 = false;
    }
}
