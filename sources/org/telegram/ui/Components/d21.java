package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class d21 extends AnimatorListenerAdapter {
    public final boolean f25532a;
    public final ThemeEditorView.EditorAlert f25533b;

    public d21(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.f25533b = editorAlert;
        this.f25532a = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f25533b.f24370x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f25533b;
        AnimatorSet[] animatorSetArr = editorAlert.f24370x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f25532a) {
                editorAlert.f24369w[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
