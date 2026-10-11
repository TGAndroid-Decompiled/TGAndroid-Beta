package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class n21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f28923a;

    public n21(ThemeEditorView.EditorAlert editorAlert) {
        this.f28923a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f28923a;
        editorAlert.f24353c.setVisibility(4);
        editorAlert.f24355f.setVisibility(4);
        editorAlert.f24358s.setVisibility(4);
        editorAlert.H = false;
    }
}
