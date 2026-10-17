package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class b21 extends AnimatorListenerAdapter {
    public final boolean f24777a;
    public final ThemeEditorView.EditorAlert f24778b;

    public b21(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.f24778b = editorAlert;
        this.f24777a = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f24778b.f24400x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f24778b;
        AnimatorSet[] animatorSetArr = editorAlert.f24400x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f24777a) {
                editorAlert.f24399w[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
