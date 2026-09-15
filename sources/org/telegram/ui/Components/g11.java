package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class g11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f24166a;

    public g11(ThemeEditorView.EditorAlert editorAlert) {
        this.f24166a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f24166a;
        editorAlert.f22220c.setVisibility(4);
        editorAlert.f22221f.setVisibility(4);
        editorAlert.f22224s.setVisibility(4);
        editorAlert.H = false;
    }
}
