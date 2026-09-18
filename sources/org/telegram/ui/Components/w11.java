package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class w11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f29840a;

    public w11(ThemeEditorView.EditorAlert editorAlert) {
        this.f29840a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f29840a;
        if (editorAlert.f22406c.getAdapter() == editorAlert.f22409r) {
            c21 c21Var = editorAlert.f22407f.f23767b;
            c21Var.requestFocus();
            AndroidUtilities.showKeyboard(c21Var);
        }
        editorAlert.f22405b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
