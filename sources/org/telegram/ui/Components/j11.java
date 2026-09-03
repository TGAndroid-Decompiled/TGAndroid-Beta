package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class j11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f25813a;

    public j11(ThemeEditorView.EditorAlert editorAlert) {
        this.f25813a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f25813a;
        editorAlert.f23177c.setVisibility(4);
        editorAlert.f23178f.setVisibility(4);
        editorAlert.f23181s.setVisibility(4);
        editorAlert.E = false;
    }
}
