package org.telegram.ui.Stars;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ChatActivity$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.DialogsActivity$$ExternalSyntheticLambda157;
import org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.LivePlayer;
import org.telegram.ui.Stories.recorder.PreviewView$$ExternalSyntheticLambda12;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.Stories.recorder.StoryRecorder;

public final class StarsController$$ExternalSyntheticLambda10 implements Runnable {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final Object f$1;
    public final TLObject f$2;
    public final boolean f$3;
    public final boolean f$4;
    public final long f$5;
    public final TLObject f$6;
    public final Object f$7;

    public StarsController$$ExternalSyntheticLambda10(StarsController starsController, boolean[] zArr, TL_stars.StarGift starGift, boolean z, boolean z2, long j, TLRPC.TL_textWithEntities tL_textWithEntities, SendGiftSheet$$ExternalSyntheticLambda0 sendGiftSheet$$ExternalSyntheticLambda0) {
        this.f$0 = starsController;
        this.f$1 = zArr;
        this.f$2 = starGift;
        this.f$3 = z;
        this.f$4 = z2;
        this.f$5 = j;
        this.f$6 = tL_textWithEntities;
        this.f$7 = sendGiftSheet$$ExternalSyntheticLambda0;
    }

    @Override
    public final void run() {
        LivePlayer livePlayer;
        int i;
        ?? r12;
        ?? r15;
        Object obj = this.f$7;
        TLObject tLObject = this.f$6;
        TLObject tLObject2 = this.f$2;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                StarsController starsController = (StarsController) obj3;
                starsController.getClass();
                ((boolean[]) obj2)[0] = true;
                starsController.buyStarGift((SendGiftSheet$$ExternalSyntheticLambda0) obj, (TL_stars.StarGift) tLObject2, this.f$3, this.f$4, this.f$5, (TLRPC.TL_textWithEntities) tLObject);
                break;
            default:
                StoryRecorder storyRecorder = (StoryRecorder) obj3;
                storyRecorder.getClass();
                TLObject tLObject3 = (TLObject) obj2;
                LivePlayer livePlayer2 = null;
                if (!(tLObject3 instanceof TLRPC.Updates)) {
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) tLObject;
                    if (tL_error != null) {
                        boolean zStartsWith = tL_error.text.startsWith("STORY_LIVE_ALREADY_");
                        DarkThemeResourceProvider darkThemeResourceProvider = storyRecorder.resourcesProvider;
                        if (!zStartsWith) {
                            StoryPrivacyBottomSheet storyPrivacyBottomSheet = storyRecorder.privacySheet;
                            if (storyPrivacyBottomSheet != null) {
                                BulletinFactory.of(storyPrivacyBottomSheet.container, darkThemeResourceProvider).showForError(tL_error, true);
                                ((PreviewView$$ExternalSyntheticLambda12) obj).run();
                            }
                        } else {
                            ChatActivity$$ExternalSyntheticOutline0.m(R.string.OK, new AlertDialog.Builder(storyRecorder.activity, 0, darkThemeResourceProvider).setTitle(LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle)).setMessage(LocaleController.getString(R.string.LiveStoryAlreadyStreaming)), null);
                        }
                    }
                } else {
                    int i2 = storyRecorder.currentAccount;
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    MessagesController.getInstance(i2).processUpdates(updates, false);
                    StoryRecorder.AnonymousClass25 anonymousClass25 = storyRecorder.cameraView;
                    if (anonymousClass25 != null) {
                        anonymousClass25.destroy(true, null);
                    }
                    ArrayList arrayListFindUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateStoryID.class);
                    int size = arrayListFindUpdates.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            Object obj4 = arrayListFindUpdates.get(i3);
                            int i4 = i3 + 1;
                            TL_update.TL_updateStoryID tL_updateStoryID = (TL_update.TL_updateStoryID) obj4;
                            livePlayer = livePlayer2;
                            if (tL_updateStoryID.random_id == ((TL_stories.TL_startLive) tLObject2).random_id) {
                                i = tL_updateStoryID.id;
                            } else {
                                livePlayer2 = livePlayer;
                                i3 = i4;
                            }
                        } else {
                            livePlayer = livePlayer2;
                            i = -1;
                        }
                    }
                    ArrayList arrayListFindUpdates2 = MessagesController.findUpdates(updates, TL_stories.TL_updateStory.class);
                    int size2 = arrayListFindUpdates2.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 < size2) {
                            Object obj5 = arrayListFindUpdates2.get(i5);
                            i5++;
                            TL_stories.StoryItem storyItem = ((TL_stories.TL_updateStory) obj5).story;
                            if (storyItem != null && (storyItem.id == i || i == -1)) {
                                r12 = storyItem;
                            }
                        } else {
                            r12 = livePlayer;
                        }
                    }
                    if (r12 != 0) {
                        TLRPC.MessageMedia messageMedia = r12.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                            r15 = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        } else {
                            r15 = livePlayer;
                        }
                    } else {
                        r15 = livePlayer;
                    }
                    if (r15 != 0) {
                        LivePlayer livePlayer3 = LivePlayer.recording;
                        if (livePlayer3 != null) {
                            livePlayer3.destroy();
                            if (LivePlayer.recording != null) {
                                LivePlayer.recording = livePlayer;
                                NotificationCenter.getInstance(i2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(LivePlayer.recording.getCallId()));
                            }
                        }
                        AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda157(storyRecorder, this.f$3, (TL_stories.StoryItem) r12, this.f$5, (TLRPC.InputGroupCall) r15, this.f$4), 100L);
                    }
                }
                break;
        }
    }

    public StarsController$$ExternalSyntheticLambda10(StoryRecorder storyRecorder, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z, long j, boolean z2, TLRPC.TL_error tL_error, PreviewView$$ExternalSyntheticLambda12 previewView$$ExternalSyntheticLambda12) {
        this.f$0 = storyRecorder;
        this.f$1 = tLObject;
        this.f$2 = tL_startLive;
        this.f$3 = z;
        this.f$5 = j;
        this.f$4 = z2;
        this.f$6 = tL_error;
        this.f$7 = previewView$$ExternalSyntheticLambda12;
    }
}
