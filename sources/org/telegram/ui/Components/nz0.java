package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class nz0 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f36459a;

    public nz0(ThemeEditorView.EditorAlert editorAlert) {
        this.f36459a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f36459a;
        if (editorAlert.f31577j1.getAdapter() == editorAlert.f31581p1) {
            tz0 tz0Var = editorAlert.f31579m1.f39809b;
            tz0Var.requestFocus();
            org.telegram.messenger.g0.K3(tz0Var);
        }
        editorAlert.f31576i1.setVisibility(8);
        editorAlert.f31583r1.setVisibility(8);
        editorAlert.f31590y1 = false;
    }
}
