package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class e21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f25704a;

    public e21(ThemeEditorView.EditorAlert editorAlert) {
        this.f25704a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f25704a;
        editorAlert.f24402c.setVisibility(4);
        editorAlert.f24403f.setVisibility(4);
        editorAlert.f24406s.setVisibility(4);
        editorAlert.H = false;
    }
}
