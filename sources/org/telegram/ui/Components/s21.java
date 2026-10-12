package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class s21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f30375a;

    public s21(ThemeEditorView.EditorAlert editorAlert) {
        this.f30375a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f30375a;
        if (editorAlert.f24139c.getAdapter() == editorAlert.f24143r) {
            z21 z21Var = editorAlert.f24141f.f24551b;
            z21Var.requestFocus();
            AndroidUtilities.showKeyboard(z21Var);
        }
        editorAlert.f24138b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
