package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class o01 extends AnimatorListenerAdapter {

    public final ThemeEditorView.EditorAlert f31136a;

    public o01(ThemeEditorView.EditorAlert editorAlert) {
        this.f31136a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f31136a;
        editorAlert.f26562c.setVisibility(4);
        editorAlert.f26564f.setVisibility(4);
        editorAlert.f26567s.setVisibility(4);
        editorAlert.D = false;
    }
}
