package org.telegram.ui.Stories;

import android.view.KeyEvent;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.Premium.boosts.ReassignBoostBottomSheet;
import org.telegram.ui.LaunchActivity;

public final class PeerStoriesView$5$$ExternalSyntheticLambda3 implements Consumer {
    public final int $r8$classId;
    public final KeyEvent.Callback f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public PeerStoriesView$5$$ExternalSyntheticLambda3(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = callback;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
    }

    @Override
    public final void accept(Object obj) {
        Object obj2 = this.f$1;
        Object obj3 = this.f$3;
        Object obj4 = this.f$2;
        KeyEvent.Callback callback = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                PeerStoriesView.AnonymousClass5 anonymousClass5 = (PeerStoriesView.AnonymousClass5) callback;
                if (storyItem == null) {
                    Bulletin bulletinCreateSimpleBulletinWithIconSize = new BulletinFactory(anonymousClass5.this$0.storyContainer, (DarkThemeResourceProvider) obj3).createSimpleBulletinWithIconSize(R.raw.story_bomb2, 36, LocaleController.getString(R.string.StoryNotFound));
                    bulletinCreateSimpleBulletinWithIconSize.tag = 3;
                    bulletinCreateSimpleBulletinWithIconSize.show(true);
                    break;
                } else {
                    anonymousClass5.getClass();
                    BaseFragment lastFragment = LaunchActivity.getLastFragment();
                    if (lastFragment != null) {
                        storyItem.dialogId = ((StoryCaptionView.Panel) obj2).peerId.longValue();
                        StoryViewer storyViewerCreateOverlayStoryViewer = lastFragment.createOverlayStoryViewer();
                        storyViewerCreateOverlayStoryViewer.open(UserConfig.selectedAccount, anonymousClass5.getContext(), storyItem, (StoriesListPlaceProvider) null);
                        StoryViewer storyViewer = (StoryViewer) obj4;
                        storyViewerCreateOverlayStoryViewer.onCloseListener = new StoryViewer$$ExternalSyntheticLambda2(storyViewer, 1);
                        storyViewer.updatePlayingMode();
                        break;
                    }
                }
                break;
            default:
                ((ReassignBoostBottomSheet) callback).lambda$showGiftOfferSheet$15();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostedChannelByUser, (TL_stories.TL_premium_myBoosts) obj2, Integer.valueOf(((ArrayList) obj4).size()), Integer.valueOf(((HashSet) obj3).size()), (TL_stories.TL_premium_boostsStatus) obj);
                break;
        }
    }
}
