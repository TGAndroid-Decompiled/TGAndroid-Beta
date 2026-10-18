package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class c21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f25082a;

    public c21(ThemeEditorView.EditorAlert editorAlert) {
        this.f25082a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f25082a;
        editorAlert.f24401c.setVisibility(4);
        editorAlert.f24402f.setVisibility(4);
        editorAlert.f24405s.setVisibility(4);
        editorAlert.H = false;
    }
}
