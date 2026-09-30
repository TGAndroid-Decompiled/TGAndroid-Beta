package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class v11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f28945a;

    public v11(ThemeEditorView.EditorAlert editorAlert) {
        this.f28945a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f28945a;
        editorAlert.f22444c.setVisibility(4);
        editorAlert.f22445f.setVisibility(4);
        editorAlert.f22448s.setVisibility(4);
        editorAlert.H = false;
    }
}
