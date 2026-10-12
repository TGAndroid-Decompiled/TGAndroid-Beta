package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class r21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f30022a;

    public r21(ThemeEditorView.EditorAlert editorAlert) {
        this.f30022a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f30022a;
        editorAlert.f24139c.setVisibility(4);
        editorAlert.f24141f.setVisibility(4);
        editorAlert.f24144s.setVisibility(4);
        editorAlert.H = false;
    }
}
