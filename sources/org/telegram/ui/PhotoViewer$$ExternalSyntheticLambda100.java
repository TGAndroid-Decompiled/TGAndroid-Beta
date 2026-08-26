package org.telegram.ui;

import android.view.View;
import java.io.FileNotFoundException;
import org.telegram.ui.Components.RecyclerListView;

public final class PhotoViewer$$ExternalSyntheticLambda100 implements RecyclerListView.OnItemClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public PhotoViewer$$ExternalSyntheticLambda100(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onItemClick(View view, int i) throws FileNotFoundException {
        switch (this.$r8$classId) {
            case 0:
                ((PhotoViewer) this.f$0).lambda$setParentActivity$81(view, i);
                break;
            case 1:
                ((ContentPreviewViewer.AnonymousClass1) this.f$0).lambda$run$4(view, i);
                break;
            case 2:
                ((DataUsage2Activity.ListView) this.f$0).lambda$new$1(view, i);
                break;
            case 3:
                ((PremiumPreviewFragment.BackgroundView) this.f$0).lambda$new$0(view, i);
                break;
            case 4:
                ((QrActivity.ThemeListViewController) this.f$0).onItemClicked(view, i);
                break;
            case 5:
                ((TopicsFragment.MessagesSearchContainer) this.f$0).lambda$new$0(view, i);
                break;
            case 6:
                ((WallpapersListActivity.SearchAdapter) this.f$0).lambda$onCreateViewHolder$5(view, i);
                break;
            case 7:
                ((ArchiveSettingsActivity) this.f$0).lambda$createView$1(view, i);
                break;
            case 8:
                ((ArchivedStickersActivity) this.f$0).lambda$createView$0(view, i);
                break;
            case 9:
                ((ChannelWallpaperActivity) this.f$0).lambda$createView$2(view, i);
                break;
            case 10:
                ((ChatLinkActivity) this.f$0).lambda$createView$6(view, i);
                break;
            case 11:
                ((ChatReactionsEditActivity) this.f$0).lambda$createView$7(view, i);
                break;
            case 12:
                ((CountrySelectActivity) this.f$0).lambda$createView$0(view, i);
                break;
            case 13:
                ((FeaturedStickersActivity) this.f$0).lambda$createView$0(view, i);
                break;
            case 14:
                ((FilterChatlistActivity) this.f$0).lambda$createView$0(view, i);
                break;
            case 15:
                ((FilterCreateActivity) this.f$0).lambda$createView$8(view, i);
                break;
            case 16:
                ((FilterCreateActivity.FilterInvitesBottomSheet) this.f$0).lambda$onViewCreated$5(view, i);
                break;
            case 17:
                ((FilteredSearchView) this.f$0).lambda$new$1(view, i);
                break;
            case 18:
                ((GroupInviteActivity) this.f$0).lambda$createView$1(view, i);
                break;
            case 19:
                ((GroupStickersActivity) this.f$0).lambda$createView$0(view, i);
                break;
            case 20:
                ((InviteContactsActivity) this.f$0).lambda$createView$0(view, i);
                break;
            case 21:
                ((LanguageSelectActivity) this.f$0).lambda$createView$4(view, i);
                break;
            case 22:
                ((LocationActivity) this.f$0).lambda$createView$18(view, i);
                break;
            case 23:
                ((MessageSendPreview) this.f$0).lambda$new$5(view, i);
                break;
            case 24:
                ((MessageStatisticActivity) this.f$0).lambda$createView$0(view, i);
                break;
            case 25:
                ((PasscodeActivity) this.f$0).lambda$createView$5(view, i);
                break;
            case 26:
                ((PhotoPickerActivity) this.f$0).lambda$createView$1(view, i);
                break;
            case 27:
                ((PollCreateActivity) this.f$0).lambda$createView$1(view, i);
                break;
            case 28:
                ((PremiumPreviewFragment) this.f$0).lambda$createView$5(view, i);
                break;
            default:
                ((PrivacyControlActivity) this.f$0).lambda$createView$9(view, i);
                break;
        }
    }
}
