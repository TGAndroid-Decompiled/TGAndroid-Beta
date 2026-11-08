package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
public final class nz0 extends AnimatorListenerAdapter {
    public final ThemeEditorView.EditorAlert f36474a;

    public nz0(ThemeEditorView.EditorAlert editorAlert) {
        this.f36474a = editorAlert;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f36474a;
        if (editorAlert.f31581j1.getAdapter() == editorAlert.f31585p1) {
            tz0 tz0Var = editorAlert.f31583m1.f39756b;
            tz0Var.requestFocus();
            org.telegram.messenger.g0.K3(tz0Var);
        }
        editorAlert.f31580i1.setVisibility(8);
        editorAlert.f31587r1.setVisibility(8);
        editorAlert.f31594y1 = false;
    }
}
