package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class f21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f26252a;

    public f21(ThemeEditorView.EditorAlert editorAlert) {
        this.f26252a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f26252a;
        if (editorAlert.f24359c.getAdapter() == editorAlert.f24363r) {
            l21 l21Var = editorAlert.f24361f.f28845b;
            l21Var.requestFocus();
            AndroidUtilities.showKeyboard(l21Var);
        }
        editorAlert.f24358b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
