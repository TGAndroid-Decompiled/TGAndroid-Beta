package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class f11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f25892a;

    public f11(ThemeEditorView.EditorAlert editorAlert) {
        this.f25892a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f25892a;
        editorAlert.f24199c.setVisibility(4);
        editorAlert.f24201f.setVisibility(4);
        editorAlert.f24204s.setVisibility(4);
        editorAlert.H = false;
    }
}
