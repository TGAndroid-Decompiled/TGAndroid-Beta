package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class g11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f26231a;

    public g11(ThemeEditorView.EditorAlert editorAlert) {
        this.f26231a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f26231a;
        if (editorAlert.f24173c.getAdapter() == editorAlert.f24177r) {
            m11 m11Var = editorAlert.f24175f.f28924b;
            m11Var.requestFocus();
            AndroidUtilities.showKeyboard(m11Var);
        }
        editorAlert.f24172b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
