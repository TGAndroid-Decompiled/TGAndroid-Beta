package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class f21 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f26251a;

    public f21(ThemeEditorView.EditorAlert editorAlert) {
        this.f26251a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f26251a;
        if (editorAlert.f24358c.getAdapter() == editorAlert.f24362r) {
            l21 l21Var = editorAlert.f24360f.f28844b;
            l21Var.requestFocus();
            AndroidUtilities.showKeyboard(l21Var);
        }
        editorAlert.f24357b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.H = false;
    }
}
