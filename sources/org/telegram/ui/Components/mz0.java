package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class mz0 extends AnimatorListenerAdapter {
    public final boolean f36183a;
    public final ThemeEditorView.EditorAlert f36184b;

    public mz0(ThemeEditorView.EditorAlert editorAlert, boolean z9) {
        this.f36184b = editorAlert;
        this.f36183a = z9;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f36184b.f31594t1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f36184b;
        AnimatorSet[] animatorSetArr = editorAlert.f31594t1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f36183a) {
                editorAlert.f31593s1[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
