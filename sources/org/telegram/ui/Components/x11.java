package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class x11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f30196a;

    public x11(ThemeEditorView.EditorAlert editorAlert) {
        this.f30196a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f30196a;
        if (editorAlert.f22457c.getAdapter() == editorAlert.f22460r) {
            d21 d21Var = editorAlert.f22458f.f24087b;
            d21Var.requestFocus();
            AndroidUtilities.showKeyboard(d21Var);
        }
        editorAlert.f22456b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
