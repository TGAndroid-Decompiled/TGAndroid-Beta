package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class i11 extends AnimatorListenerAdapter {
    public final boolean f25557a;
    public final ThemeEditorView.EditorAlert f25558b;

    public i11(ThemeEditorView.EditorAlert editorAlert, boolean z4) {
        this.f25558b = editorAlert;
        this.f25557a = z4;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f25558b.f23183x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f25558b;
        AnimatorSet[] animatorSetArr = editorAlert.f23183x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f25557a) {
                editorAlert.f23182w[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
