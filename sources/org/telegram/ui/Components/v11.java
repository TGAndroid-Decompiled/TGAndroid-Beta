package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class v11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f28951a;

    public v11(ThemeEditorView.EditorAlert editorAlert) {
        this.f28951a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f28951a;
        editorAlert.f22442c.setVisibility(4);
        editorAlert.f22443f.setVisibility(4);
        editorAlert.f22446s.setVisibility(4);
        editorAlert.H = false;
    }
}
