package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class g21 extends AnimatorListenerAdapter {
    public final boolean f25167a;
    public final ThemeEditorView.EditorAlert f25168b;

    public g21(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.f25168b = editorAlert;
        this.f25167a = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f25168b.f23345x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f25168b;
        AnimatorSet[] animatorSetArr = editorAlert.f23345x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f25167a) {
                editorAlert.f23344w[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
