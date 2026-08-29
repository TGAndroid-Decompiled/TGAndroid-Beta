package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class z01 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f35170a;

    public z01(ThemeEditorView.EditorAlert editorAlert) {
        this.f35170a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f35170a;
        if (editorAlert.f26577c.getAdapter() == editorAlert.f26581r) {
            f11 f11Var = editorAlert.f26579f.f29033b;
            f11Var.requestFocus();
            AndroidUtilities.showKeyboard(f11Var);
        }
        editorAlert.f26576b.setVisibility(8);
        editorAlert.v.setVisibility(8);
        editorAlert.D = false;
    }
}
