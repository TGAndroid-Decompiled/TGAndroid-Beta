package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;

public final class ContentPreviewViewer$1$$ExternalSyntheticLambda5 implements View.OnClickListener {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final Object f$1;
    public final boolean f$2;

    public ContentPreviewViewer$1$$ExternalSyntheticLambda5(ContentPreviewViewer.AnonymousClass1 anonymousClass1, ArrayList arrayList, boolean z) {
        this.f$0 = anonymousClass1;
        this.f$1 = arrayList;
        this.f$2 = z;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.this;
                if (contentPreviewViewer.parentActivity != null && contentPreviewViewer.delegate != null) {
                    int iIntValue = ((Integer) ((ArrayList) this.f$1).get(((Integer) view.getTag()).intValue())).intValue();
                    if (iIntValue == 0) {
                        contentPreviewViewer.delegate.sendEmoji(contentPreviewViewer.currentDocument);
                    } else if (iIntValue == 1) {
                        contentPreviewViewer.delegate.setAsEmojiStatus(contentPreviewViewer.currentDocument);
                    } else if (iIntValue == 2) {
                        contentPreviewViewer.delegate.setAsEmojiStatus(null);
                    } else if (iIntValue == 3) {
                        contentPreviewViewer.delegate.copyEmoji(contentPreviewViewer.currentDocument);
                    } else if (iIntValue == 4) {
                        contentPreviewViewer.delegate.removeFromRecent(contentPreviewViewer.currentDocument);
                    } else if (iIntValue == 5) {
                        MediaDataController.getInstance(contentPreviewViewer.currentAccount).addRecentSticker(2, contentPreviewViewer.parentObject, contentPreviewViewer.currentDocument, (int) (System.currentTimeMillis() / 1000), this.f$2);
                    }
                    contentPreviewViewer.dismissPopupWindow();
                    break;
                }
                break;
            default:
                BaseFragment lastFragment = LaunchActivity.getLastFragment();
                if (lastFragment != null) {
                    lastFragment.presentFragment(new PremiumPreviewFragment(0, this.f$2 ? "lastseen" : "readtime"));
                    ((BottomSheet) this.f$0).lambda$showGiftOfferSheet$15();
                    Runnable runnable = (Runnable) this.f$1;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                break;
        }
    }

    public ContentPreviewViewer$1$$ExternalSyntheticLambda5(boolean z, BottomSheet bottomSheet, Runnable runnable) {
        this.f$2 = z;
        this.f$0 = bottomSheet;
        this.f$1 = runnable;
    }
}
