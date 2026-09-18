package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class i11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f24800a;

    public i11(ThemeEditorView.EditorAlert editorAlert) {
        this.f24800a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f24800a;
        if (editorAlert.f22233c.getAdapter() == editorAlert.f22236r) {
            o11 o11Var = editorAlert.f22234f.f27194b;
            o11Var.requestFocus();
            AndroidUtilities.showKeyboard(o11Var);
        }
        editorAlert.f22232b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
