package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class u11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f28676a;

    public u11(ThemeEditorView.EditorAlert editorAlert) {
        this.f28676a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f28676a;
        if (editorAlert.f22443c.getAdapter() == editorAlert.f22446r) {
            a21 a21Var = editorAlert.f22444f.f23167b;
            a21Var.requestFocus();
            AndroidUtilities.showKeyboard(a21Var);
        }
        editorAlert.f22442b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
