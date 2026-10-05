package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class f21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f26300a;

    public f21(ThemeEditorView.EditorAlert editorAlert) {
        this.f26300a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f26300a;
        editorAlert.f24366c.setVisibility(4);
        editorAlert.f24368f.setVisibility(4);
        editorAlert.f24371s.setVisibility(4);
        editorAlert.H = false;
    }
}
