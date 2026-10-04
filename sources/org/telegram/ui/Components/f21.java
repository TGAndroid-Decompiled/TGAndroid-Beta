package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class f21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f26257a;

    public f21(ThemeEditorView.EditorAlert editorAlert) {
        this.f26257a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f26257a;
        if (editorAlert.f24363c.getAdapter() == editorAlert.f24367r) {
            l21 l21Var = editorAlert.f24365f.f28850b;
            l21Var.requestFocus();
            AndroidUtilities.showKeyboard(l21Var);
        }
        editorAlert.f24362b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
