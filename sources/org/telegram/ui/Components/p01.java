package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class p01 extends AnimatorListenerAdapter {
    public final boolean f29230a;
    public final ThemeEditorView.EditorAlert f29231b;

    public p01(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.f29231b = editorAlert;
        this.f29230a = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f29231b.f24230t1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f29231b;
        AnimatorSet[] animatorSetArr = editorAlert.f24230t1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f29230a) {
                editorAlert.f24229s1[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
