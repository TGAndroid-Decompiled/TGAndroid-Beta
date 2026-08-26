package org.telegram.ui;

import org.telegram.ui.Components.RecyclerListView;

public final class ProfileActivity$7$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final ProfileActivity.AnonymousClass7 f$0;

    public ProfileActivity$7$$ExternalSyntheticLambda1(ProfileActivity.AnonymousClass7 anonymousClass7, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass7;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ProfileActivity.AnonymousClass7 anonymousClass7 = this.f$0;
                anonymousClass7.getClass();
                try {
                    RecyclerListView currentListView = anonymousClass7.this$0$1.sharedMediaLayout.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().notifyDataSetChanged();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            default:
                ProfileActivity profileActivity = ProfileActivity.this;
                ProfileActivity.AnonymousClass35 anonymousClass35 = profileActivity.selectAnimatedEmojiDialog;
                if (anonymousClass35 != null) {
                    anonymousClass35.dismiss();
                    profileActivity.selectAnimatedEmojiDialog = null;
                }
                break;
        }
    }
}
