package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class f11 extends AnimatorListenerAdapter {
    public final boolean f23777a;
    public final ThemeEditorView.EditorAlert f23778b;

    public f11(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.f23778b = editorAlert;
        this.f23777a = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f23778b.f22223x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f23778b;
        AnimatorSet[] animatorSetArr = editorAlert.f22223x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f23777a) {
                editorAlert.f22222w[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
