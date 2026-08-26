package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Stories.LivePlayer;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoriesViewPager;

public final class ChatListCell$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;

    public ChatListCell$$ExternalSyntheticLambda0(Object obj, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ((ChatListCell) this.f$0).lambda$new$0(this.f$1, view);
                break;
            case 1:
                ((ActionBarMenuItem) this.f$0).lambda$addSubItem$5(this.f$1, view);
                break;
            case 2:
                boolean z = this.f$1;
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = (StoriesViewPager.AnonymousClass2.AnonymousClass1) this.f$0;
                MessagesController.getInstance(anonymousClass1.currentAccount).setStoryQuality(!z);
                BulletinFactory.of(anonymousClass1.storyContainer, anonymousClass1.resourcesProvider).createSimpleBulletin(R.raw.chats_infotip, LocaleController.getString(!z ? R.string.StoryQualityIncreasedTitle : R.string.StoryQualityDecreasedTitle), LocaleController.getString(!z ? R.string.StoryQualityIncreasedMessage : R.string.StoryQualityDecreasedMessage)).show();
                PeerStoriesView.AnonymousClass8 anonymousClass8 = anonymousClass1.popupMenu;
                if (anonymousClass8 != null) {
                    anonymousClass8.dismiss();
                }
                break;
            default:
                LivePlayer livePlayer = LivePlayer.recording;
                PeerStoriesView.AnonymousClass8 anonymousClass9 = (PeerStoriesView.AnonymousClass8) this.f$0;
                if (livePlayer != null) {
                    boolean z2 = !this.f$1;
                    if (livePlayer.outgoing && livePlayer.isMuted != z2) {
                        livePlayer.isMuted = z2;
                        NativeInstance nativeInstance = livePlayer.instance;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z2);
                        }
                    }
                }
                PeerStoriesView.AnonymousClass8 anonymousClass10 = anonymousClass9.this$0.popupMenu;
                if (anonymousClass10 != null) {
                    anonymousClass10.dismiss();
                }
                break;
        }
    }
}
