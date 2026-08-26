package org.telegram.ui.Stories.recorder;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaMetadataRetriever;
import android.view.Surface;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import com.google.android.gms.cast.framework.media.zzq;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper$SvgDrawable$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.Paint.Views.EntityView;
import org.telegram.ui.Components.PermissionRequest;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Reactions.ReactionImageHolder;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Gifts.SendGiftSheet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Storage.CacheModel$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.LivePlayer;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda53;
import org.telegram.ui.iv.RichTableCell$$ExternalSyntheticLambda3;
import org.telegram.ui.iv.RichTextCell$2$$ExternalSyntheticLambda1;

public final class PreviewView$$ExternalSyntheticLambda12 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public PreviewView$$ExternalSyntheticLambda12(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        int i;
        MediaCodec.BufferInfo bufferInfo;
        boolean z;
        short s;
        switch (this.$r8$classId) {
            case 0:
                ((StoryRecorder.AnonymousClass7) this.f$0).setupGradient();
                return;
            case 1:
                CaptionContainerView.this.waitingForScrollYChange = false;
                return;
            case 2:
                ((CaptionContainerView.PeriodDrawable) this.f$0).invalidateSelf();
                return;
            case 3:
                ((CollageLayoutView2.Part) this.f$0).pendingSeek = -1L;
                return;
            case 4:
                StoryRecorder.AnonymousClass37 anonymousClass37 = (StoryRecorder.AnonymousClass37) this.f$0;
                EntityView.SelectionView selectionView = anonymousClass37.photoView.selectionView;
                if (selectionView != null) {
                    selectionView.updatePosition();
                }
                anonymousClass37.photoView.updatePosition();
                return;
            case 5:
                ((DraftSavedHint) this.f$0).show(false);
                return;
            case 6:
                PaintView.AnonymousClass22 anonymousClass22 = (PaintView.AnonymousClass22) this.f$0;
                Bulletin.hideVisible();
                SendGiftSheet.AnonymousClass8 anonymousClass8 = new SendGiftSheet.AnonymousClass8(anonymousClass22);
                PremiumFeatureBottomSheet premiumFeatureBottomSheet = new PremiumFeatureBottomSheet(anonymousClass8, anonymousClass8.getContext(), anonymousClass8.getCurrentAccount(), false, 14, false, null);
                premiumFeatureBottomSheet.setOnDismissListener(new EmojiBottomSheet$$ExternalSyntheticLambda4(0));
                premiumFeatureBottomSheet.show();
                return;
            case 7:
                ((EmojiBottomSheet.GifPage.GifAdapter) this.f$0).request();
                return;
            case 8:
                EmojiBottomSheet.Page.Adapter adapter = (EmojiBottomSheet.Page.Adapter) this.f$0;
                EmojiBottomSheet.Page page = EmojiBottomSheet.Page.this;
                MediaDataController mediaDataController = MediaDataController.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount);
                String str = adapter.query;
                if (!"premium".equalsIgnoreCase(str)) {
                    int i2 = page.currentType;
                    EmojiBottomSheet emojiBottomSheet = EmojiBottomSheet.this;
                    if (i2 == 1 && Emoji.fullyConsistsOfEmojis(adapter.query)) {
                        TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                        tL_messages_getStickers.emoticon = adapter.query;
                        tL_messages_getStickers.hash = 0L;
                        ConnectionsManager.getInstance(((BottomSheet) emojiBottomSheet).currentAccount).sendRequest(tL_messages_getStickers, new StarGiftSheet$$ExternalSyntheticLambda0(28, adapter, str));
                        return;
                    }
                    String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                    String[] strArr = adapter.lastLang;
                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                        MediaDataController.getInstance(((BottomSheet) emojiBottomSheet).currentAccount).fetchNewEmojiKeywords(currentKeyboardLanguage);
                    }
                    adapter.lastLang = currentKeyboardLanguage;
                    mediaDataController.getEmojiSuggestions(currentKeyboardLanguage, adapter.query, false, new StoryPrivacyBottomSheet$$ExternalSyntheticLambda2(adapter, str, mediaDataController), null, false, false, false, true, 50, false);
                    return;
                }
                ArrayList<TLRPC.Document> recentStickers = mediaDataController.getRecentStickers(7);
                adapter.itemsCount = 0;
                ArrayList arrayList = adapter.documents;
                arrayList.clear();
                ArrayList arrayList2 = adapter.documentIds;
                arrayList2.clear();
                adapter.positionToSection.clear();
                adapter.stickerSets.clear();
                adapter.itemsCount++;
                arrayList.add(null);
                arrayList2.add(0L);
                arrayList.addAll(recentStickers);
                adapter.itemsCount = recentStickers.size() + adapter.itemsCount;
                adapter.activeQuery = adapter.query;
                adapter.notifyDataSetChanged();
                EmojiBottomSheet.EmojiListView.access$4100(page.listView, 0, 0);
                page.searchField.showProgress(false);
                page.tabsStrip.showSelected(false);
                return;
            case 9:
                EmojiBottomSheet.SearchField searchField = EmojiBottomSheet.SearchField.this;
                if (searchField.clearVisible) {
                    return;
                }
                searchField.clear.setVisibility(8);
                return;
            case 10:
                EmojiBottomSheet.StoryWidgetsCell.ReactionWidget reactionWidget = (EmojiBottomSheet.StoryWidgetsCell.ReactionWidget) ((zzq) this.f$0).zza;
                if (reactionWidget.visibleReactions.isEmpty()) {
                    return;
                }
                reactionWidget.progressToNext.set(0.0f, true);
                int i3 = reactionWidget.currentIndex + 1;
                reactionWidget.currentIndex = i3;
                ArrayList arrayList3 = reactionWidget.visibleReactions;
                if (i3 > arrayList3.size() - 1) {
                    reactionWidget.currentIndex = 0;
                }
                ReactionImageHolder reactionImageHolder = reactionWidget.nextReactionHolder;
                reactionImageHolder.setVisibleReaction((ReactionsLayoutInBubble.VisibleReaction) arrayList3.get(reactionWidget.currentIndex));
                reactionWidget.nextReactionHolder = reactionWidget.reactionHolder;
                reactionWidget.reactionHolder = reactionImageHolder;
                EmojiBottomSheet.StoryWidgetsCell.this.invalidate();
                return;
            case 11:
                ((FfmpegAudioWaveformLoader) this.f$0).lambda$destroy$2();
                return;
            case 12:
                ((GalleryListView.Cell) this.f$0).loadBitmap(null);
                return;
            case 13:
                ((GalleryListView.SearchAdapter) this.f$0).loadInternal();
                return;
            case 14:
                LivePlayer livePlayer = (LivePlayer) this.f$0;
                if (livePlayer.outgoing) {
                    return;
                }
                PermissionRequest.ensureAllPermissions(R.raw.permission_request_camera, R.string.PermissionNoCameraMicVideo, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new RichEditor$$ExternalSyntheticLambda53(livePlayer, 3));
                return;
            case 15:
                StoryRecorder.AnonymousClass11 anonymousClass11 = (StoryRecorder.AnonymousClass11) this.f$0;
                if (anonymousClass11.hintShown) {
                    anonymousClass11.hintShown = false;
                    anonymousClass11.invalidate();
                    return;
                }
                return;
            case 16:
                RecordControl.RecordControlAccessibilityHelper recordControlAccessibilityHelper = (RecordControl.RecordControlAccessibilityHelper) this.f$0;
                recordControlAccessibilityHelper.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                RecordControl recordControl = RecordControl.this;
                recordControl.recordingStart = jCurrentTimeMillis;
                recordControl.lastDuration = 0L;
                recordControl.recording = true;
                StoryRecorder.this.videoTimerView.setDuration(0L, true);
                recordControl.invalidate();
                return;
            case 17:
                ButtonWithCounterView buttonWithCounterView = (ButtonWithCounterView) this.f$0;
                if (buttonWithCounterView != null) {
                    buttonWithCounterView.setLoading(false);
                    return;
                }
                return;
            case 18:
                StoryPrivacyBottomSheet.SearchUsersCell.this.fullScroll(130);
                return;
            case 19:
                StoryRecorder.WindowView windowView = (StoryRecorder.WindowView) this.f$0;
                windowView.scaleGestureDetector.onTouchEvent(AndroidUtilities.emptyMotionEvent());
                windowView.gestureDetector.onTouchEvent(AndroidUtilities.emptyMotionEvent());
                return;
            case 20:
                ((Utilities.Callback) this.f$0).run(LaunchActivity.getSafeLastFragment());
                return;
            case 21:
                StoryRecorder storyRecorder = StoryRecorder.this;
                storyRecorder.destroyCameraView(true);
                storyRecorder.collageLayoutView.setCameraThumb(storyRecorder.getCameraThumb());
                return;
            case 22:
                StoryRecorder.this.trash.setVisibility(8);
                return;
            case 23:
                StoryRecorder.AnonymousClass25 anonymousClass25 = (StoryRecorder.AnonymousClass25) this.f$0;
                StoryRecorder storyRecorder2 = StoryRecorder.this;
                if (storyRecorder2.takingVideo || storyRecorder2.takingPhoto || storyRecorder2.cameraView == null || storyRecorder2.currentPage != 0 || storyRecorder2.savedDualHint == null) {
                    return;
                }
                String string = LocaleController.getString(anonymousClass25.isFrontface() ? R.string.StoryCameraSavedDualBackHint : R.string.StoryCameraSavedDualFrontHint);
                HintView2 hintView2 = storyRecorder2.savedDualHint;
                hintView2.setMaxWidthPx(HintView2.cutInFancyHalf(string, hintView2.getTextPaint()));
                storyRecorder2.savedDualHint.setText(string);
                storyRecorder2.savedDualHint.show();
                MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) + 1).apply();
                return;
            case 24:
                ((BackupImageView) this.f$0).setVisibility(8);
                return;
            case 25:
                DialogStoriesCell.StoryCell storyCell = (DialogStoriesCell.StoryCell) this.f$0;
                storyCell.drawAvatar = false;
                storyCell.invalidate();
                return;
            case 26:
                TimelineView.AudioWaveformLoader audioWaveformLoader = (TimelineView.AudioWaveformLoader) this.f$0;
                audioWaveformLoader.getClass();
                try {
                    int iRound = Math.round(((audioWaveformLoader.duration * ((long) audioWaveformLoader.inputFormat.getInteger("sample-rate"))) / audioWaveformLoader.count) / 5.0f);
                    MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(audioWaveformLoader.inputFormat.getString("mime"));
                    if (mediaCodecCreateDecoderByType == null) {
                        return;
                    }
                    mediaCodecCreateDecoderByType.configure(audioWaveformLoader.inputFormat, (Surface) null, (MediaCrypto) null, 0);
                    mediaCodecCreateDecoderByType.start();
                    mediaCodecCreateDecoderByType.getInputBuffers();
                    mediaCodecCreateDecoderByType.getOutputBuffers();
                    short[] sArr = new short[32];
                    int iDequeueOutputBuffer = -1;
                    int i4 = 0;
                    boolean z2 = false;
                    int i5 = 0;
                    int i6 = 0;
                    short s2 = 0;
                    while (true) {
                        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                        int iDequeueInputBuffer = mediaCodecCreateDecoderByType.dequeueInputBuffer(2500L);
                        if (iDequeueInputBuffer >= 0) {
                            int sampleData = audioWaveformLoader.extractor.readSampleData(mediaCodecCreateDecoderByType.getInputBuffer(iDequeueInputBuffer), i);
                            if (sampleData < 0) {
                                mediaCodecCreateDecoderByType.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                                bufferInfo = bufferInfo2;
                                z2 = true;
                            } else {
                                bufferInfo = bufferInfo2;
                                mediaCodecCreateDecoderByType.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, audioWaveformLoader.extractor.getSampleTime(), 0);
                                audioWaveformLoader.extractor.advance();
                            }
                        } else {
                            bufferInfo = bufferInfo2;
                        }
                        if (iDequeueOutputBuffer >= 0) {
                            mediaCodecCreateDecoderByType.getOutputBuffer(iDequeueOutputBuffer).position(i);
                        }
                        iDequeueOutputBuffer = mediaCodecCreateDecoderByType.dequeueOutputBuffer(bufferInfo, 2500L);
                        while (true) {
                            if (iDequeueOutputBuffer != -1 && !z2) {
                                if (iDequeueOutputBuffer >= 0) {
                                    ByteBuffer outputBuffer = mediaCodecCreateDecoderByType.getOutputBuffer(iDequeueOutputBuffer);
                                    if (outputBuffer == null || bufferInfo.size <= 0) {
                                        z = false;
                                    } else {
                                        int i7 = i6;
                                        while (true) {
                                            if (outputBuffer.remaining() > 0) {
                                                short s3 = (short) (((outputBuffer.get() & 255) << 8) | (outputBuffer.get() & 255));
                                                if (i7 >= iRound) {
                                                    sArr[i4 - i5] = s2;
                                                    i4++;
                                                    int i8 = i4 - i5;
                                                    if (i8 >= sArr.length || i4 >= audioWaveformLoader.count) {
                                                        short[] sArr2 = new short[sArr.length];
                                                        AndroidUtilities.runOnUIThread(new RichTextCell$2$$ExternalSyntheticLambda1(audioWaveformLoader, sArr, i8, 24));
                                                        sArr = sArr2;
                                                        i5 = i4;
                                                    }
                                                    if (i4 >= audioWaveformLoader.data.length) {
                                                        z = false;
                                                        i6 = 0;
                                                        s2 = 0;
                                                    } else {
                                                        s = 0;
                                                        i7 = 0;
                                                    }
                                                } else {
                                                    s = s2;
                                                }
                                                s2 = s < s3 ? s3 : s;
                                                i7++;
                                                if (outputBuffer.remaining() >= 8) {
                                                    outputBuffer.position(outputBuffer.position() + 8);
                                                }
                                            }
                                            i6 = i7;
                                            z = false;
                                        }
                                    }
                                    mediaCodecCreateDecoderByType.releaseOutputBuffer(iDequeueOutputBuffer, z);
                                    if ((bufferInfo.flags & 4) != 0) {
                                        z2 = true;
                                    }
                                } else if (iDequeueOutputBuffer == -3) {
                                    mediaCodecCreateDecoderByType.getOutputBuffers();
                                }
                                iDequeueOutputBuffer = mediaCodecCreateDecoderByType.dequeueOutputBuffer(bufferInfo, 2500L);
                            }
                        }
                        synchronized (audioWaveformLoader.lock) {
                            try {
                                if (!audioWaveformLoader.stop) {
                                    i = (!z2 && i4 < audioWaveformLoader.count) ? 0 : 0;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    mediaCodecCreateDecoderByType.stop();
                    mediaCodecCreateDecoderByType.release();
                    audioWaveformLoader.extractor.release();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 27:
                TimelineView.Track track = (TimelineView.Track) this.f$0;
                TimelineView.VideoThumbsLoader videoThumbsLoader = track.thumbs;
                if (videoThumbsLoader != null) {
                    long j = videoThumbsLoader.duration;
                    if (j > 0) {
                        track.duration = j;
                        TimelineView timelineView = TimelineView.this;
                        ArrayList arrayList4 = timelineView.collageTracks;
                        Collections.sort(arrayList4, new CacheModel$$ExternalSyntheticLambda0(17));
                        timelineView.collageMain = arrayList4.isEmpty() ? null : (TimelineView.Track) arrayList4.get(0);
                        return;
                    }
                    return;
                }
                return;
            default:
                TimelineView.VideoThumbsLoader videoThumbsLoader2 = (TimelineView.VideoThumbsLoader) this.f$0;
                MediaMetadataRetriever mediaMetadataRetriever = videoThumbsLoader2.metadataRetriever;
                if (mediaMetadataRetriever == null) {
                    return;
                }
                Bitmap frameAtTime = null;
                try {
                    frameAtTime = mediaMetadataRetriever.getFrameAtTime(videoThumbsLoader2.nextFrame * 1000, 2);
                    if (frameAtTime != null) {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(videoThumbsLoader2.frameWidth, videoThumbsLoader2.frameHeight, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        float fMax = Math.max(videoThumbsLoader2.frameWidth / frameAtTime.getWidth(), videoThumbsLoader2.frameHeight / frameAtTime.getHeight());
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        Rect rect2 = new Rect((int) SvgHelper$SvgDrawable$$ExternalSyntheticOutline0.m(frameAtTime.getWidth(), fMax, bitmapCreateBitmap.getWidth(), 2.0f), (int) SvgHelper$SvgDrawable$$ExternalSyntheticOutline0.m(frameAtTime.getHeight(), fMax, bitmapCreateBitmap.getHeight(), 2.0f), (int) Fragment$$ExternalSyntheticOutline0.m(frameAtTime.getWidth(), fMax, bitmapCreateBitmap.getWidth(), 2.0f), (int) Fragment$$ExternalSyntheticOutline0.m(frameAtTime.getHeight(), fMax, bitmapCreateBitmap.getHeight(), 2.0f));
                        if (videoThumbsLoader2.isRound) {
                            if (videoThumbsLoader2.clipPath == null) {
                                videoThumbsLoader2.clipPath = new Path();
                            }
                            videoThumbsLoader2.clipPath.rewind();
                            videoThumbsLoader2.clipPath.addCircle(videoThumbsLoader2.frameWidth / 2.0f, videoThumbsLoader2.frameHeight / 2.0f, Math.min(videoThumbsLoader2.frameWidth, videoThumbsLoader2.frameHeight) / 2.0f, Path.Direction.CW);
                            canvas.clipPath(videoThumbsLoader2.clipPath);
                        }
                        canvas.drawBitmap(frameAtTime, rect, rect2, videoThumbsLoader2.bitmapPaint);
                        frameAtTime.recycle();
                        frameAtTime = bitmapCreateBitmap;
                    }
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
                AndroidUtilities.runOnUIThread(new RichTableCell$$ExternalSyntheticLambda3(9, videoThumbsLoader2, frameAtTime));
                return;
        }
    }
}
