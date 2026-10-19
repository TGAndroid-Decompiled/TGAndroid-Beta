package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class e21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f25746a;

    public e21(ThemeEditorView.EditorAlert editorAlert) {
        this.f25746a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f25746a;
        if (editorAlert.f24395c.getAdapter() == editorAlert.f24398r) {
            k21 k21Var = editorAlert.f24396f.f28367b;
            k21Var.requestFocus();
            AndroidUtilities.showKeyboard(k21Var);
        }
        editorAlert.f24394b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
