package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

public final class p01 extends AnimatorListenerAdapter {

    public final ThemeEditorView.EditorAlert f31459a;

    public p01(ThemeEditorView.EditorAlert editorAlert) {
        this.f31459a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f31459a;
        if (editorAlert.f26562c.getAdapter() == editorAlert.f26566r) {
            v01 v01Var = editorAlert.f26564f.f34413b;
            v01Var.requestFocus();
            AndroidUtilities.showKeyboard(v01Var);
        }
        editorAlert.f26561b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.D = false;
    }
}
