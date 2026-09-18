package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class g11 extends AnimatorListenerAdapter {
    public final boolean f24064a;
    public final ThemeEditorView.EditorAlert f24065b;

    public g11(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.f24065b = editorAlert;
        this.f24064a = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f24065b.f22239x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f24065b;
        AnimatorSet[] animatorSetArr = editorAlert.f22239x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f24064a) {
                editorAlert.f22238w[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
