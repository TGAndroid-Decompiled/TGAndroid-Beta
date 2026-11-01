package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class r01 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f29852a;

    public r01(ThemeEditorView.EditorAlert editorAlert) {
        this.f29852a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f29852a;
        editorAlert.f24222j1.setVisibility(4);
        editorAlert.f24224m1.setVisibility(4);
        editorAlert.f24228q1.setVisibility(4);
        editorAlert.f24236y1 = false;
    }
}
