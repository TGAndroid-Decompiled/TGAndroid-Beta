package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class oz0 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f38130a;

    public oz0(ThemeEditorView.EditorAlert editorAlert) {
        this.f38130a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f38130a;
        editorAlert.n1.setVisibility(4);
        editorAlert.f32764q1.setVisibility(4);
        editorAlert.f32768u1.setVisibility(4);
        editorAlert.C1 = false;
    }
}
