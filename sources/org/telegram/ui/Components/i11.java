package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class i11 extends AnimatorListenerAdapter {
    public final boolean f27688a;
    public final ThemeEditorView.EditorAlert f27689b;

    public i11(ThemeEditorView.EditorAlert editorAlert, boolean z4) {
        this.f27689b = editorAlert;
        this.f27688a = z4;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f27689b.f25074x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f27689b;
        AnimatorSet[] animatorSetArr = editorAlert.f25074x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f27688a) {
                editorAlert.f25073w[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
