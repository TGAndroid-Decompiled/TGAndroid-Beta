package org.telegram.ui.Components;

import org.telegram.ui.DialogsActivity;

public final class SharedMediaLayout$$ExternalSyntheticLambda11 implements FragmentContextView.FragmentContextViewDelegate, DialogsActivity.DialogsActivityDelegate {
    public final SharedMediaLayout f$0;

    public SharedMediaLayout$$ExternalSyntheticLambda11(SharedMediaLayout sharedMediaLayout) {
        this.f$0 = sharedMediaLayout;
    }

    @Override
    public boolean canSelectStories() {
        return false;
    }

    @Override
    public boolean didSelectDialogs(org.telegram.ui.DialogsActivity r32, java.util.ArrayList r33, java.lang.CharSequence r34, boolean r35, boolean r36, int r37, int r38, org.telegram.ui.TopicsFragment r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda11.didSelectDialogs(org.telegram.ui.DialogsActivity, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.TopicsFragment):boolean");
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        return false;
    }

    public void onAnimation(boolean z) {
        SharedMediaLayout sharedMediaLayout = this.f$0;
        if (!z) {
            sharedMediaLayout.requestLayout();
        }
        sharedMediaLayout.setVisibleHeight(sharedMediaLayout.lastVisibleHeight);
    }
}
