package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class h21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f26776a;

    public h21(ThemeEditorView.EditorAlert editorAlert) {
        this.f26776a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f26776a;
        editorAlert.f24546c.setVisibility(4);
        editorAlert.f24547f.setVisibility(4);
        editorAlert.f24550s.setVisibility(4);
        editorAlert.H = false;
    }
}
