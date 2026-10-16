package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class h21 extends AnimatorListenerAdapter {
    public final boolean f25160a;
    public final ThemeEditorView.EditorAlert f25161b;

    public h21(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.f25161b = editorAlert;
        this.f25160a = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f25161b.f23045x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f25161b;
        AnimatorSet[] animatorSetArr = editorAlert.f23045x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f25160a) {
                editorAlert.f23044w[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
