package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class lz0 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f35804a;

    public lz0(ThemeEditorView.EditorAlert editorAlert) {
        this.f35804a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f35804a;
        editorAlert.f31576j1.setVisibility(4);
        editorAlert.f31578m1.setVisibility(4);
        editorAlert.f31581q1.setVisibility(4);
        editorAlert.f31589y1 = false;
    }
}
