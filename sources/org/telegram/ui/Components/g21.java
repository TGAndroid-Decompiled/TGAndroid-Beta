package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class g21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f26534a;

    public g21(ThemeEditorView.EditorAlert editorAlert) {
        this.f26534a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f26534a;
        editorAlert.f24547c.setVisibility(4);
        editorAlert.f24548f.setVisibility(4);
        editorAlert.f24551s.setVisibility(4);
        editorAlert.H = false;
    }
}
