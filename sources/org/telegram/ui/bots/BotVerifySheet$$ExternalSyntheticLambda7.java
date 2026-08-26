package org.telegram.ui.bots;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
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
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesController$StoriesList$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.PreviewView;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryRecorder$$ExternalSyntheticLambda5;
import org.telegram.ui.iv.BlockRow;
import org.telegram.ui.iv.ChatAttachAlertRichLayout;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda22;

public final class BotVerifySheet$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public BotVerifySheet$$ExternalSyntheticLambda7(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override
    public final void run() {
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast;
        SQLitePreparedStatement sQLitePreparedStatement;
        BlurringShader.BlurManager blurManager;
        float f;
        long j;
        long j2;
        long j3;
        ArrayList arrayList;
        char c = 1;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        Object obj3 = this.f$3;
        Object obj4 = this.f$2;
        switch (this.$r8$classId) {
            case 0:
                ((ButtonWithCounterView) obj2).setLoading(false);
                if (((TLObject) obj) instanceof TLRPC.TL_boolTrue) {
                    ((BottomSheet) obj4).lambda$showGiftOfferSheet$15();
                    ((BotVerifySheet$$ExternalSyntheticLambda1) obj3).run(Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                MessagesStorage messagesStorage = (MessagesStorage) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                StoriesController.StoriesList storiesList = (StoriesController.StoriesList) obj2;
                int i = storiesList.albumId;
                StringBuilder sb = new StringBuilder("StoriesList ");
                int i2 = storiesList.type;
                sb.append(i2);
                sb.append("{");
                long j4 = storiesList.dialogId;
                sb.append(j4);
                sb.append("} saveCache {");
                ArrayList arrayList3 = (ArrayList) obj;
                sb.append(StoriesController.access$900(arrayList3));
                sb.append("}");
                FileLog.d(sb.toString());
                try {
                    SQLiteDatabase database = messagesStorage.getDatabase();
                    SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = database.executeFast("REPLACE INTO profile_stories VALUES(?, ?, ?, ?, ?, ?)");
                    try {
                        Locale locale = Locale.US;
                        database.executeFast("DELETE FROM profile_stories_albums_links WHERE dialog_id = " + j4 + " AND album_id = " + i).stepThis().dispose();
                        sQLitePreparedStatementExecuteFast = database.executeFast("REPLACE INTO profile_stories_albums_links VALUES(?, ?, ?, ?)");
                        for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                            try {
                                TL_stories.StoryItem storyItem = ((MessageObject) arrayList3.get(i3)).storyItem;
                                if (storyItem != null) {
                                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
                                    storyItem.serializeToStream(nativeByteBuffer);
                                    sQLitePreparedStatementExecuteFast2.requery();
                                    sQLitePreparedStatementExecuteFast2.bindLong(1, j4);
                                    sQLitePreparedStatementExecuteFast2.bindInteger(2, storyItem.id);
                                    sQLitePreparedStatementExecuteFast2.bindByteBuffer(3, nativeByteBuffer);
                                    sQLitePreparedStatementExecuteFast2.bindInteger(4, i2);
                                    sQLitePreparedStatementExecuteFast2.bindInteger(5, storiesList.seenStories.contains(Integer.valueOf(storyItem.id)) ? 1 : 0);
                                    sQLitePreparedStatementExecuteFast2.bindInteger(6, arrayList2.indexOf(Integer.valueOf(storyItem.id)) + 1);
                                    sQLitePreparedStatementExecuteFast2.step();
                                    nativeByteBuffer.reuse();
                                    sQLitePreparedStatementExecuteFast.requery();
                                    sQLitePreparedStatementExecuteFast.bindLong(1, j4);
                                    sQLitePreparedStatementExecuteFast.bindInteger(2, i);
                                    sQLitePreparedStatementExecuteFast.bindInteger(3, storyItem.id);
                                    sQLitePreparedStatementExecuteFast.bindInteger(4, i3);
                                    sQLitePreparedStatementExecuteFast.step();
                                    break;
                                }
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
                        sQLitePreparedStatementExecuteFast = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    sQLitePreparedStatementExecuteFast = null;
                    sQLitePreparedStatement = null;
                }
                AndroidUtilities.runOnUIThread(new StoriesController$StoriesList$$ExternalSyntheticLambda1(storiesList, 2));
                return;
            case 2:
                PreviewView previewView = (PreviewView) obj2;
                Bitmap bitmap = previewView.bitmap;
                if (bitmap != null && !bitmap.isRecycled()) {
                    previewView.bitmap.recycle();
                }
                Bitmap bitmap2 = ((Bitmap[]) obj)[0];
                previewView.bitmap = bitmap2;
                StoryEntry storyEntry = (StoryEntry) obj4;
                if (storyEntry != null && !storyEntry.isDraft && storyEntry.isVideo && bitmap2 != null) {
                    storyEntry.width = bitmap2.getWidth();
                    storyEntry.height = previewView.bitmap.getHeight();
                    storyEntry.setupMatrix();
                }
                if (((boolean[]) obj3)[0] && storyEntry != null && (blurManager = previewView.blurManager) != null && previewView.bitmap != null) {
                    blurManager.resetBitmap();
                    blurManager.setFallbackBlur(storyEntry.buildBitmap(previewView.bitmap, 0.2f), 0);
                    StoryRecorder$$ExternalSyntheticLambda5 storyRecorder$$ExternalSyntheticLambda5 = previewView.invalidateBlur;
                    if (storyRecorder$$ExternalSyntheticLambda5 != null) {
                        storyRecorder$$ExternalSyntheticLambda5.run();
                    }
                }
                previewView.setupGradient();
                previewView.invalidate();
                return;
            case 3:
                StoryEntry storyEntry2 = (StoryEntry) obj2;
                storyEntry2.getClass();
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                videoEditedInfo.isStory = true;
                videoEditedInfo.fromCamera = storyEntry2.fromCamera;
                videoEditedInfo.originalWidth = storyEntry2.width;
                videoEditedInfo.originalHeight = storyEntry2.height;
                videoEditedInfo.resultWidth = storyEntry2.resultWidth;
                videoEditedInfo.resultHeight = storyEntry2.resultHeight;
                File file = storyEntry2.paintFile;
                videoEditedInfo.paintPath = file == null ? null : file.getPath();
                File file2 = storyEntry2.messageFile;
                videoEditedInfo.messagePath = file2 == null ? null : file2.getPath();
                File file3 = storyEntry2.messageVideoMaskFile;
                videoEditedInfo.messageVideoMaskPath = file3 == null ? null : file3.getPath();
                File file4 = storyEntry2.backgroundFile;
                videoEditedInfo.backgroundPath = file4 == null ? null : file4.getPath();
                int iExtractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(videoEditedInfo.resultWidth, videoEditedInfo.resultHeight, videoEditedInfo.bitrate, true);
                int[][] iArr = (int[][]) obj4;
                String str = (String) obj;
                if (!storyEntry2.isVideo || str == null || storyEntry2.isCollage()) {
                    File file5 = storyEntry2.filterFile;
                    if (file5 != null) {
                        videoEditedInfo.originalPath = file5.getAbsolutePath();
                    } else {
                        videoEditedInfo.originalPath = str;
                    }
                    videoEditedInfo.isPhoto = true;
                    videoEditedInfo.collage = storyEntry2.collage;
                    if (storyEntry2.isCollage()) {
                        int i4 = 0;
                        boolean z = false;
                        while (i4 < storyEntry2.collageContent.size()) {
                            StoryEntry storyEntry3 = (StoryEntry) storyEntry2.collageContent.get(i4);
                            if (storyEntry3.isVideo) {
                                storyEntry3.width = Math.max(storyEntry3.width, iArr[i4][c]);
                                storyEntry3.height = Math.max(storyEntry3.height, iArr[i4][2]);
                                storyEntry3.duration = Math.max(storyEntry3.duration, iArr[i4][4]);
                                z = true;
                            }
                            i4++;
                            c = 1;
                        }
                        ArrayList<VideoEditedInfo.Part> parts = VideoEditedInfo.Part.toParts(storyEntry2);
                        videoEditedInfo.collageParts = parts;
                        if (z) {
                            int size = parts.size();
                            int i5 = 0;
                            long j5 = 0;
                            VideoEditedInfo.Part part = null;
                            while (i5 < size) {
                                VideoEditedInfo.Part part2 = parts.get(i5);
                                i5++;
                                VideoEditedInfo.Part part3 = part2;
                                if (part3.isVideo) {
                                    long j6 = part3.duration;
                                    if (j6 > j5) {
                                        part = part3;
                                        j5 = j6;
                                    }
                                }
                            }
                            f = 8.0f;
                            if (part != null) {
                                float f2 = part.duration;
                                float f3 = part.right;
                                float f4 = part.left;
                                long j7 = (long) ((f3 - f4) * f2);
                                storyEntry2.duration = j7;
                                videoEditedInfo.originalDuration = j7;
                                videoEditedInfo.estimatedDuration = j7;
                                j = -(part.offset + ((long) (f4 * f2)));
                                part.offset = j;
                                ArrayList<VideoEditedInfo.Part> arrayList4 = videoEditedInfo.collageParts;
                                int i6 = 0;
                                for (int size2 = arrayList4.size(); i6 < size2; size2 = size2) {
                                    VideoEditedInfo.Part part4 = arrayList4.get(i6);
                                    i6++;
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
                            videoEditedInfo.estimatedSize = (long) (((storyEntry2.duration / 1000.0f) * iExtractRealEncoderBitrate) / f);
                            videoEditedInfo.filterState = null;
                        } else {
                            long j8 = storyEntry2.averageDuration;
                            storyEntry2.duration = j8;
                            videoEditedInfo.originalDuration = j8;
                            videoEditedInfo.estimatedDuration = j8;
                            f = 8.0f;
                        }
                    } else {
                        f = 8.0f;
                        if (storyEntry2.round != null) {
                            long j9 = (long) ((storyEntry2.roundRight - storyEntry2.roundLeft) * storyEntry2.roundDuration);
                            storyEntry2.duration = j9;
                            videoEditedInfo.originalDuration = j9;
                            videoEditedInfo.estimatedDuration = j9;
                        } else if (storyEntry2.audioPath != null) {
                            long j10 = (long) ((storyEntry2.audioRight - storyEntry2.audioLeft) * storyEntry2.audioDuration);
                            storyEntry2.duration = j10;
                            videoEditedInfo.originalDuration = j10;
                            videoEditedInfo.estimatedDuration = j10;
                        } else {
                            long j11 = storyEntry2.averageDuration;
                            storyEntry2.duration = j11;
                            videoEditedInfo.originalDuration = j11;
                            videoEditedInfo.estimatedDuration = j11;
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
                    videoEditedInfo.estimatedSize = (long) (((storyEntry2.duration / 1000.0f) * iExtractRealEncoderBitrate) / f);
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
                    if (videoBitrate >= 1000000 || (arrayList = storyEntry2.mediaEntities) == null || arrayList.isEmpty()) {
                        int i7 = videoEditedInfo.originalBitrate;
                        if (i7 < 500000) {
                            videoEditedInfo.bitrate = 2500000;
                            videoEditedInfo.originalBitrate = -1;
                        } else {
                            videoEditedInfo.bitrate = Utilities.clamp(i7, 3000000, 500000);
                        }
                    } else {
                        videoEditedInfo.bitrate = 2000000;
                        videoEditedInfo.originalBitrate = -1;
                    }
                    StringBuilder sb2 = new StringBuilder("story bitrate, original = ");
                    sb2.append(videoEditedInfo.originalBitrate);
                    sb2.append(" => ");
                    ChatObject$Call$$ExternalSyntheticOutline0.m(sb2, videoEditedInfo.bitrate);
                    int[] iArr2 = iArr[0];
                    int i8 = iArr2[4];
                    long j12 = i8;
                    storyEntry2.duration = j12;
                    videoEditedInfo.originalDuration = j12 * 1000;
                    float f5 = j12;
                    long j13 = ((long) (storyEntry2.left * f5)) * 1000;
                    videoEditedInfo.startTime = j13;
                    long j14 = ((long) (storyEntry2.right * f5)) * 1000;
                    videoEditedInfo.endTime = j14;
                    videoEditedInfo.estimatedDuration = j14 - j13;
                    videoEditedInfo.volume = storyEntry2.videoVolume;
                    videoEditedInfo.muted = storyEntry2.muted;
                    videoEditedInfo.estimatedSize = (long) Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(i8 / 1000.0f, iExtractRealEncoderBitrate, 8.0f, iArr2[5]);
                    videoEditedInfo.estimatedSize = Math.max(storyEntry2.file.length(), videoEditedInfo.estimatedSize);
                    videoEditedInfo.filterState = storyEntry2.filterState;
                    File file6 = storyEntry2.paintBlurFile;
                    videoEditedInfo.blurPath = file6 == null ? null : file6.getPath();
                    j = 0;
                }
                videoEditedInfo.account = storyEntry2.currentAccount;
                videoEditedInfo.wallpaperPeerId = storyEntry2.backgroundWallpaperPeerId;
                videoEditedInfo.isDark = storyEntry2.isDark;
                videoEditedInfo.avatarStartTime = -1L;
                MediaController.CropState cropState = storyEntry2.crop;
                if (cropState != null) {
                    videoEditedInfo.cropState = cropState.clone();
                } else {
                    videoEditedInfo.cropState = new MediaController.CropState();
                }
                videoEditedInfo.cropState.useMatrix = new Matrix();
                videoEditedInfo.cropState.useMatrix.set(storyEntry2.matrix);
                videoEditedInfo.mediaEntities = storyEntry2.mediaEntities;
                videoEditedInfo.gradientTopColor = Integer.valueOf(storyEntry2.gradientTopColor);
                videoEditedInfo.gradientBottomColor = Integer.valueOf(storyEntry2.gradientBottomColor);
                videoEditedInfo.forceFragmenting = true;
                videoEditedInfo.hdrInfo = storyEntry2.hdrInfo;
                videoEditedInfo.mixedSoundInfos.clear();
                if (storyEntry2.isCollage() && !storyEntry2.muted) {
                    ArrayList<VideoEditedInfo.Part> arrayList5 = videoEditedInfo.collageParts;
                    int size3 = arrayList5.size();
                    int i9 = 0;
                    while (i9 < size3) {
                        VideoEditedInfo.Part part6 = arrayList5.get(i9);
                        i9++;
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
                File file7 = storyEntry2.round;
                if (file7 != null) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file7.getAbsolutePath());
                    mixedSoundInfo2.volume = storyEntry2.roundVolume;
                    float f8 = storyEntry2.roundLeft;
                    float f9 = storyEntry2.roundDuration;
                    long j15 = ((long) (f8 * f9)) * 1000;
                    mixedSoundInfo2.audioOffset = j15;
                    if (storyEntry2.isVideo) {
                        mixedSoundInfo2.startTime = ((long) (storyEntry2.roundOffset - (storyEntry2.left * storyEntry2.duration))) * 1000;
                        j3 = 0;
                    } else {
                        j3 = 0;
                        mixedSoundInfo2.startTime = 0L;
                    }
                    long j16 = mixedSoundInfo2.startTime + j;
                    mixedSoundInfo2.startTime = j16;
                    if (j16 < j3) {
                        mixedSoundInfo2.audioOffset = j15 - j16;
                        mixedSoundInfo2.startTime = j3;
                    }
                    mixedSoundInfo2.duration = ((long) ((storyEntry2.roundRight - f8) * f9)) * 1000;
                    videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo2);
                }
                String str2 = storyEntry2.audioPath;
                if (str2 != null) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str2);
                    mixedSoundInfo3.volume = storyEntry2.audioVolume;
                    float f10 = storyEntry2.audioLeft;
                    float f11 = storyEntry2.audioDuration;
                    long j17 = ((long) (f10 * f11)) * 1000;
                    mixedSoundInfo3.audioOffset = j17;
                    if (storyEntry2.isVideo) {
                        mixedSoundInfo3.startTime = ((long) (storyEntry2.audioOffset - (storyEntry2.left * storyEntry2.duration))) * 1000;
                        j2 = 0;
                    } else {
                        j2 = 0;
                        mixedSoundInfo3.startTime = 0L;
                    }
                    long j18 = mixedSoundInfo3.startTime + j;
                    mixedSoundInfo3.startTime = j18;
                    if (j18 < j2) {
                        mixedSoundInfo3.audioOffset = j17 - j18;
                        mixedSoundInfo3.startTime = j2;
                    }
                    mixedSoundInfo3.duration = ((long) ((storyEntry2.audioRight - f10) * f11)) * 1000;
                    videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo3);
                }
                ((Utilities.Callback) obj3).run(videoEditedInfo);
                return;
            case 4:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj2;
                AndroidUtilities.addToClipboard(connectedbotstarref.url);
                BulletinFactory.of(((BottomSheet) obj4).topBulletinContainer, (Theme.ResourcesProvider) obj).createSimpleBulletin(R.raw.copy, LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, AffiliateProgramFragment.percents(connectedbotstarref.commission_permille), UserObject.getUserName((TLRPC.User) obj3)))).show();
                return;
            case 5:
                ((ChannelAffiliateProgramsFragment) obj2).lambda$createView$7((Context) obj, (TLRPC.User) obj4, (TL_payments.connectedBotStarRef) obj3);
                return;
            case 6:
                boolean[] zArr = (boolean[]) obj2;
                BotWebViewContainer$$ExternalSyntheticLambda22 botWebViewContainer$$ExternalSyntheticLambda22 = (BotWebViewContainer$$ExternalSyntheticLambda22) obj4;
                if (!(((TLObject) obj) instanceof TLRPC.TL_boolTrue)) {
                    if (zArr[0]) {
                        return;
                    }
                    zArr[0] = true;
                    botWebViewContainer$$ExternalSyntheticLambda22.run(Boolean.TRUE, "cancelled");
                    return;
                }
                ((TLRPC.UserFull) obj3).bot_can_manage_emoji_status = true;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                botWebViewContainer$$ExternalSyntheticLambda22.run(Boolean.TRUE, "allowed");
                return;
            case 7:
                ((ChatAttachAlertRichLayout) obj2).listView.turnIntoKeepList((BlockRow) obj, (TL_iv.PageBlock) obj4);
                ((ItemOptions) obj3).dismiss();
                return;
            default:
                ((BotWebViewContainer) obj2).lambda$onEventReceived$44((TLObject) obj, (String) obj4, (String) obj3);
                return;
        }
    }

    public BotVerifySheet$$ExternalSyntheticLambda7(TLObject tLObject, boolean[] zArr, BotWebViewContainer$$ExternalSyntheticLambda22 botWebViewContainer$$ExternalSyntheticLambda22, TLRPC.UserFull userFull) {
        this.$r8$classId = 6;
        this.f$1 = tLObject;
        this.f$0 = zArr;
        this.f$2 = botWebViewContainer$$ExternalSyntheticLambda22;
        this.f$3 = userFull;
    }

    public BotVerifySheet$$ExternalSyntheticLambda7(TL_payments.connectedBotStarRef connectedbotstarref, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider, TLRPC.User user) {
        this.$r8$classId = 4;
        this.f$0 = connectedbotstarref;
        this.f$2 = bottomSheet;
        this.f$1 = resourcesProvider;
        this.f$3 = user;
    }
}
