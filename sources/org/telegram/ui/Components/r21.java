package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class r21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f32111a;

    public r21(ThemeEditorView.EditorAlert editorAlert) {
        this.f32111a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f32111a;
        if (editorAlert.f26341c.getAdapter() == editorAlert.f26344r) {
            x21 x21Var = editorAlert.f26342f.f35225b;
            x21Var.requestFocus();
            AndroidUtilities.showKeyboard(x21Var);
        }
        editorAlert.f26340b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
