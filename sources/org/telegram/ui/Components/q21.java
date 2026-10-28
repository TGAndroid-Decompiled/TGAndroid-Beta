package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class q21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f31778a;

    public q21(ThemeEditorView.EditorAlert editorAlert) {
        this.f31778a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f31778a;
        editorAlert.f26341c.setVisibility(4);
        editorAlert.f26342f.setVisibility(4);
        editorAlert.f26345s.setVisibility(4);
        editorAlert.H = false;
    }
}
