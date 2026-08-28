package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class n01 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f30983a;

    public n01(ThemeEditorView.EditorAlert editorAlert) {
        this.f30983a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f30983a;
        if (editorAlert.f26566c.getAdapter() == editorAlert.f26570r) {
            t01 t01Var = editorAlert.f26568f.f33196b;
            t01Var.requestFocus();
            AndroidUtilities.showKeyboard(t01Var);
        }
        editorAlert.f26565b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.D = false;
    }
}
