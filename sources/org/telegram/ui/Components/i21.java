package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class i21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f27182a;

    public i21(ThemeEditorView.EditorAlert editorAlert) {
        this.f27182a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f27182a;
        if (editorAlert.f24546c.getAdapter() == editorAlert.f24549r) {
            o21 o21Var = editorAlert.f24547f.f29762b;
            o21Var.requestFocus();
            AndroidUtilities.showKeyboard(o21Var);
        }
        editorAlert.f24545b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
