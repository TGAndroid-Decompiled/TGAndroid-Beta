package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class o21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f29243a;

    public o21(ThemeEditorView.EditorAlert editorAlert) {
        this.f29243a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f29243a;
        if (editorAlert.f24353c.getAdapter() == editorAlert.f24357r) {
            v21 v21Var = editorAlert.f24355f.f32810b;
            v21Var.requestFocus();
            AndroidUtilities.showKeyboard(v21Var);
        }
        editorAlert.f24352b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
