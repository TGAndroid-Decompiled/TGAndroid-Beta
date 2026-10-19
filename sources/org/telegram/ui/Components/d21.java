package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class d21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f25397a;

    public d21(ThemeEditorView.EditorAlert editorAlert) {
        this.f25397a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f25397a;
        editorAlert.f24397c.setVisibility(4);
        editorAlert.f24398f.setVisibility(4);
        editorAlert.f24401s.setVisibility(4);
        editorAlert.H = false;
    }
}
