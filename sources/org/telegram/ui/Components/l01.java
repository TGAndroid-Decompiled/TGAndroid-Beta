package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class l01 extends AnimatorListenerAdapter {
    public final boolean f30297a;
    public final ThemeEditorView.EditorAlert f30298b;

    public l01(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.f30298b = editorAlert;
        this.f30297a = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f30298b.f26573x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f30298b;
        AnimatorSet[] animatorSetArr = editorAlert.f26573x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f30297a) {
                editorAlert.f26572w[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
