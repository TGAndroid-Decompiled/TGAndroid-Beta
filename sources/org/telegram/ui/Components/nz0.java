package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class nz0 extends AnimatorListenerAdapter {
    public final boolean f37757a;
    public final ThemeEditorView.EditorAlert f37758b;

    public nz0(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.f37758b = editorAlert;
        this.f37757a = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f37758b.f32771x1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f37758b;
        AnimatorSet[] animatorSetArr = editorAlert.f32771x1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f37757a) {
                editorAlert.f32770w1[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
