package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class q21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f31811a;

    public q21(ThemeEditorView.EditorAlert editorAlert) {
        this.f31811a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f31811a;
        if (editorAlert.f26337c.getAdapter() == editorAlert.f26340r) {
            w21 w21Var = editorAlert.f26338f.f34912b;
            w21Var.requestFocus();
            AndroidUtilities.showKeyboard(w21Var);
        }
        editorAlert.f26336b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
