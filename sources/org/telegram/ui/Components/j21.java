package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class j21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f25872a;

    public j21(ThemeEditorView.EditorAlert editorAlert) {
        this.f25872a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f25872a;
        if (editorAlert.f23039c.getAdapter() == editorAlert.f23042r) {
            q21 q21Var = editorAlert.f23040f.f28709b;
            q21Var.requestFocus();
            AndroidUtilities.showKeyboard(q21Var);
        }
        editorAlert.f23038b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
