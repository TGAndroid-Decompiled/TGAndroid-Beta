package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class r01 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f29794a;

    public r01(ThemeEditorView.EditorAlert editorAlert) {
        this.f29794a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f29794a;
        if (editorAlert.f24221j1.getAdapter() == editorAlert.f24226p1) {
            x01 x01Var = editorAlert.f24223m1.f32863b;
            x01Var.requestFocus();
            org.telegram.messenger.i0.J3(x01Var);
        }
        editorAlert.f24220i1.setVisibility(8);
        editorAlert.f24228r1.setVisibility(8);
        editorAlert.f24235y1 = false;
    }
}
