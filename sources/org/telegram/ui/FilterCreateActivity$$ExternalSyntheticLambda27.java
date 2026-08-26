package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.PhotoViewerWebView;
import org.telegram.ui.Components.SearchStateDrawable;
import org.telegram.ui.Stars.StarsController;

public final class FilterCreateActivity$$ExternalSyntheticLambda27 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;
    public final int f$2;

    public FilterCreateActivity$$ExternalSyntheticLambda27(Object obj, boolean z, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = z;
        this.f$2 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                FilterCreateActivity filterCreateActivity = (FilterCreateActivity) this.f$0;
                filterCreateActivity.getClass();
                BulletinFactory bulletinFactoryOf = BulletinFactory.of(filterCreateActivity);
                boolean z = this.f$1;
                int i = z ? R.raw.folder_in : R.raw.folder_out;
                int i2 = this.f$2;
                Bulletin bulletinCreateSimpleBulletin = bulletinFactoryOf.createSimpleBulletin(z ? LocaleController.formatPluralString("FolderLinkAddedChats", i2, new Object[0]) : LocaleController.formatPluralString("FolderLinkRemovedChats", i2, new Object[0]), LocaleController.getString(R.string.FolderLinkChatlistUpdate), i);
                bulletinCreateSimpleBulletin.duration = 5000;
                bulletinCreateSimpleBulletin.show();
                break;
            case 1:
                ((PhotoViewerWebView.YoutubeProxy) this.f$0).this$0.photoViewer.updatePlayerState(this.f$2, this.f$1);
                break;
            case 2:
                SearchStateDrawable searchStateDrawable = (SearchStateDrawable) this.f$0;
                searchStateDrawable.delaySetProgress = null;
                searchStateDrawable.setIconState(this.f$2, this.f$1, true);
                break;
            default:
                StarsController starsController = (StarsController) this.f$0;
                if (!this.f$1) {
                    starsController.getClass();
                } else {
                    int i3 = this.f$2;
                    starsController.sendingPaidMessagesIds.remove(Integer.valueOf(i3));
                    Runnable runnable = (Runnable) starsController.postponedPaidMessages.remove(Integer.valueOf(i3));
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                break;
        }
    }

    public FilterCreateActivity$$ExternalSyntheticLambda27(SearchStateDrawable searchStateDrawable, int i, boolean z) {
        this.$r8$classId = 2;
        this.f$0 = searchStateDrawable;
        this.f$2 = i;
        this.f$1 = z;
    }
}
