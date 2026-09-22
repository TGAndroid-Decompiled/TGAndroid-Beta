package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class h11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f24497a;

    public h11(ThemeEditorView.EditorAlert editorAlert) {
        this.f24497a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f24497a;
        if (editorAlert.f22217c.getAdapter() == editorAlert.f22220r) {
            n11 n11Var = editorAlert.f22218f.f26925b;
            n11Var.requestFocus();
            AndroidUtilities.showKeyboard(n11Var);
        }
        editorAlert.f22216b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
