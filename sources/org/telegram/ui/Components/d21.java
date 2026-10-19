package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class d21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f25395a;

    public d21(ThemeEditorView.EditorAlert editorAlert) {
        this.f25395a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f25395a;
        editorAlert.f24395c.setVisibility(4);
        editorAlert.f24396f.setVisibility(4);
        editorAlert.f24399s.setVisibility(4);
        editorAlert.H = false;
    }
}
