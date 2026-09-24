package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class u11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f28662a;

    public u11(ThemeEditorView.EditorAlert editorAlert) {
        this.f28662a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f28662a;
        if (editorAlert.f22428c.getAdapter() == editorAlert.f22431r) {
            a21 a21Var = editorAlert.f22429f.f23137b;
            a21Var.requestFocus();
            AndroidUtilities.showKeyboard(a21Var);
        }
        editorAlert.f22427b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
