package org.telegram.ui.Stories.recorder;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda54;
import org.telegram.ui.Stories.StoriesController;

public final class StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda6 implements Utilities.Callback {
    public final int $r8$classId;
    public final StoryPrivacyBottomSheet.Page f$0;

    public StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda6(StoryPrivacyBottomSheet.Page page, int i) {
        this.$r8$classId = i;
        this.f$0 = page;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                String str = (String) obj;
                StoryPrivacyBottomSheet.Page page = this.f$0;
                if (str != null) {
                    page.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                page.query = str;
                page.updateItems(false, true);
                break;
            case 1:
                StoryPrivacyBottomSheet.Page page2 = this.f$0;
                StoryPrivacyBottomSheet storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
                storyPrivacyBottomSheet.selectedPeer = (TLRPC.InputPeer) obj;
                HashSet hashSet = storyPrivacyBottomSheet.selectedAlbums;
                hashSet.clear();
                if (storyPrivacyBottomSheet.isLive && storyPrivacyBottomSheet.isRtmpStream) {
                    storyPrivacyBottomSheet.isRtmpStream = false;
                }
                Utilities.Callback callback = storyPrivacyBottomSheet.onSelectedPeer;
                if (callback != null) {
                    callback.run(storyPrivacyBottomSheet.selectedPeer);
                }
                StoryRecorder$$ExternalSyntheticLambda19 storyRecorder$$ExternalSyntheticLambda19 = storyPrivacyBottomSheet.onSelectedAlbums;
                if (storyRecorder$$ExternalSyntheticLambda19 != null) {
                    storyRecorder$$ExternalSyntheticLambda19.run(new HashSet(hashSet));
                }
                page2.updateItems(true, true);
                break;
            case 2:
                StoryPrivacyBottomSheet storyPrivacyBottomSheet2 = StoryPrivacyBottomSheet.this;
                storyPrivacyBottomSheet2.done(new StoryPrivacyBottomSheet.StoryPrivacy(5, ((BottomSheet) storyPrivacyBottomSheet2).currentAccount, (ArrayList) obj), new PeerStoriesView$8$$ExternalSyntheticLambda54(storyPrivacyBottomSheet2, 1), false);
                break;
            default:
                StoryPrivacyBottomSheet.Page page3 = this.f$0;
                StoryPrivacyBottomSheet storyPrivacyBottomSheet3 = StoryPrivacyBottomSheet.this;
                storyPrivacyBottomSheet3.selectedAlbums.add(Integer.valueOf(((StoriesController.StoryAlbum) obj).album_id));
                page3.updateItems(true, true);
                StoryRecorder$$ExternalSyntheticLambda19 storyRecorder$$ExternalSyntheticLambda110 = storyPrivacyBottomSheet3.onSelectedAlbums;
                if (storyRecorder$$ExternalSyntheticLambda110 != null) {
                    storyRecorder$$ExternalSyntheticLambda110.run(new HashSet(storyPrivacyBottomSheet3.selectedAlbums));
                }
                break;
        }
    }
}
