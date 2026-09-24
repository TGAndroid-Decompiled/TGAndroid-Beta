package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class t11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f28376a;

    public t11(ThemeEditorView.EditorAlert editorAlert) {
        this.f28376a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f28376a;
        editorAlert.f22428c.setVisibility(4);
        editorAlert.f22429f.setVisibility(4);
        editorAlert.f22432s.setVisibility(4);
        editorAlert.H = false;
    }
}
