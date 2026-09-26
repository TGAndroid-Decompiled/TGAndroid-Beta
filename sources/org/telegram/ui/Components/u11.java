package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class u11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f28675a;

    public u11(ThemeEditorView.EditorAlert editorAlert) {
        this.f28675a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f28675a;
        if (editorAlert.f22442c.getAdapter() == editorAlert.f22445r) {
            a21 a21Var = editorAlert.f22443f.f23166b;
            a21Var.requestFocus();
            AndroidUtilities.showKeyboard(a21Var);
        }
        editorAlert.f22441b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
