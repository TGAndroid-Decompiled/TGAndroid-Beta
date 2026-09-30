package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class x11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f30103a;

    public x11(ThemeEditorView.EditorAlert editorAlert) {
        this.f30103a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f30103a;
        if (editorAlert.f22464c.getAdapter() == editorAlert.f22467r) {
            d21 d21Var = editorAlert.f22465f.f24143b;
            d21Var.requestFocus();
            AndroidUtilities.showKeyboard(d21Var);
        }
        editorAlert.f22463b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
