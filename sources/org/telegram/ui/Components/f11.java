package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class f11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f25865a;

    public f11(ThemeEditorView.EditorAlert editorAlert) {
        this.f25865a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f25865a;
        editorAlert.f24172c.setVisibility(4);
        editorAlert.f24174f.setVisibility(4);
        editorAlert.f24177s.setVisibility(4);
        editorAlert.H = false;
    }
}
