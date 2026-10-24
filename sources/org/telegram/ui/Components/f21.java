package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class f21 extends AnimatorListenerAdapter {
    public final boolean f26178a;
    public final ThemeEditorView.EditorAlert f26179b;

    public f21(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.f26179b = editorAlert;
        this.f26178a = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f26179b.f24553x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f26179b;
        AnimatorSet[] animatorSetArr = editorAlert.f24553x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f26178a) {
                editorAlert.f24552w[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
