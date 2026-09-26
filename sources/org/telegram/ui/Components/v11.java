package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class v11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f28967a;

    public v11(ThemeEditorView.EditorAlert editorAlert) {
        this.f28967a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f28967a;
        if (editorAlert.f22442c.getAdapter() == editorAlert.f22445r) {
            b21 b21Var = editorAlert.f22443f.f23481b;
            b21Var.requestFocus();
            AndroidUtilities.showKeyboard(b21Var);
        }
        editorAlert.f22441b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
