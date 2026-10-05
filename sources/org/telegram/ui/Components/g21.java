package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class g21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f26680a;

    public g21(ThemeEditorView.EditorAlert editorAlert) {
        this.f26680a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f26680a;
        if (editorAlert.f24366c.getAdapter() == editorAlert.f24370r) {
            m21 m21Var = editorAlert.f24368f.f29323b;
            m21Var.requestFocus();
            AndroidUtilities.showKeyboard(m21Var);
        }
        editorAlert.f24365b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
