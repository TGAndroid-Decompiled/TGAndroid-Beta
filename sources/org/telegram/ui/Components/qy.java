package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

public final class qy implements Utilities.Callback {

    public final int f32002a;

    public final ry f32003b;

    public qy(ry ryVar, int i10) {
        this.f32002a = i10;
        this.f32003b = ryVar;
    }

    @Override
    public final void run(Object obj) {
        String str;
        CharSequence charSequenceConcat;
        int i10;
        int iIndexOfIgnoreCase;
        int iIndexOfIgnoreCase2;
        int i11 = this.f32002a;
        int i12 = 0;
        ry ryVar = this.f32003b;
        switch (i11) {
            case 0:
                ryVar.a((Runnable) obj, true);
                break;
            case 1:
                Runnable runnable = (Runnable) obj;
                ArrayList arrayList = ryVar.f32276s;
                LongSparseArray longSparseArray = ryVar.v;
                ty tyVar = ryVar.f32277w;
                HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(tyVar.M.Y0).getAllStickers();
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (ArrayList<TLRPC.Document> arrayList3 : allStickers.values()) {
                    int size = arrayList3.size();
                    int i13 = 0;
                    while (i13 < size) {
                        TLRPC.Document document = arrayList3.get(i13);
                        i13++;
                        TLRPC.Document document2 = document;
                        if (!hashSet.contains(Long.valueOf(document2.f22386id)) && MessageObject.isPremiumSticker(document2)) {
                            hashSet.add(Long.valueOf(document2.f22386id));
                            arrayList2.add(document2);
                            longSparseArray.put(document2.f22386id, document2);
                        }
                    }
                }
                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(tyVar.M.Y0).getFeaturedStickerSets();
                int size2 = featuredStickerSets.size();
                int i14 = 0;
                while (i14 < size2) {
                    TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i14);
                    i14++;
                    TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                    TLRPC.Document document3 = stickerSetCovered2.cover;
                    if (document3 != null && !hashSet.contains(Long.valueOf(document3.f22386id)) && MessageObject.isPremiumSticker(stickerSetCovered2.cover)) {
                        hashSet.add(Long.valueOf(stickerSetCovered2.cover.f22386id));
                        arrayList2.add(stickerSetCovered2.cover);
                        TLRPC.Document document4 = stickerSetCovered2.cover;
                        longSparseArray.put(document4.f22386id, document4);
                    }
                    ArrayList<TLRPC.Document> arrayList4 = stickerSetCovered2.covers;
                    if (arrayList4 != null) {
                        int size3 = arrayList4.size();
                        int i15 = 0;
                        while (i15 < size3) {
                            TLRPC.Document document5 = arrayList4.get(i15);
                            i15++;
                            TLRPC.Document document6 = document5;
                            ArrayList arrayList5 = arrayList;
                            if (!hashSet.contains(Long.valueOf(document6.f22386id)) && MessageObject.isPremiumSticker(document6)) {
                                hashSet.add(Long.valueOf(document6.f22386id));
                                arrayList2.add(document6);
                                longSparseArray.put(document6.f22386id, document6);
                            }
                            arrayList = arrayList5;
                        }
                    }
                    arrayList = arrayList;
                }
                ArrayList arrayList6 = arrayList;
                if (!arrayList2.isEmpty()) {
                    arrayList6.addAll(arrayList2);
                    ryVar.f32273f.put(arrayList6, tyVar.J);
                    ryVar.h.add(arrayList6);
                }
                runnable.run();
                break;
            case 2:
                ryVar.a((Runnable) obj, false);
                break;
            case 3:
                MediaDataController.getInstance(ryVar.f32277w.M.Y0).searchStickerSets(false, ryVar.f32269a, new org.telegram.ui.df(20, ryVar, (Runnable) obj));
                break;
            case 4:
                Runnable runnable2 = (Runnable) obj;
                ty tyVar2 = ryVar.f32277w;
                ArrayList arrayList7 = ryVar.f32276s;
                if (ryVar.f32269a.length() <= 14) {
                    HashMap<String, ArrayList<TLRPC.Document>> allStickers2 = MediaDataController.getInstance(tyVar2.M.Y0).getAllStickers();
                    str = ryVar.f32269a;
                    int length = str.length();
                    int i16 = 0;
                    while (i16 < length) {
                        if (i16 >= length - 1) {
                            charSequenceConcat = str;
                            if (charSequenceConcat.charAt(i16) == 65039) {
                                length--;
                                charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i16), charSequenceConcat.subSequence(i16 + 1, charSequenceConcat.length()));
                                i16--;
                            }
                        } else if (charSequenceConcat.charAt(i16) == 55356) {
                            int i17 = i16 + 1;
                            if (charSequenceConcat.charAt(i17) < 57339 || charSequenceConcat.charAt(i17) > 57343) {
                                charSequenceConcat = str;
                                charSequenceConcat = str;
                                charSequenceConcat = str;
                                if (charSequenceConcat.charAt(i16) == 8205) {
                                    i10 = i16 + 1;
                                    if (charSequenceConcat.charAt(i10) != 9792 || charSequenceConcat.charAt(i10) == 9794) {
                                    }
                                    i16--;
                                }
                                charSequenceConcat = str;
                                if (charSequenceConcat.charAt(i16) == 65039) {
                                    length--;
                                    charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i16), charSequenceConcat.subSequence(i16 + 1, charSequenceConcat.length()));
                                    i16--;
                                }
                            }
                            charSequenceConcat = str;
                            length -= 2;
                            charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i16), charSequenceConcat.subSequence(i16 + 2, charSequenceConcat.length()));
                            i16--;
                        } else {
                            charSequenceConcat = str;
                            charSequenceConcat = str;
                            charSequenceConcat = str;
                            if (charSequenceConcat.charAt(i16) == 8205) {
                                i10 = i16 + 1;
                                if (charSequenceConcat.charAt(i10) != 9792) {
                                }
                                charSequenceConcat = str;
                                length -= 2;
                                charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i16), charSequenceConcat.subSequence(i16 + 2, charSequenceConcat.length()));
                                i16--;
                            }
                            charSequenceConcat = str;
                            if (charSequenceConcat.charAt(i16) == 65039) {
                                length--;
                                charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i16), charSequenceConcat.subSequence(i16 + 1, charSequenceConcat.length()));
                                i16--;
                            }
                        }
                        i16++;
                        charSequenceConcat = charSequenceConcat;
                    }
                    ArrayList<TLRPC.Document> arrayList8 = allStickers2 != null ? allStickers2.get(charSequenceConcat.toString()) : null;
                    if (arrayList8 != null) {
                        charSequenceConcat = str;
                        if (!arrayList8.isEmpty()) {
                            arrayList7.addAll(arrayList8);
                            int size4 = arrayList8.size();
                            while (i12 < size4) {
                                charSequenceConcat = str;
                                TLRPC.Document document7 = arrayList8.get(i12);
                                ryVar.v.put(document7.f22386id, document7);
                                i12++;
                            }
                            charSequenceConcat = str;
                            ryVar.f32273f.put(arrayList7, tyVar2.J);
                            ryVar.h.add(arrayList7);
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
                ty tyVar3 = ryVar.f32277w;
                yy yyVar = tyVar3.M;
                int i18 = yyVar.Y0;
                HashMap<String, ArrayList<TLRPC.Document>> allStickers3 = MediaDataController.getInstance(i18).getAllStickers();
                if (allStickers3 == null || allStickers3.isEmpty() || ryVar.f32269a.length() <= 1) {
                    runnable3.run();
                } else {
                    String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                    if (!Arrays.equals(yyVar.S0, currentKeyboardLanguage)) {
                        MediaDataController.getInstance(i18).fetchNewEmojiKeywords(currentKeyboardLanguage);
                    }
                    yyVar.S0 = currentKeyboardLanguage;
                    MediaDataController.getInstance(i18).getEmojiSuggestions(yyVar.S0, tyVar3.J, true, new ag.l0(ryVar, allStickers3, runnable3, 28), false);
                }
                break;
            case 6:
                Runnable runnable4 = (Runnable) obj;
                HashMap map = ryVar.d;
                HashMap map2 = ryVar.f32272e;
                ArrayList arrayList9 = ryVar.f32271c;
                ty tyVar4 = ryVar.f32277w;
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(tyVar4.M.Y0).getStickerSets(0);
                yy yyVar2 = tyVar4.M;
                int i19 = yyVar2.Y0;
                int i20 = yyVar2.Y0;
                MessagesController.getInstance(i19).filterPremiumStickers(stickerSets);
                int size5 = stickerSets.size();
                for (int i21 = 0; i21 < size5; i21++) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i21);
                    int iIndexOfIgnoreCase3 = AndroidUtilities.indexOfIgnoreCase(tL_messages_stickerSet.set.title, tyVar4.J);
                    if (iIndexOfIgnoreCase3 < 0) {
                        String str2 = tL_messages_stickerSet.set.short_name;
                        if (str2 != null && (iIndexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str2, tyVar4.J)) >= 0 && (iIndexOfIgnoreCase2 == 0 || tL_messages_stickerSet.set.short_name.charAt(iIndexOfIgnoreCase2 - 1) == ' ')) {
                            arrayList9.add(tL_messages_stickerSet);
                            map.put(tL_messages_stickerSet, Boolean.TRUE);
                        }
                    } else if (iIndexOfIgnoreCase3 == 0 || tL_messages_stickerSet.set.title.charAt(iIndexOfIgnoreCase3 - 1) == ' ') {
                        arrayList9.add(tL_messages_stickerSet);
                        map2.put(tL_messages_stickerSet, Integer.valueOf(iIndexOfIgnoreCase3));
                    }
                }
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets2 = MediaDataController.getInstance(i20).getStickerSets(3);
                MessagesController.getInstance(i20).filterPremiumStickers(stickerSets2);
                int size6 = stickerSets2.size();
                while (i12 < size6) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets2.get(i12);
                    int iIndexOfIgnoreCase4 = AndroidUtilities.indexOfIgnoreCase(tL_messages_stickerSet2.set.title, tyVar4.J);
                    if (iIndexOfIgnoreCase4 < 0) {
                        String str3 = tL_messages_stickerSet2.set.short_name;
                        if (str3 != null && (iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str3, tyVar4.J)) >= 0 && (iIndexOfIgnoreCase == 0 || tL_messages_stickerSet2.set.short_name.charAt(iIndexOfIgnoreCase - 1) == ' ')) {
                            arrayList9.add(tL_messages_stickerSet2);
                            map.put(tL_messages_stickerSet2, Boolean.TRUE);
                        }
                    } else if (iIndexOfIgnoreCase4 == 0 || tL_messages_stickerSet2.set.title.charAt(iIndexOfIgnoreCase4 - 1) == ' ') {
                        arrayList9.add(tL_messages_stickerSet2);
                        map2.put(tL_messages_stickerSet2, Integer.valueOf(iIndexOfIgnoreCase4));
                    }
                    i12++;
                }
                runnable4.run();
                break;
            default:
                Runnable runnable5 = (Runnable) obj;
                ty tyVar5 = ryVar.f32277w;
                if (Emoji.fullyConsistsOfEmojis(tyVar5.J)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = ryVar.f32269a;
                    tL_messages_getStickers.hash = 0L;
                    tyVar5.H = ConnectionsManager.getInstance(tyVar5.M.Y0).sendRequest(tL_messages_getStickers, new cg.y(ryVar, tL_messages_getStickers, runnable5, 17));
                } else {
                    runnable5.run();
                }
                break;
        }
    }
}
