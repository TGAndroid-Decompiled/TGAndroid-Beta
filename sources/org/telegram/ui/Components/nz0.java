package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class nz0 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f36429a;

    public nz0(ThemeEditorView.EditorAlert editorAlert) {
        this.f36429a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f36429a;
        if (editorAlert.f31596m1.getAdapter() == editorAlert.f31601s1) {
            tz0 tz0Var = editorAlert.f31598p1.f39847b;
            tz0Var.requestFocus();
            org.telegram.messenger.g0.K3(tz0Var);
        }
        editorAlert.l1.setVisibility(8);
        editorAlert.f31603u1.setVisibility(8);
        editorAlert.B1 = false;
    }
}
