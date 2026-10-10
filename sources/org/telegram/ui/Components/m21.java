package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class m21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f28622a;

    public m21(ThemeEditorView.EditorAlert editorAlert) {
        this.f28622a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f28622a;
        editorAlert.f24365c.setVisibility(4);
        editorAlert.f24367f.setVisibility(4);
        editorAlert.f24370s.setVisibility(4);
        editorAlert.H = false;
    }
}
