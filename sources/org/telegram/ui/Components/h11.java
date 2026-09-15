package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class h11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f24494a;

    public h11(ThemeEditorView.EditorAlert editorAlert) {
        this.f24494a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f24494a;
        if (editorAlert.f22220c.getAdapter() == editorAlert.f22223r) {
            n11 n11Var = editorAlert.f22221f.f26928b;
            n11Var.requestFocus();
            AndroidUtilities.showKeyboard(n11Var);
        }
        editorAlert.f22219b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
