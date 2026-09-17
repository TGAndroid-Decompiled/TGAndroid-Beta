package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class g11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f26258a;

    public g11(ThemeEditorView.EditorAlert editorAlert) {
        this.f26258a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f26258a;
        if (editorAlert.f24200c.getAdapter() == editorAlert.f24204r) {
            m11 m11Var = editorAlert.f24202f.f28951b;
            m11Var.requestFocus();
            AndroidUtilities.showKeyboard(m11Var);
        }
        editorAlert.f24199b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
