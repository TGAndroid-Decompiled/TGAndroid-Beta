package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class h11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f24459a;

    public h11(ThemeEditorView.EditorAlert editorAlert) {
        this.f24459a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f24459a;
        editorAlert.f22230c.setVisibility(4);
        editorAlert.f22231f.setVisibility(4);
        editorAlert.f22234s.setVisibility(4);
        editorAlert.H = false;
    }
}
