package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class q01 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f29486a;

    public q01(ThemeEditorView.EditorAlert editorAlert) {
        this.f29486a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f29486a;
        editorAlert.f24221j1.setVisibility(4);
        editorAlert.f24223m1.setVisibility(4);
        editorAlert.f24227q1.setVisibility(4);
        editorAlert.f24235y1 = false;
    }
}
