package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class p21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f31426a;

    public p21(ThemeEditorView.EditorAlert editorAlert) {
        this.f31426a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f31426a;
        editorAlert.f26337c.setVisibility(4);
        editorAlert.f26338f.setVisibility(4);
        editorAlert.f26341s.setVisibility(4);
        editorAlert.H = false;
    }
}
