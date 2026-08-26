package org.telegram.ui.iv;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService$1$$ExternalSyntheticLambda0;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Stories.LivePlayer;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.bots.BotPreviewsEditContainer;
import org.telegram.ui.bots.BotBiometrySettings;
import org.telegram.ui.community.CommunityCreateActivity;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.HistoryFragment;
import org.telegram.ui.web.WebBrowserSettings;

public final class RichEditor$$ExternalSyntheticLambda53 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;

    public RichEditor$$ExternalSyntheticLambda53(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run(Object obj) {
        int i;
        UniversalAdapter universalAdapter;
        CharSequence text;
        String str = "";
        switch (this.$r8$classId) {
            case 0:
                ((RichEditor) this.f$0).listView.addRichMessage((TL_iv.RichMessage) obj);
                break;
            case 1:
                ((BottomSheet) this.f$0).dismiss(((Boolean) obj).booleanValue());
                break;
            case 2:
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift != null) {
                    boolean z = starGift instanceof TL_stars.TL_starGiftUnique;
                    TextView textView = (TextView) this.f$0;
                    if (z) {
                        textView.setText(starGift.availability_remains <= 0 ? LocaleController.formatPluralStringComma("Gift2QuantityIssuedNone", starGift.availability_total) : LocaleController.formatPluralStringComma("Gift2QuantityIssued1", starGift.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", starGift.availability_total));
                    } else {
                        int i2 = starGift.availability_remains;
                        int i3 = starGift.availability_total;
                        textView.setText(i2 <= 0 ? LocaleController.formatPluralStringComma("Gift2Availability2ValueNone", i3) : LocaleController.formatPluralStringComma("Gift2Availability4Value", i2, LocaleController.formatNumber(i3, ',')));
                    }
                    break;
                }
                break;
            case 3:
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
            case 4:
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
            case 5:
                StoryViewer storyViewer = (StoryViewer) this.f$0;
                if (storyViewer != null) {
                    storyViewer.isOverlayVisible = false;
                    storyViewer.updatePlayingMode();
                }
                break;
            case 6:
                StoriesController storiesController = (StoriesController) this.f$0;
                StoriesController.StoriesList storiesList = (StoriesController.StoriesList) obj;
                storiesController.getClass();
                int i4 = storiesList.type;
                long j = storiesList.dialogId;
                if (i4 != 0 || (i = storiesList.albumId) <= 0) {
                    HashMap map = storiesController.storiesLists[i4];
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
            case 7:
                ((BotPreviewsEditContainer) this.f$0).lambda$addTranslation$2((String) obj);
                break;
            case 8:
                BotBiometrySettings botBiometrySettings = (BotBiometrySettings) this.f$0;
                ArrayList arrayList = botBiometrySettings.biometryBots;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                UniversalRecyclerView universalRecyclerView = botBiometrySettings.listView;
                if (universalRecyclerView != null && (universalAdapter = universalRecyclerView.adapter) != null) {
                    universalAdapter.update(true);
                    break;
                }
                break;
            case 9:
                ArrayList arrayList2 = (ArrayList) obj;
                CommunityCreateActivity communityCreateActivity = (CommunityCreateActivity) this.f$0;
                ArrayList arrayList3 = communityCreateActivity.joinedCommunities;
                boolean z2 = arrayList3 == null || arrayList3.isEmpty();
                communityCreateActivity.joinedCommunities = arrayList2;
                UniversalRecyclerView universalRecyclerView2 = communityCreateActivity.listView;
                if (universalRecyclerView2 != null) {
                    universalRecyclerView2.adapter.update(z2);
                }
                break;
            case 10:
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                RichEditorListView.AnonymousClass4 anonymousClass4 = (RichEditorListView.AnonymousClass4) this.f$0;
                if (richMessage == null) {
                    anonymousClass4.getClass();
                    break;
                } else {
                    RichEditorListView richEditorListView = RichEditorListView.this;
                    int size = richEditorListView.rows.size();
                    int i5 = anonymousClass4.val$startRowIdx;
                    if (i5 < size) {
                        ArrayList arrayList4 = richEditorListView.rows;
                        int size2 = arrayList4.size();
                        int i6 = anonymousClass4.val$endRowIdx;
                        if (i6 < size2) {
                            RichEditorHistory richEditorHistory = richEditorListView.history;
                            if (richEditorHistory != null) {
                                AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                                richEditorHistory.commit();
                            }
                            RichEditorListView.AnonymousClass1 anonymousClass1 = richEditorListView.textSelectionHelper;
                            if (anonymousClass1 != null) {
                                anonymousClass1.clear();
                            }
                            BlockRow blockRow = (BlockRow) arrayList4.get(i5);
                            BlockRow blockRow2 = (BlockRow) arrayList4.get(i6);
                            if (RichEditorListView.isFormattable(blockRow.block)) {
                                View viewFindViewByItemObject = richEditorListView.findViewByItemObject(blockRow);
                                text = viewFindViewByItemObject instanceof RichTextCell ? ((RichTextCell) viewFindViewByItemObject).getEditText().getText() : RichTextCell.readStyledText(blockRow.block);
                            } else {
                                text = "";
                            }
                            CharSequence text2 = str;
                            if (RichEditorListView.isFormattable(blockRow2.block)) {
                                View viewFindViewByItemObject2 = richEditorListView.findViewByItemObject(blockRow2);
                                text2 = viewFindViewByItemObject2 instanceof RichTextCell ? ((RichTextCell) viewFindViewByItemObject2).getEditText().getText() : RichTextCell.readStyledText(blockRow2.block);
                            }
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text.subSequence(0, Math.max(0, Math.min(anonymousClass4.val$sOff, text.length()))));
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(text2.subSequence(Math.max(0, Math.min(anonymousClass4.val$eOff, text2.length())), text2.length()));
                            ArrayList arrayList5 = new ArrayList();
                            RichEditorListView.flattenBlocks(arrayList5, richMessage.blocks, null);
                            if (arrayList5.isEmpty()) {
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                                spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                                int i7 = RichTextCell.$r8$clinit;
                                pageblockparagraph.text = RichTextStyle.fromSpannable(spannableStringBuilder3);
                                arrayList5.add(new BlockRow(pageblockparagraph, blockRow.level, blockRow.num));
                            } else {
                                if (spannableStringBuilder.length() > 0) {
                                    BlockRow blockRow3 = (BlockRow) arrayList5.get(0);
                                    if (RichEditorListView.isFormattable(blockRow3.block)) {
                                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                        spannableStringBuilder4.append((CharSequence) RichTextCell.readStyledText(blockRow3.block));
                                        blockRow3.block.text = RichTextStyle.fromSpannable(spannableStringBuilder4);
                                    } else {
                                        TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                        int i8 = RichTextCell.$r8$clinit;
                                        pageblockparagraph2.text = RichTextStyle.fromSpannable(spannableStringBuilder);
                                        arrayList5.add(0, new BlockRow(pageblockparagraph2, blockRow.level, blockRow.num));
                                    }
                                }
                                if (spannableStringBuilder2.length() > 0) {
                                    BlockRow blockRow4 = (BlockRow) Fragment$$ExternalSyntheticOutline0.m(1, arrayList5);
                                    if (RichEditorListView.isFormattable(blockRow4.block)) {
                                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(RichTextCell.readStyledText(blockRow4.block));
                                        spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                        blockRow4.block.text = RichTextStyle.fromSpannable(spannableStringBuilder5);
                                    } else {
                                        TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                        int i9 = RichTextCell.$r8$clinit;
                                        pageblockparagraph3.text = RichTextStyle.fromSpannable(spannableStringBuilder2);
                                        arrayList5.add(new BlockRow(pageblockparagraph3, blockRow2.level, blockRow2.num));
                                    }
                                }
                            }
                            TL_iv.RichMessage richMessage2 = richEditorListView.loadedRichMessage;
                            if (richMessage2 == null) {
                                richEditorListView.loadedRichMessage = richMessage;
                            } else {
                                ArrayList<TLRPC.Photo> arrayList6 = richMessage.photos;
                                if (arrayList6 != null) {
                                    richMessage2.photos.addAll(arrayList6);
                                }
                                ArrayList<TLRPC.Document> arrayList7 = richMessage.documents;
                                if (arrayList7 != null) {
                                    richEditorListView.loadedRichMessage.documents.addAll(arrayList7);
                                }
                            }
                            for (int i10 = 0; i10 < arrayList5.size(); i10++) {
                                richEditorListView.resolveLoadedMedia((BlockRow) arrayList5.get(i10));
                            }
                            while (i6 >= i5) {
                                arrayList4.remove(i6);
                                i6--;
                            }
                            arrayList4.addAll(i5, arrayList5);
                            richEditorListView.renumberAllRuns();
                            richEditorListView.adapter.update(false);
                            RichEditorHistory richEditorHistory2 = richEditorListView.history;
                            if (richEditorHistory2 != null) {
                                richEditorHistory2.record();
                            }
                            richEditorListView.delegate.onContentChanged();
                            richEditorListView.post(new RichTableCell$$ExternalSyntheticLambda3(26, anonymousClass4, arrayList5.isEmpty() ? null : (BlockRow) Fragment$$ExternalSyntheticOutline0.m(1, arrayList5)));
                            break;
                        }
                    }
                }
                break;
            case 11:
                ChatAttachAlertRichLayout.this.listView.addRichMessage((TL_iv.RichMessage) obj);
                break;
            case 12:
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
            case 13:
                AndroidUtilities.hideKeyboard((EditTextCaption) this.f$0);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                break;
            case 14:
                BotWebViewContainer.WebViewProxy webViewProxy = (BotWebViewContainer.WebViewProxy) this.f$0;
                webViewProxy.getClass();
                StringBuilder sb = new StringBuilder("window.navigator.__share__receive(");
                String str3 = str;
                if (!((Boolean) obj).booleanValue()) {
                    str3 = "'abort'";
                }
                webViewProxy.webView.evaluateJS(Fragment$$ExternalSyntheticOutline0.m(sb, str3, ")"));
                break;
            case 15:
                HistoryFragment historyFragment = (HistoryFragment) this.f$0;
                historyFragment.history = (ArrayList) obj;
                if (historyFragment.listView.isAttachedToWindow()) {
                    historyFragment.listView.adapter.update(true);
                }
                break;
            default:
                WebBrowserSettings webBrowserSettings = (WebBrowserSettings) this.f$0;
                webBrowserSettings.getClass();
                webBrowserSettings.historySize = ((ArrayList) obj).size();
                UniversalRecyclerView universalRecyclerView3 = webBrowserSettings.listView;
                if (universalRecyclerView3 != null && universalRecyclerView3.adapter != null && universalRecyclerView3.isAttachedToWindow()) {
                    webBrowserSettings.listView.adapter.update(true);
                    break;
                }
                break;
        }
    }
}
