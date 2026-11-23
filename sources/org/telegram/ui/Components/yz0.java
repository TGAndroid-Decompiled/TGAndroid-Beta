package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class yz0 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f42608a;

    public yz0(ThemeEditorView.EditorAlert editorAlert) {
        this.f42608a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f42608a;
        if (editorAlert.n1.getAdapter() == editorAlert.f33200t1) {
            e01 e01Var = editorAlert.f33197q1.f35358b;
            e01Var.requestFocus();
            org.telegram.messenger.g0.I3(e01Var);
        }
        editorAlert.f33194m1.setVisibility(8);
        editorAlert.f33202v1.setVisibility(8);
        editorAlert.C1 = false;
    }
}
