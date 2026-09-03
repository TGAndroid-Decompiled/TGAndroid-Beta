package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class j11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f27962a;

    public j11(ThemeEditorView.EditorAlert editorAlert) {
        this.f27962a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f27962a;
        editorAlert.f25067c.setVisibility(4);
        editorAlert.f25069f.setVisibility(4);
        editorAlert.f25072s.setVisibility(4);
        editorAlert.E = false;
    }
}
