package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class e21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f25905a;

    public e21(ThemeEditorView.EditorAlert editorAlert) {
        this.f25905a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f25905a;
        editorAlert.f24363c.setVisibility(4);
        editorAlert.f24365f.setVisibility(4);
        editorAlert.f24368s.setVisibility(4);
        editorAlert.H = false;
    }
}
