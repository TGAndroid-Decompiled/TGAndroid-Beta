package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class w11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f29900a;

    public w11(ThemeEditorView.EditorAlert editorAlert) {
        this.f29900a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f29900a;
        editorAlert.f22457c.setVisibility(4);
        editorAlert.f22458f.setVisibility(4);
        editorAlert.f22461s.setVisibility(4);
        editorAlert.H = false;
    }
}
