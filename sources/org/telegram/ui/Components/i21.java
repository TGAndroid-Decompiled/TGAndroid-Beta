package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class i21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f25800a;

    public i21(ThemeEditorView.EditorAlert editorAlert) {
        this.f25800a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f25800a;
        if (editorAlert.f23339c.getAdapter() == editorAlert.f23342r) {
            p21 p21Var = editorAlert.f23340f.f28722b;
            p21Var.requestFocus();
            AndroidUtilities.showKeyboard(p21Var);
        }
        editorAlert.f23338b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
