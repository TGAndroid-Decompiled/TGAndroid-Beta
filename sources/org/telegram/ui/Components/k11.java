package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class k11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f28251a;

    public k11(ThemeEditorView.EditorAlert editorAlert) {
        this.f28251a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f28251a;
        editorAlert.f25065c.setVisibility(4);
        editorAlert.f25067f.setVisibility(4);
        editorAlert.f25070s.setVisibility(4);
        editorAlert.E = false;
    }
}
