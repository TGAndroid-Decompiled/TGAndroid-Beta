package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class r21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f30021a;

    public r21(ThemeEditorView.EditorAlert editorAlert) {
        this.f30021a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f30021a;
        editorAlert.f24138c.setVisibility(4);
        editorAlert.f24140f.setVisibility(4);
        editorAlert.f24143s.setVisibility(4);
        editorAlert.H = false;
    }
}
