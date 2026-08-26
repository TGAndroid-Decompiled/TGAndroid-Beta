package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService$1$$ExternalSyntheticLambda0;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Components.Paint.Views.LinkPreview;
import org.telegram.ui.Components.PlayPauseDrawable;
import org.telegram.ui.Components.Premium.VideoScreenPreview;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.VideoEditTextureView;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.LivePlayer;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.StoryViewer$5$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.bots.BotPreviewsEditContainer;
import org.telegram.ui.Stories.recorder.CaptionContainerView;
import org.telegram.ui.Stories.recorder.CollageLayoutView2;
import org.telegram.ui.Stories.recorder.DownloadButton;
import org.telegram.ui.Stories.recorder.FlashViews;
import org.telegram.ui.Stories.recorder.GalleryListView;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.Stories.recorder.PreviewView;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryLinkSheet;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.bots.BotBiometrySettings;
import org.telegram.ui.community.CommunityCreateActivity;
import org.telegram.ui.iv.BlockRow;
import org.telegram.ui.iv.ChatAttachAlertRichLayout;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.iv.RichEditorHistory;
import org.telegram.ui.iv.RichEditorListView;
import org.telegram.ui.iv.RichTableCell$$ExternalSyntheticLambda3;
import org.telegram.ui.iv.RichTextCell;
import org.telegram.ui.iv.RichTextStyle;
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda1;

public final class VoIPFragment$$ExternalSyntheticLambda7 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;

    public VoIPFragment$$ExternalSyntheticLambda7(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run(Object obj) {
        int i;
        int i2;
        ThemeActivity.ListAdapter listAdapter;
        UniversalAdapter universalAdapter;
        CharSequence text;
        int i3 = 14;
        int i4 = 0;
        z = false;
        boolean z = false;
        switch (this.$r8$classId) {
            case 0:
                ((VoIPFragment) this.f$0).updateKeyView(true);
                break;
            case 1:
                StarGiftSheet.ActionView actionView = (StarGiftSheet.ActionView) this.f$0;
                actionView.getClass();
                actionView.blurMatrix = new Matrix();
                actionView.blurInvertMatrix = new Matrix();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader((Bitmap) obj, tileMode, tileMode);
                actionView.blurBitmapShader = bitmapShader;
                Paint paint = actionView.bgPaint;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.25f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 2:
                TL_stars.StarGifts starGifts = (TL_stars.StarGifts) obj;
                StarsController starsController = (StarsController) this.f$0;
                starsController.giftsLoading = false;
                starsController.giftsLoaded = true;
                boolean z2 = starGifts instanceof TL_stars.TL_starGifts;
                ArrayList arrayList = starsController.gifts;
                if (z2) {
                    TL_stars.TL_starGifts tL_starGifts = (TL_stars.TL_starGifts) starGifts;
                    int i5 = starsController.currentAccount;
                    MessagesController.getInstance(i5).putUsers(tL_starGifts.users, false);
                    MessagesController.getInstance(i5).putChats(tL_starGifts.chats, false);
                    MessagesStorage.getInstance(i5).putUsersAndChats(tL_starGifts.users, tL_starGifts.chats, true, true);
                    arrayList.clear();
                    arrayList.addAll(tL_starGifts.gifts);
                    ArrayList arrayList2 = starsController.birthdaySortedGifts;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    Collections.sort(arrayList2, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(i3)), new TableModel$$ExternalSyntheticLambda1(15)));
                    ArrayList arrayList3 = starsController.sortedGifts;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    Collections.sort(arrayList3, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(16)));
                    starsController.giftsHash = tL_starGifts.hash;
                    starsController.giftsRemoteTime = System.currentTimeMillis();
                    NotificationCenter.getInstance(i5).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftsLoaded, new Object[0]);
                    starsController.saveStarGiftsCached(starsController.giftsHash, starsController.giftsRemoteTime, tL_starGifts.gifts);
                } else if (starGifts instanceof TL_stars.TL_starGiftsNotModified) {
                    int i6 = starsController.giftsHash;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    starsController.giftsRemoteTime = jCurrentTimeMillis;
                    starsController.saveStarGiftsCached(i6, jCurrentTimeMillis, arrayList);
                }
                break;
            case 3:
                ((BottomSheet) this.f$0).dismiss(((Boolean) obj).booleanValue());
                break;
            case 4:
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift != null) {
                    boolean z3 = starGift instanceof TL_stars.TL_starGiftUnique;
                    TextView textView = (TextView) this.f$0;
                    if (z3) {
                        textView.setText(starGift.availability_remains <= 0 ? LocaleController.formatPluralStringComma("Gift2QuantityIssuedNone", starGift.availability_total) : LocaleController.formatPluralStringComma("Gift2QuantityIssued1", starGift.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", starGift.availability_total));
                    } else {
                        int i7 = starGift.availability_remains;
                        int i8 = starGift.availability_total;
                        textView.setText(i7 <= 0 ? LocaleController.formatPluralStringComma("Gift2Availability2ValueNone", i8) : LocaleController.formatPluralStringComma("Gift2Availability4Value", i7, LocaleController.formatNumber(i8, ',')));
                    }
                    break;
                }
                break;
            case 5:
                ((StickersActivity) this.f$0).setQuickReactionImage((View) obj);
                break;
            case 6:
                LivePlayer livePlayer = (LivePlayer) this.f$0;
                livePlayer.getClass();
                if (((Boolean) obj).booleanValue() && !livePlayer.destroyed) {
                    livePlayer.outgoing = true;
                    livePlayer.isFront = true;
                    livePlayer.setPolling(false);
                    LivePlayer.recording = livePlayer;
                    livePlayer.recordingVideoCapturer = NativeInstance.createVideoCapturer(livePlayer.instanceSink, livePlayer.isFront ? 1 : 0);
                    if (livePlayer.instance != null) {
                        DispatchQueue dispatchQueue = Utilities.globalQueue;
                        NativeInstance nativeInstance = livePlayer.instance;
                        Objects.requireNonNull(nativeInstance);
                        dispatchQueue.postRunnable(new VoIPService$1$$ExternalSyntheticLambda0(nativeInstance, 4));
                        livePlayer.srcs.clear();
                        livePlayer.instance = null;
                    }
                    livePlayer.configureAudio();
                    livePlayer.init$4();
                    NotificationCenter.getInstance(livePlayer.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(livePlayer.inputCall.id));
                }
                break;
            case 7:
                PeerStoriesView peerStoriesView = (PeerStoriesView) this.f$0;
                peerStoriesView.getClass();
                peerStoriesView.messageStars = ((Long) obj).longValue();
                PeerStoriesView.AnonymousClass19 anonymousClass19 = peerStoriesView.chatActivityEnterView;
                if (anonymousClass19 != null) {
                    anonymousClass19.checkSendButton(true);
                    peerStoriesView.chatActivityEnterView.updateSendButtonPaid();
                }
                peerStoriesView.checkStealthMode(true);
                break;
            case 8:
                StoryViewer storyViewer = (StoryViewer) this.f$0;
                if (storyViewer != null) {
                    storyViewer.isOverlayVisible = false;
                    storyViewer.updatePlayingMode();
                }
                break;
            case 9:
                StoriesController storiesController = (StoriesController) this.f$0;
                StoriesController.StoriesList storiesList = (StoriesController.StoriesList) obj;
                storiesController.getClass();
                int i9 = storiesList.type;
                long j = storiesList.dialogId;
                if (i9 != 0 || (i = storiesList.albumId) <= 0) {
                    HashMap map = storiesController.storiesLists[i9];
                    if (map != null) {
                        map.remove(Long.valueOf(j));
                    }
                    break;
                } else {
                    HashMap map2 = storiesController.storiesAlbumsLists;
                    HashMap map3 = (HashMap) map2.get(Long.valueOf(j));
                    if (map3 != null) {
                        map3.remove(Integer.valueOf(i));
                        if (map3.isEmpty()) {
                            map2.remove(Long.valueOf(j));
                        }
                        break;
                    }
                }
                break;
            case 10:
                String str = (String) obj;
                BotPreviewsEditContainer botPreviewsEditContainer = (BotPreviewsEditContainer) this.f$0;
                ArrayList arrayList4 = botPreviewsEditContainer.localLangs;
                if (!arrayList4.contains(str)) {
                    arrayList4.add(str);
                    botPreviewsEditContainer.updateLangs(true);
                }
                AndroidUtilities.runOnUIThread(new StoryViewer$5$$ExternalSyntheticLambda0(i3, botPreviewsEditContainer, str), 120L);
                break;
            case 11:
                ((CaptionContainerView) this.f$0).updateKeyboard(((Integer) obj).intValue());
                break;
            case 12:
                CollageLayoutView2 collageLayoutView2 = (CollageLayoutView2) this.f$0;
                collageLayoutView2.longPressedPart.content.videoVolume = ((Float) obj).floatValue();
                CollageLayoutView2.Part part = collageLayoutView2.longPressedPart;
                VideoScreenPreview.AnonymousClass3 anonymousClass3 = part.videoPlayer;
                if (anonymousClass3 != null) {
                    anonymousClass3.setVolume(part.content.videoVolume);
                }
                break;
            case 13:
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                DownloadButton.BuildingVideo buildingVideo = (DownloadButton.BuildingVideo) this.f$0;
                MessageObject messageObject = buildingVideo.messageObject;
                if (messageObject != null) {
                    messageObject.videoEditedInfo = videoEditedInfo;
                    MediaController.getInstance().scheduleVideoConvert(buildingVideo.messageObject);
                    break;
                }
                break;
            case 14:
                FlashViews flashViews = (FlashViews) this.f$0;
                flashViews.setScreenBrightness(-1.0f);
                AndroidUtilities.runOnUIThread(new StoryViewer$5$$ExternalSyntheticLambda0(17, flashViews, (Runnable) obj), 80L);
                break;
            case 15:
                ((GalleryListView) this.f$0).searchEmptyView.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator).start();
                break;
            case 16:
                StoryRecorder.AnonymousClass24 anonymousClass24 = (StoryRecorder.AnonymousClass24) ((PaintView) this.f$0);
                StoryRecorder storyRecorder = StoryRecorder.this;
                storyRecorder.previewView.setupAudio((MessageObject) obj);
                StoryEntry storyEntry = storyRecorder.outputEntry;
                if (storyEntry != null && storyRecorder.mode != 1) {
                    boolean zIsEmpty = TextUtils.isEmpty(storyEntry.audioPath);
                    boolean z4 = !zIsEmpty;
                    ((PlayPauseDrawable) storyRecorder.playButton.this$0).setPause(storyRecorder.previewView.pauseLinks.contains(-9982), false);
                    storyRecorder.playButton.setVisibility(0);
                    storyRecorder.playButton.animate().alpha(!zIsEmpty ? 1.0f : 0.0f).withEndAction(new TodoItemMenu$$ExternalSyntheticLambda5(15, anonymousClass24, z4)).start();
                }
                if (storyRecorder.collageLayoutView.hasLayout()) {
                    ArrayList arrayList5 = storyRecorder.collageLayoutView.parts;
                    int size = arrayList5.size();
                    while (true) {
                        if (i4 < size) {
                            Object obj2 = arrayList5.get(i4);
                            i4++;
                            StoryEntry storyEntry2 = ((CollageLayoutView2.Part) obj2).content;
                            if (storyEntry2 != null && storyEntry2.isVideo) {
                                i2 = TextUtils.isEmpty(storyRecorder.outputEntry.audioPath) ? -1 : 2;
                            }
                        }
                    }
                }
                storyRecorder.switchToEditMode(i2, true, true);
                break;
            case 17:
                StoryEntry.HDRInfo hDRInfo = (StoryEntry.HDRInfo) obj;
                VideoEditTextureView videoEditTextureView = ((PreviewView) this.f$0).textureView;
                if (videoEditTextureView != null) {
                    videoEditTextureView.setHDRInfo(hDRInfo);
                }
                break;
            case 18:
                LinkPreview.WebPagePreview webPagePreview = (LinkPreview.WebPagePreview) obj;
                StoryLinkSheet storyLinkSheet = (StoryLinkSheet) this.f$0;
                if (webPagePreview == null) {
                    storyLinkSheet.closePreview();
                } else {
                    storyLinkSheet.getClass();
                    storyLinkSheet.photoLarge = webPagePreview.largePhoto;
                    storyLinkSheet.captionAbove = webPagePreview.captionAbove;
                }
                break;
            case 19:
                StoryPrivacyBottomSheet.this.commentsPrice = ((Integer) obj).intValue();
                break;
            case 20:
                ((StoryRecorder.AnonymousClass13) this.f$0).takePicture((Utilities.Callback) obj);
                break;
            case 21:
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                ThemeActivity themeActivity = (ThemeActivity) this.f$0;
                RecyclerListView recyclerListView = themeActivity.listView;
                if (recyclerListView != null && recyclerListView.mIsAttached && (listAdapter = themeActivity.listAdapter) != null) {
                    int i10 = themeActivity.sensitiveContentRow;
                    boolean z5 = i10 >= 0;
                    if (contentsettings != null && contentsettings.sensitive_can_change) {
                        z = true;
                    }
                    if (z5 == z) {
                        listAdapter.notifyItemChanged(i10);
                    } else {
                        themeActivity.updateRows$8(true);
                    }
                    break;
                }
                break;
            case 22:
                ThemePreviewActivity themePreviewActivity = (ThemePreviewActivity) this.f$0;
                themePreviewActivity.getClass();
                themePreviewActivity.dimAmount = ((Float) obj).floatValue();
                themePreviewActivity.backgroundImage.invalidate();
                themePreviewActivity.invalidateBlur$2();
                break;
            case 23:
                ((PollItemMenu.AnonymousClass3) this.f$0).scrollToPosition$1(((Integer) obj).intValue());
                break;
            case 24:
                BotBiometrySettings botBiometrySettings = (BotBiometrySettings) this.f$0;
                ArrayList arrayList6 = botBiometrySettings.biometryBots;
                arrayList6.clear();
                arrayList6.addAll((ArrayList) obj);
                UniversalRecyclerView universalRecyclerView = botBiometrySettings.listView;
                if (universalRecyclerView != null && (universalAdapter = universalRecyclerView.adapter) != null) {
                    universalAdapter.update(true);
                    break;
                }
                break;
            case 25:
                ArrayList arrayList7 = (ArrayList) obj;
                CommunityCreateActivity communityCreateActivity = (CommunityCreateActivity) this.f$0;
                ArrayList arrayList8 = communityCreateActivity.joinedCommunities;
                boolean z6 = arrayList8 == null || arrayList8.isEmpty();
                communityCreateActivity.joinedCommunities = arrayList7;
                UniversalRecyclerView universalRecyclerView2 = communityCreateActivity.listView;
                if (universalRecyclerView2 != null) {
                    universalRecyclerView2.adapter.update(z6);
                }
                break;
            case 26:
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                RichEditorListView.AnonymousClass4 anonymousClass4 = (RichEditorListView.AnonymousClass4) this.f$0;
                if (richMessage == null) {
                    anonymousClass4.getClass();
                    break;
                } else {
                    RichEditorListView richEditorListView = RichEditorListView.this;
                    int size2 = richEditorListView.rows.size();
                    int i11 = anonymousClass4.val$startRowIdx;
                    if (i11 < size2) {
                        ArrayList arrayList9 = richEditorListView.rows;
                        int size3 = arrayList9.size();
                        int i12 = anonymousClass4.val$endRowIdx;
                        if (i12 < size3) {
                            RichEditorHistory richEditorHistory = richEditorListView.history;
                            if (richEditorHistory != null) {
                                AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                                richEditorHistory.commit();
                            }
                            RichEditorListView.AnonymousClass1 anonymousClass1 = richEditorListView.textSelectionHelper;
                            if (anonymousClass1 != null) {
                                anonymousClass1.clear(false);
                            }
                            BlockRow blockRow = (BlockRow) arrayList9.get(i11);
                            BlockRow blockRow2 = (BlockRow) arrayList9.get(i12);
                            CharSequence text2 = "";
                            if (RichEditorListView.isFormattable(blockRow.block)) {
                                View viewFindViewByItemObject = richEditorListView.findViewByItemObject(blockRow);
                                text = viewFindViewByItemObject instanceof RichTextCell ? ((RichTextCell) viewFindViewByItemObject).getEditText().getText() : RichTextCell.readStyledText(blockRow.block);
                            } else {
                                text = "";
                            }
                            if (RichEditorListView.isFormattable(blockRow2.block)) {
                                View viewFindViewByItemObject2 = richEditorListView.findViewByItemObject(blockRow2);
                                text2 = viewFindViewByItemObject2 instanceof RichTextCell ? ((RichTextCell) viewFindViewByItemObject2).getEditText().getText() : RichTextCell.readStyledText(blockRow2.block);
                            }
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text.subSequence(0, Math.max(0, Math.min(anonymousClass4.val$sOff, text.length()))));
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(text2.subSequence(Math.max(0, Math.min(anonymousClass4.val$eOff, text2.length())), text2.length()));
                            ArrayList arrayList10 = new ArrayList();
                            RichEditorListView.flattenBlocks(arrayList10, richMessage.blocks, null);
                            if (arrayList10.isEmpty()) {
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                                spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                                int i13 = RichTextCell.$r8$clinit;
                                pageblockparagraph.text = RichTextStyle.fromSpannable(spannableStringBuilder3);
                                arrayList10.add(new BlockRow(pageblockparagraph, blockRow.level, blockRow.num));
                            } else {
                                if (spannableStringBuilder.length() > 0) {
                                    BlockRow blockRow3 = (BlockRow) arrayList10.get(0);
                                    if (RichEditorListView.isFormattable(blockRow3.block)) {
                                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                        spannableStringBuilder4.append((CharSequence) RichTextCell.readStyledText(blockRow3.block));
                                        blockRow3.block.text = RichTextStyle.fromSpannable(spannableStringBuilder4);
                                    } else {
                                        TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                        int i14 = RichTextCell.$r8$clinit;
                                        pageblockparagraph2.text = RichTextStyle.fromSpannable(spannableStringBuilder);
                                        arrayList10.add(0, new BlockRow(pageblockparagraph2, blockRow.level, blockRow.num));
                                    }
                                }
                                if (spannableStringBuilder2.length() > 0) {
                                    BlockRow blockRow4 = (BlockRow) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList10);
                                    if (RichEditorListView.isFormattable(blockRow4.block)) {
                                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(RichTextCell.readStyledText(blockRow4.block));
                                        spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                        blockRow4.block.text = RichTextStyle.fromSpannable(spannableStringBuilder5);
                                    } else {
                                        TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                        int i15 = RichTextCell.$r8$clinit;
                                        pageblockparagraph3.text = RichTextStyle.fromSpannable(spannableStringBuilder2);
                                        arrayList10.add(new BlockRow(pageblockparagraph3, blockRow2.level, blockRow2.num));
                                    }
                                }
                            }
                            TL_iv.RichMessage richMessage2 = richEditorListView.loadedRichMessage;
                            if (richMessage2 == null) {
                                richEditorListView.loadedRichMessage = richMessage;
                            } else {
                                ArrayList<TLRPC.Photo> arrayList11 = richMessage.photos;
                                if (arrayList11 != null) {
                                    richMessage2.photos.addAll(arrayList11);
                                }
                                ArrayList<TLRPC.Document> arrayList12 = richMessage.documents;
                                if (arrayList12 != null) {
                                    richEditorListView.loadedRichMessage.documents.addAll(arrayList12);
                                }
                            }
                            for (int i16 = 0; i16 < arrayList10.size(); i16++) {
                                richEditorListView.resolveLoadedMedia((BlockRow) arrayList10.get(i16));
                            }
                            while (i12 >= i11) {
                                arrayList9.remove(i12);
                                i12--;
                            }
                            arrayList9.addAll(i11, arrayList10);
                            richEditorListView.renumberAllRuns();
                            richEditorListView.adapter.update(false);
                            RichEditorHistory richEditorHistory2 = richEditorListView.history;
                            if (richEditorHistory2 != null) {
                                richEditorHistory2.record();
                            }
                            richEditorListView.delegate.onContentChanged();
                            richEditorListView.post(new RichTableCell$$ExternalSyntheticLambda3(15, anonymousClass4, arrayList10.isEmpty() ? null : (BlockRow) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList10)));
                            break;
                        }
                    }
                }
                break;
            case 27:
                ChatAttachAlertRichLayout.this.listView.addRichMessage((TL_iv.RichMessage) obj);
                break;
            case 28:
                ((RichEditor) this.f$0).listView.addRichMessage((TL_iv.RichMessage) obj);
                break;
            default:
                String str2 = (String) obj;
                RichEditorListView richEditorListView2 = (RichEditorListView) this.f$0;
                richEditorListView2.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str2;
                    richEditorListView2.addBlock(pageblockmath);
                    break;
                }
                break;
        }
    }
}
