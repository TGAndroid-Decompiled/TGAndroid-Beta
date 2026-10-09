package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class m21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f28655a;

    public m21(ThemeEditorView.EditorAlert editorAlert) {
        this.f28655a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f28655a;
        if (editorAlert.f24361c.getAdapter() == editorAlert.f24365r) {
            s21 s21Var = editorAlert.f24363f.f31348b;
            s21Var.requestFocus();
            AndroidUtilities.showKeyboard(s21Var);
        }
        editorAlert.f24360b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
