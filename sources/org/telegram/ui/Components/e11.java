package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class e11 extends AnimatorListenerAdapter {
    public final boolean f25540a;
    public final ThemeEditorView.EditorAlert f25541b;

    public e11(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.f25541b = editorAlert;
        this.f25540a = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f25541b.f24206x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f25541b;
        AnimatorSet[] animatorSetArr = editorAlert.f24206x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f25540a) {
                editorAlert.f24205w[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
