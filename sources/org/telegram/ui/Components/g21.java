package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class g21 extends AnimatorListenerAdapter {
    public final boolean f26524a;
    public final ThemeEditorView.EditorAlert f26525b;

    public g21(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.f26525b = editorAlert;
        this.f26524a = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f26525b.f24552x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f26525b;
        AnimatorSet[] animatorSetArr = editorAlert.f24552x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f26524a) {
                editorAlert.f24551w[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
