package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class i21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f25472a;

    public i21(ThemeEditorView.EditorAlert editorAlert) {
        this.f25472a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f25472a;
        editorAlert.f23039c.setVisibility(4);
        editorAlert.f23040f.setVisibility(4);
        editorAlert.f23043s.setVisibility(4);
        editorAlert.H = false;
    }
}
