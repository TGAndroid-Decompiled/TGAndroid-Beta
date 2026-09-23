package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class f11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f23805a;

    public f11(ThemeEditorView.EditorAlert editorAlert) {
        this.f23805a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f23805a;
        editorAlert.f22191c.setVisibility(4);
        editorAlert.f22192f.setVisibility(4);
        editorAlert.f22195s.setVisibility(4);
        editorAlert.H = false;
    }
}
