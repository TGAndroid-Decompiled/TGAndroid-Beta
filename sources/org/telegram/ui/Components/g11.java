package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class g11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f24131a;

    public g11(ThemeEditorView.EditorAlert editorAlert) {
        this.f24131a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f24131a;
        if (editorAlert.f22191c.getAdapter() == editorAlert.f22194r) {
            m11 m11Var = editorAlert.f22192f.f26571b;
            m11Var.requestFocus();
            AndroidUtilities.showKeyboard(m11Var);
        }
        editorAlert.f22190b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
