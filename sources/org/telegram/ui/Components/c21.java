package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class c21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f25075a;

    public c21(ThemeEditorView.EditorAlert editorAlert) {
        this.f25075a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f25075a;
        editorAlert.f24394c.setVisibility(4);
        editorAlert.f24395f.setVisibility(4);
        editorAlert.f24398s.setVisibility(4);
        editorAlert.H = false;
    }
}
