package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class u11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f27550a;

    public u11(ThemeEditorView.EditorAlert editorAlert) {
        this.f27550a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f27550a;
        if (editorAlert.f21305c.getAdapter() == editorAlert.f21308r) {
            a21 a21Var = editorAlert.f21306f.f21978b;
            a21Var.requestFocus();
            AndroidUtilities.showKeyboard(a21Var);
        }
        editorAlert.f21304b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
