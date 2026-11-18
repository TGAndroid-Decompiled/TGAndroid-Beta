package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class uz0 extends AnimatorListenerAdapter {
    public final boolean f40452a;
    public final ThemeEditorView.EditorAlert f40453b;

    public uz0(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.f40453b = editorAlert;
        this.f40452a = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f40453b.f33168x1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f40453b;
        AnimatorSet[] animatorSetArr = editorAlert.f33168x1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f40452a) {
                editorAlert.f33167w1[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
