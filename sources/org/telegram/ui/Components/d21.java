package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class d21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f25466a;

    public d21(ThemeEditorView.EditorAlert editorAlert) {
        this.f25466a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f25466a;
        if (editorAlert.f24401c.getAdapter() == editorAlert.f24404r) {
            j21 j21Var = editorAlert.f24402f.f28062b;
            j21Var.requestFocus();
            AndroidUtilities.showKeyboard(j21Var);
        }
        editorAlert.f24400b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
