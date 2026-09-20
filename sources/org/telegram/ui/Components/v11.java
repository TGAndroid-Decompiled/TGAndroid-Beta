package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class v11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f28898a;

    public v11(ThemeEditorView.EditorAlert editorAlert) {
        this.f28898a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f28898a;
        if (editorAlert.f22441c.getAdapter() == editorAlert.f22444r) {
            b21 b21Var = editorAlert.f22442f.f23471b;
            b21Var.requestFocus();
            AndroidUtilities.showKeyboard(b21Var);
        }
        editorAlert.f22440b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
