package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class wz0 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f41779a;

    public wz0(ThemeEditorView.EditorAlert editorAlert) {
        this.f41779a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f41779a;
        editorAlert.n1.setVisibility(4);
        editorAlert.f33261q1.setVisibility(4);
        editorAlert.f33265u1.setVisibility(4);
        editorAlert.C1 = false;
    }
}
