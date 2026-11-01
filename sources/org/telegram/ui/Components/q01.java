package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class q01 extends AnimatorListenerAdapter {
    public final boolean f29584a;
    public final ThemeEditorView.EditorAlert f29585b;

    public q01(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.f29585b = editorAlert;
        this.f29584a = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f29585b.f24231t1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f29585b;
        AnimatorSet[] animatorSetArr = editorAlert.f24231t1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f29584a) {
                editorAlert.f24230s1[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
