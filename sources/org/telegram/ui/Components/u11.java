package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class u11 extends AnimatorListenerAdapter {
    public final boolean f28683a;
    public final ThemeEditorView.EditorAlert f28684b;

    public u11(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.f28684b = editorAlert;
        this.f28683a = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f28684b.f22450x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f28684b;
        AnimatorSet[] animatorSetArr = editorAlert.f22450x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f28683a) {
                editorAlert.f22449w[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
