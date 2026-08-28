package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class m01 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f30650a;

    public m01(ThemeEditorView.EditorAlert editorAlert) {
        this.f30650a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f30650a;
        editorAlert.f26566c.setVisibility(4);
        editorAlert.f26568f.setVisibility(4);
        editorAlert.f26571s.setVisibility(4);
        editorAlert.D = false;
    }
}
