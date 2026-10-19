package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class c21 extends AnimatorListenerAdapter {
    public final boolean f25061a;
    public final ThemeEditorView.EditorAlert f25062b;

    public c21(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.f25062b = editorAlert;
        this.f25061a = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f25062b.f24401x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f25062b;
        AnimatorSet[] animatorSetArr = editorAlert.f24401x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f25061a) {
                editorAlert.f24400w[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
