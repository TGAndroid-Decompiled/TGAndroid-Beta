package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class m21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f28698a;

    public m21(ThemeEditorView.EditorAlert editorAlert) {
        this.f28698a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f28698a;
        editorAlert.f24389c.setVisibility(4);
        editorAlert.f24391f.setVisibility(4);
        editorAlert.f24394s.setVisibility(4);
        editorAlert.H = false;
    }
}
