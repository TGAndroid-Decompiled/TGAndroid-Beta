package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class t11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f28382a;

    public t11(ThemeEditorView.EditorAlert editorAlert) {
        this.f28382a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f28382a;
        editorAlert.f22442c.setVisibility(4);
        editorAlert.f22443f.setVisibility(4);
        editorAlert.f22446s.setVisibility(4);
        editorAlert.H = false;
    }
}
