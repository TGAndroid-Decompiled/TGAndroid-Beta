package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class xz0 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f42254a;

    public xz0(ThemeEditorView.EditorAlert editorAlert) {
        this.f42254a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f42254a;
        if (editorAlert.n1.getAdapter() == editorAlert.f33264t1) {
            d01 d01Var = editorAlert.f33261q1.f34938b;
            d01Var.requestFocus();
            org.telegram.messenger.g0.I3(d01Var);
        }
        editorAlert.f33258m1.setVisibility(8);
        editorAlert.f33266v1.setVisibility(8);
        editorAlert.C1 = false;
    }
}
