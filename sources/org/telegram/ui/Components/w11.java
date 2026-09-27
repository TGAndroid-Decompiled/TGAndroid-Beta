package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class w11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f29830a;

    public w11(ThemeEditorView.EditorAlert editorAlert) {
        this.f29830a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f29830a;
        if (editorAlert.f22445c.getAdapter() == editorAlert.f22448r) {
            c21 c21Var = editorAlert.f22446f.f23856b;
            c21Var.requestFocus();
            AndroidUtilities.showKeyboard(c21Var);
        }
        editorAlert.f22444b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
