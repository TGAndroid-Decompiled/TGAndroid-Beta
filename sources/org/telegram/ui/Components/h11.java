package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class h11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f24462a;

    public h11(ThemeEditorView.EditorAlert editorAlert) {
        this.f24462a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f24462a;
        editorAlert.f22233c.setVisibility(4);
        editorAlert.f22234f.setVisibility(4);
        editorAlert.f22237s.setVisibility(4);
        editorAlert.H = false;
    }
}
