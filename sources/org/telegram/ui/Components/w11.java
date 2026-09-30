package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class w11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f29794a;

    public w11(ThemeEditorView.EditorAlert editorAlert) {
        this.f29794a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f29794a;
        editorAlert.f22464c.setVisibility(4);
        editorAlert.f22465f.setVisibility(4);
        editorAlert.f22468s.setVisibility(4);
        editorAlert.H = false;
    }
}
