package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class f21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f26061a;

    public f21(ThemeEditorView.EditorAlert editorAlert) {
        this.f26061a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f26061a;
        if (editorAlert.f24401c.getAdapter() == editorAlert.f24404r) {
            l21 l21Var = editorAlert.f24402f.f28670b;
            l21Var.requestFocus();
            AndroidUtilities.showKeyboard(l21Var);
        }
        editorAlert.f24400b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
