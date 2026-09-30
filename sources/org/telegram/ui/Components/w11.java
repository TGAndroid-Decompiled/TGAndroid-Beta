package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class w11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f29789a;

    public w11(ThemeEditorView.EditorAlert editorAlert) {
        this.f29789a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f29789a;
        if (editorAlert.f22444c.getAdapter() == editorAlert.f22447r) {
            c21 c21Var = editorAlert.f22445f.f23828b;
            c21Var.requestFocus();
            AndroidUtilities.showKeyboard(c21Var);
        }
        editorAlert.f22443b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
