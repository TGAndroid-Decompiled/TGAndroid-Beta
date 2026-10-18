package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class d21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f25459a;

    public d21(ThemeEditorView.EditorAlert editorAlert) {
        this.f25459a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f25459a;
        if (editorAlert.f24394c.getAdapter() == editorAlert.f24397r) {
            j21 j21Var = editorAlert.f24395f.f28055b;
            j21Var.requestFocus();
            AndroidUtilities.showKeyboard(j21Var);
        }
        editorAlert.f24393b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
