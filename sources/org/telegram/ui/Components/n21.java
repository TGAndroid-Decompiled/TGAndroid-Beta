package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class n21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f28958a;

    public n21(ThemeEditorView.EditorAlert editorAlert) {
        this.f28958a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f28958a;
        if (editorAlert.f24365c.getAdapter() == editorAlert.f24369r) {
            u21 u21Var = editorAlert.f24367f.f32577b;
            u21Var.requestFocus();
            AndroidUtilities.showKeyboard(u21Var);
        }
        editorAlert.f24364b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
