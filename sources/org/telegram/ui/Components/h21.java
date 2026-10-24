package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class h21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f26860a;

    public h21(ThemeEditorView.EditorAlert editorAlert) {
        this.f26860a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f26860a;
        if (editorAlert.f24547c.getAdapter() == editorAlert.f24550r) {
            n21 n21Var = editorAlert.f24548f.f29456b;
            n21Var.requestFocus();
            AndroidUtilities.showKeyboard(n21Var);
        }
        editorAlert.f24546b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
