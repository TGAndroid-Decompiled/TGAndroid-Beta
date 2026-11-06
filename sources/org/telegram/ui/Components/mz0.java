package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class mz0 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f36141a;

    public mz0(ThemeEditorView.EditorAlert editorAlert) {
        this.f36141a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f36141a;
        editorAlert.f31577j1.setVisibility(4);
        editorAlert.f31579m1.setVisibility(4);
        editorAlert.f31582q1.setVisibility(4);
        editorAlert.f31590y1 = false;
    }
}
