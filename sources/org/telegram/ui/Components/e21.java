package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class e21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f25748a;

    public e21(ThemeEditorView.EditorAlert editorAlert) {
        this.f25748a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f25748a;
        if (editorAlert.f24397c.getAdapter() == editorAlert.f24400r) {
            k21 k21Var = editorAlert.f24398f.f28369b;
            k21Var.requestFocus();
            AndroidUtilities.showKeyboard(k21Var);
        }
        editorAlert.f24396b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
