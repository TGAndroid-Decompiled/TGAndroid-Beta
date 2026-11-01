package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class s01 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f30147a;

    public s01(ThemeEditorView.EditorAlert editorAlert) {
        this.f30147a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f30147a;
        if (editorAlert.f24222j1.getAdapter() == editorAlert.f24227p1) {
            y01 y01Var = editorAlert.f24224m1.f24267b;
            y01Var.requestFocus();
            org.telegram.messenger.i0.J3(y01Var);
        }
        editorAlert.f24221i1.setVisibility(8);
        editorAlert.f24229r1.setVisibility(8);
        editorAlert.f24236y1 = false;
    }
}
