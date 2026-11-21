package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class xz0 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f42281a;

    public xz0(ThemeEditorView.EditorAlert editorAlert) {
        this.f42281a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f42281a;
        editorAlert.n1.setVisibility(4);
        editorAlert.f33194q1.setVisibility(4);
        editorAlert.f33198u1.setVisibility(4);
        editorAlert.C1 = false;
    }
}
