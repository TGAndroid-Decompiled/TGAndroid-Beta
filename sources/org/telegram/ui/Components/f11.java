package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class f11 extends AnimatorListenerAdapter {
    public final boolean f23778a;
    public final ThemeEditorView.EditorAlert f23779b;

    public f11(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.f23779b = editorAlert;
        this.f23778a = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f23779b.f22226x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f23779b;
        AnimatorSet[] animatorSetArr = editorAlert.f22226x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f23778a) {
                editorAlert.f22225w[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
