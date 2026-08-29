package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class x01 extends AnimatorListenerAdapter {
    public final boolean f34534a;
    public final ThemeEditorView.EditorAlert f34535b;

    public x01(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.f34535b = editorAlert;
        this.f34534a = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f34535b.f26584x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f34535b;
        AnimatorSet[] animatorSetArr = editorAlert.f26584x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f34534a) {
                editorAlert.f26583w[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
