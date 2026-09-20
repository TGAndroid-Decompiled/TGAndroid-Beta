package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class u11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f28513a;

    public u11(ThemeEditorView.EditorAlert editorAlert) {
        this.f28513a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f28513a;
        editorAlert.f22441c.setVisibility(4);
        editorAlert.f22442f.setVisibility(4);
        editorAlert.f22445s.setVisibility(4);
        editorAlert.H = false;
    }
}
