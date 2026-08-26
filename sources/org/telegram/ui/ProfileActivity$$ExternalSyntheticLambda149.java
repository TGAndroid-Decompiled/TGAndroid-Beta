package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject$Call$$ExternalSyntheticOutline0;
import org.telegram.messenger.Emoji$EmojiSpan$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ButtonSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.TranslateAlert2;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda29;
import org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda50;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesController$StoriesList$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.StoriesViewPager;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.DraftsController;
import org.telegram.ui.Stories.recorder.PreviewView;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.Stories.recorder.StoryRecorder$$ExternalSyntheticLambda7;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.bots.BotVerifySheet$$ExternalSyntheticLambda1;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment;
import org.telegram.ui.web.WebActionBar$$ExternalSyntheticLambda9;

public final class ProfileActivity$$ExternalSyntheticLambda149 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public ProfileActivity$$ExternalSyntheticLambda149(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    private final void run$org$telegram$ui$Stories$recorder$StoryEntry$$ExternalSyntheticLambda9() {
        int i;
        float f;
        long j;
        int i2;
        long j2;
        long j3;
        ArrayList arrayList;
        StoryEntry storyEntry = (StoryEntry) this.f$0;
        storyEntry.getClass();
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.isStory = true;
        videoEditedInfo.fromCamera = storyEntry.fromCamera;
        videoEditedInfo.originalWidth = storyEntry.width;
        videoEditedInfo.originalHeight = storyEntry.height;
        videoEditedInfo.resultWidth = storyEntry.resultWidth;
        videoEditedInfo.resultHeight = storyEntry.resultHeight;
        File file = storyEntry.paintFile;
        videoEditedInfo.paintPath = file == null ? null : file.getPath();
        File file2 = storyEntry.messageFile;
        videoEditedInfo.messagePath = file2 == null ? null : file2.getPath();
        File file3 = storyEntry.messageVideoMaskFile;
        videoEditedInfo.messageVideoMaskPath = file3 == null ? null : file3.getPath();
        File file4 = storyEntry.backgroundFile;
        videoEditedInfo.backgroundPath = file4 == null ? null : file4.getPath();
        int iExtractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(videoEditedInfo.resultWidth, videoEditedInfo.resultHeight, videoEditedInfo.bitrate, true);
        boolean z = storyEntry.isVideo;
        int[][] iArr = (int[][]) this.f$1;
        String str = (String) this.f$2;
        if (!z || str == null || storyEntry.isCollage()) {
            File file5 = storyEntry.filterFile;
            if (file5 != null) {
                videoEditedInfo.originalPath = file5.getAbsolutePath();
            } else {
                videoEditedInfo.originalPath = str;
            }
            videoEditedInfo.isPhoto = true;
            videoEditedInfo.collage = storyEntry.collage;
            if (storyEntry.isCollage()) {
                int i3 = 0;
                boolean z2 = false;
                while (i3 < storyEntry.collageContent.size()) {
                    StoryEntry storyEntry2 = (StoryEntry) storyEntry.collageContent.get(i3);
                    if (storyEntry2.isVideo) {
                        storyEntry2.width = Math.max(storyEntry2.width, iArr[i3][1]);
                        storyEntry2.height = Math.max(storyEntry2.height, iArr[i3][2]);
                        int i4 = i3;
                        i2 = i4;
                        storyEntry2.duration = Math.max(storyEntry2.duration, iArr[i4][4]);
                        z2 = true;
                    } else {
                        i2 = i3;
                    }
                    i3 = i2 + 1;
                }
                ArrayList<VideoEditedInfo.Part> parts = VideoEditedInfo.Part.toParts(storyEntry);
                videoEditedInfo.collageParts = parts;
                if (z2) {
                    int size = parts.size();
                    long j4 = 0;
                    int i5 = 0;
                    VideoEditedInfo.Part part = null;
                    while (i5 < size) {
                        VideoEditedInfo.Part part2 = parts.get(i5);
                        i5++;
                        VideoEditedInfo.Part part3 = part2;
                        int i6 = iExtractRealEncoderBitrate;
                        if (part3.isVideo) {
                            long j5 = part3.duration;
                            if (j5 > j4) {
                                j4 = j5;
                                part = part3;
                            }
                        }
                        iExtractRealEncoderBitrate = i6;
                    }
                    i = iExtractRealEncoderBitrate;
                    f = 8.0f;
                    if (part != null) {
                        float f2 = part.duration;
                        float f3 = part.right;
                        float f4 = part.left;
                        long j6 = (long) ((f3 - f4) * f2);
                        storyEntry.duration = j6;
                        videoEditedInfo.originalDuration = j6;
                        videoEditedInfo.estimatedDuration = j6;
                        j = -(part.offset + ((long) (f4 * f2)));
                        part.offset = j;
                        ArrayList<VideoEditedInfo.Part> arrayList2 = videoEditedInfo.collageParts;
                        int size2 = arrayList2.size();
                        int i7 = 0;
                        while (i7 < size2) {
                            VideoEditedInfo.Part part4 = arrayList2.get(i7);
                            i7++;
                            VideoEditedInfo.Part part5 = part4;
                            if (part5.isVideo && part5 != part) {
                                part5.offset += j;
                            }
                        }
                    }
                    videoEditedInfo.startTime = -1L;
                    videoEditedInfo.endTime = -1L;
                    videoEditedInfo.muted = true;
                    videoEditedInfo.originalBitrate = -1;
                    videoEditedInfo.volume = 1.0f;
                    videoEditedInfo.bitrate = -1;
                    videoEditedInfo.framerate = 30;
                    videoEditedInfo.estimatedSize = (long) (((storyEntry.duration / 1000.0f) * i) / f);
                    videoEditedInfo.filterState = null;
                } else {
                    long j7 = storyEntry.averageDuration;
                    storyEntry.duration = j7;
                    videoEditedInfo.originalDuration = j7;
                    videoEditedInfo.estimatedDuration = j7;
                    i = iExtractRealEncoderBitrate;
                    f = 8.0f;
                }
            } else {
                i = iExtractRealEncoderBitrate;
                f = 8.0f;
                if (storyEntry.round != null) {
                    long j8 = (long) ((storyEntry.roundRight - storyEntry.roundLeft) * storyEntry.roundDuration);
                    storyEntry.duration = j8;
                    videoEditedInfo.originalDuration = j8;
                    videoEditedInfo.estimatedDuration = j8;
                } else if (storyEntry.audioPath != null) {
                    long j9 = (long) ((storyEntry.audioRight - storyEntry.audioLeft) * storyEntry.audioDuration);
                    storyEntry.duration = j9;
                    videoEditedInfo.originalDuration = j9;
                    videoEditedInfo.estimatedDuration = j9;
                } else {
                    long j10 = storyEntry.averageDuration;
                    storyEntry.duration = j10;
                    videoEditedInfo.originalDuration = j10;
                    videoEditedInfo.estimatedDuration = j10;
                }
            }
            j = 0;
            videoEditedInfo.startTime = -1L;
            videoEditedInfo.endTime = -1L;
            videoEditedInfo.muted = true;
            videoEditedInfo.originalBitrate = -1;
            videoEditedInfo.volume = 1.0f;
            videoEditedInfo.bitrate = -1;
            videoEditedInfo.framerate = 30;
            videoEditedInfo.estimatedSize = (long) (((storyEntry.duration / 1000.0f) * i) / f);
            videoEditedInfo.filterState = null;
        } else {
            videoEditedInfo.originalPath = str;
            videoEditedInfo.isPhoto = false;
            videoEditedInfo.framerate = Math.min(59, iArr[0][7]);
            int videoBitrate = MediaController.getVideoBitrate(str);
            if (videoBitrate == -1) {
                videoBitrate = iArr[0][3];
            }
            videoEditedInfo.originalBitrate = videoBitrate;
            if (videoBitrate >= 1000000 || (arrayList = storyEntry.mediaEntities) == null || arrayList.isEmpty()) {
                int i8 = videoEditedInfo.originalBitrate;
                if (i8 < 500000) {
                    videoEditedInfo.bitrate = 2500000;
                    videoEditedInfo.originalBitrate = -1;
                } else {
                    videoEditedInfo.bitrate = Utilities.clamp(i8, 3000000, 500000);
                }
            } else {
                videoEditedInfo.bitrate = 2000000;
                videoEditedInfo.originalBitrate = -1;
            }
            StringBuilder sb = new StringBuilder("story bitrate, original = ");
            sb.append(videoEditedInfo.originalBitrate);
            sb.append(" => ");
            ChatObject$Call$$ExternalSyntheticOutline0.m(sb, videoEditedInfo.bitrate);
            int[] iArr2 = iArr[0];
            int i9 = iArr2[4];
            long j11 = i9;
            storyEntry.duration = j11;
            videoEditedInfo.originalDuration = j11 * 1000;
            float f5 = j11;
            long j12 = ((long) (storyEntry.left * f5)) * 1000;
            videoEditedInfo.startTime = j12;
            long j13 = ((long) (storyEntry.right * f5)) * 1000;
            videoEditedInfo.endTime = j13;
            videoEditedInfo.estimatedDuration = j13 - j12;
            videoEditedInfo.volume = storyEntry.videoVolume;
            videoEditedInfo.muted = storyEntry.muted;
            videoEditedInfo.estimatedSize = (long) Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(i9 / 1000.0f, iExtractRealEncoderBitrate, 8.0f, iArr2[5]);
            videoEditedInfo.estimatedSize = Math.max(storyEntry.file.length(), videoEditedInfo.estimatedSize);
            videoEditedInfo.filterState = storyEntry.filterState;
            File file6 = storyEntry.paintBlurFile;
            videoEditedInfo.blurPath = file6 == null ? null : file6.getPath();
            j = 0;
        }
        videoEditedInfo.account = storyEntry.currentAccount;
        videoEditedInfo.wallpaperPeerId = storyEntry.backgroundWallpaperPeerId;
        videoEditedInfo.isDark = storyEntry.isDark;
        videoEditedInfo.avatarStartTime = -1L;
        MediaController.CropState cropState = storyEntry.crop;
        if (cropState != null) {
            videoEditedInfo.cropState = cropState.clone();
        } else {
            videoEditedInfo.cropState = new MediaController.CropState();
        }
        videoEditedInfo.cropState.useMatrix = new Matrix();
        videoEditedInfo.cropState.useMatrix.set(storyEntry.matrix);
        videoEditedInfo.mediaEntities = storyEntry.mediaEntities;
        videoEditedInfo.gradientTopColor = Integer.valueOf(storyEntry.gradientTopColor);
        videoEditedInfo.gradientBottomColor = Integer.valueOf(storyEntry.gradientBottomColor);
        videoEditedInfo.forceFragmenting = true;
        videoEditedInfo.hdrInfo = storyEntry.hdrInfo;
        videoEditedInfo.mixedSoundInfos.clear();
        if (storyEntry.isCollage() && !storyEntry.muted) {
            ArrayList<VideoEditedInfo.Part> arrayList3 = videoEditedInfo.collageParts;
            int size3 = arrayList3.size();
            int i10 = 0;
            while (i10 < size3) {
                VideoEditedInfo.Part part6 = arrayList3.get(i10);
                i10++;
                VideoEditedInfo.Part part7 = part6;
                if (part7.isVideo && part7.volume > 0.0f && !part7.muted) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo = new MediaCodecVideoConvertor.MixedSoundInfo(part7.path);
                    mixedSoundInfo.volume = part7.volume;
                    float f6 = part7.left;
                    float f7 = part7.duration;
                    mixedSoundInfo.audioOffset = ((long) (f6 * f7)) * 1000;
                    mixedSoundInfo.startTime = part7.offset * 1000;
                    mixedSoundInfo.duration = ((long) ((part7.right - f6) * f7)) * 1000;
                    videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo);
                }
            }
        }
        File file7 = storyEntry.round;
        if (file7 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file7.getAbsolutePath());
            mixedSoundInfo2.volume = storyEntry.roundVolume;
            float f8 = storyEntry.roundLeft;
            float f9 = storyEntry.roundDuration;
            long j14 = ((long) (f8 * f9)) * 1000;
            mixedSoundInfo2.audioOffset = j14;
            if (storyEntry.isVideo) {
                mixedSoundInfo2.startTime = ((long) (storyEntry.roundOffset - (storyEntry.left * storyEntry.duration))) * 1000;
                j3 = 0;
            } else {
                j3 = 0;
                mixedSoundInfo2.startTime = 0L;
            }
            long j15 = mixedSoundInfo2.startTime + j;
            mixedSoundInfo2.startTime = j15;
            if (j15 < j3) {
                mixedSoundInfo2.audioOffset = j14 - j15;
                mixedSoundInfo2.startTime = j3;
            }
            mixedSoundInfo2.duration = ((long) ((storyEntry.roundRight - f8) * f9)) * 1000;
            videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo2);
        }
        String str2 = storyEntry.audioPath;
        if (str2 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str2);
            mixedSoundInfo3.volume = storyEntry.audioVolume;
            float f10 = storyEntry.audioLeft;
            float f11 = storyEntry.audioDuration;
            long j16 = ((long) (f10 * f11)) * 1000;
            mixedSoundInfo3.audioOffset = j16;
            if (storyEntry.isVideo) {
                mixedSoundInfo3.startTime = ((long) (storyEntry.audioOffset - (storyEntry.left * storyEntry.duration))) * 1000;
                j2 = 0;
            } else {
                j2 = 0;
                mixedSoundInfo3.startTime = 0L;
            }
            long j17 = mixedSoundInfo3.startTime + j;
            mixedSoundInfo3.startTime = j17;
            if (j17 < j2) {
                mixedSoundInfo3.audioOffset = j16 - j17;
                mixedSoundInfo3.startTime = j2;
            }
            mixedSoundInfo3.duration = ((long) ((storyEntry.audioRight - f10) * f11)) * 1000;
            videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo3);
        }
        ((Utilities.Callback) this.f$3).run(videoEditedInfo);
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        int iIndexOf;
        int i;
        StoryEntry storyEntryFromStoryItem;
        File file;
        ArrayList arrayList2;
        TL_stories.StoryItem storyItem;
        TLRPC.Photo photo;
        StoryViewer.VideoPlayerHolder videoPlayerHolder;
        char c;
        BaseFragment safeLastFragment;
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast;
        SQLitePreparedStatement sQLitePreparedStatement;
        BlurringShader.BlurManager blurManager;
        int i2 = 1;
        switch (this.$r8$classId) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) this.f$0;
                if (AndroidUtilities.isContextSafe(profileActivity.getParentActivity())) {
                    TranslateAlert2.showAlert(profileActivity.getParentActivity(), profileActivity, ((String[]) this.f$1)[0], (String) this.f$2, (String) this.f$3, new WebActionBar$$ExternalSyntheticLambda9(profileActivity, 9), null);
                    return;
                }
                return;
            case 1:
                ((ProfileActivity) this.f$0).lambda$didUploadPhoto$111((String) this.f$2, (TLObject) this.f$3, (TLRPC.TL_error) this.f$1);
                return;
            case 2:
                ProfileActivity profileActivity2 = ProfileActivity.this;
                profileActivity2.avatarsViewPager.settingMainPhoto--;
                TLObject tLObject = (TLObject) this.f$1;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    profileActivity2.getMessagesController().putUsers(tL_photos_photo.users, false);
                    MessagesController messagesController = profileActivity2.getMessagesController();
                    UserConfig userConfig = (UserConfig) this.f$2;
                    TLRPC.User user = messagesController.getUser(Long.valueOf(userConfig.clientUserId));
                    TLRPC.Photo photo2 = tL_photos_photo.photo;
                    if (photo2 instanceof TLRPC.TL_photo) {
                        ProfileActivity.AnonymousClass23 anonymousClass23 = profileActivity2.avatarsViewPager;
                        if (!anonymousClass23.photos.isEmpty() && (iIndexOf = (arrayList = anonymousClass23.photos).indexOf((TLRPC.Photo) this.f$3)) >= 0) {
                            arrayList.set(iIndexOf, photo2);
                        }
                        if (user != null) {
                            user.photo.photo_id = tL_photos_photo.photo.id;
                            userConfig.setCurrentUser(user);
                            userConfig.saveConfig(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ProfileActivity.ListAdapter listAdapter = ProfileActivity.ListAdapter.this;
                ProfileActivity.this.setLoadingSpan(null);
                TLObject tLObject2 = (TLObject) this.f$1;
                if (!(tLObject2 instanceof TL_fragment.TL_collectibleInfo)) {
                    BulletinFactory.showError((TLRPC.TL_error) this.f$3);
                    return;
                }
                ProfileActivity profileActivity3 = ProfileActivity.this;
                TLObject user2 = profileActivity3.userId != 0 ? profileActivity3.getMessagesController().getUser(Long.valueOf(profileActivity3.userId)) : profileActivity3.getMessagesController().getChat(Long.valueOf(profileActivity3.chatId));
                if (profileActivity3.getParentActivity() == null) {
                    return;
                }
                FragmentUsernameBottomSheet.open(profileActivity3.getParentActivity(), 0, ((TLRPC.TL_username) this.f$2).username, user2, (TL_fragment.TL_collectibleInfo) tLObject2, profileActivity3.resourcesProvider);
                return;
            case 4:
                AlertDialog alertDialog = (AlertDialog) this.f$1;
                SessionsActivity sessionsActivity = (SessionsActivity) this.f$0;
                sessionsActivity.getClass();
                try {
                    alertDialog.dismiss();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (((TLRPC.TL_error) this.f$2) == null) {
                    sessionsActivity.sessions.remove((TLRPC.TL_webAuthorization) this.f$3);
                    sessionsActivity.updateRows$17();
                    SessionsActivity.ListAdapter listAdapter2 = sessionsActivity.listAdapter;
                    if (listAdapter2 != null) {
                        listAdapter2.mObservable.notifyChanged();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                AlertDialog alertDialog2 = (AlertDialog) this.f$1;
                SessionsActivity sessionsActivity2 = (SessionsActivity) this.f$0;
                sessionsActivity2.getClass();
                try {
                    alertDialog2.dismiss();
                    break;
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
                if (((TLRPC.TL_error) this.f$2) == null) {
                    ArrayList arrayList3 = sessionsActivity2.sessions;
                    TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.f$3;
                    arrayList3.remove(tL_authorization);
                    sessionsActivity2.passwordSessions.remove(tL_authorization);
                    sessionsActivity2.updateRows$17();
                    SessionsActivity.ListAdapter listAdapter3 = sessionsActivity2.listAdapter;
                    if (listAdapter3 != null) {
                        listAdapter3.mObservable.notifyChanged();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                TLObject tLObject3 = (TLObject) this.f$1;
                SessionsActivity.AnonymousClass6 anonymousClass6 = (SessionsActivity.AnonymousClass6) this.f$0;
                anonymousClass6.response = tLObject3;
                anonymousClass6.error = (TLRPC.TL_error) this.f$2;
                ((CameraScanActivity$$ExternalSyntheticLambda0) this.f$3).run();
                return;
            case 7:
                ((SettingsActivity) this.f$0).lambda$didUploadPhoto$22((String) this.f$2, (TLObject) this.f$3, (TLRPC.TL_error) this.f$1);
                return;
            case 8:
                BaseFragment baseFragment = (BaseFragment) this.f$0;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f$1;
                if (baseFragment != null && tL_error != null) {
                    BulletinFactory.of(baseFragment).showForError(false, tL_error);
                }
                if ((baseFragment instanceof ChatActivity) && tL_error == null) {
                    ((ChatActivity) baseFragment).startFireworks();
                }
                ((Browser.Progress) this.f$2).end();
                ((AlertDialog) this.f$3).dismiss();
                return;
            case 9:
                ((StarGiftSheet) this.f$0).lambda$addAttributeRow$45((boolean[]) this.f$1, (TL_stars.StarGiftAttribute) this.f$2, (ButtonSpan.TextViewButtons[]) this.f$3);
                return;
            case 10:
                ((StarGiftSheet) this.f$0).lambda$openTransfer$145((TLObject) this.f$1, (PollItemMenu$$ExternalSyntheticLambda8) this.f$2, (TLRPC.TL_error) this.f$3);
                return;
            case 11:
                ((StarGiftSheet) this.f$0).lambda$openCrafting$3((MessageObject) this.f$1, (ArrayList) this.f$2, (TL_stars.StarGift) this.f$3);
                return;
            case 12:
                ((StarGiftSheet) this.f$0).getClass();
                ((UserSelectorBottomSheet[]) this.f$1)[0].lambda$showGiftOfferSheet$15();
                ((Browser.Progress) this.f$2).end();
                BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment2 == null) {
                    return;
                }
                BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                bottomSheetParams.transitionFromLeft = true;
                safeLastFragment2.showAsSheet((TwoStepVerificationActivity) this.f$3, bottomSheetParams);
                return;
            case 13:
                StarGiftSheet starGiftSheet = (StarGiftSheet) this.f$0;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f$1;
                TLObject tLObject4 = (TLObject) this.f$2;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.f$3;
                if (tL_error2 == null) {
                    starGiftSheet.getClass();
                    if (tLObject4 instanceof TLRPC.Updates) {
                        starGiftSheet.upgradedOnce = true;
                        starGiftSheet.upgrade_form = null;
                        starGiftSheet.applyNewGiftFromUpdates(inputSavedStarGift, (TLRPC.Updates) tLObject4, new StarGiftSheet$$ExternalSyntheticLambda3(starGiftSheet, 6));
                        Utilities.stageQueue.postRunnable(new StickersActivity$$ExternalSyntheticLambda18(1, starGiftSheet, tLObject4));
                        return;
                    }
                }
                starGiftSheet.getBulletinFactory().showForError(false, tL_error2);
                return;
            case 14:
                StarGiftSheet.CraftTopView craftTopView = (StarGiftSheet.CraftTopView) this.f$0;
                craftTopView.crafting = false;
                if (((TL_stars.StarGift) this.f$1) != null) {
                    AndroidUtilities.runOnUIThread((Runnable) this.f$3);
                    return;
                }
                RLottieImageView rLottieImageView = craftTopView.brokenGiftImage;
                if (rLottieImageView != null) {
                    rLottieImageView.playAnimation();
                    AndroidUtilities.runOnUIThread(new QrActivity$5$$ExternalSyntheticLambda1(27), 750L);
                }
                craftTopView.precraftingLayout.animate().alpha(0.0f).start();
                craftTopView.failedLayout.animate().alpha(1.0f).start();
                craftTopView.button.animate().alpha(1.0f).start();
                craftTopView.craftingLayout.animate().alpha(0.0f).start();
                craftTopView.buttonsLayout.animate().alpha(1.0f).start();
                TextView textView = craftTopView.failedSubtitle;
                ArrayList arrayList4 = (ArrayList) this.f$2;
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftFailedText", arrayList4.size(), new Object[0])));
                AnimatedTextView animatedTextView = craftTopView.buttonTitle;
                animatedTextView.setText(LocaleController.getString(R.string.GiftCraftButtonFailed));
                animatedTextView.setTranslationY(AndroidUtilities.dp(6.0f));
                craftTopView.buttonSubtitle.setAlpha(0.0f);
                if (craftTopView.failedGifts != null) {
                    int i3 = 0;
                    while (true) {
                        GiftSheet.GiftCell[] giftCellArr = craftTopView.failedGifts;
                        if (i3 < giftCellArr.length) {
                            AndroidUtilities.removeFromParent(giftCellArr[i3]);
                            i3++;
                        } else {
                            craftTopView.failedGifts = null;
                        }
                    }
                }
                craftTopView.failedGifts = new GiftSheet.GiftCell[arrayList4.size()];
                int i4 = 0;
                while (i4 < arrayList4.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList4.get(i4);
                    GiftSheet.GiftCell giftCell = new GiftSheet.GiftCell(craftTopView.getContext(), craftTopView.currentAccount, craftTopView.resourcesProvider);
                    giftCell.setStarsGift(starGift, false, false, false, false, true);
                    giftCell.chanceTextView.setVisibility(8);
                    giftCell.setRibbonColor(-3065286);
                    BackupImageView backupImageView = giftCell.imageView;
                    FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(42, 42, 17);
                    giftCell.imageViewLayoutParams = layoutParamsCreateFrame;
                    backupImageView.setLayoutParams(layoutParamsCreateFrame);
                    int i5 = i4 + 1;
                    boolean z = i5 >= arrayList4.size();
                    LinearLayout linearLayout = craftTopView.failedGiftsLayout;
                    craftTopView.failedGifts[i4] = giftCell;
                    linearLayout.addView(giftCell, LayoutHelper.createLinear(74, 74, 0.0f, 51, 0, 0, z ? 0 : 6, 0));
                    i4 = i5;
                }
                return;
            case 15:
                ((StarsController) this.f$0).getClass();
                TLObject tLObject5 = (TLObject) this.f$1;
                boolean z2 = tLObject5 instanceof TLRPC.TL_payments_paymentFormStarGift;
                Utilities.Callback callback = (Utilities.Callback) this.f$3;
                if (z2) {
                    callback.run((TLRPC.TL_payments_paymentFormStarGift) tLObject5);
                    return;
                }
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f$2;
                StarsController.bulletinError(tL_error3 == null ? "NO_PAYMENT_FORM" : tL_error3.text);
                callback.run(null);
                return;
            case 16:
                StatisticActivity.ChartCell chartCell = (StatisticActivity.ChartCell) this.f$0;
                StatisticActivity statisticActivity = StatisticActivity.this;
                ChartData chartData = (ChartData) this.f$1;
                if (chartData != null) {
                    statisticActivity.childDataCache.put((String) this.f$2, chartData);
                }
                if (chartData != null) {
                    StatisticActivity.ZoomCancelable zoomCancelable = (StatisticActivity.ZoomCancelable) this.f$3;
                    if (!zoomCancelable.canceled && (i = zoomCancelable.adapterPosition) >= 0) {
                        View viewFindViewByPosition = statisticActivity.layoutManager.findViewByPosition(i);
                        if (viewFindViewByPosition instanceof StatisticActivity.ChartCell) {
                            chartCell.data.childChartData = chartData;
                            StatisticActivity.ChartCell chartCell2 = (StatisticActivity.ChartCell) viewFindViewByPosition;
                            chartCell2.chartView.legendSignatureView.showProgress(false, false);
                            chartCell2.zoomChart(false);
                        }
                    }
                }
                StatisticActivity.access$5100(statisticActivity);
                return;
            case 17:
                StatisticActivity.ChartViewData chartViewData = (StatisticActivity.ChartViewData) this.f$0;
                chartViewData.loading = false;
                chartViewData.chartData = (ChartData) this.f$1;
                chartViewData.zoomToken = (String) this.f$2;
                StatisticActivity.BaseChartCell baseChartCell = (StatisticActivity.BaseChartCell) ((Utilities.Callback0Return) this.f$3).run();
                if (baseChartCell != null) {
                    baseChartCell.updateData(chartViewData, true);
                    return;
                }
                return;
            case 18:
                PeerStoriesView.AnonymousClass8 anonymousClass8 = (PeerStoriesView.AnonymousClass8) this.f$0;
                anonymousClass8.getClass();
                TLObject tLObject6 = (TLObject) this.f$1;
                boolean z3 = tLObject6 instanceof TL_stories.TL_stories_stories;
                Utilities.Callback callback2 = (Utilities.Callback) this.f$3;
                if (z3) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject6;
                    StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = anonymousClass8.this$0;
                    MessagesController.getInstance(anonymousClass1.currentAccount).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(anonymousClass1.currentAccount).putChats(tL_stories_stories.chats, false);
                    for (int i6 = 0; i6 < tL_stories_stories.stories.size(); i6++) {
                        if (tL_stories_stories.stories.get(i6).id == ((TL_stories.StoryItem) this.f$2).id) {
                            callback2.run(tL_stories_stories.stories.get(i6).media.document);
                            return;
                        }
                    }
                }
                callback2.run(null);
                return;
            case 19:
                PeerStoriesView.AnonymousClass8 anonymousClass9 = (PeerStoriesView.AnonymousClass8) this.f$0;
                Activity activity = (Activity) this.f$1;
                StoryViewer storyViewer = (StoryViewer) this.f$2;
                PeerStoriesView.SharedResources sharedResources = (PeerStoriesView.SharedResources) this.f$3;
                StoryRecorder storyRecorder = StoryRecorder.getInstance(activity, anonymousClass9.this$0.currentAccount);
                PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope = anonymousClass9.this$0.playerSharedScope;
                long j = (videoPlayerSharedScope == null || (videoPlayerHolder = videoPlayerSharedScope.player) == null) ? 0L : videoPlayerHolder.currentPosition;
                DraftsController draftsController = MessagesController.getInstance(anonymousClass9.this$0.currentAccount).getStoriesController().draftsController;
                TL_stories.StoryItem storyItem2 = anonymousClass9.this$0.currentStory.storyItem;
                long j2 = storyItem2.dialogId;
                ArrayList arrayList5 = draftsController.drafts;
                int size = arrayList5.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        Object obj = arrayList5.get(i7);
                        i7++;
                        storyEntryFromStoryItem = (StoryEntry) obj;
                        if (storyEntryFromStoryItem.isEdit && storyItem2.id == storyEntryFromStoryItem.editStoryId && j2 == storyEntryFromStoryItem.editStoryPeerId) {
                            TLRPC.MessageMedia messageMedia = storyItem2.media;
                            TLRPC.Document document = messageMedia.document;
                            arrayList2 = arrayList5;
                            storyItem = storyItem2;
                            if ((document == null || document.id == storyEntryFromStoryItem.editDocumentId) && ((photo = messageMedia.photo) == null || photo.id == storyEntryFromStoryItem.editPhotoId)) {
                                storyEntryFromStoryItem.isEditSaved = true;
                            }
                        } else {
                            arrayList2 = arrayList5;
                            storyItem = storyItem2;
                        }
                        storyItem2 = storyItem;
                        arrayList5 = arrayList2;
                    } else {
                        storyEntryFromStoryItem = null;
                    }
                }
                if (storyEntryFromStoryItem == null || storyEntryFromStoryItem.isRepostMessage || (file = storyEntryFromStoryItem.file) == null || !file.exists()) {
                    storyEntryFromStoryItem = StoryEntry.fromStoryItem(anonymousClass9.this$0.currentStory.getPath(), anonymousClass9.this$0.currentStory.storyItem);
                    storyEntryFromStoryItem.editStoryPeerId = anonymousClass9.this$0.dialogId;
                }
                StoryEntry storyEntryCopy$1 = storyEntryFromStoryItem.copy$1();
                if (anonymousClass9.this$0.isBotsPreview()) {
                    StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass2 = anonymousClass9.this$0;
                    storyEntryCopy$1.botId = anonymousClass2.dialogId;
                    storyEntryCopy$1.editingBotPreview = MessagesController.toInputMedia(anonymousClass2.currentStory.storyItem.media);
                    StoriesController.StoriesList storiesList = storyViewer.storiesList;
                    if (storiesList instanceof StoriesController.BotPreviewsList) {
                        storyEntryCopy$1.botLang = ((StoriesController.BotPreviewsList) storiesList).lang_code;
                    }
                }
                storyRecorder.openEdit(StoryRecorder.SourceView.fromStoryViewer(storyViewer), storyEntryCopy$1, j);
                storyRecorder.onFullyOpenListener = new PeerStoriesView$8$$ExternalSyntheticLambda29(anonymousClass9, 3);
                storyRecorder.onClosePrepareListener = new PeerStoriesView$8$$ExternalSyntheticLambda50(anonymousClass9, sharedResources, 1);
                return;
            case 20:
                StoriesController.StoriesCollections storiesCollections = (StoriesController.StoriesCollections) this.f$0;
                storiesCollections.creating = false;
                TLObject tLObject7 = (TLObject) this.f$1;
                if (tLObject7 instanceof TL_stories.TL_storyAlbum) {
                    TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) tLObject7;
                    StoriesController.StoryAlbum storyAlbum = new StoriesController.StoryAlbum();
                    storyAlbum.album_id = tL_storyAlbum.album_id;
                    storyAlbum.title = tL_storyAlbum.title;
                    storyAlbum.icon_photo = tL_storyAlbum.icon_photo;
                    storyAlbum.icon_video = tL_storyAlbum.icon_video;
                    storiesCollections.collections.add(storyAlbum);
                    storiesCollections.updateAlbumsListCache(true);
                    Utilities.Callback callback3 = (Utilities.Callback) this.f$2;
                    if (callback3 != null) {
                        callback3.run(storyAlbum);
                        return;
                    }
                    return;
                }
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f$3;
                if (tL_error4 == null || (safeLastFragment = LaunchActivity.getSafeLastFragment()) == null) {
                    c = 0;
                } else {
                    c = 0;
                    BulletinFactory.of(safeLastFragment).showForError(false, tL_error4);
                }
                NotificationCenter notificationCenter = NotificationCenter.getInstance(storiesCollections.currentAccount);
                int i8 = NotificationCenter.storyAlbumsCollectionsUpdate;
                Object[] objArr = new Object[2];
                objArr[c] = Long.valueOf(storiesCollections.dialogId);
                objArr[1] = storiesCollections;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i8, objArr);
                return;
            case 21:
                MessagesStorage messagesStorage = (MessagesStorage) this.f$2;
                ArrayList arrayList6 = (ArrayList) this.f$3;
                StoriesController.StoriesList storiesList2 = (StoriesController.StoriesList) this.f$0;
                int i9 = storiesList2.albumId;
                StringBuilder sb = new StringBuilder("StoriesList ");
                int i10 = storiesList2.type;
                sb.append(i10);
                sb.append("{");
                long j3 = storiesList2.dialogId;
                sb.append(j3);
                sb.append("} saveCache {");
                ArrayList arrayList7 = (ArrayList) this.f$1;
                sb.append(StoriesController.access$900(arrayList7));
                sb.append("}");
                FileLog.d(sb.toString());
                try {
                    SQLiteDatabase database = messagesStorage.getDatabase();
                    SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = database.executeFast("REPLACE INTO profile_stories VALUES(?, ?, ?, ?, ?, ?)");
                    try {
                        Locale locale = Locale.US;
                        database.executeFast("DELETE FROM profile_stories_albums_links WHERE dialog_id = " + j3 + " AND album_id = " + i9).stepThis().dispose();
                        sQLitePreparedStatementExecuteFast = database.executeFast("REPLACE INTO profile_stories_albums_links VALUES(?, ?, ?, ?)");
                        int i11 = 0;
                        while (i11 < arrayList7.size()) {
                            try {
                                TL_stories.StoryItem storyItem3 = ((MessageObject) arrayList7.get(i11)).storyItem;
                                if (storyItem3 != null) {
                                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem3.getObjectSize());
                                    storyItem3.serializeToStream(nativeByteBuffer);
                                    sQLitePreparedStatementExecuteFast2.requery();
                                    sQLitePreparedStatementExecuteFast2.bindLong(i2, j3);
                                    sQLitePreparedStatementExecuteFast2.bindInteger(2, storyItem3.id);
                                    sQLitePreparedStatementExecuteFast2.bindByteBuffer(3, nativeByteBuffer);
                                    sQLitePreparedStatementExecuteFast2.bindInteger(4, i10);
                                    sQLitePreparedStatementExecuteFast2.bindInteger(5, storiesList2.seenStories.contains(Integer.valueOf(storyItem3.id)) ? 1 : 0);
                                    sQLitePreparedStatementExecuteFast2.bindInteger(6, arrayList6.indexOf(Integer.valueOf(storyItem3.id)) + 1);
                                    sQLitePreparedStatementExecuteFast2.step();
                                    nativeByteBuffer.reuse();
                                    sQLitePreparedStatementExecuteFast.requery();
                                    sQLitePreparedStatementExecuteFast.bindLong(1, j3);
                                    sQLitePreparedStatementExecuteFast.bindInteger(2, i9);
                                    sQLitePreparedStatementExecuteFast.bindInteger(3, storyItem3.id);
                                    sQLitePreparedStatementExecuteFast.bindInteger(4, i11);
                                    sQLitePreparedStatementExecuteFast.step();
                                }
                                i11++;
                                i2 = 1;
                                break;
                            } catch (Throwable th) {
                                th = th;
                                sQLitePreparedStatement = sQLitePreparedStatementExecuteFast2;
                                try {
                                    messagesStorage.checkSQLException(th);
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    if (sQLitePreparedStatementExecuteFast != null) {
                                        sQLitePreparedStatementExecuteFast.dispose();
                                    }
                                } catch (Throwable th2) {
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    if (sQLitePreparedStatementExecuteFast != null) {
                                        sQLitePreparedStatementExecuteFast.dispose();
                                    }
                                    throw th2;
                                }
                            }
                        }
                        if (sQLitePreparedStatementExecuteFast2 != null) {
                            sQLitePreparedStatementExecuteFast2.dispose();
                        }
                        if (sQLitePreparedStatementExecuteFast != null) {
                            sQLitePreparedStatementExecuteFast.dispose();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        sQLitePreparedStatement = sQLitePreparedStatementExecuteFast2;
                        sQLitePreparedStatementExecuteFast = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    sQLitePreparedStatementExecuteFast = null;
                    sQLitePreparedStatement = null;
                }
                AndroidUtilities.runOnUIThread(new StoriesController$StoriesList$$ExternalSyntheticLambda0(storiesList2, 2));
                return;
            case 22:
                PreviewView previewView = (PreviewView) this.f$0;
                Bitmap bitmap = previewView.bitmap;
                if (bitmap != null && !bitmap.isRecycled()) {
                    previewView.bitmap.recycle();
                }
                Bitmap bitmap2 = ((Bitmap[]) this.f$1)[0];
                previewView.bitmap = bitmap2;
                StoryEntry storyEntry = (StoryEntry) this.f$2;
                if (storyEntry != null && !storyEntry.isDraft && storyEntry.isVideo && bitmap2 != null) {
                    storyEntry.width = bitmap2.getWidth();
                    storyEntry.height = previewView.bitmap.getHeight();
                    storyEntry.setupMatrix();
                }
                if (((boolean[]) this.f$3)[0] && storyEntry != null && (blurManager = previewView.blurManager) != null && previewView.bitmap != null) {
                    blurManager.resetBitmap();
                    blurManager.setFallbackBlur(storyEntry.buildBitmap(previewView.bitmap, 0.2f), false);
                    StoryRecorder$$ExternalSyntheticLambda7 storyRecorder$$ExternalSyntheticLambda7 = previewView.invalidateBlur;
                    if (storyRecorder$$ExternalSyntheticLambda7 != null) {
                        storyRecorder$$ExternalSyntheticLambda7.run();
                    }
                }
                previewView.setupGradient();
                previewView.invalidate();
                return;
            case 23:
                run$org$telegram$ui$Stories$recorder$StoryEntry$$ExternalSyntheticLambda9();
                return;
            case 24:
                TopicCreateFragment.AnonymousClass1 anonymousClass3 = (TopicCreateFragment.AnonymousClass1) this.f$0;
                TLObject tLObject8 = (TLObject) this.f$1;
                if (tLObject8 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject8;
                    for (int i12 = 0; i12 < updates.updates.size(); i12++) {
                        if (updates.updates.get(i12) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i12);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            String str = (String) this.f$2;
                            tL_messageActionTopicCreate.title = str;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            TopicCreateFragment topicCreateFragment = TopicCreateFragment.this;
                            tL_messageService.peer_id = topicCreateFragment.getMessagesController().getPeer(topicCreateFragment.dialogId);
                            tL_messageService.dialog_id = topicCreateFragment.dialogId;
                            tL_messageService.id = tL_updateMessageID.id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList8 = new ArrayList();
                            arrayList8.add(new MessageObject(((BaseFragment) topicCreateFragment).currentAccount, tL_messageService, false, false));
                            TLRPC.Chat chat = topicCreateFragment.getMessagesController().getChat(Long.valueOf(-topicCreateFragment.dialogId));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.id = tL_updateMessageID.id;
                            long j4 = topicCreateFragment.selectedEmojiDocumentId;
                            if (j4 != 0) {
                                tL_forumTopic.icon_emoji_id = j4;
                                tL_forumTopic.flags |= 1;
                            }
                            tL_forumTopic.my = true;
                            tL_forumTopic.flags |= 2;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str;
                            tL_forumTopic.top_message = tL_messageService.id;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = topicCreateFragment.getMessagesController().getPeer(topicCreateFragment.getUserConfig().clientUserId);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = topicCreateFragment.iconColor;
                            ChatActivity chatActivity = topicCreateFragment.openInChatActivity;
                            if (chatActivity != null) {
                                chatActivity.resetForReload();
                                chatActivity.saveDraft();
                                chatActivity.setThreadMessages(arrayList8, chat, tL_messageService.id, 1, 1, tL_forumTopic);
                                chatActivity.justCreatedTopic = true;
                                chatActivity.firstLoadMessages();
                                chatActivity.updateTitle(true);
                                chatActivity.avatarContainer.updateSubtitle(true);
                                chatActivity.updateTopicTitleIcon();
                                chatActivity.topicsTabs.setCurrentTopic(chatActivity.getTopicId());
                                chatActivity.updateTopPanel(true);
                                chatActivity.updateBottomOverlay(true);
                                chatActivity.hideFieldPanel(true);
                                chatActivity.applyDraftMaybe(true, true);
                                chatActivity.reloadPinnedMessages();
                                topicCreateFragment.getMessagesController().getTopicsController().onTopicCreated(topicCreateFragment.dialogId, tL_forumTopic, true);
                                topicCreateFragment.finishFragment();
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -topicCreateFragment.dialogId);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                ChatActivity chatActivity2 = new ChatActivity(bundle);
                                chatActivity2.setThreadMessages(arrayList8, chat, tL_messageService.id, 1, 1, tL_forumTopic);
                                chatActivity2.justCreatedTopic = true;
                                topicCreateFragment.getMessagesController().getTopicsController().onTopicCreated(topicCreateFragment.dialogId, tL_forumTopic, true);
                                topicCreateFragment.presentFragment(chatActivity2);
                            }
                        }
                    }
                }
                ((AlertDialog) this.f$3).dismiss();
                return;
            case 25:
                ((TwoStepVerificationActivity) this.f$0).lambda$processDone$30((byte[]) this.f$1, (TLObject) this.f$2, (byte[]) this.f$3);
                return;
            case 26:
                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = (TwoStepVerificationSetupActivity) this.f$0;
                twoStepVerificationSetupActivity.getClass();
                if (((TLObject) this.f$1) instanceof TLRPC.TL_boolTrue) {
                    twoStepVerificationSetupActivity.animateSuccess$2(new TodoItemMenu$$ExternalSyntheticLambda9(20, twoStepVerificationSetupActivity, (String) this.f$2));
                    return;
                }
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.f$3;
                if (tL_error5 == null || tL_error5.text.startsWith("CODE_INVALID")) {
                    twoStepVerificationSetupActivity.onCodeFieldError();
                    return;
                } else if (!tL_error5.text.startsWith("FLOOD_WAIT")) {
                    twoStepVerificationSetupActivity.showAlertWithText$3(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error5.text);
                    return;
                } else {
                    int iIntValue = Utilities.parseInt((CharSequence) tL_error5.text).intValue();
                    twoStepVerificationSetupActivity.showAlertWithText$3(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                    return;
                }
            case 27:
                ((ButtonWithCounterView) this.f$0).setLoading(false);
                if (((TLObject) this.f$1) instanceof TLRPC.TL_boolTrue) {
                    ((BottomSheet) this.f$2).lambda$showGiftOfferSheet$15();
                    ((BotVerifySheet$$ExternalSyntheticLambda1) this.f$3).run(Boolean.FALSE);
                    return;
                }
                return;
            case 28:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f$0;
                AndroidUtilities.addToClipboard(connectedbotstarref.url);
                new BulletinFactory(((BottomSheet) this.f$1).topBulletinContainer, (Theme.ResourcesProvider) this.f$2).createSimpleBulletin(LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, AffiliateProgramFragment.percents(connectedbotstarref.commission_permille), UserObject.getUserName((TLRPC.User) this.f$3))), R.raw.copy).show();
                return;
            default:
                ((ChannelAffiliateProgramsFragment) this.f$0).lambda$createView$7((Context) this.f$1, (TLRPC.User) this.f$2, (TL_payments.connectedBotStarRef) this.f$3);
                return;
        }
    }

    public ProfileActivity$$ExternalSyntheticLambda149(BaseFragment baseFragment, TLRPC.TL_error tL_error, TLObject tLObject, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = baseFragment;
        this.f$1 = tL_error;
        this.f$3 = tLObject;
        this.f$2 = str;
    }

    public ProfileActivity$$ExternalSyntheticLambda149(StoryEntry storyEntry, String str, int[][] iArr, Utilities.Callback callback) {
        this.$r8$classId = 23;
        this.f$0 = storyEntry;
        this.f$2 = str;
        this.f$1 = iArr;
        this.f$3 = callback;
    }
}
