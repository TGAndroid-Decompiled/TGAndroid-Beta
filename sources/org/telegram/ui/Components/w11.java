package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class w11 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f29793a;

    public w11(ThemeEditorView.EditorAlert editorAlert) {
        this.f29793a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f29793a;
        if (editorAlert.f22443c.getAdapter() == editorAlert.f22446r) {
            c21 c21Var = editorAlert.f22444f.f23842b;
            c21Var.requestFocus();
            AndroidUtilities.showKeyboard(c21Var);
        }
        editorAlert.f22442b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
