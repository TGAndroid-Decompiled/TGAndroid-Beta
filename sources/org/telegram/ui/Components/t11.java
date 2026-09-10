package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class t11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f27274a;

    public t11(ThemeEditorView.EditorAlert editorAlert) {
        this.f27274a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f27274a;
        editorAlert.f21305c.setVisibility(4);
        editorAlert.f21306f.setVisibility(4);
        editorAlert.f21309s.setVisibility(4);
        editorAlert.H = false;
    }
}
