package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class lz0 extends AnimatorListenerAdapter {
    public final boolean f35804a;
    public final ThemeEditorView.EditorAlert f35805b;

    public lz0(ThemeEditorView.EditorAlert editorAlert, boolean z9) {
        this.f35805b = editorAlert;
        this.f35804a = z9;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f35805b.f31585t1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f35805b;
        AnimatorSet[] animatorSetArr = editorAlert.f31585t1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f35804a) {
                editorAlert.f31584s1[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
