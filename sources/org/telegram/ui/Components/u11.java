package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class u11 extends AnimatorListenerAdapter {
    public final boolean f28533a;
    public final ThemeEditorView.EditorAlert f28534b;

    public u11(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.f28534b = editorAlert;
        this.f28533a = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f28534b.f22412x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f28534b;
        AnimatorSet[] animatorSetArr = editorAlert.f22412x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f28533a) {
                editorAlert.f22411w[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
