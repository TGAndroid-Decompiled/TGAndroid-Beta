package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class n21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f28998a;

    public n21(ThemeEditorView.EditorAlert editorAlert) {
        this.f28998a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f28998a;
        if (editorAlert.f24389c.getAdapter() == editorAlert.f24393r) {
            u21 u21Var = editorAlert.f24391f.f32614b;
            u21Var.requestFocus();
            AndroidUtilities.showKeyboard(u21Var);
        }
        editorAlert.f24388b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
