package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class j11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f25853a;

    public j11(ThemeEditorView.EditorAlert editorAlert) {
        this.f25853a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f25853a;
        editorAlert.f23204c.setVisibility(4);
        editorAlert.f23205f.setVisibility(4);
        editorAlert.f23208s.setVisibility(4);
        editorAlert.E = false;
    }
}
