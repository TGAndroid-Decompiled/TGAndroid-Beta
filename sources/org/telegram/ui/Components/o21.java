package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class o21 extends AnimatorListenerAdapter {
    public final boolean f31133a;
    public final ThemeEditorView.EditorAlert f31134b;

    public o21(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.f31134b = editorAlert;
        this.f31133a = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f31134b.f26343x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f31134b;
        AnimatorSet[] animatorSetArr = editorAlert.f26343x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f31133a) {
                editorAlert.f26342w[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
