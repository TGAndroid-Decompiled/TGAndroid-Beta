package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class g11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f26230a;

    public g11(ThemeEditorView.EditorAlert editorAlert) {
        this.f26230a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f26230a;
        if (editorAlert.f24172c.getAdapter() == editorAlert.f24176r) {
            m11 m11Var = editorAlert.f24174f.f28923b;
            m11Var.requestFocus();
            AndroidUtilities.showKeyboard(m11Var);
        }
        editorAlert.f24171b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
