package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class f11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f25893a;

    public f11(ThemeEditorView.EditorAlert editorAlert) {
        this.f25893a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f25893a;
        editorAlert.f24200c.setVisibility(4);
        editorAlert.f24202f.setVisibility(4);
        editorAlert.f24205s.setVisibility(4);
        editorAlert.H = false;
    }
}
