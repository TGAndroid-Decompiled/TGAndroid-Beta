package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class mz0 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f36174a;

    public mz0(ThemeEditorView.EditorAlert editorAlert) {
        this.f36174a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f36174a;
        editorAlert.f31581j1.setVisibility(4);
        editorAlert.f31583m1.setVisibility(4);
        editorAlert.f31586q1.setVisibility(4);
        editorAlert.f31594y1 = false;
    }
}
