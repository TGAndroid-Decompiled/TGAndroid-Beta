package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class mz0 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f36165a;

    public mz0(ThemeEditorView.EditorAlert editorAlert) {
        this.f36165a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f36165a;
        if (editorAlert.f31576j1.getAdapter() == editorAlert.f31580p1) {
            sz0 sz0Var = editorAlert.f31578m1.f38775b;
            sz0Var.requestFocus();
            org.telegram.messenger.g0.K3(sz0Var);
        }
        editorAlert.f31575i1.setVisibility(8);
        editorAlert.f31582r1.setVisibility(8);
        editorAlert.f31589y1 = false;
    }
}
