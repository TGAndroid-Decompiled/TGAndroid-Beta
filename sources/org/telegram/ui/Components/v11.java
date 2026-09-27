package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class v11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f29010a;

    public v11(ThemeEditorView.EditorAlert editorAlert) {
        this.f29010a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f29010a;
        editorAlert.f22445c.setVisibility(4);
        editorAlert.f22446f.setVisibility(4);
        editorAlert.f22449s.setVisibility(4);
        editorAlert.H = false;
    }
}
