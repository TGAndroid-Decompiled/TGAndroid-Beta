package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class k11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f26105a;

    public k11(ThemeEditorView.EditorAlert editorAlert) {
        this.f26105a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f26105a;
        if (editorAlert.f23204c.getAdapter() == editorAlert.f23207r) {
            q11 q11Var = editorAlert.f23205f.f28592b;
            q11Var.requestFocus();
            AndroidUtilities.showKeyboard(q11Var);
        }
        editorAlert.f23203b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.E = false;
    }
}
