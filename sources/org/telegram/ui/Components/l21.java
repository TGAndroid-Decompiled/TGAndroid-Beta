package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class l21 extends AnimatorListenerAdapter {
    public final boolean f28142a;
    public final ThemeEditorView.EditorAlert f28143b;

    public l21(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.f28143b = editorAlert;
        this.f28142a = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f28143b.f24372x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f28143b;
        AnimatorSet[] animatorSetArr = editorAlert.f24372x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f28142a) {
                editorAlert.f24371w[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
