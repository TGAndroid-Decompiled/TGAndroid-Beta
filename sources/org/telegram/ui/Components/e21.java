package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class e21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f25900a;

    public e21(ThemeEditorView.EditorAlert editorAlert) {
        this.f25900a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f25900a;
        editorAlert.f24359c.setVisibility(4);
        editorAlert.f24361f.setVisibility(4);
        editorAlert.f24364s.setVisibility(4);
        editorAlert.H = false;
    }
}
