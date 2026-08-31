package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class j11 extends AnimatorListenerAdapter {
    public final boolean f27972a;
    public final ThemeEditorView.EditorAlert f27973b;

    public j11(ThemeEditorView.EditorAlert editorAlert, boolean z4) {
        this.f27973b = editorAlert;
        this.f27972a = z4;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f27973b.f25072x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f27973b;
        AnimatorSet[] animatorSetArr = editorAlert.f25072x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f27972a) {
                editorAlert.f25071w[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
