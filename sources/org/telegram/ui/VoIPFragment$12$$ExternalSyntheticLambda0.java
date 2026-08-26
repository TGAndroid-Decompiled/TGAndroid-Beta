package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaMetadataRetriever;
import android.view.Surface;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.GestureDetectorFixDoubleTap$GestureDetectorCompatImplBase;
import org.telegram.ui.Components.Paint.Views.EntityView;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Reactions.ReactionImageHolder;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Gifts.SendGiftSheet;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.CollageLayoutView2;
import org.telegram.ui.Stories.recorder.DraftSavedHint;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.Stories.recorder.GalleryListView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.Stories.recorder.RecordControl;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.Stories.recorder.TimelineView;
import org.telegram.ui.TON.TONIntroActivity;
import org.telegram.ui.web.WebActionBar;

public final class VoIPFragment$12$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public VoIPFragment$12$$ExternalSyntheticLambda0(Object obj, int i) {
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
                VoIPFragment.this.updateViewState$1();
                return;
            case 1:
                ((CollageLayoutView2.Part) this.f$0).pendingSeek = -1L;
                return;
            case 2:
                StoryRecorder.AnonymousClass37 anonymousClass37 = (StoryRecorder.AnonymousClass37) this.f$0;
                EntityView.SelectionView selectionView = anonymousClass37.photoView.selectionView;
                if (selectionView != null) {
                    selectionView.updatePosition();
                }
                anonymousClass37.photoView.updatePosition();
                return;
            case 3:
                ((DraftSavedHint) this.f$0).show(false);
                return;
            case 4:
                PaintView.AnonymousClass22 anonymousClass22 = (PaintView.AnonymousClass22) this.f$0;
                Bulletin bulletin = Bulletin.visibleBulletin;
                if (bulletin != null) {
                    bulletin.hide();
                }
                SendGiftSheet.AnonymousClass8 anonymousClass8 = new SendGiftSheet.AnonymousClass8(anonymousClass22);
                PremiumFeatureBottomSheet premiumFeatureBottomSheet = new PremiumFeatureBottomSheet(anonymousClass8, LaunchActivity.instance, anonymousClass8.getCurrentAccount(), false, 14, false, null);
                premiumFeatureBottomSheet.setOnDismissListener(new SettingsActivity$$ExternalSyntheticLambda21(7));
                premiumFeatureBottomSheet.show();
                return;
            case 5:
                ((EmojiBottomSheet.GifPage.GifAdapter) this.f$0).request$1();
                return;
            case 6:
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
                        ConnectionsManager.getInstance(((BottomSheet) emojiBottomSheet).currentAccount).sendRequest(tL_messages_getStickers, new ThemeSetUrlActivity$$ExternalSyntheticLambda6(2, adapter, str));
                        return;
                    }
                    String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                    String[] strArr = adapter.lastLang;
                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                        MediaDataController.getInstance(((BottomSheet) emojiBottomSheet).currentAccount).fetchNewEmojiKeywords(currentKeyboardLanguage);
                    }
                    adapter.lastLang = currentKeyboardLanguage;
                    mediaDataController.getEmojiSuggestions(currentKeyboardLanguage, adapter.query, false, new VoIPFragment$$ExternalSyntheticLambda42(adapter, str, mediaDataController, 22), null, false, false, false, true, 50, false);
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
                adapter.mObservable.notifyChanged();
                EmojiBottomSheet.EmojiListView.access$4100(page.listView, 0, 0);
                page.searchField.showProgress(false);
                EmojiBottomSheet.Page.AnonymousClass3 anonymousClass3 = page.tabsStrip;
                anonymousClass3.showSelected = false;
                anonymousClass3.contentView.invalidate();
                return;
            case 7:
                EmojiBottomSheet.SearchField searchField = (EmojiBottomSheet.SearchField) ((WebActionBar.AnonymousClass5) this.f$0).this$0;
                if (searchField.clearVisible) {
                    return;
                }
                searchField.clear.setVisibility(8);
                return;
            case 8:
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
            case 9:
                ((FfmpegAudioWaveformLoader) this.f$0).lambda$destroy$2();
                return;
            case 10:
                ((GalleryListView.Cell) this.f$0).loadBitmap(null);
                return;
            case 11:
                ((GalleryListView.SearchAdapter) this.f$0).loadInternal();
                return;
            case 12:
                StoryRecorder.AnonymousClass11 anonymousClass11 = (StoryRecorder.AnonymousClass11) this.f$0;
                if (anonymousClass11.hintShown) {
                    anonymousClass11.hintShown = false;
                    anonymousClass11.invalidate();
                    return;
                }
                return;
            case 13:
                ((StoryRecorder.AnonymousClass7) this.f$0).setupGradient();
                return;
            case 14:
                RecordControl.RecordControlAccessibilityHelper recordControlAccessibilityHelper = (RecordControl.RecordControlAccessibilityHelper) this.f$0;
                recordControlAccessibilityHelper.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                RecordControl recordControl = recordControlAccessibilityHelper.this$0;
                recordControl.recordingStart = jCurrentTimeMillis;
                recordControl.lastDuration = 0L;
                recordControl.recording = true;
                StoryRecorder.this.videoTimerView.setDuration(0L, true);
                recordControl.invalidate();
                return;
            case 15:
                ButtonWithCounterView buttonWithCounterView = (ButtonWithCounterView) this.f$0;
                if (buttonWithCounterView != null) {
                    buttonWithCounterView.setLoading(false);
                    return;
                }
                return;
            case 16:
                ((StoryPrivacyBottomSheet.SearchUsersCell) ((StoryPrivacyBottomSheet.SearchUsersCell.SpansContainer) this.f$0).this$0).fullScroll(130);
                return;
            case 17:
                StoryRecorder.WindowView windowView = (StoryRecorder.WindowView) this.f$0;
                windowView.scaleGestureDetector.onTouchEvent(AndroidUtilities.emptyMotionEvent());
                ((GestureDetectorFixDoubleTap$GestureDetectorCompatImplBase) windowView.gestureDetector.this$0).onTouchEvent(AndroidUtilities.emptyMotionEvent());
                return;
            case 18:
                StoryRecorder storyRecorder = StoryRecorder.this;
                storyRecorder.destroyCameraView(true);
                storyRecorder.collageLayoutView.setCameraThumb(storyRecorder.getCameraThumb());
                return;
            case 19:
                StoryRecorder.this.trash.setVisibility(8);
                return;
            case 20:
                StoryRecorder.AnonymousClass25 anonymousClass25 = (StoryRecorder.AnonymousClass25) this.f$0;
                StoryRecorder storyRecorder2 = StoryRecorder.this;
                if (storyRecorder2.takingVideo || storyRecorder2.takingPhoto || storyRecorder2.cameraView == null || storyRecorder2.currentPage != 0 || storyRecorder2.savedDualHint == null) {
                    return;
                }
                String string = LocaleController.getString(anonymousClass25.isFrontface() ? R.string.StoryCameraSavedDualBackHint : R.string.StoryCameraSavedDualFrontHint);
                HintView2 hintView2 = storyRecorder2.savedDualHint;
                hintView2.textMaxWidth = HintView2.cutInFancyHalf(string, hintView2.getTextPaint());
                storyRecorder2.savedDualHint.setText(string);
                storyRecorder2.savedDualHint.show();
                MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) + 1).apply();
                return;
            case 21:
                ((BackupImageView) this.f$0).setVisibility(8);
                return;
            case 22:
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
                                                        AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda2(audioWaveformLoader, sArr, i8, 14));
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
            case 23:
                TimelineView.Track track = (TimelineView.Track) this.f$0;
                TimelineView.VideoThumbsLoader videoThumbsLoader = track.thumbs;
                if (videoThumbsLoader != null) {
                    long j = videoThumbsLoader.duration;
                    if (j > 0) {
                        track.duration = j;
                        TimelineView timelineView = TimelineView.this;
                        ArrayList arrayList4 = timelineView.collageTracks;
                        Collections.sort(arrayList4, new OAuthSheet$$ExternalSyntheticLambda3(18));
                        timelineView.collageMain = arrayList4.isEmpty() ? null : (TimelineView.Track) arrayList4.get(0);
                        return;
                    }
                    return;
                }
                return;
            case 24:
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
                        Rect rect2 = new Rect((int) SvgHelper$SvgDrawable$$ExternalSyntheticOutline0.m(frameAtTime.getWidth(), fMax, bitmapCreateBitmap.getWidth(), 2.0f), (int) SvgHelper$SvgDrawable$$ExternalSyntheticOutline0.m(frameAtTime.getHeight(), fMax, bitmapCreateBitmap.getHeight(), 2.0f), (int) SurfaceContainer$$ExternalSyntheticOutline0.m$1(frameAtTime.getWidth(), fMax, bitmapCreateBitmap.getWidth(), 2.0f), (int) SurfaceContainer$$ExternalSyntheticOutline0.m$1(frameAtTime.getHeight(), fMax, bitmapCreateBitmap.getHeight(), 2.0f));
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
                AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda9(6, videoThumbsLoader2, frameAtTime));
                return;
            case 25:
                TONIntroActivity.NestedFrameLayout nestedFrameLayout = (TONIntroActivity.NestedFrameLayout) this.f$0;
                nestedFrameLayout.getClass();
                try {
                    RecyclerListView currentListView = ((TONIntroActivity) nestedFrameLayout.this$0).transactionsLayout.getCurrentListView();
                    if (currentListView == null || currentListView.getAdapter() == null) {
                        return;
                    }
                    currentListView.getAdapter().notifyDataSetChanged();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 26:
                TopicsFragment.this.adapter.notifyDataSetChanged();
                return;
            case 27:
                TopicsFragment.this.clearSelectedTopics();
                return;
            case 28:
                ((VoIPFeedbackActivity) this.f$0).finish();
                return;
            default:
                VoIPFragment.this.updateViewState$1();
                return;
        }
    }
}
