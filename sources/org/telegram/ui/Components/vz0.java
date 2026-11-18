package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class vz0 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f41509a;

    public vz0(ThemeEditorView.EditorAlert editorAlert) {
        this.f41509a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f41509a;
        editorAlert.n1.setVisibility(4);
        editorAlert.f33161q1.setVisibility(4);
        editorAlert.f33165u1.setVisibility(4);
        editorAlert.C1 = false;
    }
}
