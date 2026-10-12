package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class s21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f30379a;

    public s21(ThemeEditorView.EditorAlert editorAlert) {
        this.f30379a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f30379a;
        if (editorAlert.f24138c.getAdapter() == editorAlert.f24142r) {
            z21 z21Var = editorAlert.f24140f.f24563b;
            z21Var.requestFocus();
            AndroidUtilities.showKeyboard(z21Var);
        }
        editorAlert.f24137b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
