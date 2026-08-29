package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class y01 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f34889a;

    public y01(ThemeEditorView.EditorAlert editorAlert) {
        this.f34889a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f34889a;
        editorAlert.f26577c.setVisibility(4);
        editorAlert.f26579f.setVisibility(4);
        editorAlert.f26582s.setVisibility(4);
        editorAlert.D = false;
    }
}
