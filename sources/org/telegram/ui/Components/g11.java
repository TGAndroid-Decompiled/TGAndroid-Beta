package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class g11 extends AnimatorListenerAdapter {
    public final boolean f24061a;
    public final ThemeEditorView.EditorAlert f24062b;

    public g11(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.f24062b = editorAlert;
        this.f24061a = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f24062b.f22236x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f24062b;
        AnimatorSet[] animatorSetArr = editorAlert.f22236x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f24061a) {
                editorAlert.f22235w[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
