package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class w11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f29792a;

    public w11(ThemeEditorView.EditorAlert editorAlert) {
        this.f29792a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f29792a;
        if (editorAlert.f22442c.getAdapter() == editorAlert.f22445r) {
            c21 c21Var = editorAlert.f22443f.f23841b;
            c21Var.requestFocus();
            AndroidUtilities.showKeyboard(c21Var);
        }
        editorAlert.f22441b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
