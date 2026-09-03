package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class k11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f28249a;

    public k11(ThemeEditorView.EditorAlert editorAlert) {
        this.f28249a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f28249a;
        if (editorAlert.f25067c.getAdapter() == editorAlert.f25071r) {
            q11 q11Var = editorAlert.f25069f.f30959b;
            q11Var.requestFocus();
            AndroidUtilities.showKeyboard(q11Var);
        }
        editorAlert.f25066b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.E = false;
    }
}
