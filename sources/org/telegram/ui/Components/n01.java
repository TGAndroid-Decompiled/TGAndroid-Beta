package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

public final class n01 extends AnimatorListenerAdapter {

    public final boolean f30803a;

    public final ThemeEditorView.EditorAlert f30804b;

    public n01(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.f30804b = editorAlert;
        this.f30803a = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f30804b.f26569x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet == null || !animatorSet.equals(animator)) {
            return;
        }
        animatorSetArr[0] = null;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f30804b;
        AnimatorSet[] animatorSetArr = editorAlert.f26569x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet == null || !animatorSet.equals(animator)) {
            return;
        }
        if (!this.f30803a) {
            editorAlert.f26568w[0].setVisibility(4);
        }
        animatorSetArr[0] = null;
    }
}
