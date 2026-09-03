package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class k11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f26144a;

    public k11(ThemeEditorView.EditorAlert editorAlert) {
        this.f26144a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f26144a;
        if (editorAlert.f23177c.getAdapter() == editorAlert.f23180r) {
            q11 q11Var = editorAlert.f23178f.f28640b;
            q11Var.requestFocus();
            AndroidUtilities.showKeyboard(q11Var);
        }
        editorAlert.f23176b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.E = false;
    }
}
