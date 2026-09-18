package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class v11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f28887a;

    public v11(ThemeEditorView.EditorAlert editorAlert) {
        this.f28887a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f28887a;
        editorAlert.f22406c.setVisibility(4);
        editorAlert.f22407f.setVisibility(4);
        editorAlert.f22410s.setVisibility(4);
        editorAlert.H = false;
    }
}
