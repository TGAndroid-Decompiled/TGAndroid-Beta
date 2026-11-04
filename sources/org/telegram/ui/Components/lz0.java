package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class lz0 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f35935a;

    public lz0(ThemeEditorView.EditorAlert editorAlert) {
        this.f35935a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f35935a;
        editorAlert.k1.setVisibility(4);
        editorAlert.f31656n1.setVisibility(4);
        editorAlert.f31660r1.setVisibility(4);
        editorAlert.f31668z1 = false;
    }
}
