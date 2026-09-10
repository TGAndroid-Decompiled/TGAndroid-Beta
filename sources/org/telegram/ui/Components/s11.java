package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class s11 extends AnimatorListenerAdapter {
    public final boolean f26898a;
    public final ThemeEditorView.EditorAlert f26899b;

    public s11(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.f26899b = editorAlert;
        this.f26898a = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f26899b.f21311x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f26899b;
        AnimatorSet[] animatorSetArr = editorAlert.f21311x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f26898a) {
                editorAlert.f21310w[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
