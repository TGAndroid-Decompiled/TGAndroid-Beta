package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class c21 extends AnimatorListenerAdapter {
    public final boolean f25063a;
    public final ThemeEditorView.EditorAlert f25064b;

    public c21(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.f25064b = editorAlert;
        this.f25063a = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f25064b.f24403x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f25064b;
        AnimatorSet[] animatorSetArr = editorAlert.f24403x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f25063a) {
                editorAlert.f24402w[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
