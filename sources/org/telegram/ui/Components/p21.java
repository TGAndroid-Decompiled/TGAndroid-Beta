package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class p21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f31428a;

    public p21(ThemeEditorView.EditorAlert editorAlert) {
        this.f31428a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f31428a;
        editorAlert.f26339c.setVisibility(4);
        editorAlert.f26340f.setVisibility(4);
        editorAlert.f26343s.setVisibility(4);
        editorAlert.H = false;
    }
}
