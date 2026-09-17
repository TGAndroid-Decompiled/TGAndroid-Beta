package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class i11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f24797a;

    public i11(ThemeEditorView.EditorAlert editorAlert) {
        this.f24797a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f24797a;
        if (editorAlert.f22230c.getAdapter() == editorAlert.f22233r) {
            o11 o11Var = editorAlert.f22231f.f27191b;
            o11Var.requestFocus();
            AndroidUtilities.showKeyboard(o11Var);
        }
        editorAlert.f22229b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
