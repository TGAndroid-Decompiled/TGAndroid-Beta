package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class w extends AnimatorListenerAdapter {
    public final boolean a;
    public final ThemeEditorView.EditorAlert b;

    public w(ThemeEditorView.EditorAlert editorAlert, boolean z) {
        this.b = editorAlert;
        this.a = z;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.b.w1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.b;
        AnimatorSet[] animatorSetArr = editorAlert.w1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.a) {
                editorAlert.v1[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
