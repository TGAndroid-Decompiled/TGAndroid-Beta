package org.telegram.ui.Adapters;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticLambda120;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.AboutLinkCell$$ExternalSyntheticLambda1;
import org.telegram.ui.Cells.EmptyCell;
import org.telegram.ui.Cells.FeaturedStickerSetInfoCell;
import org.telegram.ui.Cells.StickerEmojiCell;
import org.telegram.ui.Cells.StickerSetNameCell;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda16;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda0;

public final class StickersSearchAdapter extends RecyclerListView.SelectionAdapter {
    public boolean cleared;
    public final Context context;
    public final Delegate delegate;
    public int emojiSearchId;
    public ImageView emptyImageView;
    public TextView emptyTextView;
    public final LongSparseArray installingStickerSets;
    public final TLRPC.StickerSetCovered[] primaryInstallingStickerSets;
    public final LongSparseArray removingStickerSets;
    public int reqId;
    public int reqId2;
    public final Theme.ResourcesProvider resourcesProvider;
    public String searchQuery;
    public int totalItems;
    public final int currentAccount = UserConfig.selectedAccount;
    public final SparseArray rowStartPack = new SparseArray();
    public final SparseArray cache = new SparseArray();
    public final SparseArray cacheParent = new SparseArray();
    public final SparseIntArray positionToRow = new SparseIntArray();
    public final SparseArray positionToEmoji = new SparseArray();
    public final ArrayList serverPacks = new ArrayList();
    public final ArrayList localPacks = new ArrayList();
    public final HashMap localPacksByShortName = new HashMap();
    public final HashMap localPacksByName = new HashMap();
    public final HashMap emojiStickers = new HashMap();
    public final ArrayList emojiArrays = new ArrayList();
    public final SparseArray positionsToSets = new SparseArray();
    public final AnonymousClass1 searchRunnable = new AnonymousClass1();

    public final class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        public final void clear() {
            StickersSearchAdapter stickersSearchAdapter = StickersSearchAdapter.this;
            if (stickersSearchAdapter.cleared) {
                return;
            }
            stickersSearchAdapter.cleared = true;
            stickersSearchAdapter.emojiStickers.clear();
            stickersSearchAdapter.emojiArrays.clear();
            stickersSearchAdapter.localPacks.clear();
            stickersSearchAdapter.serverPacks.clear();
            stickersSearchAdapter.localPacksByShortName.clear();
            stickersSearchAdapter.localPacksByName.clear();
        }

        @Override
        public final void run() {
            HashMap map;
            HashMap map2;
            ArrayList arrayList;
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList2;
            int i;
            int iIndexOfIgnoreCase;
            int iIndexOfIgnoreCase2;
            CharSequence charSequence;
            char c;
            CharSequence charSequenceConcat;
            StickersSearchAdapter stickersSearchAdapter = StickersSearchAdapter.this;
            if (TextUtils.isEmpty(stickersSearchAdapter.searchQuery)) {
                return;
            }
            Delegate delegate = stickersSearchAdapter.delegate;
            delegate.onSearchStart();
            stickersSearchAdapter.cleared = false;
            int i2 = stickersSearchAdapter.emojiSearchId + 1;
            stickersSearchAdapter.emojiSearchId = i2;
            ArrayList arrayList3 = new ArrayList(0);
            LongSparseArray longSparseArray = new LongSparseArray(0);
            int i3 = stickersSearchAdapter.currentAccount;
            HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(i3).getAllStickers();
            int length = stickersSearchAdapter.searchQuery.length();
            HashMap map3 = stickersSearchAdapter.emojiStickers;
            if (length <= 14) {
                String str = stickersSearchAdapter.searchQuery;
                int length2 = str.length();
                int i4 = 0;
                while (i4 < length2) {
                    if (i4 < length2 - 1) {
                        c = 1;
                        if (charSequence.charAt(i4) == 55356) {
                            int i5 = i4 + 1;
                            if (charSequence.charAt(i5) < 57339 || charSequence.charAt(i5) > 57343) {
                            }
                            charSequence = str;
                            CharSequence[] charSequenceArr = {charSequence.subSequence(0, i4), charSequence.subSequence(i4 + 2, charSequence.length())};
                            length2 -= 2;
                            i4--;
                            charSequenceConcat = TextUtils.concat(charSequenceArr);
                            i4++;
                            charSequence = charSequenceConcat;
                        } else {
                            charSequence = str;
                        }
                        charSequence = str;
                        charSequence = str;
                        if (charSequence.charAt(i4) == 8205) {
                            int i6 = i4 + 1;
                            if (charSequence.charAt(i6) == 9792 || charSequence.charAt(i6) == 9794) {
                                charSequence = str;
                                CharSequence[] charSequenceArr2 = {charSequence.subSequence(0, i4), charSequence.subSequence(i4 + 2, charSequence.length())};
                                length2 -= 2;
                                i4--;
                                charSequenceConcat = TextUtils.concat(charSequenceArr2);
                            }
                            i4++;
                            charSequence = charSequenceConcat;
                        }
                    } else {
                        charSequence = str;
                        c = 1;
                    }
                    char cCharAt = charSequence.charAt(i4);
                    charSequenceConcat = charSequence;
                    if (cCharAt == 65039) {
                        CharSequence charSequenceSubSequence = charSequence.subSequence(0, i4);
                        CharSequence charSequenceSubSequence2 = charSequence.subSequence(i4 + 1, charSequence.length());
                        CharSequence[] charSequenceArr3 = new CharSequence[2];
                        charSequenceArr3[0] = charSequenceSubSequence;
                        charSequenceArr3[c] = charSequenceSubSequence2;
                        length2--;
                        i4--;
                        charSequenceConcat = TextUtils.concat(charSequenceArr3);
                    }
                    i4++;
                    charSequence = charSequenceConcat;
                }
                charSequence = str;
                ArrayList<TLRPC.Document> arrayList4 = allStickers != null ? allStickers.get(charSequence.toString()) : null;
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    clear();
                    arrayList3.addAll(arrayList4);
                    int size = arrayList4.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        TLRPC.Document document = arrayList4.get(i7);
                        longSparseArray.put(document.id, document);
                    }
                    map3.put(arrayList3, stickersSearchAdapter.searchQuery);
                    stickersSearchAdapter.emojiArrays.add(arrayList3);
                }
            }
            if (allStickers != null && !allStickers.isEmpty() && stickersSearchAdapter.searchQuery.length() > 1) {
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                if (!Arrays.equals(delegate.getLastSearchKeyboardLanguage(), currentKeyboardLanguage)) {
                    MediaDataController.getInstance(i3).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                delegate.setLastSearchKeyboardLanguage(currentKeyboardLanguage);
                MediaDataController.getInstance(i3).getEmojiSuggestions(delegate.getLastSearchKeyboardLanguage(), stickersSearchAdapter.searchQuery, false, new VoIPService$$ExternalSyntheticLambda120(this, i2, allStickers, 4), false);
            }
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i3).getStickerSets(0);
            int size2 = stickerSets.size();
            int i8 = 0;
            while (true) {
                map = stickersSearchAdapter.localPacksByShortName;
                map2 = stickersSearchAdapter.localPacksByName;
                arrayList = stickersSearchAdapter.localPacks;
                if (i8 >= size2) {
                    break;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i8);
                int iIndexOfIgnoreCase3 = AndroidUtilities.indexOfIgnoreCase(tL_messages_stickerSet.set.title, stickersSearchAdapter.searchQuery);
                if (iIndexOfIgnoreCase3 < 0) {
                    String str2 = tL_messages_stickerSet.set.short_name;
                    if (str2 != null && (iIndexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str2, stickersSearchAdapter.searchQuery)) >= 0 && (iIndexOfIgnoreCase2 == 0 || tL_messages_stickerSet.set.short_name.charAt(iIndexOfIgnoreCase2 - 1) == ' ')) {
                        clear();
                        arrayList.add(tL_messages_stickerSet);
                        map.put(tL_messages_stickerSet, Boolean.TRUE);
                    }
                } else if (iIndexOfIgnoreCase3 == 0 || tL_messages_stickerSet.set.title.charAt(iIndexOfIgnoreCase3 - 1) == ' ') {
                    clear();
                    arrayList.add(tL_messages_stickerSet);
                    map2.put(tL_messages_stickerSet, Integer.valueOf(iIndexOfIgnoreCase3));
                }
                i8++;
            }
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets2 = MediaDataController.getInstance(i3).getStickerSets(3);
            int size3 = stickerSets2.size();
            int i9 = 0;
            while (i9 < size3) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets2.get(i9);
                int iIndexOfIgnoreCase4 = AndroidUtilities.indexOfIgnoreCase(tL_messages_stickerSet2.set.title, stickersSearchAdapter.searchQuery);
                if (iIndexOfIgnoreCase4 >= 0) {
                    if (iIndexOfIgnoreCase4 != 0) {
                        arrayList2 = stickerSets2;
                        if (tL_messages_stickerSet2.set.title.charAt(iIndexOfIgnoreCase4 - 1) == ' ') {
                        }
                        i = 1;
                    } else {
                        arrayList2 = stickerSets2;
                    }
                    clear();
                    arrayList.add(tL_messages_stickerSet2);
                    map2.put(tL_messages_stickerSet2, Integer.valueOf(iIndexOfIgnoreCase4));
                    i = 1;
                } else {
                    arrayList2 = stickerSets2;
                    String str3 = tL_messages_stickerSet2.set.short_name;
                    if (str3 != null && (iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str3, stickersSearchAdapter.searchQuery)) >= 0) {
                        if (iIndexOfIgnoreCase == 0 || tL_messages_stickerSet2.set.short_name.charAt(iIndexOfIgnoreCase - 1) == ' ') {
                            clear();
                            arrayList.add(tL_messages_stickerSet2);
                            map.put(tL_messages_stickerSet2, Boolean.TRUE);
                        }
                    }
                    i = 1;
                }
                i9 += i;
                stickerSets2 = arrayList2;
            }
            if (!arrayList.isEmpty() || !map3.isEmpty()) {
                delegate.setAdapterVisible(true);
            }
            TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = new TLRPC.TL_messages_searchStickerSets();
            tL_messages_searchStickerSets.q = stickersSearchAdapter.searchQuery;
            stickersSearchAdapter.reqId = ConnectionsManager.getInstance(i3).sendRequest(tL_messages_searchStickerSets, new StarGiftSheet$$ExternalSyntheticLambda0(9, this, tL_messages_searchStickerSets));
            if (Emoji.isValidEmoji(stickersSearchAdapter.searchQuery)) {
                TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                tL_messages_getStickers.emoticon = stickersSearchAdapter.searchQuery;
                tL_messages_getStickers.hash = 0L;
                stickersSearchAdapter.reqId2 = ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getStickers, new GiftSheet$$ExternalSyntheticLambda16(2, this, tL_messages_getStickers, arrayList3, longSparseArray));
            }
            stickersSearchAdapter.notifyDataSetChanged();
        }
    }

    public final class AnonymousClass2 extends StickerEmojiCell {
        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(82.0f), 1073741824));
        }
    }

    public interface Delegate {
        String[] getLastSearchKeyboardLanguage();

        int getStickersPerRow();

        void onSearchStart();

        void onSearchStop();

        void onStickerSetAdd(TLRPC.StickerSetCovered stickerSetCovered, boolean z);

        void onStickerSetRemove(TLRPC.StickerSetCovered stickerSetCovered);

        void setAdapterVisible(boolean z);

        void setLastSearchKeyboardLanguage(String[] strArr);
    }

    public StickersSearchAdapter(Context context, Delegate delegate, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, Theme.ResourcesProvider resourcesProvider) {
        this.context = context;
        this.delegate = delegate;
        this.primaryInstallingStickerSets = stickerSetCoveredArr;
        this.installingStickerSets = longSparseArray;
        this.removingStickerSets = longSparseArray2;
        this.resourcesProvider = resourcesProvider;
    }

    public final void bindFeaturedStickerSetInfoCell(FeaturedStickerSetInfoCell featuredStickerSetInfoCell, int i, boolean z) {
        boolean z2;
        FeaturedStickerSetInfoCell featuredStickerSetInfoCell2;
        boolean z3;
        int i2 = this.currentAccount;
        MediaDataController mediaDataController = MediaDataController.getInstance(i2);
        ArrayList<Long> unreadStickerSets = mediaDataController.getUnreadStickerSets();
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.cache.get(i);
        boolean z4 = unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSetCovered.set.id));
        int i3 = 0;
        while (true) {
            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.primaryInstallingStickerSets;
            if (i3 >= stickerSetCoveredArr.length) {
                z2 = false;
                break;
            }
            if (stickerSetCoveredArr[i3] != null) {
                TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(i2).getStickerSetById(stickerSetCoveredArr[i3].set.id);
                if (stickerSetById != null && !stickerSetById.set.archived) {
                    stickerSetCoveredArr[i3] = null;
                } else if (stickerSetCoveredArr[i3].set.id == stickerSetCovered.set.id) {
                    z2 = true;
                    break;
                }
            }
            i3++;
        }
        int iIndexOfIgnoreCase = TextUtils.isEmpty(this.searchQuery) ? -1 : AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.title, this.searchQuery);
        if (iIndexOfIgnoreCase >= 0) {
            featuredStickerSetInfoCell2 = featuredStickerSetInfoCell;
            z3 = z;
            featuredStickerSetInfoCell2.setStickerSet(stickerSetCovered, z4, z3, iIndexOfIgnoreCase, this.searchQuery.length(), z2);
        } else {
            featuredStickerSetInfoCell2 = featuredStickerSetInfoCell;
            z3 = z;
            featuredStickerSetInfoCell2.setStickerSet(stickerSetCovered, z4, z3, 0, 0, z2);
            if (!TextUtils.isEmpty(this.searchQuery) && AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.short_name, this.searchQuery) == 0) {
                String str = stickerSetCovered.set.short_name;
                int length = this.searchQuery.length();
                featuredStickerSetInfoCell2.url = str;
                featuredStickerSetInfoCell2.urlSearchLength = length;
                featuredStickerSetInfoCell2.updateUrlSearchSpan();
            }
        }
        if (z4) {
            mediaDataController.markFeaturedStickersByIdAsRead(false, stickerSetCovered.set.id);
        }
        long j = stickerSetCovered.set.id;
        LongSparseArray longSparseArray = this.installingStickerSets;
        boolean z5 = longSparseArray.indexOfKey(j) >= 0;
        long j2 = stickerSetCovered.set.id;
        LongSparseArray longSparseArray2 = this.removingStickerSets;
        boolean z6 = longSparseArray2.indexOfKey(j2) >= 0;
        if (z5 || z6) {
            if (z5 && featuredStickerSetInfoCell2.isInstalled) {
                longSparseArray.remove(stickerSetCovered.set.id);
                z5 = false;
            } else if (z6 && !featuredStickerSetInfoCell2.isInstalled) {
                longSparseArray2.remove(stickerSetCovered.set.id);
            }
        }
        featuredStickerSetInfoCell2.setAddDrawProgress(!z2 && z5, z3);
        mediaDataController.preloadStickerSetThumb(stickerSetCovered);
        featuredStickerSetInfoCell2.setNeedDivider(i > 0);
    }

    @Override
    public final int getItemCount() {
        return Math.max(1, this.totalItems + 1);
    }

    @Override
    public final int getItemViewType(int i) {
        if (i == 0 && this.totalItems == 0) {
            return 5;
        }
        if (i == getItemCount() - 1) {
            return 4;
        }
        Object obj = this.cache.get(i);
        if (obj == null) {
            return 1;
        }
        if (obj instanceof TLRPC.Document) {
            return 0;
        }
        return obj instanceof TLRPC.StickerSetCovered ? 3 : 2;
    }

    public final void installStickerSet(TLRPC.StickerSetCovered stickerSetCovered, FeaturedStickerSetInfoCell featuredStickerSetInfoCell) {
        TLRPC.StickerSetCovered[] stickerSetCoveredArr;
        boolean z;
        int i = 0;
        while (true) {
            stickerSetCoveredArr = this.primaryInstallingStickerSets;
            if (i >= stickerSetCoveredArr.length) {
                break;
            }
            if (stickerSetCoveredArr[i] != null) {
                TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(this.currentAccount).getStickerSetById(stickerSetCoveredArr[i].set.id);
                if (stickerSetById != null && !stickerSetById.set.archived) {
                    stickerSetCoveredArr[i] = null;
                    break;
                } else if (stickerSetCoveredArr[i].set.id == stickerSetCovered.set.id) {
                    return;
                }
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= stickerSetCoveredArr.length) {
                z = false;
                break;
            } else {
                if (stickerSetCoveredArr[i2] == null) {
                    stickerSetCoveredArr[i2] = stickerSetCovered;
                    z = true;
                    break;
                }
                i2++;
            }
        }
        if (!z && featuredStickerSetInfoCell != null) {
            featuredStickerSetInfoCell.setAddDrawProgress(true, true);
        }
        this.installingStickerSets.put(stickerSetCovered.set.id, stickerSetCovered);
        if (featuredStickerSetInfoCell != null) {
            this.delegate.onStickerSetAdd(featuredStickerSetInfoCell.getStickerSet(), z);
            return;
        }
        SparseArray sparseArray = this.positionsToSets;
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) sparseArray.get(i3);
            if (stickerSetCovered2 != null && stickerSetCovered2.set.id == stickerSetCovered.set.id) {
                notifyItemChanged(i3, 0);
                return;
            }
        }
    }

    @Override
    public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        return false;
    }

    @Override
    public final void notifyDataSetChanged() {
        Delegate delegate;
        int i;
        int i2;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList arrayList2;
        Object obj;
        SparseArray sparseArray = this.rowStartPack;
        sparseArray.clear();
        SparseIntArray sparseIntArray = this.positionToRow;
        sparseIntArray.clear();
        SparseArray sparseArray2 = this.cache;
        sparseArray2.clear();
        SparseArray sparseArray3 = this.positionsToSets;
        sparseArray3.clear();
        SparseArray sparseArray4 = this.positionToEmoji;
        sparseArray4.clear();
        this.totalItems = 0;
        ArrayList arrayList3 = this.serverPacks;
        int size = arrayList3.size();
        ArrayList arrayList4 = this.localPacks;
        int size2 = arrayList4.size();
        ArrayList arrayList5 = this.emojiArrays;
        int i3 = !arrayList5.isEmpty() ? 1 : 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < size + size2 + i3) {
            SparseArray sparseArray5 = this.cacheParent;
            Delegate delegate2 = this.delegate;
            if (i4 < size2) {
                delegate = delegate2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList4.get(i4);
                i = size;
                arrayList = tL_messages_stickerSet.documents;
                i2 = i3;
                obj = tL_messages_stickerSet;
            } else {
                delegate = delegate2;
                i = size;
                int i6 = i4 - size2;
                if (i6 < i3) {
                    int size3 = arrayList5.size();
                    String str = "";
                    arrayList4 = arrayList4;
                    i2 = i3;
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < size3) {
                        int i9 = size3;
                        ArrayList arrayList6 = (ArrayList) arrayList5.get(i7);
                        int i10 = i7;
                        String str2 = (String) this.emojiStickers.get(arrayList6);
                        if (str2 != null && !str.equals(str2)) {
                            sparseArray4.put(this.totalItems + i8, str2);
                            str = str2;
                        }
                        int size4 = arrayList6.size();
                        SparseArray sparseArray6 = sparseArray4;
                        int i11 = 0;
                        while (i11 < size4) {
                            String str3 = str;
                            int i12 = this.totalItems + i8;
                            int i13 = size4;
                            int stickersPerRow = (i8 / delegate.getStickersPerRow()) + i5;
                            int i14 = i11;
                            TLRPC.Document document = (TLRPC.Document) arrayList6.get(i11);
                            sparseArray2.put(i12, document);
                            ArrayList arrayList7 = arrayList5;
                            int i15 = i8;
                            TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(this.currentAccount).getStickerSetById(MediaDataController.getStickerSetId(document));
                            if (stickerSetById != null) {
                                sparseArray5.put(i12, stickerSetById);
                            }
                            sparseIntArray.put(i12, stickersPerRow);
                            i8 = i15 + 1;
                            i11 = i14 + 1;
                            str = str3;
                            size4 = i13;
                            arrayList5 = arrayList7;
                        }
                        i7 = i10 + 1;
                        size3 = i9;
                        sparseArray4 = sparseArray6;
                    }
                    sparseArray4 = sparseArray4;
                    arrayList5 = arrayList5;
                    int iCeil = (int) Math.ceil(i8 / delegate.getStickersPerRow());
                    for (int i16 = 0; i16 < iCeil; i16++) {
                        sparseArray.put(i5 + i16, Integer.valueOf(i8));
                    }
                    this.totalItems = (delegate.getStickersPerRow() * iCeil) + this.totalItems;
                    i5 += iCeil;
                } else {
                    i2 = i3;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList3.get(i6 - i2);
                    arrayList = stickerSetCovered.covers;
                    obj = stickerSetCovered;
                }
                arrayList2 = arrayList3;
                i4++;
                size = i;
                arrayList4 = arrayList4;
                i3 = i2;
                sparseArray4 = sparseArray4;
                arrayList3 = arrayList2;
                arrayList5 = arrayList5;
            }
            if (arrayList.isEmpty()) {
                arrayList2 = arrayList3;
            } else {
                int iCeil2 = (int) Math.ceil(arrayList.size() / delegate.getStickersPerRow());
                sparseArray2.put(this.totalItems, obj);
                if (i4 >= size2 && (obj instanceof TLRPC.StickerSetCovered)) {
                    sparseArray3.put(this.totalItems, (TLRPC.StickerSetCovered) obj);
                }
                sparseIntArray.put(this.totalItems, i5);
                int size5 = arrayList.size();
                int i17 = 0;
                while (i17 < size5) {
                    int i18 = i17 + 1;
                    int i19 = iCeil2;
                    int i20 = this.totalItems + i18;
                    int stickersPerRow2 = i17 / delegate.getStickersPerRow();
                    ArrayList arrayList8 = arrayList3;
                    sparseArray2.put(i20, arrayList.get(i17));
                    sparseArray5.put(i20, obj);
                    sparseIntArray.put(i20, stickersPerRow2 + i5 + 1);
                    if (i4 >= size2 && (obj instanceof TLRPC.StickerSetCovered)) {
                        sparseArray3.put(i20, (TLRPC.StickerSetCovered) obj);
                    }
                    i17 = i18;
                    iCeil2 = i19;
                    arrayList3 = arrayList8;
                }
                int i21 = iCeil2;
                arrayList2 = arrayList3;
                int i22 = i21 + 1;
                for (int i23 = 0; i23 < i22; i23++) {
                    sparseArray.put(i5 + i23, obj);
                }
                this.totalItems = (delegate.getStickersPerRow() * i21) + 1 + this.totalItems;
                i5 += i22;
            }
            i4++;
            size = i;
            arrayList4 = arrayList4;
            i3 = i2;
            sparseArray4 = sparseArray4;
            arrayList3 = arrayList2;
            arrayList5 = arrayList5;
        }
        super.notifyDataSetChanged();
    }

    @Override
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int itemViewType = viewHolder.getItemViewType();
        SparseArray sparseArray = this.cache;
        if (itemViewType == 0) {
            ((StickerEmojiCell) viewHolder.itemView).setSticker((TLRPC.Document) sparseArray.get(i), null, this.cacheParent.get(i), (String) this.positionToEmoji.get(i), false);
            return;
        }
        if (itemViewType == 1) {
            ((EmptyCell) viewHolder.itemView).setHeight(0);
            return;
        }
        if (itemViewType != 2) {
            if (itemViewType != 3) {
                return;
            }
            bindFeaturedStickerSetInfoCell((FeaturedStickerSetInfoCell) viewHolder.itemView, i, false);
            return;
        }
        StickerSetNameCell stickerSetNameCell = (StickerSetNameCell) viewHolder.itemView;
        Object obj = sparseArray.get(i);
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (!TextUtils.isEmpty(this.searchQuery) && this.localPacksByShortName.containsKey(tL_messages_stickerSet)) {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (stickerSet != null) {
                    stickerSetNameCell.setText(stickerSet.title, 0, null, 0, 0);
                }
                stickerSetNameCell.setUrl(this.searchQuery.length(), tL_messages_stickerSet.set.short_name);
                return;
            }
            Integer num = (Integer) this.localPacksByName.get(tL_messages_stickerSet);
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            if (stickerSet2 != null && num != null) {
                stickerSetNameCell.setText(stickerSet2.title, 0, null, num.intValue(), !TextUtils.isEmpty(this.searchQuery) ? this.searchQuery.length() : 0);
            }
            stickerSetNameCell.setUrl(0, null);
        }
    }

    @Override
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View stickerSetNameCell;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Context context = this.context;
        if (i == 0) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(context, false, resourcesProvider);
            anonymousClass2.getImageView().setLayerNum(3);
            stickerSetNameCell = anonymousClass2;
        } else if (i == 1) {
            stickerSetNameCell = new EmptyCell(context);
        } else if (i == 2) {
            stickerSetNameCell = new StickerSetNameCell(this.context, false, true, this.resourcesProvider, false);
        } else if (i == 3) {
            FeaturedStickerSetInfoCell featuredStickerSetInfoCell = new FeaturedStickerSetInfoCell(17, this.context, this.resourcesProvider, true, true);
            featuredStickerSetInfoCell.setAddOnClickListener(new AboutLinkCell$$ExternalSyntheticLambda1(this, 5));
            stickerSetNameCell = featuredStickerSetInfoCell;
        } else if (i == 4) {
            stickerSetNameCell = new View(context);
        } else if (i != 5) {
            stickerSetNameCell = null;
        } else {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            ImageView imageView = new ImageView(context);
            this.emptyImageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.emptyImageView.setImageResource(R.drawable.stickers_empty);
            ImageView imageView2 = this.emptyImageView;
            int i2 = Theme.key_chat_emojiPanelEmptyText;
            imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            linearLayout.addView(this.emptyImageView, LayoutHelper.createLinear(-2, -2));
            linearLayout.addView(new Space(context), LayoutHelper.createLinear(-1, 15));
            TextView textView = new TextView(context);
            this.emptyTextView = textView;
            textView.setText(LocaleController.getString(R.string.NoStickersFound));
            this.emptyTextView.setTextSize(1, 16.0f);
            this.emptyTextView.setTextColor(Theme.getColor(i2, resourcesProvider));
            linearLayout.addView(this.emptyTextView, LayoutHelper.createLinear(-2, -2));
            linearLayout.setMinimumHeight(AndroidUtilities.dp(112.0f));
            linearLayout.setLayoutParams(LayoutHelper.createFrame(-1, -1.0f));
            stickerSetNameCell = linearLayout;
        }
        return new RecyclerListView.Holder(stickerSetNameCell);
    }

    @Override
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        if (list.contains(0) && viewHolder.getItemViewType() == 3) {
            bindFeaturedStickerSetInfoCell((FeaturedStickerSetInfoCell) viewHolder.itemView, i, true);
        } else {
            super.onBindViewHolder(viewHolder, i, list);
        }
    }
}
