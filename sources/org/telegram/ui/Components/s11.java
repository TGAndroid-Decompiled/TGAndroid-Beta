package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class s11 extends AnimatorListenerAdapter {
    public final boolean f28094a;
    public final ThemeEditorView.EditorAlert f28095b;

    public s11(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.f28095b = editorAlert;
        this.f28094a = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f28095b.f22434x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f28095b;
        AnimatorSet[] animatorSetArr = editorAlert.f22434x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f28094a) {
                editorAlert.f22433w[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
