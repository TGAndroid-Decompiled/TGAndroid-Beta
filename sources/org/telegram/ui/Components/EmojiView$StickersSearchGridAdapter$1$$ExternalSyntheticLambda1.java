package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda21;
import org.telegram.ui.BoostsActivity$$ExternalSyntheticLambda7;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda42;

public final class EmojiView$StickersSearchGridAdapter$1$$ExternalSyntheticLambda1 implements Utilities.Callback {
    public final int $r8$classId;
    public final EmojiView.StickersSearchGridAdapter.AnonymousClass1 f$0;

    public EmojiView$StickersSearchGridAdapter$1$$ExternalSyntheticLambda1(EmojiView.StickersSearchGridAdapter.AnonymousClass1 anonymousClass1, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass1;
    }

    @Override
    public final void run(Object obj) {
        String str;
        CharSequence charSequenceConcat;
        int i;
        int iIndexOfIgnoreCase;
        int iIndexOfIgnoreCase2;
        int i2 = 2;
        EmojiView.StickersSearchGridAdapter.AnonymousClass1 anonymousClass1 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                anonymousClass1.searchStickerSets((Runnable) obj, true);
                break;
            case 1:
                Runnable runnable = (Runnable) obj;
                EmojiView.StickersSearchGridAdapter stickersSearchGridAdapter = EmojiView.StickersSearchGridAdapter.this;
                HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(EmojiView.this.currentAccount).getAllStickers();
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                Iterator<ArrayList<TLRPC.Document>> it = allStickers.values().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    LongSparseArray longSparseArray = anonymousClass1.emojiStickersMap;
                    if (!zHasNext) {
                        ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(EmojiView.this.currentAccount).getFeaturedStickerSets();
                        int size = featuredStickerSets.size();
                        int i3 = 0;
                        while (i3 < size) {
                            TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i3);
                            int i4 = i3 + 1;
                            TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                            TLRPC.Document document = stickerSetCovered2.cover;
                            if (document != null && !hashSet.contains(Long.valueOf(document.id)) && MessageObject.isPremiumSticker(stickerSetCovered2.cover)) {
                                hashSet.add(Long.valueOf(stickerSetCovered2.cover.id));
                                arrayList.add(stickerSetCovered2.cover);
                                TLRPC.Document document2 = stickerSetCovered2.cover;
                                longSparseArray.put(document2.id, document2);
                            }
                            ArrayList<TLRPC.Document> arrayList2 = stickerSetCovered2.covers;
                            if (arrayList2 != null) {
                                int size2 = arrayList2.size();
                                int i5 = 0;
                                while (i5 < size2) {
                                    TLRPC.Document document3 = arrayList2.get(i5);
                                    i5++;
                                    TLRPC.Document document4 = document3;
                                    int i6 = i4;
                                    if (!hashSet.contains(Long.valueOf(document4.id)) && MessageObject.isPremiumSticker(document4)) {
                                        hashSet.add(Long.valueOf(document4.id));
                                        arrayList.add(document4);
                                        longSparseArray.put(document4.id, document4);
                                    }
                                    i4 = i6;
                                }
                            }
                            i3 = i4;
                        }
                        if (!arrayList.isEmpty()) {
                            ArrayList arrayList3 = anonymousClass1.emojiStickersArray2;
                            arrayList3.addAll(arrayList);
                            anonymousClass1.emojiStickers.put(arrayList3, stickersSearchGridAdapter.searchQuery);
                            anonymousClass1.emojiArrays.add(arrayList3);
                        }
                        runnable.run();
                        break;
                    } else {
                        ArrayList<TLRPC.Document> next = it.next();
                        int size3 = next.size();
                        int i7 = 0;
                        while (i7 < size3) {
                            TLRPC.Document document5 = next.get(i7);
                            i7++;
                            TLRPC.Document document6 = document5;
                            if (!hashSet.contains(Long.valueOf(document6.id)) && MessageObject.isPremiumSticker(document6)) {
                                hashSet.add(Long.valueOf(document6.id));
                                arrayList.add(document6);
                                longSparseArray.put(document6.id, document6);
                            }
                        }
                    }
                }
                break;
            case 2:
                anonymousClass1.searchStickerSets((Runnable) obj, false);
                break;
            case 3:
                MediaDataController.getInstance(EmojiView.this.currentAccount).searchStickerSets(false, anonymousClass1.query, new ArticleViewer$$ExternalSyntheticLambda21(29, anonymousClass1, (Runnable) obj));
                break;
            case 4:
                Runnable runnable2 = (Runnable) obj;
                if (anonymousClass1.query.length() <= 14) {
                    EmojiView.StickersSearchGridAdapter stickersSearchGridAdapter2 = EmojiView.StickersSearchGridAdapter.this;
                    HashMap<String, ArrayList<TLRPC.Document>> allStickers2 = MediaDataController.getInstance(EmojiView.this.currentAccount).getAllStickers();
                    str = anonymousClass1.query;
                    int length = str.length();
                    int i8 = 0;
                    while (i8 < length) {
                        if (i8 >= length - 1) {
                            charSequenceConcat = str;
                            if (charSequenceConcat.charAt(i8) == 65039) {
                                length--;
                                charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i8), charSequenceConcat.subSequence(i8 + 1, charSequenceConcat.length()));
                                i8--;
                            }
                        } else if (charSequenceConcat.charAt(i8) == 55356) {
                            int i9 = i8 + 1;
                            if (charSequenceConcat.charAt(i9) < 57339 || charSequenceConcat.charAt(i9) > 57343) {
                                charSequenceConcat = str;
                                charSequenceConcat = str;
                                charSequenceConcat = str;
                                if (charSequenceConcat.charAt(i8) == 8205) {
                                    i = i8 + 1;
                                    if (charSequenceConcat.charAt(i) != 9792 || charSequenceConcat.charAt(i) == 9794) {
                                    }
                                    i8--;
                                }
                                charSequenceConcat = str;
                                if (charSequenceConcat.charAt(i8) == 65039) {
                                    length--;
                                    charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i8), charSequenceConcat.subSequence(i8 + 1, charSequenceConcat.length()));
                                    i8--;
                                }
                            }
                            charSequenceConcat = str;
                            length -= 2;
                            charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i8), charSequenceConcat.subSequence(i8 + 2, charSequenceConcat.length()));
                            i8--;
                        } else {
                            charSequenceConcat = str;
                            charSequenceConcat = str;
                            charSequenceConcat = str;
                            if (charSequenceConcat.charAt(i8) == 8205) {
                                i = i8 + 1;
                                if (charSequenceConcat.charAt(i) != 9792) {
                                }
                                charSequenceConcat = str;
                                length -= 2;
                                charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i8), charSequenceConcat.subSequence(i8 + 2, charSequenceConcat.length()));
                                i8--;
                            }
                            charSequenceConcat = str;
                            if (charSequenceConcat.charAt(i8) == 65039) {
                                length--;
                                charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i8), charSequenceConcat.subSequence(i8 + 1, charSequenceConcat.length()));
                                i8--;
                            }
                        }
                        i8++;
                        charSequenceConcat = charSequenceConcat;
                    }
                    ArrayList<TLRPC.Document> arrayList4 = allStickers2 != null ? allStickers2.get(charSequenceConcat.toString()) : null;
                    if (arrayList4 != null) {
                        charSequenceConcat = str;
                        if (!arrayList4.isEmpty()) {
                            ArrayList arrayList5 = anonymousClass1.emojiStickersArray2;
                            arrayList5.addAll(arrayList4);
                            int size4 = arrayList4.size();
                            for (int i10 = 0; i10 < size4; i10++) {
                                charSequenceConcat = str;
                                TLRPC.Document document7 = arrayList4.get(i10);
                                anonymousClass1.emojiStickersMap.put(document7.id, document7);
                            }
                            charSequenceConcat = str;
                            anonymousClass1.emojiStickers.put(arrayList5, stickersSearchGridAdapter2.searchQuery);
                            anonymousClass1.emojiArrays.add(arrayList5);
                        }
                    }
                }
                charSequenceConcat = str;
                charSequenceConcat = str;
                charSequenceConcat = str;
                runnable2.run();
                break;
            case 5:
                Runnable runnable3 = (Runnable) obj;
                EmojiView.StickersSearchGridAdapter stickersSearchGridAdapter3 = EmojiView.StickersSearchGridAdapter.this;
                HashMap<String, ArrayList<TLRPC.Document>> allStickers3 = MediaDataController.getInstance(EmojiView.this.currentAccount).getAllStickers();
                if (allStickers3 == null || allStickers3.isEmpty() || anonymousClass1.query.length() <= 1) {
                    runnable3.run();
                } else {
                    String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                    EmojiView emojiView = EmojiView.this;
                    boolean zEquals = Arrays.equals(emojiView.lastSearchKeyboardLanguage, currentKeyboardLanguage);
                    int i11 = emojiView.currentAccount;
                    if (!zEquals) {
                        MediaDataController.getInstance(i11).fetchNewEmojiKeywords(currentKeyboardLanguage);
                    }
                    emojiView.lastSearchKeyboardLanguage = currentKeyboardLanguage;
                    MediaDataController.getInstance(i11).getEmojiSuggestions(emojiView.lastSearchKeyboardLanguage, stickersSearchGridAdapter3.searchQuery, true, new VoIPFragment$$ExternalSyntheticLambda42(anonymousClass1, allStickers3, runnable3, i2), false);
                }
                break;
            case 6:
                Runnable runnable4 = (Runnable) obj;
                EmojiView.StickersSearchGridAdapter stickersSearchGridAdapter4 = EmojiView.StickersSearchGridAdapter.this;
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(EmojiView.this.currentAccount).getStickerSets(0);
                EmojiView emojiView2 = EmojiView.this;
                MessagesController.getInstance(emojiView2.currentAccount).filterPremiumStickers(stickerSets);
                int size5 = stickerSets.size();
                int i12 = 0;
                while (true) {
                    HashMap map = anonymousClass1.localPacksByShortName;
                    HashMap map2 = anonymousClass1.localPacksByName;
                    ArrayList arrayList6 = anonymousClass1.localPacks;
                    if (i12 >= size5) {
                        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets2 = MediaDataController.getInstance(emojiView2.currentAccount).getStickerSets(3);
                        MessagesController.getInstance(emojiView2.currentAccount).filterPremiumStickers(stickerSets2);
                        int size6 = stickerSets2.size();
                        for (int i13 = 0; i13 < size6; i13++) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets2.get(i13);
                            int iIndexOfIgnoreCase3 = AndroidUtilities.indexOfIgnoreCase(tL_messages_stickerSet.set.title, stickersSearchGridAdapter4.searchQuery);
                            if (iIndexOfIgnoreCase3 < 0) {
                                String str2 = tL_messages_stickerSet.set.short_name;
                                if (str2 != null && (iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str2, stickersSearchGridAdapter4.searchQuery)) >= 0 && (iIndexOfIgnoreCase == 0 || tL_messages_stickerSet.set.short_name.charAt(iIndexOfIgnoreCase - 1) == ' ')) {
                                    arrayList6.add(tL_messages_stickerSet);
                                    map.put(tL_messages_stickerSet, Boolean.TRUE);
                                }
                            } else if (iIndexOfIgnoreCase3 == 0 || tL_messages_stickerSet.set.title.charAt(iIndexOfIgnoreCase3 - 1) == ' ') {
                                arrayList6.add(tL_messages_stickerSet);
                                map2.put(tL_messages_stickerSet, Integer.valueOf(iIndexOfIgnoreCase3));
                            }
                        }
                        runnable4.run();
                    } else {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i12);
                        int iIndexOfIgnoreCase4 = AndroidUtilities.indexOfIgnoreCase(tL_messages_stickerSet2.set.title, stickersSearchGridAdapter4.searchQuery);
                        if (iIndexOfIgnoreCase4 < 0) {
                            String str3 = tL_messages_stickerSet2.set.short_name;
                            if (str3 != null && (iIndexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str3, stickersSearchGridAdapter4.searchQuery)) >= 0 && (iIndexOfIgnoreCase2 == 0 || tL_messages_stickerSet2.set.short_name.charAt(iIndexOfIgnoreCase2 - 1) == ' ')) {
                                arrayList6.add(tL_messages_stickerSet2);
                                map.put(tL_messages_stickerSet2, Boolean.TRUE);
                            }
                        } else if (iIndexOfIgnoreCase4 == 0 || tL_messages_stickerSet2.set.title.charAt(iIndexOfIgnoreCase4 - 1) == ' ') {
                            arrayList6.add(tL_messages_stickerSet2);
                            map2.put(tL_messages_stickerSet2, Integer.valueOf(iIndexOfIgnoreCase4));
                        }
                        i12++;
                    }
                    break;
                }
                break;
            default:
                Runnable runnable5 = (Runnable) obj;
                EmojiView.StickersSearchGridAdapter stickersSearchGridAdapter5 = EmojiView.StickersSearchGridAdapter.this;
                if (Emoji.fullyConsistsOfEmojis(stickersSearchGridAdapter5.searchQuery)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = anonymousClass1.query;
                    tL_messages_getStickers.hash = 0L;
                    stickersSearchGridAdapter5.reqId2 = ConnectionsManager.getInstance(EmojiView.this.currentAccount).sendRequest(tL_messages_getStickers, new BoostsActivity$$ExternalSyntheticLambda7(anonymousClass1, tL_messages_getStickers, runnable5, 15));
                } else {
                    runnable5.run();
                }
                break;
        }
    }
}
