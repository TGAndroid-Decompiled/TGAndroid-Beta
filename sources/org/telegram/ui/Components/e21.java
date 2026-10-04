package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class e21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f25899a;

    public e21(ThemeEditorView.EditorAlert editorAlert) {
        this.f25899a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f25899a;
        editorAlert.f24358c.setVisibility(4);
        editorAlert.f24360f.setVisibility(4);
        editorAlert.f24363s.setVisibility(4);
        editorAlert.H = false;
    }
}
