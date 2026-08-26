package org.telegram.ui.Stories.recorder;

import android.text.TextUtils;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

public final class StoryPrivacyBottomSheet$$ExternalSyntheticLambda2 implements MediaDataController.KeywordResultCallback, AlertDialog.OnButtonClickListener {
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public StoryPrivacyBottomSheet$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        ((StoryPrivacyBottomSheet) this.f$0).done((StoryPrivacyBottomSheet.StoryPrivacy) this.f$1, (Runnable) this.f$2, true);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ArrayList<TLRPC.Document> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList arrayList4;
        EmojiBottomSheet.Page.Adapter adapter = (EmojiBottomSheet.Page.Adapter) this.f$0;
        if (TextUtils.equals((String) this.f$1, adapter.query)) {
            ArrayList<Emoji.EmojiSpanRange> emojis = Emoji.parseEmojis(adapter.query);
            for (int i = 0; i < emojis.size(); i++) {
                try {
                    MediaDataController.KeywordResult keywordResult = new MediaDataController.KeywordResult();
                    keywordResult.emoji = emojis.get(i).code.toString();
                    arrayList.add(keywordResult);
                } catch (Exception unused) {
                }
            }
            adapter.itemsCount = 0;
            ArrayList arrayList5 = adapter.documents;
            arrayList5.clear();
            ArrayList arrayList6 = adapter.documentIds;
            arrayList6.clear();
            SparseIntArray sparseIntArray = adapter.positionToSection;
            sparseIntArray.clear();
            ArrayList arrayList7 = adapter.stickerSets;
            arrayList7.clear();
            adapter.itemsCount++;
            arrayList5.add(null);
            arrayList6.add(0L);
            EmojiBottomSheet.Page page = EmojiBottomSheet.Page.this;
            if (page.currentType == 0) {
                HashSet hashSet = adapter.searchDocumentIds;
                hashSet.clear();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    MediaDataController.KeywordResult keywordResult2 = (MediaDataController.KeywordResult) arrayList.get(i2);
                    String str2 = keywordResult2.emoji;
                    if (str2 != null && !str2.startsWith("animated_") && (arrayList4 = (ArrayList) adapter.allEmojis.get(keywordResult2.emoji)) != null) {
                        hashSet.addAll(arrayList4);
                    }
                }
                arrayList6.addAll(hashSet);
                for (int i3 = 0; i3 < hashSet.size(); i3++) {
                    arrayList5.add(null);
                }
                adapter.itemsCount = hashSet.size() + adapter.itemsCount;
            } else {
                MediaDataController mediaDataController = (MediaDataController) this.f$2;
                HashMap<String, ArrayList<TLRPC.Document>> allStickers = mediaDataController.getAllStickers();
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    MediaDataController.KeywordResult keywordResult3 = (MediaDataController.KeywordResult) arrayList.get(i4);
                    String str3 = keywordResult3.emoji;
                    if (str3 != null && !str3.startsWith("animated_") && (arrayList3 = allStickers.get(keywordResult3.emoji)) != null && !arrayList3.isEmpty()) {
                        for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                            TLRPC.Document document = arrayList3.get(i5);
                            if (document != null && !arrayList5.contains(document)) {
                                arrayList5.add(document);
                                adapter.itemsCount++;
                            }
                        }
                    }
                }
                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    MediaDataController.KeywordResult keywordResult4 = (MediaDataController.KeywordResult) arrayList.get(i6);
                    String str4 = keywordResult4.emoji;
                    if (str4 != null && !str4.startsWith("animated_")) {
                        for (int i7 = 0; i7 < featuredStickerSets.size(); i7++) {
                            TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i7);
                            if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                            } else if (stickerSetCovered.covers.isEmpty()) {
                                if (stickerSetCovered.cover != null) {
                                    ArrayList<TLRPC.Document> arrayList8 = new ArrayList<>();
                                    arrayList8.add(stickerSetCovered.cover);
                                    arrayList2 = arrayList8;
                                }
                            } else {
                                arrayList2 = stickerSetCovered.covers;
                            }
                            for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                                String strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(arrayList2.get(i8), null);
                                if (strFindAnimatedEmojiEmoticon != null && strFindAnimatedEmojiEmoticon.contains(keywordResult4.emoji)) {
                                    arrayList5.add(arrayList2.get(i8));
                                    adapter.itemsCount++;
                                }
                            }
                        }
                    }
                }
            }
            String strTranslitSafe = AndroidUtilities.translitSafe((adapter.query + "").toLowerCase());
            int i9 = 0;
            while (true) {
                ArrayList arrayList9 = adapter.allStickerSets;
                if (i9 >= arrayList9.size()) {
                    break;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList9.get(i9);
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    String strTranslitSafe2 = AndroidUtilities.translitSafe((tL_messages_stickerSet.set.title + "").toLowerCase());
                    if (strTranslitSafe2.startsWith(strTranslitSafe) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", strTranslitSafe, strTranslitSafe2)) {
                        int size = arrayList7.size();
                        arrayList7.add(tL_messages_stickerSet);
                        sparseIntArray.put(adapter.itemsCount, size);
                        arrayList5.add(null);
                        adapter.itemsCount++;
                        arrayList5.addAll(tL_messages_stickerSet.documents);
                        adapter.itemsCount = tL_messages_stickerSet.documents.size() + adapter.itemsCount;
                    }
                }
                i9++;
            }
            boolean z = arrayList6.size() <= 1 && arrayList5.size() <= 1;
            adapter.includeNotFound = z;
            if (z) {
                adapter.itemsCount++;
            }
            if (!z) {
                adapter.searchId++;
            }
            adapter.activeQuery = adapter.query;
            adapter.notifyDataSetChanged();
            EmojiBottomSheet.EmojiListView.access$4100(page.listView, 0, 0);
            page.searchField.showProgress(false);
            page.tabsStrip.showSelected(false);
        }
    }
}
