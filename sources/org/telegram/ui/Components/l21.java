package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class l21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f28242a;

    public l21(ThemeEditorView.EditorAlert editorAlert) {
        this.f28242a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f28242a;
        editorAlert.f24361c.setVisibility(4);
        editorAlert.f24363f.setVisibility(4);
        editorAlert.f24366s.setVisibility(4);
        editorAlert.H = false;
    }
}
