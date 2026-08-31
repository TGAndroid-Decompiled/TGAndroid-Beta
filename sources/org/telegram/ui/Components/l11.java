package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class l11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f28541a;

    public l11(ThemeEditorView.EditorAlert editorAlert) {
        this.f28541a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f28541a;
        if (editorAlert.f25065c.getAdapter() == editorAlert.f25069r) {
            r11 r11Var = editorAlert.f25067f.f31235b;
            r11Var.requestFocus();
            AndroidUtilities.showKeyboard(r11Var);
        }
        editorAlert.f25064b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.E = false;
    }
}
