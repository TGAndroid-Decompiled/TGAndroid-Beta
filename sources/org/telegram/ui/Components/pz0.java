package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class pz0 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f38450a;

    public pz0(ThemeEditorView.EditorAlert editorAlert) {
        this.f38450a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f38450a;
        if (editorAlert.n1.getAdapter() == editorAlert.f32767t1) {
            vz0 vz0Var = editorAlert.f32764q1.f41808b;
            vz0Var.requestFocus();
            org.telegram.messenger.g0.J3(vz0Var);
        }
        editorAlert.f32761m1.setVisibility(8);
        editorAlert.f32769v1.setVisibility(8);
        editorAlert.C1 = false;
    }
}
