package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class f21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f26058a;

    public f21(ThemeEditorView.EditorAlert editorAlert) {
        this.f26058a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f26058a;
        if (editorAlert.f24398c.getAdapter() == editorAlert.f24401r) {
            l21 l21Var = editorAlert.f24399f.f28666b;
            l21Var.requestFocus();
            AndroidUtilities.showKeyboard(l21Var);
        }
        editorAlert.f24397b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
