package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class f11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f25866a;

    public f11(ThemeEditorView.EditorAlert editorAlert) {
        this.f25866a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f25866a;
        editorAlert.f24173c.setVisibility(4);
        editorAlert.f24175f.setVisibility(4);
        editorAlert.f24178s.setVisibility(4);
        editorAlert.H = false;
    }
}
