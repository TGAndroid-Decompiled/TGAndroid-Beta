package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Cells.SharedPhotoVideoCell2;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.Stories.recorder.StoryRecorder;

public final class SharedMediaLayout$$ExternalSyntheticLambda2 implements View.OnClickListener {
    public final int $r8$classId;
    public final SharedMediaLayout f$0;

    public SharedMediaLayout$$ExternalSyntheticLambda2(SharedMediaLayout sharedMediaLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = sharedMediaLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                BaseFragment baseFragment = this.f$0.profileActivity;
                baseFragment.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                StoryRecorder.getInstance(baseFragment.getParentActivity(), baseFragment.getCurrentAccount()).open(null);
                break;
            case 1:
                this.f$0.closeActionMode(true);
                break;
            case 2:
                this.f$0.onActionBarItemClick(102, view);
                break;
            case 3:
                this.f$0.onActionBarItemClick(100, view);
                break;
            case 4:
                this.f$0.onActionBarItemClick(103, view);
                break;
            case 5:
                this.f$0.onActionBarItemClick(104, view);
                break;
            case 6:
                this.f$0.onActionBarItemClick(101, view);
                break;
            default:
                SharedMediaLayout sharedMediaLayout = this.f$0;
                if (sharedMediaLayout.saveItem.getAlpha() >= 0.1f) {
                    SharedMediaLayout.AnonymousClass13 anonymousClass13 = sharedMediaLayout.giftsContainer;
                    if (anonymousClass13 != null && anonymousClass13.isReordering()) {
                        ProfileGiftsContainer.Page currentPage = anonymousClass13.getCurrentPage();
                        if (currentPage != null) {
                            currentPage.resetReordering();
                        }
                        anonymousClass13.setReorderingCollections(false);
                    }
                    SharedMediaLayout.AnonymousClass15 anonymousClass15 = sharedMediaLayout.storiesContainer;
                    if (anonymousClass15 != null && anonymousClass15.reorderingCollections) {
                        SharedMediaLayout.StoryAlbumData storyAlbumDataStoryAlbums_getByAlbumId = sharedMediaLayout.storyAlbums_getByAlbumId(sharedMediaLayout.storyAlbums_getAlbumIdByTabType(sharedMediaLayout.getClosestTab()));
                        SharedMediaLayout.MediaPage mediaPage = sharedMediaLayout.getMediaPage(storyAlbumDataStoryAlbums_getByAlbumId.tabType);
                        if (mediaPage != null) {
                            anonymousClass15.setReorderingAlbums(false);
                            SharedMediaLayout.AnonymousClass19 anonymousClass19 = mediaPage.listView;
                            for (int i = 0; i < anonymousClass19.getChildCount(); i++) {
                                View childAt = anonymousClass19.getChildAt(i);
                                if (childAt instanceof SharedPhotoVideoCell2) {
                                    ((SharedPhotoVideoCell2) childAt).setReordering(false, true);
                                }
                            }
                            SharedMediaLayout.StoryAlbumData.AnonymousClass1 anonymousClass1 = storyAlbumDataStoryAlbums_getByAlbumId.adapter;
                            if (anonymousClass1 != null && anonymousClass1.inAlbumStoriesReorder) {
                                anonymousClass1.inAlbumStoriesReorder = false;
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
