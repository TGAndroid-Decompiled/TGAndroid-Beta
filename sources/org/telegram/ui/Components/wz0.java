package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class wz0 extends AnimatorListenerAdapter {
    public final boolean f41936a;
    public final ThemeEditorView.EditorAlert f41937b;

    public wz0(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.f41937b = editorAlert;
        this.f41936a = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f41937b.f33201x1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f41937b;
        AnimatorSet[] animatorSetArr = editorAlert.f33201x1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f41936a) {
                editorAlert.f33200w1[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
