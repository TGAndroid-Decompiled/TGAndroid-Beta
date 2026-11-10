package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class mz0 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f36149a;

    public mz0(ThemeEditorView.EditorAlert editorAlert) {
        this.f36149a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f36149a;
        editorAlert.f31596m1.setVisibility(4);
        editorAlert.f31598p1.setVisibility(4);
        editorAlert.f31602t1.setVisibility(4);
        editorAlert.B1 = false;
    }
}
