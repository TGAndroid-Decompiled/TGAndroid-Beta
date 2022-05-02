package org.telegram.p009ui.Adapters;

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
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C0952R;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ActionBar.ThemeDescription;
import org.telegram.p009ui.Adapters.StickersSearchAdapter;
import org.telegram.p009ui.Cells.EmptyCell;
import org.telegram.p009ui.Cells.FeaturedStickerSetInfoCell;
import org.telegram.p009ui.Cells.StickerEmojiCell;
import org.telegram.p009ui.Cells.StickerSetNameCell;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$InputStickerSet;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$StickerSetCovered;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messages_foundStickerSets;
import org.telegram.tgnet.TLRPC$TL_messages_getStickers;
import org.telegram.tgnet.TLRPC$TL_messages_searchStickerSets;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.tgnet.TLRPC$TL_messages_stickers;

public class StickersSearchAdapter extends RecyclerListView.SelectionAdapter {
    boolean cleared;
    private final Context context;
    private final Delegate delegate;
    private int emojiSearchId;
    private ImageView emptyImageView;
    private TextView emptyTextView;
    private final LongSparseArray<TLRPC$StickerSetCovered> installingStickerSets;
    private final TLRPC$StickerSetCovered[] primaryInstallingStickerSets;
    private final LongSparseArray<TLRPC$StickerSetCovered> removingStickerSets;
    private int reqId;
    private int reqId2;
    private final Theme.ResourcesProvider resourcesProvider;
    private String searchQuery;
    private int totalItems;
    private final int currentAccount = UserConfig.selectedAccount;
    private SparseArray<Object> rowStartPack = new SparseArray<>();
    private SparseArray<Object> cache = new SparseArray<>();
    private SparseArray<Object> cacheParent = new SparseArray<>();
    private SparseIntArray positionToRow = new SparseIntArray();
    private SparseArray<String> positionToEmoji = new SparseArray<>();
    private ArrayList<TLRPC$StickerSetCovered> serverPacks = new ArrayList<>();
    private ArrayList<TLRPC$TL_messages_stickerSet> localPacks = new ArrayList<>();
    private HashMap<TLRPC$TL_messages_stickerSet, Boolean> localPacksByShortName = new HashMap<>();
    private HashMap<TLRPC$TL_messages_stickerSet, Integer> localPacksByName = new HashMap<>();
    private HashMap<ArrayList<TLRPC$Document>, String> emojiStickers = new HashMap<>();
    private ArrayList<ArrayList<TLRPC$Document>> emojiArrays = new ArrayList<>();
    private SparseArray<TLRPC$StickerSetCovered> positionsToSets = new SparseArray<>();
    private Runnable searchRunnable = new RunnableC11301();

    public interface Delegate {
        String[] getLastSearchKeyboardLanguage();

        int getStickersPerRow();

        void onSearchStart();

        void onSearchStop();

        void onStickerSetAdd(TLRPC$StickerSetCovered tLRPC$StickerSetCovered, boolean z);

        void onStickerSetRemove(TLRPC$StickerSetCovered tLRPC$StickerSetCovered);

        void setAdapterVisible(boolean z);

        void setLastSearchKeyboardLanguage(String[] strArr);
    }

    @Override
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        return false;
    }

    static int access$804(StickersSearchAdapter stickersSearchAdapter) {
        int i = stickersSearchAdapter.emojiSearchId + 1;
        stickersSearchAdapter.emojiSearchId = i;
        return i;
    }

    public class RunnableC11301 implements Runnable {
        RunnableC11301() {
        }

        private void clear() {
            StickersSearchAdapter stickersSearchAdapter = StickersSearchAdapter.this;
            if (!stickersSearchAdapter.cleared) {
                stickersSearchAdapter.cleared = true;
                stickersSearchAdapter.emojiStickers.clear();
                StickersSearchAdapter.this.emojiArrays.clear();
                StickersSearchAdapter.this.localPacks.clear();
                StickersSearchAdapter.this.serverPacks.clear();
                StickersSearchAdapter.this.localPacksByShortName.clear();
                StickersSearchAdapter.this.localPacksByName.clear();
            }
        }

        @Override
        public void run() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Adapters.StickersSearchAdapter.RunnableC11301.run():void");
        }

        public void lambda$run$0(int i, HashMap hashMap, ArrayList arrayList, String str) {
            if (i == StickersSearchAdapter.this.emojiSearchId) {
                int size = arrayList.size();
                boolean z = false;
                for (int i2 = 0; i2 < size; i2++) {
                    String str2 = ((MediaDataController.KeywordResult) arrayList.get(i2)).emoji;
                    ArrayList arrayList2 = hashMap != null ? (ArrayList) hashMap.get(str2) : null;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        clear();
                        if (!StickersSearchAdapter.this.emojiStickers.containsKey(arrayList2)) {
                            StickersSearchAdapter.this.emojiStickers.put(arrayList2, str2);
                            StickersSearchAdapter.this.emojiArrays.add(arrayList2);
                            z = true;
                        }
                    }
                }
                if (z) {
                    StickersSearchAdapter.this.notifyDataSetChanged();
                }
            }
        }

        public void lambda$run$2(final TLRPC$TL_messages_searchStickerSets tLRPC$TL_messages_searchStickerSets, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            if (tLObject instanceof TLRPC$TL_messages_foundStickerSets) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        StickersSearchAdapter.RunnableC11301.this.lambda$run$1(tLRPC$TL_messages_searchStickerSets, tLObject);
                    }
                });
            }
        }

        public void lambda$run$1(TLRPC$TL_messages_searchStickerSets tLRPC$TL_messages_searchStickerSets, TLObject tLObject) {
            if (tLRPC$TL_messages_searchStickerSets.f953q.equals(StickersSearchAdapter.this.searchQuery)) {
                clear();
                StickersSearchAdapter.this.delegate.onSearchStop();
                StickersSearchAdapter.this.reqId = 0;
                StickersSearchAdapter.this.delegate.setAdapterVisible(true);
                StickersSearchAdapter.this.serverPacks.addAll(((TLRPC$TL_messages_foundStickerSets) tLObject).sets);
                StickersSearchAdapter.this.notifyDataSetChanged();
            }
        }

        public void lambda$run$4(final TLRPC$TL_messages_getStickers tLRPC$TL_messages_getStickers, final ArrayList arrayList, final LongSparseArray longSparseArray, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StickersSearchAdapter.RunnableC11301.this.lambda$run$3(tLRPC$TL_messages_getStickers, tLObject, arrayList, longSparseArray);
                }
            });
        }

        public void lambda$run$3(TLRPC$TL_messages_getStickers tLRPC$TL_messages_getStickers, TLObject tLObject, ArrayList arrayList, LongSparseArray longSparseArray) {
            if (tLRPC$TL_messages_getStickers.emoticon.equals(StickersSearchAdapter.this.searchQuery)) {
                StickersSearchAdapter.this.reqId2 = 0;
                if (tLObject instanceof TLRPC$TL_messages_stickers) {
                    TLRPC$TL_messages_stickers tLRPC$TL_messages_stickers = (TLRPC$TL_messages_stickers) tLObject;
                    int size = arrayList.size();
                    int size2 = tLRPC$TL_messages_stickers.stickers.size();
                    for (int i = 0; i < size2; i++) {
                        TLRPC$Document tLRPC$Document = tLRPC$TL_messages_stickers.stickers.get(i);
                        if (longSparseArray.indexOfKey(tLRPC$Document.f861id) < 0) {
                            arrayList.add(tLRPC$Document);
                        }
                    }
                    if (size != arrayList.size()) {
                        StickersSearchAdapter.this.emojiStickers.put(arrayList, StickersSearchAdapter.this.searchQuery);
                        if (size == 0) {
                            StickersSearchAdapter.this.emojiArrays.add(arrayList);
                        }
                        StickersSearchAdapter.this.notifyDataSetChanged();
                    }
                }
            }
        }
    }

    public StickersSearchAdapter(Context context, Delegate delegate, TLRPC$StickerSetCovered[] tLRPC$StickerSetCoveredArr, LongSparseArray<TLRPC$StickerSetCovered> longSparseArray, LongSparseArray<TLRPC$StickerSetCovered> longSparseArray2, Theme.ResourcesProvider resourcesProvider) {
        this.context = context;
        this.delegate = delegate;
        this.primaryInstallingStickerSets = tLRPC$StickerSetCoveredArr;
        this.installingStickerSets = longSparseArray;
        this.removingStickerSets = longSparseArray2;
        this.resourcesProvider = resourcesProvider;
    }

    @Override
    public int getItemCount() {
        return Math.max(1, this.totalItems + 1);
    }

    public void search(String str) {
        if (this.reqId != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
            this.reqId = 0;
        }
        if (this.reqId2 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId2, true);
            this.reqId2 = 0;
        }
        if (TextUtils.isEmpty(str)) {
            this.searchQuery = null;
            this.localPacks.clear();
            this.emojiStickers.clear();
            this.serverPacks.clear();
            this.delegate.setAdapterVisible(false);
            notifyDataSetChanged();
        } else {
            this.searchQuery = str.toLowerCase();
        }
        AndroidUtilities.cancelRunOnUIThread(this.searchRunnable);
        AndroidUtilities.runOnUIThread(this.searchRunnable, 300L);
    }

    @Override
    public int getItemViewType(int i) {
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
        if (obj instanceof TLRPC$Document) {
            return 0;
        }
        return obj instanceof TLRPC$StickerSetCovered ? 3 : 2;
    }

    public void lambda$onCreateViewHolder$0(View view) {
        FeaturedStickerSetInfoCell featuredStickerSetInfoCell = (FeaturedStickerSetInfoCell) view.getParent();
        TLRPC$StickerSetCovered stickerSet = featuredStickerSetInfoCell.getStickerSet();
        if (stickerSet != null && this.installingStickerSets.indexOfKey(stickerSet.set.f886id) < 0 && this.removingStickerSets.indexOfKey(stickerSet.set.f886id) < 0) {
            if (featuredStickerSetInfoCell.isInstalled()) {
                this.removingStickerSets.put(stickerSet.set.f886id, stickerSet);
                this.delegate.onStickerSetRemove(featuredStickerSetInfoCell.getStickerSet());
                return;
            }
            installStickerSet(stickerSet, featuredStickerSetInfoCell);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout;
        StickerSetNameCell stickerSetNameCell;
        if (i != 0) {
            if (i == 1) {
                linearLayout = new EmptyCell(this.context);
            } else if (i == 2) {
                stickerSetNameCell = new StickerSetNameCell(this.context, false, true, this.resourcesProvider);
            } else if (i == 3) {
                FeaturedStickerSetInfoCell featuredStickerSetInfoCell = new FeaturedStickerSetInfoCell(this.context, 17, true, true, this.resourcesProvider);
                featuredStickerSetInfoCell.setAddOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        StickersSearchAdapter.this.lambda$onCreateViewHolder$0(view);
                    }
                });
                linearLayout = featuredStickerSetInfoCell;
            } else if (i == 4) {
                linearLayout = new View(this.context);
            } else if (i != 5) {
                linearLayout = null;
            } else {
                LinearLayout linearLayout2 = new LinearLayout(this.context);
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(17);
                ImageView imageView = new ImageView(this.context);
                this.emptyImageView = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.emptyImageView.setImageResource(C0952R.C0953drawable.stickers_empty);
                this.emptyImageView.setColorFilter(new PorterDuffColorFilter(getThemedColor("chat_emojiPanelEmptyText"), PorterDuff.Mode.MULTIPLY));
                linearLayout2.addView(this.emptyImageView, LayoutHelper.createLinear(-2, -2));
                linearLayout2.addView(new Space(this.context), LayoutHelper.createLinear(-1, 15));
                TextView textView = new TextView(this.context);
                this.emptyTextView = textView;
                textView.setText(LocaleController.getString("NoStickersFound", C0952R.string.NoStickersFound));
                this.emptyTextView.setTextSize(1, 16.0f);
                this.emptyTextView.setTextColor(getThemedColor("chat_emojiPanelEmptyText"));
                linearLayout2.addView(this.emptyTextView, LayoutHelper.createLinear(-2, -2));
                linearLayout2.setMinimumHeight(AndroidUtilities.m34dp(112.0f));
                linearLayout2.setLayoutParams(LayoutHelper.createFrame(-1, -1.0f));
                linearLayout = linearLayout2;
            }
            return new RecyclerListView.Holder(linearLayout);
        }
        StickerEmojiCell stickerEmojiCell = new StickerEmojiCell(this, this.context, false) {
            @Override
            public void onMeasure(int i2, int i3) {
                super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(82.0f), 1073741824));
            }
        };
        stickerEmojiCell.getImageView().setLayerNum(3);
        stickerSetNameCell = stickerEmojiCell;
        linearLayout = stickerSetNameCell;
        return new RecyclerListView.Holder(linearLayout);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType == 0) {
            ((StickerEmojiCell) viewHolder.itemView).setSticker((TLRPC$Document) this.cache.get(i), null, this.cacheParent.get(i), this.positionToEmoji.get(i), false);
        } else if (itemViewType == 1) {
            ((EmptyCell) viewHolder.itemView).setHeight(0);
        } else if (itemViewType == 2) {
            StickerSetNameCell stickerSetNameCell = (StickerSetNameCell) viewHolder.itemView;
            Object obj = this.cache.get(i);
            if (obj instanceof TLRPC$TL_messages_stickerSet) {
                TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = (TLRPC$TL_messages_stickerSet) obj;
                if (TextUtils.isEmpty(this.searchQuery) || !this.localPacksByShortName.containsKey(tLRPC$TL_messages_stickerSet)) {
                    Integer num = this.localPacksByName.get(tLRPC$TL_messages_stickerSet);
                    TLRPC$StickerSet tLRPC$StickerSet = tLRPC$TL_messages_stickerSet.set;
                    if (!(tLRPC$StickerSet == null || num == null)) {
                        stickerSetNameCell.setText(tLRPC$StickerSet.title, 0, num.intValue(), !TextUtils.isEmpty(this.searchQuery) ? this.searchQuery.length() : 0);
                    }
                    stickerSetNameCell.setUrl(null, 0);
                    return;
                }
                TLRPC$StickerSet tLRPC$StickerSet2 = tLRPC$TL_messages_stickerSet.set;
                if (tLRPC$StickerSet2 != null) {
                    stickerSetNameCell.setText(tLRPC$StickerSet2.title, 0);
                }
                stickerSetNameCell.setUrl(tLRPC$TL_messages_stickerSet.set.short_name, this.searchQuery.length());
            }
        } else if (itemViewType == 3) {
            bindFeaturedStickerSetInfoCell((FeaturedStickerSetInfoCell) viewHolder.itemView, i, false);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        if (!list.contains(0) || viewHolder.getItemViewType() != 3) {
            super.onBindViewHolder(viewHolder, i, list);
        } else {
            bindFeaturedStickerSetInfoCell((FeaturedStickerSetInfoCell) viewHolder.itemView, i, true);
        }
    }

    public void installStickerSet(TLRPC$InputStickerSet tLRPC$InputStickerSet) {
        for (int i = 0; i < this.serverPacks.size(); i++) {
            TLRPC$StickerSetCovered tLRPC$StickerSetCovered = this.serverPacks.get(i);
            if (tLRPC$StickerSetCovered.set.f886id == tLRPC$InputStickerSet.f876id) {
                installStickerSet(tLRPC$StickerSetCovered, null);
                return;
            }
        }
    }

    public void installStickerSet(org.telegram.tgnet.TLRPC$StickerSetCovered r8, org.telegram.p009ui.Cells.FeaturedStickerSetInfoCell r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Adapters.StickersSearchAdapter.installStickerSet(org.telegram.tgnet.TLRPC$StickerSetCovered, org.telegram.ui.Cells.FeaturedStickerSetInfoCell):void");
    }

    private void bindFeaturedStickerSetInfoCell(FeaturedStickerSetInfoCell featuredStickerSetInfoCell, int i, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        ArrayList<Long> unreadStickerSets = mediaDataController.getUnreadStickerSets();
        TLRPC$StickerSetCovered tLRPC$StickerSetCovered = (TLRPC$StickerSetCovered) this.cache.get(i);
        boolean z5 = true;
        boolean z6 = unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(tLRPC$StickerSetCovered.set.f886id));
        int i2 = 0;
        while (true) {
            TLRPC$StickerSetCovered[] tLRPC$StickerSetCoveredArr = this.primaryInstallingStickerSets;
            if (i2 >= tLRPC$StickerSetCoveredArr.length) {
                z2 = false;
                break;
            }
            if (tLRPC$StickerSetCoveredArr[i2] != null) {
                TLRPC$TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(this.currentAccount).getStickerSetById(this.primaryInstallingStickerSets[i2].set.f886id);
                if (stickerSetById != null && !stickerSetById.set.archived) {
                    this.primaryInstallingStickerSets[i2] = null;
                } else if (this.primaryInstallingStickerSets[i2].set.f886id == tLRPC$StickerSetCovered.set.f886id) {
                    z2 = true;
                    break;
                }
            }
            i2++;
        }
        int indexOfIgnoreCase = TextUtils.isEmpty(this.searchQuery) ? -1 : AndroidUtilities.indexOfIgnoreCase(tLRPC$StickerSetCovered.set.title, this.searchQuery);
        if (indexOfIgnoreCase >= 0) {
            featuredStickerSetInfoCell.setStickerSet(tLRPC$StickerSetCovered, z6, z, indexOfIgnoreCase, this.searchQuery.length(), z2);
        } else {
            featuredStickerSetInfoCell.setStickerSet(tLRPC$StickerSetCovered, z6, z, 0, 0, z2);
            if (!TextUtils.isEmpty(this.searchQuery) && AndroidUtilities.indexOfIgnoreCase(tLRPC$StickerSetCovered.set.short_name, this.searchQuery) == 0) {
                featuredStickerSetInfoCell.setUrl(tLRPC$StickerSetCovered.set.short_name, this.searchQuery.length());
            }
        }
        if (z6) {
            mediaDataController.markFaturedStickersByIdAsRead(tLRPC$StickerSetCovered.set.f886id);
        }
        boolean z7 = this.installingStickerSets.indexOfKey(tLRPC$StickerSetCovered.set.f886id) >= 0;
        boolean z8 = this.removingStickerSets.indexOfKey(tLRPC$StickerSetCovered.set.f886id) >= 0;
        if (z7 || z8) {
            if (z7 && featuredStickerSetInfoCell.isInstalled()) {
                this.installingStickerSets.remove(tLRPC$StickerSetCovered.set.f886id);
                z7 = false;
            } else if (z8 && !featuredStickerSetInfoCell.isInstalled()) {
                this.removingStickerSets.remove(tLRPC$StickerSetCovered.set.f886id);
            }
        }
        if (z2 || !z7) {
            z4 = z;
            z3 = false;
        } else {
            z4 = z;
            z3 = true;
        }
        featuredStickerSetInfoCell.setAddDrawProgress(z3, z4);
        mediaDataController.preloadStickerSetThumb(tLRPC$StickerSetCovered);
        if (i <= 0) {
            z5 = false;
        }
        featuredStickerSetInfoCell.setNeedDivider(z5);
    }

    @Override
    public void notifyDataSetChanged() {
        int i;
        ArrayList<TLRPC$Document> arrayList;
        TLRPC$StickerSetCovered tLRPC$StickerSetCovered;
        this.rowStartPack.clear();
        this.positionToRow.clear();
        this.cache.clear();
        this.positionsToSets.clear();
        this.positionToEmoji.clear();
        this.totalItems = 0;
        int size = this.serverPacks.size();
        int size2 = this.localPacks.size();
        int i2 = !this.emojiArrays.isEmpty() ? 1 : 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < size + size2 + i2) {
            if (i3 < size2) {
                TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = this.localPacks.get(i3);
                arrayList = tLRPC$TL_messages_stickerSet.documents;
                i = size;
                tLRPC$StickerSetCovered = tLRPC$TL_messages_stickerSet;
            } else {
                int i5 = i3 - size2;
                if (i5 < i2) {
                    int size3 = this.emojiArrays.size();
                    String str = "";
                    int i6 = 0;
                    for (int i7 = 0; i7 < size3; i7++) {
                        ArrayList<TLRPC$Document> arrayList2 = this.emojiArrays.get(i7);
                        String str2 = this.emojiStickers.get(arrayList2);
                        if (str2 != null && !str.equals(str2)) {
                            this.positionToEmoji.put(this.totalItems + i6, str2);
                            str = str2;
                        }
                        int size4 = arrayList2.size();
                        for (int i8 = 0; i8 < size4; i8++) {
                            int i9 = this.totalItems + i6;
                            int stickersPerRow = (i6 / this.delegate.getStickersPerRow()) + i4;
                            TLRPC$Document tLRPC$Document = arrayList2.get(i8);
                            size = size;
                            this.cache.put(i9, tLRPC$Document);
                            size3 = size3;
                            str = str;
                            TLRPC$TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(this.currentAccount).getStickerSetById(MediaDataController.getStickerSetId(tLRPC$Document));
                            if (stickerSetById != null) {
                                this.cacheParent.put(i9, stickerSetById);
                            }
                            this.positionToRow.put(i9, stickersPerRow);
                            i6++;
                        }
                    }
                    i = size;
                    int ceil = (int) Math.ceil(i6 / this.delegate.getStickersPerRow());
                    for (int i10 = 0; i10 < ceil; i10++) {
                        this.rowStartPack.put(i4 + i10, Integer.valueOf(i6));
                    }
                    this.totalItems += this.delegate.getStickersPerRow() * ceil;
                    i4 += ceil;
                    i3++;
                    size = i;
                } else {
                    i = size;
                    TLRPC$StickerSetCovered tLRPC$StickerSetCovered2 = this.serverPacks.get(i5 - i2);
                    arrayList = tLRPC$StickerSetCovered2.covers;
                    tLRPC$StickerSetCovered = tLRPC$StickerSetCovered2;
                }
            }
            if (!arrayList.isEmpty()) {
                int ceil2 = (int) Math.ceil(arrayList.size() / this.delegate.getStickersPerRow());
                this.cache.put(this.totalItems, tLRPC$StickerSetCovered);
                if (i3 >= size2 && (tLRPC$StickerSetCovered instanceof TLRPC$StickerSetCovered)) {
                    this.positionsToSets.put(this.totalItems, tLRPC$StickerSetCovered);
                }
                this.positionToRow.put(this.totalItems, i4);
                int size5 = arrayList.size();
                int i11 = 0;
                while (i11 < size5) {
                    int i12 = i11 + 1;
                    int i13 = this.totalItems + i12;
                    int stickersPerRow2 = i4 + 1 + (i11 / this.delegate.getStickersPerRow());
                    this.cache.put(i13, arrayList.get(i11));
                    this.cacheParent.put(i13, tLRPC$StickerSetCovered);
                    this.positionToRow.put(i13, stickersPerRow2);
                    if (i3 >= size2 && (tLRPC$StickerSetCovered instanceof TLRPC$StickerSetCovered)) {
                        this.positionsToSets.put(i13, tLRPC$StickerSetCovered);
                    }
                    i11 = i12;
                }
                int i14 = ceil2 + 1;
                for (int i15 = 0; i15 < i14; i15++) {
                    this.rowStartPack.put(i4 + i15, tLRPC$StickerSetCovered);
                }
                this.totalItems += (ceil2 * this.delegate.getStickersPerRow()) + 1;
                i4 += i14;
            }
            i3++;
            size = i;
        }
        super.notifyDataSetChanged();
    }

    public int getSpanSize(int i) {
        if (i == this.totalItems || (this.cache.get(i) != null && !(this.cache.get(i) instanceof TLRPC$Document))) {
            return this.delegate.getStickersPerRow();
        }
        return 1;
    }

    public TLRPC$StickerSetCovered getSetForPosition(int i) {
        return this.positionsToSets.get(i);
    }

    public void updateColors(RecyclerListView recyclerListView) {
        int childCount = recyclerListView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerListView.getChildAt(i);
            if (childAt instanceof FeaturedStickerSetInfoCell) {
                ((FeaturedStickerSetInfoCell) childAt).updateColors();
            } else if (childAt instanceof StickerSetNameCell) {
                ((StickerSetNameCell) childAt).updateColors();
            }
        }
    }

    public void getThemeDescriptions(List<ThemeDescription> list, RecyclerListView recyclerListView, ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate) {
        FeaturedStickerSetInfoCell.createThemeDescriptions(list, recyclerListView, themeDescriptionDelegate);
        StickerSetNameCell.createThemeDescriptions(list, recyclerListView, themeDescriptionDelegate);
        list.add(new ThemeDescription(this.emptyImageView, ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, "chat_emojiPanelEmptyText"));
        list.add(new ThemeDescription(this.emptyTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "chat_emojiPanelEmptyText"));
    }

    private int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }
}
