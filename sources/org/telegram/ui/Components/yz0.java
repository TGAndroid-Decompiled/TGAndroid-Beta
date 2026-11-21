package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class yz0 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f42615a;

    public yz0(ThemeEditorView.EditorAlert editorAlert) {
        this.f42615a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f42615a;
        if (editorAlert.n1.getAdapter() == editorAlert.f33197t1) {
            e01 e01Var = editorAlert.f33194q1.f35356b;
            e01Var.requestFocus();
            org.telegram.messenger.g0.I3(e01Var);
        }
        editorAlert.f33191m1.setVisibility(8);
        editorAlert.f33199v1.setVisibility(8);
        editorAlert.C1 = false;
    }
}
