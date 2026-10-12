package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class h21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f25493a;

    public h21(ThemeEditorView.EditorAlert editorAlert) {
        this.f25493a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f25493a;
        editorAlert.f23339c.setVisibility(4);
        editorAlert.f23340f.setVisibility(4);
        editorAlert.f23343s.setVisibility(4);
        editorAlert.H = false;
    }
}
