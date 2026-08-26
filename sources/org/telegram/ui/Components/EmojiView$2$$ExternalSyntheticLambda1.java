package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$$ExternalSyntheticOutline2;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda21;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda33;
import org.telegram.ui.Business.BusinessIntroActivity$$ExternalSyntheticLambda3;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda155;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda177;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda15;
import org.telegram.ui.Stories.recorder.StoryEntry;

public final class EmojiView$2$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public EmojiView$2$$ExternalSyntheticLambda1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        int i = 3;
        char c = 1;
        final int i2 = 0;
        switch (this.$r8$classId) {
            case 0:
                MessagesController.getInstance(EmojiView.this.currentAccount).updateEmojiStatus((TLRPC.EmojiStatus) this.f$1);
                break;
            case 1:
                ChatAttachAlertAudioLayout chatAttachAlertAudioLayout = (ChatAttachAlertAudioLayout) this.f$0;
                chatAttachAlertAudioLayout.getClass();
                ((ChatAttachAlert) this.f$1).blur3_InvalidateBlur$1();
                chatAttachAlertAudioLayout.checkUi_listViewPadding$1();
                chatAttachAlertAudioLayout.parentAlert.updateLayout(chatAttachAlertAudioLayout, true, 0);
                break;
            case 2:
                ChatAttachAlertContactsLayout.UserCell userCell = (ChatAttachAlertContactsLayout.UserCell) this.f$0;
                userCell.getClass();
                AndroidUtilities.runOnUIThread(new EmojiView$2$$ExternalSyntheticLambda1(i, userCell, ((ChatAttachAlertContactsLayout.UserCell.CharSequenceCallback) this.f$1).run()));
                break;
            case 3:
                ((ChatAttachAlertContactsLayout.UserCell) this.f$0).setStatus((CharSequence) this.f$1);
                break;
            case 4:
                ChatAttachAlertDocumentLayout.SearchAdapter searchAdapter = (ChatAttachAlertDocumentLayout.SearchAdapter) this.f$0;
                String str = (String) this.f$1;
                searchAdapter.getClass();
                ArrayList arrayList = new ArrayList(ChatAttachAlertDocumentLayout.this.listAdapter.items);
                if (ChatAttachAlertDocumentLayout.this.listAdapter.history.isEmpty()) {
                    arrayList.addAll(0, ChatAttachAlertDocumentLayout.this.listAdapter.recentItems);
                }
                Utilities.searchQueue.postRunnable(new QrActivity$$ExternalSyntheticLambda15(searchAdapter, str, !searchAdapter.currentSearchFilters.isEmpty(), arrayList, 11));
                break;
            case 5:
                ChatAttachAlertDocumentLayout.SearchAdapter searchAdapter2 = (ChatAttachAlertDocumentLayout.SearchAdapter) this.f$0;
                ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = ChatAttachAlertDocumentLayout.this;
                if (chatAttachAlertDocumentLayout.searching) {
                    ChatAttachAlertDocumentLayout.AnonymousClass4 anonymousClass4 = chatAttachAlertDocumentLayout.listView;
                    RecyclerView.Adapter adapter = anonymousClass4.getAdapter();
                    ChatAttachAlertDocumentLayout.SearchAdapter searchAdapter3 = chatAttachAlertDocumentLayout.searchAdapter;
                    if (adapter != searchAdapter3) {
                        anonymousClass4.setAdapter(searchAdapter3);
                    }
                }
                searchAdapter2.searchResult = (ArrayList) this.f$1;
                searchAdapter2.notifyDataSetChanged();
                break;
            case 6:
                ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = (ChatAttachAlertLocationLayout) this.f$0;
                chatAttachAlertLocationLayout.getClass();
                float[] fArr = (float[]) this.f$1;
                chatAttachAlertLocationLayout.resetMapPosition(fArr[0], fArr[1]);
                break;
            case 7:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f$0;
                chatAttachAlertPhotoLayout.getClass();
                ChatAttachAlert.AttachAlertLayout attachAlertLayout = (ChatAttachAlert.AttachAlertLayout) this.f$1;
                int currentItemTop = attachAlertLayout.getCurrentItemTop();
                int listTopPadding = attachAlertLayout.getListTopPadding();
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                chatAttachAlertPhotoLayout.gridView.scrollBy(0, listTopPadding);
                break;
            case 8:
                ChatAttachAlertPhotoLayout.CameraViewInternal cameraViewInternal = ((ChatAttachAlertPhotoLayout) this.f$0).cameraView;
                if (cameraViewInternal != null) {
                    cameraViewInternal.setLayoutParams((FrameLayout.LayoutParams) this.f$1);
                }
                break;
            case 9:
                ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview = (ChatAttachAlertPhotoLayoutPreview) this.f$0;
                chatAttachAlertPhotoLayoutPreview.getClass();
                ChatAttachAlert.AttachAlertLayout attachAlertLayout2 = (ChatAttachAlert.AttachAlertLayout) this.f$1;
                int currentItemTop2 = attachAlertLayout2.getCurrentItemTop();
                int listTopPadding2 = attachAlertLayout2.getListTopPadding();
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                chatAttachAlertPhotoLayoutPreview.listView.scrollBy(0, listTopPadding2);
                break;
            case 10:
                ChatGreetingsView.access$000(((ChatGreetingsView.AnonymousClass2) this.f$0).this$0);
                ((BusinessIntroActivity$$ExternalSyntheticLambda3) this.f$1).run();
                break;
            case 11:
                ChatThemeBottomSheet.this.onDataLoaded((List) this.f$1);
                break;
            case 12:
                ChatThemeBottomSheet.this.onDataLoaded((List) this.f$1);
                break;
            case 13:
                ((BottomSheet) this.f$0).lambda$showGiftOfferSheet$15();
                Browser.openUrl((Context) this.f$1, "https://t.me/BotFather?start=deletebot");
                break;
            case 14:
                CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet = (CreateRtmpStreamBottomSheet) this.f$0;
                createRtmpStreamBottomSheet.getClass();
                TLObject tLObject = (TLObject) this.f$1;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    createRtmpStreamBottomSheet.rtmpUrl = groupcallstreamrtmpurl.url;
                    createRtmpStreamBottomSheet.rtmpKey = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(createRtmpStreamBottomSheet.rtmpKey);
                    createRtmpStreamBottomSheet.rtmpKeySpoiled = spannableStringBuilder;
                    TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                    textStyleRun.flags |= 256;
                    textStyleRun.start = 0;
                    textStyleRun.end = spannableStringBuilder.length();
                    createRtmpStreamBottomSheet.rtmpKeySpoiled.setSpan(new TextStyleSpan(textStyleRun, 0), 0, createRtmpStreamBottomSheet.rtmpKeySpoiled.length(), 0);
                    createRtmpStreamBottomSheet.adapter.update(false);
                    break;
                }
                break;
            case 15:
                DialogsBotsAdapter.PopularBots popularBots = (DialogsBotsAdapter.PopularBots) this.f$0;
                popularBots.getClass();
                TLObject tLObject2 = (TLObject) this.f$1;
                boolean z = tLObject2 instanceof TL_bots.popularAppBots;
                DialogsBotsAdapter$$ExternalSyntheticLambda2 dialogsBotsAdapter$$ExternalSyntheticLambda2 = popularBots.whenUpdated;
                if (z) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    int i3 = popularBots.currentAccount;
                    MessagesController.getInstance(i3).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i3).putUsersAndChats(popularappbots.users, null, false, true);
                    ArrayList arrayList2 = popularBots.bots;
                    arrayList2.addAll(popularappbots.users);
                    String str2 = popularappbots.next_offset;
                    popularBots.lastOffset = str2;
                    popularBots.endReached = str2 == null;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    popularBots.cacheTime = jCurrentTimeMillis;
                    if (!popularBots.savingCache) {
                        popularBots.savingCache = true;
                        String str3 = popularBots.lastOffset;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = str3;
                        ArrayList arrayList3 = new ArrayList();
                        for (int iM = 0; iM < arrayList2.size(); iM = MessagesController$$ExternalSyntheticOutline2.m(((TLRPC.User) arrayList2.get(iM)).id, arrayList3, iM, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i3);
                        messagesStorage.getStorageQueue().postRunnable(new PhotoViewer$$ExternalSyntheticLambda177((Object) popularBots, (Object) messagesStorage, (Object) arrayList3, jCurrentTimeMillis, str4, 4));
                    }
                    popularBots.loading = false;
                    dialogsBotsAdapter$$ExternalSyntheticLambda2.run();
                } else {
                    popularBots.lastOffset = null;
                    popularBots.endReached = true;
                    popularBots.loading = false;
                    dialogsBotsAdapter$$ExternalSyntheticLambda2.run();
                }
                break;
            case 16:
                EditCoverButton editCoverButton = (EditCoverButton) this.f$0;
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile((String) this.f$1);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Paint paint = new Paint(3);
                canvas.translate(bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                float fMax = Math.max(bitmapCreateBitmap.getWidth() / bitmapDecodeFile.getWidth(), bitmapCreateBitmap.getHeight() / bitmapDecodeFile.getHeight());
                canvas.scale(fMax, fMax);
                canvas.drawBitmap(bitmapDecodeFile, (-bitmapDecodeFile.getWidth()) / 2.0f, (-bitmapDecodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new EmojiView$2$$ExternalSyntheticLambda1(17, editCoverButton, bitmapDecodeFile));
                break;
            case 17:
                ((EditCoverButton) this.f$0).setImage((Bitmap) this.f$1);
                break;
            case 18:
                ((EditTextBoldCursor) this.f$0).lambda$drawHint$1((Canvas) this.f$1);
                break;
            case 19:
                MessagesController.getInstance(((BottomSheet) EmojiPacksAlert.this).currentAccount).updateEmojiStatus((TLRPC.EmojiStatus) this.f$1);
                break;
            case 20:
                EmojiView.AnonymousClass2 anonymousClass2 = (EmojiView.AnonymousClass2) this.f$0;
                anonymousClass2.getClass();
                TLObject tLObject3 = (TLObject) this.f$1;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    EmojiView emojiView = EmojiView.this;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(emojiView.currentAccount).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(emojiView.currentAccount).replaceStickerSet(tL_messages_stickerSet);
                }
                break;
            case 21:
                EmojiView.EmojiPackHeader emojiPackHeader = (EmojiView.EmojiPackHeader) this.f$0;
                emojiPackHeader.pack.installed = true;
                EmojiView emojiView2 = EmojiView.this;
                ArrayList arrayList4 = emojiView2.installedEmojiSets;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.f$1;
                if (!arrayList4.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    emojiView2.installedEmojiSets.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                }
                emojiPackHeader.updateState$1(true);
                break;
            case 22:
                final EmojiView.EmojiSearchAdapter.AnonymousClass5 anonymousClass5 = (EmojiView.EmojiSearchAdapter.AnonymousClass5) this.f$0;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                EmojiView.EmojiSearchAdapter emojiSearchAdapter = EmojiView.EmojiSearchAdapter.this;
                boolean zEquals = Arrays.equals(EmojiView.this.lastSearchKeyboardLanguage, currentKeyboardLanguage);
                EmojiView emojiView3 = EmojiView.this;
                if (!zEquals) {
                    MediaDataController.getInstance(emojiView3.currentAccount).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                emojiView3.lastSearchKeyboardLanguage = currentKeyboardLanguage;
                ArrayList arrayList5 = new ArrayList();
                final ArrayList arrayList6 = new ArrayList();
                final ArrayList arrayList7 = new ArrayList();
                final String str5 = (String) this.f$1;
                Utilities.Callback callback = new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList8;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList9;
                        Runnable runnable = (Runnable) obj;
                        switch (i2) {
                            case 0:
                                EmojiView.EmojiSearchAdapter.AnonymousClass5 anonymousClass6 = anonymousClass5;
                                MediaDataController.getInstance(EmojiView.this.currentAccount).searchStickerSets(true, str5, new ArticleViewer$$ExternalSyntheticLambda33(anonymousClass6, arrayList7, runnable, 8));
                                break;
                            default:
                                EmojiView.EmojiSearchAdapter.AnonymousClass5 anonymousClass7 = anonymousClass5;
                                boolean z2 = SharedConfig.suggestAnimatedEmoji;
                                EmojiView.EmojiSearchAdapter emojiSearchAdapter2 = EmojiView.EmojiSearchAdapter.this;
                                if (z2 || UserConfig.getInstance(EmojiView.this.currentAccount).isPremium()) {
                                    String strTranslitSafe = AndroidUtilities.translitSafe((str5 + "").toLowerCase());
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(EmojiView.this.currentAccount).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList10 = arrayList7;
                                    if (stickerSets != null) {
                                        for (int i4 = 0; i4 < stickerSets.size(); i4++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i4);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList9 = tL_messages_stickerSet3.documents) != null && !arrayList9.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String strTranslitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (strTranslitSafe2.startsWith(strTranslitSafe) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", strTranslitSafe, strTranslitSafe2)) {
                                                    arrayList10.add(new EmojiView.EmojiPackInfo(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    int i5 = EmojiView.this.currentAccount;
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i5).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i6 = 0; i6 < featuredEmojiSets.size(); i6++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i6);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String strTranslitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (strTranslitSafe3.startsWith(strTranslitSafe) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", strTranslitSafe, strTranslitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList8 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i5).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList8 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList8 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList8 != null && !arrayList8.isEmpty()) {
                                                        arrayList10.add(new EmojiView.EmojiPackInfo(stickerSetCovered, arrayList8));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.id));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                runnable.run();
                                break;
                        }
                    }
                };
                ArticleViewer$$ExternalSyntheticLambda21 articleViewer$$ExternalSyntheticLambda21 = new ArticleViewer$$ExternalSyntheticLambda21(27, anonymousClass5, str5);
                final char c2 = c == true ? 1 : 0;
                Utilities.doCallbacks(callback, articleViewer$$ExternalSyntheticLambda21, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList8;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList9;
                        Runnable runnable = (Runnable) obj;
                        switch (c2) {
                            case 0:
                                EmojiView.EmojiSearchAdapter.AnonymousClass5 anonymousClass6 = anonymousClass5;
                                MediaDataController.getInstance(EmojiView.this.currentAccount).searchStickerSets(true, str5, new ArticleViewer$$ExternalSyntheticLambda33(anonymousClass6, arrayList6, runnable, 8));
                                break;
                            default:
                                EmojiView.EmojiSearchAdapter.AnonymousClass5 anonymousClass7 = anonymousClass5;
                                boolean z2 = SharedConfig.suggestAnimatedEmoji;
                                EmojiView.EmojiSearchAdapter emojiSearchAdapter2 = EmojiView.EmojiSearchAdapter.this;
                                if (z2 || UserConfig.getInstance(EmojiView.this.currentAccount).isPremium()) {
                                    String strTranslitSafe = AndroidUtilities.translitSafe((str5 + "").toLowerCase());
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(EmojiView.this.currentAccount).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList10 = arrayList6;
                                    if (stickerSets != null) {
                                        for (int i4 = 0; i4 < stickerSets.size(); i4++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i4);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList9 = tL_messages_stickerSet3.documents) != null && !arrayList9.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String strTranslitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (strTranslitSafe2.startsWith(strTranslitSafe) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", strTranslitSafe, strTranslitSafe2)) {
                                                    arrayList10.add(new EmojiView.EmojiPackInfo(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    int i5 = EmojiView.this.currentAccount;
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i5).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i6 = 0; i6 < featuredEmojiSets.size(); i6++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i6);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String strTranslitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (strTranslitSafe3.startsWith(strTranslitSafe) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", strTranslitSafe, strTranslitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList8 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i5).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList8 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList8 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList8 != null && !arrayList8.isEmpty()) {
                                                        arrayList10.add(new EmojiView.EmojiPackInfo(stickerSetCovered, arrayList8));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.id));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                runnable.run();
                                break;
                        }
                    }
                }, new ArticleViewer$$ExternalSyntheticLambda21(28, anonymousClass5, arrayList5), new ChatActivity$$ExternalSyntheticLambda155(anonymousClass5, str5, arrayList5, arrayList6, arrayList7));
                break;
            case 23:
                EmojiView.EmojiSearchAdapter emojiSearchAdapter2 = EmojiView.EmojiSearchAdapter.this;
                EmojiView.this.emojiSearchField.showProgress$1(false);
                ArrayList arrayList8 = emojiSearchAdapter2.resultGlobal;
                int size = arrayList8.size();
                ArrayList arrayList9 = (ArrayList) this.f$1;
                emojiSearchAdapter2.isCompleted = size >= arrayList9.size();
                arrayList8.clear();
                arrayList8.addAll(arrayList9);
                emojiSearchAdapter2.notifyDataSetChanged();
                break;
            case 24:
                ((EmojiView.GifAdapter) this.f$0).search((String) this.f$1, "", true, false, false);
                break;
            case 25:
                EmojiView.GifAdapter gifAdapter = (EmojiView.GifAdapter) this.f$0;
                gifAdapter.getClass();
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.f$1);
                EmojiView emojiView4 = EmojiView.this;
                MessagesController.getInstance(emojiView4.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
                int i4 = emojiView4.currentAccount;
                MessagesController.getInstance(i4).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i4).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str6 = gifAdapter.lastSearchImageString;
                gifAdapter.lastSearchImageString = null;
                gifAdapter.search(str6, "", false, false, false);
                break;
            case 26:
                FilterGLThread filterGLThread = (FilterGLThread) this.f$0;
                filterGLThread.makeCurrentContext();
                StoryEntry.HDRInfo hDRInfo = (StoryEntry.HDRInfo) this.f$1;
                filterGLThread.setupVideoShader(hDRInfo);
                FilterShaders filterShaders = filterGLThread.filterShaders;
                filterShaders.hdrInfo = hDRInfo;
                filterShaders.setupExternalShaders();
                break;
            case 27:
                ((FilterGLThread) this.f$0).filterShaders.delegate = (FilterShaders.FilterShadersDelegate) this.f$1;
                break;
            case 28:
                ((FolderBottomSheet) this.f$0).reqId = -1;
                ((Runnable) ((Pair) this.f$1).first).run();
                break;
            default:
                ((OAuthSheet$$ExternalSyntheticLambda13) this.f$0).run((BaseFragment) this.f$1);
                break;
        }
    }
}
