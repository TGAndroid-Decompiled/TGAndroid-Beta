package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class e21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f25700a;

    public e21(ThemeEditorView.EditorAlert editorAlert) {
        this.f25700a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f25700a;
        editorAlert.f24398c.setVisibility(4);
        editorAlert.f24399f.setVisibility(4);
        editorAlert.f24402s.setVisibility(4);
        editorAlert.H = false;
    }
}
