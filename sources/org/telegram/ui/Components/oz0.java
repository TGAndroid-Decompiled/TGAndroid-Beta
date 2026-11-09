package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class oz0 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f36838a;

    public oz0(ThemeEditorView.EditorAlert editorAlert) {
        this.f36838a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f36838a;
        if (editorAlert.f31586j1.getAdapter() == editorAlert.f31590p1) {
            uz0 uz0Var = editorAlert.f31588m1.f40263b;
            uz0Var.requestFocus();
            org.telegram.messenger.g0.K3(uz0Var);
        }
        editorAlert.f31585i1.setVisibility(8);
        editorAlert.f31592r1.setVisibility(8);
        editorAlert.f31599y1 = false;
    }
}
