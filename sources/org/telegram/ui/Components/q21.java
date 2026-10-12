package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class q21 extends AnimatorListenerAdapter {
    public final boolean f29673a;
    public final ThemeEditorView.EditorAlert f29674b;

    public q21(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.f29674b = editorAlert;
        this.f29673a = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f29674b.f24145x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f29674b;
        AnimatorSet[] animatorSetArr = editorAlert.f24145x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f29673a) {
                editorAlert.f24144w[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
