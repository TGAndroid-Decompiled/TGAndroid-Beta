package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class nz0 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f36557a;

    public nz0(ThemeEditorView.EditorAlert editorAlert) {
        this.f36557a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f36557a;
        editorAlert.f31586j1.setVisibility(4);
        editorAlert.f31588m1.setVisibility(4);
        editorAlert.f31591q1.setVisibility(4);
        editorAlert.f31599y1 = false;
    }
}
