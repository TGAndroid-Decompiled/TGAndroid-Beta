package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class kz0 extends AnimatorListenerAdapter {
    public final boolean f35516a;
    public final ThemeEditorView.EditorAlert f35517b;

    public kz0(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.f35517b = editorAlert;
        this.f35516a = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f35517b.f31663u1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f35517b;
        AnimatorSet[] animatorSetArr = editorAlert.f31663u1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f35516a) {
                editorAlert.f31662t1[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
