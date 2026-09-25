package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class t11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f28383a;

    public t11(ThemeEditorView.EditorAlert editorAlert) {
        this.f28383a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f28383a;
        editorAlert.f22443c.setVisibility(4);
        editorAlert.f22444f.setVisibility(4);
        editorAlert.f22447s.setVisibility(4);
        editorAlert.H = false;
    }
}
