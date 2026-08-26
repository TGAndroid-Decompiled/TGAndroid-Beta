package org.telegram.ui.Gifts;

import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.core.view.DifferentialMotionFlingController$$ExternalSyntheticLambda0;
import com.google.android.exoplayer2.ExoPlayerImpl;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.cast.zzw;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.EmojiThemes$$ExternalSyntheticLambda3;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesStorage;
import org.telegram.ui.Stories.StoriesStorage$$ExternalSyntheticLambda2;
import org.telegram.ui.Stories.StoriesUtilities;
import org.telegram.ui.Stories.recorder.DraftsController;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;

public final class GiftSheet$$ExternalSyntheticLambda17 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final long f$2;

    public GiftSheet$$ExternalSyntheticLambda17(Object obj, long j, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = j;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        boolean z;
        Object obj = this.f$1;
        long j = this.f$2;
        Object obj2 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                GiftSheet giftSheet = (GiftSheet) obj2;
                giftSheet.getClass();
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    giftSheet.lambda$showGiftOfferSheet$15();
                    Utilities.Callback callback = (Utilities.Callback) obj;
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", j);
                    bundle.putBoolean("open_gifts", true);
                    safeLastFragment.presentFragment(new ProfileActivity(bundle));
                    break;
                }
                break;
            case 1:
                zzw zzwVar = (zzw) obj2;
                zzwVar.getClass();
                int i = Util.SDK_INT;
                ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
                DefaultAnalyticsCollector defaultAnalyticsCollector = exoPlayerImpl.analyticsCollector;
                AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = defaultAnalyticsCollector.generateReadingMediaPeriodEventTime();
                defaultAnalyticsCollector.sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 26, new EmojiThemes$$ExternalSyntheticLambda3(eventTimeGenerateReadingMediaPeriodEventTime, obj, j));
                if (exoPlayerImpl.videoOutput == obj) {
                    DifferentialMotionFlingController$$ExternalSyntheticLambda0 differentialMotionFlingController$$ExternalSyntheticLambda0 = new DifferentialMotionFlingController$$ExternalSyntheticLambda0(7);
                    ListenerSet listenerSet = exoPlayerImpl.listeners;
                    listenerSet.queueEvent(26, differentialMotionFlingController$$ExternalSyntheticLambda0);
                    listenerSet.flushEvents();
                }
                break;
            case 2:
                ((VideoFramesRewinder) obj2).lambda$new$1((ArrayList) obj, j);
                break;
            case 3:
                ((NativeInstance) obj2).lambda$onParticipantDescriptionsRequired$2(j, (int[]) obj);
                break;
            case 4:
                ((VideoCapturerDevice) obj2).lambda$init$5(j, (String) obj);
                break;
            case 5:
                ((VideoCapturerDevice) obj2).lambda$init$2(j, (Point) obj);
                break;
            case 6:
                StarGiftSheet starGiftSheet = (StarGiftSheet) obj2;
                starGiftSheet.showTimeoutAlert(starGiftSheet.getContext(), (int) j, true);
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 7:
                StarGiftSheet starGiftSheet2 = (StarGiftSheet) obj2;
                starGiftSheet2.getClass();
                ((Browser.Progress) obj).end();
                starGiftSheet2.showTimeoutAlert(starGiftSheet2.getContext(), (int) j, true);
                break;
            case 8:
                BottomSheet bottomSheet = ((BottomSheet[]) obj2)[0];
                if (bottomSheet != null) {
                    bottomSheet.lambda$showGiftOfferSheet$15();
                }
                BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment2 != null) {
                    safeLastFragment2.presentFragment(ChatActivity.of(j, ((TL_stories.Boost) obj).giveaway_msg_id));
                    break;
                }
                break;
            case 9:
                BulletinFactory.of((ChatActivity) obj2).createSimpleBulletin(R.raw.stars_send, LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j, ((TLRPC.Chat) obj).title))).show(true);
                break;
            case 10:
                ((DialogStoriesCell) obj2).lambda$openStoryForCell$5((DialogStoriesCell.StoryCell) obj, j);
                break;
            case 11:
                StoriesController storiesController = (StoriesController) obj2;
                storiesController.allStoriesLoading.remove(Long.valueOf(j));
                TLObject tLObject = (TLObject) obj;
                if (tLObject != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    int i2 = storiesController.currentAccount;
                    MessagesController.getInstance(i2).putUsers(tL_stories_peerStories.users, false);
                    TLRPC.User user = MessagesController.getInstance(i2).getUser(Long.valueOf(j));
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    storiesController.allStoriesMap.put(peerStories, DialogObject.getPeerDialogId(peerStories.peer));
                    if (user != null && (storiesController.isContactOrService(user) || user.self)) {
                        storiesController.applyToList(peerStories);
                        StoriesStorage storiesStorage = storiesController.storiesStorage;
                        storiesStorage.storage.getStorageQueue().postRunnable(new StoriesStorage$$ExternalSyntheticLambda2(storiesStorage, peerStories, 0));
                    }
                    StringBuilder sbM = AacUtil.m(j, "StoriesController processAllStoriesResponse dialogId=", " overwrite stories ");
                    sbM.append(tL_stories_peerStories.stories.stories.size());
                    FileLog.d(sbM.toString());
                    NotificationCenter.getInstance(i2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    break;
                }
                break;
            case 12:
                StoriesController.UploadingStory uploadingStory = (StoriesController.UploadingStory) obj2;
                uploadingStory.entryDestroyed = true;
                StoryEntry storyEntry = uploadingStory.entry;
                boolean z2 = storyEntry.isError;
                StoriesController storiesController2 = StoriesController.this;
                DraftsController draftsController = storiesController2.draftsController;
                if (z2) {
                    draftsController.getClass();
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(storyEntry);
                    draftsController.delete(arrayList);
                }
                storyEntry.isError = false;
                storyEntry.error = null;
                if (storyEntry.isEditingCover) {
                    z = false;
                } else {
                    draftsController.getClass();
                    if (storyEntry.isRepostMessage) {
                        z = false;
                    } else {
                        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                        if (storyItem.media == null) {
                            z = false;
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = draftsController.drafts;
                            int size = arrayList3.size();
                            int i3 = 0;
                            while (i3 < size) {
                                Object obj3 = arrayList3.get(i3);
                                i3++;
                                StoryEntry storyEntry2 = (StoryEntry) obj3;
                                if (storyEntry2.isEdit && storyEntry2.editStoryId == storyItem.id) {
                                    arrayList2.add(storyEntry2);
                                }
                            }
                            draftsController.delete(arrayList2);
                            draftsController.prepare(storyEntry);
                            storyEntry.draftId = Utilities.random.nextLong();
                            DraftsController.StoryDraft storyDraft = new DraftsController.StoryDraft(storyEntry);
                            storyEntry.isEdit = true;
                            storyDraft.isEdit = true;
                            storyEntry.editStoryPeerId = j;
                            storyDraft.editStoryPeerId = j;
                            int i4 = storyItem.id;
                            storyEntry.editStoryId = i4;
                            storyDraft.editStoryId = i4;
                            long j2 = ((long) storyItem.expire_date) * 1000;
                            storyEntry.editExpireDate = j2;
                            storyDraft.editExpireDate = j2;
                            TLRPC.MessageMedia messageMedia = storyItem.media;
                            TLRPC.Document document = messageMedia.document;
                            if (document != null) {
                                long j3 = document.id;
                                storyEntry.editDocumentId = j3;
                                storyDraft.editDocumentId = j3;
                            } else {
                                TLRPC.Photo photo = messageMedia.photo;
                                if (photo != null) {
                                    long j4 = photo.id;
                                    storyEntry.editPhotoId = j4;
                                    storyDraft.editPhotoId = j4;
                                }
                            }
                            arrayList3.remove(storyEntry);
                            z = false;
                            arrayList3.add(0, storyEntry);
                            draftsController.append(storyDraft);
                        }
                    }
                }
                if (!uploadingStory.edit) {
                    storiesController2.storyLimitFetched = z;
                    storiesController2.storyLimitCached = null;
                }
                break;
            case 13:
                ArrayList arrayList4 = (ArrayList) obj;
                MessagesStorage messagesStorage = ((StoriesStorage) obj2).storage;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    String strJoin = TextUtils.join(", ", arrayList4);
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + j + " AND story_id IN (" + strJoin + ")").stepThis().dispose();
                } catch (Throwable th) {
                    messagesStorage.checkSQLException(th);
                    return;
                }
                break;
            case 14:
                ((StoriesStorage) obj2).updateStoryItemInternal(j, (TL_stories.StoryItem) obj);
                break;
            case 15:
                StoriesUtilities.UserStoriesLoadOperation userStoriesLoadOperation = (StoriesUtilities.UserStoriesLoadOperation) obj2;
                userStoriesLoadOperation.getClass();
                ((View) obj).invalidate();
                MessagesController.getInstance(userStoriesLoadOperation.currentAccount).getStoriesController().setLoading(j, false);
                break;
            case 16:
                StoryPrivacyBottomSheet.Page page = (StoryPrivacyBottomSheet.Page) obj2;
                page.getClass();
                page.selectChat(j, ((TLRPC.ChatFull) obj).participants);
                break;
            default:
                ((long[]) obj2)[0] = j;
                ((GiftSheet$$ExternalSyntheticLambda15) obj).run();
                break;
        }
    }

    public GiftSheet$$ExternalSyntheticLambda17(Object obj, Object obj2, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = j;
    }
}
