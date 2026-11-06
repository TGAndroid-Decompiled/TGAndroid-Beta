package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;
public final class kz0 extends AnimatorListenerAdapter {
    public final boolean f35455a;
    public final ThemeEditorView.EditorAlert f35456b;

    public kz0(ThemeEditorView.EditorAlert editorAlert, boolean z9) {
        this.f35456b = editorAlert;
        this.f35455a = z9;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f35456b.f31584t1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[0] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.f35456b;
        AnimatorSet[] animatorSetArr = editorAlert.f31584t1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f35455a) {
                editorAlert.f31583s1[0].setVisibility(4);
            }
            animatorSetArr[0] = null;
        }
    }
}
