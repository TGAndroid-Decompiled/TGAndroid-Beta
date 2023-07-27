package org.telegram.ui.Stories.recorder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScrollerCustom;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.tgnet.TLRPC$TL_stickerPack;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.StickerSetNameCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.DrawingInBackgroundThreadDrawable;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EmojiTabsStrip;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SearchStateDrawable;
import org.telegram.ui.Components.StickerCategoriesListView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.SelectAnimatedEmojiDialog;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
public class EmojiBottomSheet extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    private int categoryIndex;
    private Utilities.Callback2<Bitmap, Float> drawBlurBitmap;
    private final ImageView galleryButton;
    private float maxPadding;
    private Utilities.Callback<TLRPC$Document> onDocumentSelected;
    private String query;
    private final TabsView tabsView;
    private float top;
    private final ViewPagerFixed viewPager;
    private boolean wasKeyboardVisible;

    static float access$3616(EmojiBottomSheet emojiBottomSheet, float f) {
        float f2 = emojiBottomSheet.top + f;
        emojiBottomSheet.top = f2;
        return f2;
    }

    public class Page extends FrameLayout {
        public Adapter adapter;
        public int currentType;
        public GridLayoutManager layoutManager;
        public EmojiListView listView;
        private float lockTop;
        private boolean resetOnce;
        public SearchField searchField;
        public int spanCount;
        public EmojiTabsStrip tabsStrip;

        public Page(Context context) {
            super(context);
            this.spanCount = 8;
            this.lockTop = -1.0f;
            this.resetOnce = false;
            EmojiListView emojiListView = new EmojiListView(context);
            this.listView = emojiListView;
            Adapter adapter = new Adapter();
            this.adapter = adapter;
            emojiListView.setAdapter(adapter);
            EmojiListView emojiListView2 = this.listView;
            GridLayoutManager gridLayoutManager = new GridLayoutManager(context, this.spanCount);
            this.layoutManager = gridLayoutManager;
            emojiListView2.setLayoutManager(gridLayoutManager);
            this.listView.setClipToPadding(true);
            this.listView.setVerticalScrollBarEnabled(false);
            this.layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup(EmojiBottomSheet.this) {
                @Override
                public int getSpanSize(int i) {
                    if (Page.this.adapter.getItemViewType(i) != 2) {
                        return Page.this.spanCount;
                    }
                    return 1;
                }
            });
            this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(View view, int i) {
                    EmojiBottomSheet.Page.this.lambda$new$0(view, i);
                }
            });
            this.listView.setOnScrollListener(new RecyclerView.OnScrollListener(EmojiBottomSheet.this) {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    int i3;
                    SearchField searchField;
                    ((BottomSheet) EmojiBottomSheet.this).containerView.invalidate();
                    int i4 = -1;
                    if (Page.this.lockTop < 0.0f) {
                        i3 = Page.this.layoutManager.findFirstCompletelyVisibleItemPosition();
                    } else {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= Page.this.listView.getChildCount()) {
                                i3 = -1;
                                break;
                            }
                            View childAt = Page.this.listView.getChildAt(i5);
                            if (childAt.getY() + childAt.getHeight() > Page.this.lockTop + Page.this.listView.getPaddingTop()) {
                                i3 = Page.this.listView.getChildAdapterPosition(childAt);
                                break;
                            }
                            i5++;
                        }
                        if (i3 == -1) {
                            return;
                        }
                    }
                    int size = Page.this.adapter.positionToSection.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        int keyAt = Page.this.adapter.positionToSection.keyAt(size);
                        int valueAt = Page.this.adapter.positionToSection.valueAt(size);
                        if (i3 >= keyAt) {
                            i4 = valueAt;
                            break;
                        }
                        size--;
                    }
                    if (i4 >= 0) {
                        Page.this.tabsStrip.select(i4, true);
                    }
                    if (((BottomSheet) EmojiBottomSheet.this).keyboardVisible) {
                        Page page = Page.this;
                        if (!page.listView.scrollingByUser || (searchField = page.searchField) == null || searchField.editText == null) {
                            return;
                        }
                        EmojiBottomSheet.this.closeKeyboard();
                    }
                }

                @Override
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    if (i == 0 && Page.this.lockTop >= 0.0f && Page.this.atTop()) {
                        Page.this.lockTop = -1.0f;
                    }
                }
            });
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.setAddDelay(0L);
            defaultItemAnimator.setAddDuration(220L);
            defaultItemAnimator.setMoveDuration(220L);
            defaultItemAnimator.setChangeDuration(160L);
            defaultItemAnimator.setMoveInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.listView.setItemAnimator(defaultItemAnimator);
            addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
            SearchField searchField = new SearchField(context, ((BottomSheet) EmojiBottomSheet.this).resourcesProvider);
            this.searchField = searchField;
            searchField.setOnSearchQuery(new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    EmojiBottomSheet.Page.this.lambda$new$1((String) obj, (Integer) obj2);
                }
            });
            addView(this.searchField, LayoutHelper.createFrame(-1, -2, 48));
            EmojiTabsStrip emojiTabsStrip = new EmojiTabsStrip(context, ((BottomSheet) EmojiBottomSheet.this).resourcesProvider, false, false, true, 0, null, EmojiBottomSheet.this) {
                @Override
                protected boolean onTabClick(int i) {
                    int i2 = 0;
                    if (this.scrollingAnimation) {
                        return false;
                    }
                    SearchField searchField2 = Page.this.searchField;
                    if (searchField2 != null && searchField2.categoriesListView != null) {
                        if (Page.this.searchField.categoriesListView.getSelectedCategory() != null) {
                            Page.this.listView.scrollToPosition(0, 0);
                            Page.this.searchField.categoriesListView.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                        }
                        Page.this.searchField.categoriesListView.scrollToStart();
                        Page.this.searchField.clear();
                    }
                    Adapter adapter2 = Page.this.adapter;
                    if (adapter2 != null) {
                        adapter2.updateItems(null);
                    }
                    int i3 = -1;
                    while (true) {
                        if (i2 >= Page.this.adapter.positionToSection.size()) {
                            break;
                        }
                        int keyAt = Page.this.adapter.positionToSection.keyAt(i2);
                        if (Page.this.adapter.positionToSection.valueAt(i2) == i) {
                            i3 = keyAt;
                            break;
                        }
                        i2++;
                    }
                    if (i3 >= 0) {
                        Page page = Page.this;
                        page.listView.scrollToPosition(i3, ((int) page.lockTop()) - AndroidUtilities.dp(102.0f));
                        return true;
                    }
                    return true;
                }
            };
            this.tabsStrip = emojiTabsStrip;
            addView(emojiTabsStrip, LayoutHelper.createFrame(-1, 36.0f));
        }

        public void lambda$new$0(View view, int i) {
            AnimatedEmojiDrawable animatedEmojiDrawable;
            if (i < 0) {
                return;
            }
            TLRPC$Document tLRPC$Document = i >= this.adapter.documents.size() ? null : (TLRPC$Document) this.adapter.documents.get(i);
            long longValue = i >= this.adapter.documentIds.size() ? 0L : ((Long) this.adapter.documentIds.get(i)).longValue();
            if (tLRPC$Document == null && (view instanceof EmojiListView.EmojiImageView) && (animatedEmojiDrawable = ((EmojiListView.EmojiImageView) view).drawable) != null) {
                tLRPC$Document = animatedEmojiDrawable.getDocument();
            }
            if (tLRPC$Document == null && longValue != 0) {
                tLRPC$Document = AnimatedEmojiDrawable.findDocument(((BottomSheet) EmojiBottomSheet.this).currentAccount, longValue);
            }
            if (tLRPC$Document == null) {
                return;
            }
            if (EmojiBottomSheet.this.onDocumentSelected != null) {
                EmojiBottomSheet.this.onDocumentSelected.run(tLRPC$Document);
            }
            EmojiBottomSheet.this.dismiss();
        }

        public void lambda$new$1(String str, Integer num) {
            EmojiBottomSheet.this.query = str;
            EmojiBottomSheet.this.categoryIndex = num.intValue();
            this.adapter.updateItems(str);
        }

        public float top() {
            float f = this.lockTop;
            if (f >= 0.0f) {
                return f;
            }
            for (int i = 0; i < this.listView.getChildCount(); i++) {
                View childAt = this.listView.getChildAt(i);
                Object tag = childAt.getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                    return Math.max(0, childAt.getBottom() - AndroidUtilities.dp(102.0f));
                }
            }
            return 0.0f;
        }

        public float lockTop() {
            int paddingTop;
            float f = this.lockTop;
            if (f >= 0.0f) {
                paddingTop = this.listView.getPaddingTop();
            } else {
                f = top();
                this.lockTop = f;
                paddingTop = this.listView.getPaddingTop();
            }
            return f + paddingTop;
        }

        public void updateTops() {
            float max = Math.max(0.0f, top());
            this.tabsStrip.setTranslationY(AndroidUtilities.dp(16.0f) + max);
            this.searchField.setTranslationY(AndroidUtilities.dp(52.0f) + max);
            EmojiListView emojiListView = this.listView;
            emojiListView.setBounds(max + emojiListView.getPaddingTop(), this.listView.getHeight() - this.listView.getPaddingBottom());
        }

        @Override
        protected void onMeasure(int i, int i2) {
            setPadding(((BottomSheet) EmojiBottomSheet.this).backgroundPaddingLeft, 0, ((BottomSheet) EmojiBottomSheet.this).backgroundPaddingLeft, 0);
            this.tabsStrip.setTranslationY(AndroidUtilities.dp(16.0f));
            this.searchField.setTranslationY(AndroidUtilities.dp(52.0f));
            this.listView.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(102.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.navigationBarHeight + AndroidUtilities.dp(40.0f));
            super.onMeasure(i, i2);
        }

        public void bind(int i) {
            this.currentType = i;
            GridLayoutManager gridLayoutManager = this.layoutManager;
            int i2 = i == 0 ? 8 : 5;
            this.spanCount = i2;
            gridLayoutManager.setSpanCount(i2);
            if (!this.resetOnce) {
                this.adapter.updateItems(null);
            }
            if (EmojiBottomSheet.this.categoryIndex < 0) {
                if (!TextUtils.isEmpty(EmojiBottomSheet.this.query)) {
                    this.searchField.editText.setText(EmojiBottomSheet.this.query);
                    this.searchField.categoriesListView.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                    this.searchField.categoriesListView.scrollToStart();
                    AndroidUtilities.cancelRunOnUIThread(this.adapter.searchRunnable);
                    AndroidUtilities.runOnUIThread(this.adapter.searchRunnable);
                } else {
                    this.searchField.clear();
                }
            } else {
                SearchField searchField = this.searchField;
                searchField.ignoreTextChange = true;
                searchField.editText.setText(BuildConfig.APP_CENTER_HASH);
                SearchField searchField2 = this.searchField;
                searchField2.ignoreTextChange = false;
                searchField2.categoriesListView.selectCategory(EmojiBottomSheet.this.categoryIndex);
                this.searchField.categoriesListView.scrollToSelected();
                if (this.searchField.categoriesListView.getSelectedCategory() != null) {
                    this.adapter.query = this.searchField.categoriesListView.getSelectedCategory().emojis;
                    AndroidUtilities.cancelRunOnUIThread(this.adapter.searchRunnable);
                    AndroidUtilities.runOnUIThread(this.adapter.searchRunnable);
                }
            }
            MediaDataController.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount).checkStickers(i != 0 ? 0 : 5);
        }

        public boolean atTop() {
            return !this.listView.canScrollVertically(-1);
        }

        public class Adapter extends RecyclerView.Adapter {
            private String activeQuery;
            private final HashMap<String, ArrayList<Long>> allEmojis;
            private final ArrayList<TLRPC$TL_messages_stickerSet> allStickerSets;
            private final ArrayList<Long> documentIds;
            private final ArrayList<TLRPC$Document> documents;
            private TLRPC$TL_messages_stickerSet faveSet;
            private boolean includeNotFound;
            private int itemsCount;
            private int lastAllSetsCount;
            private String[] lastLang;
            private final ArrayList<EmojiView.EmojiPack> packs;
            private final HashMap<Long, ArrayList<TLRPC$TL_stickerPack>> packsBySet;
            private final SparseIntArray positionToSection;
            private String query;
            private TLRPC$TL_messages_stickerSet recentSet;
            private HashSet<Long> searchDocumentIds;
            private int searchId;
            private final Runnable searchRunnable;
            private final ArrayList<TLRPC$TL_messages_stickerSet> stickerSets;

            private Adapter() {
                this.allEmojis = new HashMap<>();
                this.packsBySet = new HashMap<>();
                this.allStickerSets = new ArrayList<>();
                this.stickerSets = new ArrayList<>();
                this.packs = new ArrayList<>();
                this.documents = new ArrayList<>();
                this.documentIds = new ArrayList<>();
                this.itemsCount = 0;
                this.positionToSection = new SparseIntArray();
                this.searchDocumentIds = new HashSet<>();
                this.searchRunnable = new Runnable() {
                    @Override
                    public final void run() {
                        EmojiBottomSheet.Page.Adapter.this.lambda$new$1();
                    }
                };
            }

            public void update() {
                if (this.query == null) {
                    updateItems(null);
                }
            }

            public void updateItems(java.lang.String r17) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.EmojiBottomSheet.Page.Adapter.updateItems(java.lang.String):void");
            }

            public void lambda$new$1() {
                final String str = this.query;
                final MediaDataController mediaDataController = MediaDataController.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount);
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                String[] strArr = this.lastLang;
                if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                    MediaDataController.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                this.lastLang = currentKeyboardLanguage;
                mediaDataController.getEmojiSuggestions(currentKeyboardLanguage, this.query, false, new MediaDataController.KeywordResultCallback() {
                    @Override
                    public final void run(ArrayList arrayList, String str2) {
                        EmojiBottomSheet.Page.Adapter.this.lambda$new$0(str, mediaDataController, arrayList, str2);
                    }
                }, null, false, false, false, true, 50);
            }

            public void lambda$new$0(String str, MediaDataController mediaDataController, ArrayList arrayList, String str2) {
                ArrayList<Long> arrayList2;
                if (TextUtils.equals(str, this.query)) {
                    ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(this.query);
                    for (int i = 0; i < parseEmojis.size(); i++) {
                        try {
                            MediaDataController.KeywordResult keywordResult = new MediaDataController.KeywordResult();
                            keywordResult.emoji = parseEmojis.get(i).code.toString();
                            arrayList.add(keywordResult);
                        } catch (Exception unused) {
                        }
                    }
                    this.itemsCount = 0;
                    this.documents.clear();
                    this.documentIds.clear();
                    this.positionToSection.clear();
                    this.stickerSets.clear();
                    this.itemsCount++;
                    this.documents.add(null);
                    this.documentIds.add(0L);
                    if (Page.this.currentType == 0) {
                        this.searchDocumentIds.clear();
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            MediaDataController.KeywordResult keywordResult2 = (MediaDataController.KeywordResult) arrayList.get(i2);
                            String str3 = keywordResult2.emoji;
                            if (str3 != null && !str3.startsWith("animated_") && (arrayList2 = this.allEmojis.get(keywordResult2.emoji)) != null) {
                                this.searchDocumentIds.addAll(arrayList2);
                            }
                        }
                        this.documentIds.addAll(this.searchDocumentIds);
                        for (int i3 = 0; i3 < this.searchDocumentIds.size(); i3++) {
                            this.documents.add(null);
                        }
                        this.itemsCount += this.searchDocumentIds.size();
                    } else {
                        HashMap<String, ArrayList<TLRPC$Document>> allStickers = mediaDataController.getAllStickers();
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            ArrayList<TLRPC$Document> arrayList3 = allStickers.get(((MediaDataController.KeywordResult) arrayList.get(i4)).emoji);
                            if (arrayList3 != null && !arrayList3.isEmpty()) {
                                for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                                    TLRPC$Document tLRPC$Document = arrayList3.get(i5);
                                    if (tLRPC$Document != null && !this.documents.contains(tLRPC$Document)) {
                                        this.documents.add(tLRPC$Document);
                                        this.itemsCount++;
                                    }
                                }
                            }
                        }
                    }
                    String translitSafe = AndroidUtilities.translitSafe((this.query + BuildConfig.APP_CENTER_HASH).toLowerCase());
                    for (int i6 = 0; i6 < this.allStickerSets.size(); i6++) {
                        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = this.allStickerSets.get(i6);
                        if (tLRPC$TL_messages_stickerSet != null && tLRPC$TL_messages_stickerSet.set != null) {
                            String translitSafe2 = AndroidUtilities.translitSafe((tLRPC$TL_messages_stickerSet.set.title + BuildConfig.APP_CENTER_HASH).toLowerCase());
                            if (!translitSafe2.startsWith(translitSafe)) {
                                if (!translitSafe2.contains(" " + translitSafe)) {
                                }
                            }
                            int size = this.stickerSets.size();
                            this.stickerSets.add(tLRPC$TL_messages_stickerSet);
                            this.positionToSection.put(this.itemsCount, size);
                            this.documents.add(null);
                            this.itemsCount++;
                            this.documents.addAll(tLRPC$TL_messages_stickerSet.documents);
                            this.itemsCount += tLRPC$TL_messages_stickerSet.documents.size();
                        }
                    }
                    boolean z = this.documentIds.size() <= 1 && this.documents.size() <= 1;
                    this.includeNotFound = z;
                    if (z) {
                        this.itemsCount++;
                    }
                    if (!z) {
                        this.searchId++;
                    }
                    this.activeQuery = this.query;
                    notifyDataSetChanged();
                    Page.this.listView.scrollToPosition(0, 0);
                    Page.this.searchField.showProgress(false);
                    Page.this.tabsStrip.showSelected(false);
                }
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View emojiImageView;
                View noEmojiView;
                if (i == 0) {
                    emojiImageView = new View(Page.this.getContext());
                } else {
                    if (i == 1) {
                        noEmojiView = new StickerSetNameCell(Page.this.getContext(), true, ((BottomSheet) EmojiBottomSheet.this).resourcesProvider);
                    } else if (i == 3) {
                        noEmojiView = new NoEmojiView(Page.this.getContext(), Page.this.currentType == 0);
                    } else {
                        emojiImageView = new EmojiListView.EmojiImageView(Page.this.getContext(), Page.this.listView);
                    }
                    emojiImageView = noEmojiView;
                }
                return new RecyclerListView.Holder(emojiImageView);
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                TLRPC$StickerSet tLRPC$StickerSet;
                int itemViewType = viewHolder.getItemViewType();
                if (itemViewType == 0) {
                    viewHolder.itemView.setTag(34);
                    viewHolder.itemView.setLayoutParams(new RecyclerView.LayoutParams(-1, (int) EmojiBottomSheet.this.maxPadding));
                } else if (itemViewType == 1) {
                    int i2 = this.positionToSection.get(i);
                    if (i2 < 0 || i2 >= this.stickerSets.size()) {
                        return;
                    }
                    TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = this.stickerSets.get(i2);
                    String str = (tLRPC$TL_messages_stickerSet == null || (tLRPC$StickerSet = tLRPC$TL_messages_stickerSet.set) == null) ? BuildConfig.APP_CENTER_HASH : tLRPC$StickerSet.title;
                    StickerSetNameCell stickerSetNameCell = (StickerSetNameCell) viewHolder.itemView;
                    if (this.activeQuery == null) {
                        stickerSetNameCell.setText(str, 0);
                        return;
                    }
                    int indexOf = str.toLowerCase().indexOf(this.activeQuery.toLowerCase());
                    if (indexOf < 0) {
                        stickerSetNameCell.setText(str, 0);
                    } else {
                        stickerSetNameCell.setText(str, 0, indexOf, this.activeQuery.length());
                    }
                } else if (itemViewType != 2) {
                    if (itemViewType == 3) {
                        ((NoEmojiView) viewHolder.itemView).update(this.searchId);
                    }
                } else {
                    TLRPC$Document tLRPC$Document = i >= this.documents.size() ? null : this.documents.get(i);
                    long longValue = i >= this.documentIds.size() ? 0L : this.documentIds.get(i).longValue();
                    if (tLRPC$Document == null && longValue == 0) {
                        return;
                    }
                    EmojiListView.EmojiImageView emojiImageView = (EmojiListView.EmojiImageView) viewHolder.itemView;
                    if (Page.this.currentType != 0) {
                        emojiImageView.setEmoji(null);
                        emojiImageView.setSticker(tLRPC$Document);
                    } else if (tLRPC$Document != null) {
                        emojiImageView.setSticker(null);
                        emojiImageView.setEmoji(tLRPC$Document);
                    } else {
                        emojiImageView.setSticker(null);
                        emojiImageView.setEmojiId(longValue);
                    }
                }
            }

            @Override
            public int getItemViewType(int i) {
                if (i == 0) {
                    return 0;
                }
                if (this.includeNotFound && i == this.itemsCount - 1) {
                    return 3;
                }
                return this.positionToSection.get(i, -1) >= 0 ? 1 : 2;
            }

            @Override
            public int getItemCount() {
                return this.itemsCount;
            }
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        View[] viewPages;
        if (i == NotificationCenter.stickersDidLoad || i == NotificationCenter.groupStickersDidLoad) {
            for (View view : this.viewPager.getViewPages()) {
                if (view instanceof Page) {
                    Page page = (Page) view;
                    if (i == NotificationCenter.groupStickersDidLoad || ((page.currentType == 0 && ((Integer) objArr[0]).intValue() == 5) || (page.currentType == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        page.adapter.update();
                    }
                }
            }
        }
    }

    public EmojiBottomSheet(final Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, true, resourcesProvider);
        this.query = null;
        this.categoryIndex = -1;
        this.maxPadding = -1.0f;
        this.useSmoothKeyboard = true;
        fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
        this.occupyNavigationBar = true;
        setUseLightStatusBar(false);
        this.containerView = new ContainerView(context);
        ViewPagerFixed viewPagerFixed = new ViewPagerFixed(context) {
            @Override
            protected void onTabAnimationUpdate() {
                EmojiBottomSheet.this.tabsView.setType(EmojiBottomSheet.this.viewPager.getPositionAnimated());
                ((BottomSheet) EmojiBottomSheet.this).containerView.invalidate();
                invalidate();
            }
        };
        this.viewPager = viewPagerFixed;
        viewPagerFixed.setAdapter(new ViewPagerFixed.Adapter() {
            @Override
            public int getItemCount() {
                return 2;
            }

            @Override
            public View createView(int i) {
                return new Page(context);
            }

            @Override
            public void bindView(View view, int i, int i2) {
                ((Page) view).bind(i);
            }
        });
        this.containerView.addView(viewPagerFixed, LayoutHelper.createFrame(-1, -1, 87));
        new KeyboardNotifier(this.containerView, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                EmojiBottomSheet.this.lambda$new$0((Integer) obj);
            }
        });
        TabsView tabsView = new TabsView(context);
        this.tabsView = tabsView;
        tabsView.setOnTypeSelected(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                EmojiBottomSheet.this.lambda$new$1((Integer) obj);
            }
        });
        this.containerView.addView(tabsView, LayoutHelper.createFrame(-1, -2, 87));
        ImageView imageView = new ImageView(context);
        this.galleryButton = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setVisibility(8);
        imageView.setImageResource(R.drawable.msg_tabs_media);
        imageView.setColorFilter(new PorterDuffColorFilter(1895825407, PorterDuff.Mode.SRC_IN));
        ScaleStateListAnimator.apply(imageView);
        this.containerView.addView(imageView, LayoutHelper.createFrame(40, 40.0f, 83, 8.0f, 0.0f, 0.0f, 0.0f));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
        MediaDataController.getInstance(this.currentAccount).checkStickers(5);
        MediaDataController.getInstance(this.currentAccount).checkFeaturedEmoji();
        MediaDataController.getInstance(this.currentAccount).checkStickers(0);
        MediaDataController.getInstance(this.currentAccount).loadRecents(0, false, true, false);
        MediaDataController.getInstance(this.currentAccount).loadRecents(2, false, true, false);
    }

    public void lambda$new$0(Integer num) {
        boolean z = this.wasKeyboardVisible;
        boolean z2 = this.keyboardVisible;
        if (z != z2) {
            this.wasKeyboardVisible = z2;
            this.container.clearAnimation();
            float f = 0.0f;
            if (this.keyboardVisible) {
                int i = AndroidUtilities.displaySize.y;
                int i2 = this.keyboardHeight;
                f = Math.min(0.0f, Math.max(((i - i2) * 0.3f) - this.top, (-i2) / 3.0f));
            }
            this.container.animate().translationY(f).setDuration(250L).setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator).start();
        }
    }

    public void lambda$new$1(Integer num) {
        if (this.viewPager.isManualScrolling() || this.viewPager.getCurrentPosition() == num.intValue()) {
            return;
        }
        this.viewPager.scrollToPosition(num.intValue());
        this.tabsView.setType(num.intValue());
    }

    public void closeKeyboard() {
        View[] viewPages;
        SearchField searchField;
        this.keyboardVisible = false;
        this.container.animate().translationY(0.0f).setDuration(250L).setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator).start();
        for (View view : this.viewPager.getViewPages()) {
            if ((view instanceof Page) && (searchField = ((Page) view).searchField) != null) {
                AndroidUtilities.hideKeyboard(searchField.editText);
            }
        }
    }

    public void setOnGalleryClick(View.OnClickListener onClickListener) {
        this.galleryButton.setOnClickListener(onClickListener);
        this.galleryButton.setVisibility(onClickListener != null ? 0 : 8);
    }

    @Override
    public void dismiss() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        closeKeyboard();
        super.dismiss();
    }

    public void setBlurDelegate(Utilities.Callback2<Bitmap, Float> callback2) {
        this.drawBlurBitmap = callback2;
    }

    private class ContainerView extends FrameLayout {
        private final Paint backgroundBlurPaint;
        private final Paint backgroundPaint;
        private Bitmap blurBitmap;
        private Matrix blurBitmapMatrix;
        private BitmapShader blurBitmapShader;
        private final Paint handlePaint;
        private final RectF handleRect;
        private final AnimatedFloat isActionBarT;

        public ContainerView(Context context) {
            super(context);
            this.backgroundPaint = new Paint(1);
            this.backgroundBlurPaint = new Paint(3);
            this.handlePaint = new Paint(1);
            this.isActionBarT = new AnimatedFloat(this, 0L, 250L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.handleRect = new RectF();
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            setupBlurBitmap();
        }

        private void setupBlurBitmap() {
            if (this.blurBitmap != null || EmojiBottomSheet.this.drawBlurBitmap == null || SharedConfig.getDevicePerformanceClass() <= 0 || !LiteMode.isPowerSaverApplied()) {
                return;
            }
            Point point = AndroidUtilities.displaySize;
            Bitmap createBitmap = Bitmap.createBitmap(point.x / 16, point.y / 16, Bitmap.Config.ARGB_8888);
            EmojiBottomSheet.this.drawBlurBitmap.run(createBitmap, Float.valueOf(16.0f));
            Utilities.stackBlurBitmap(createBitmap, 8);
            this.blurBitmap = createBitmap;
            Paint paint = this.backgroundBlurPaint;
            Bitmap bitmap = this.blurBitmap;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.blurBitmapShader = bitmapShader;
            paint.setShader(bitmapShader);
            if (this.blurBitmapMatrix == null) {
                this.blurBitmapMatrix = new Matrix();
            }
            this.blurBitmapMatrix.postScale(8.0f, 8.0f);
            this.blurBitmapShader.setLocalMatrix(this.blurBitmapMatrix);
            invalidate();
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            Bitmap bitmap = this.blurBitmap;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.backgroundBlurPaint.setShader(null);
        }

        @Override
        public void setTranslationY(float f) {
            super.setTranslationY(f);
            invalidate();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            EmojiBottomSheet.this.maxPadding = Math.min(size2 * 0.45f, (AndroidUtilities.dp(350.0f) / 0.55f) * 0.45f);
            EmojiBottomSheet.this.viewPager.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
            EmojiBottomSheet.this.viewPager.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            EmojiBottomSheet.this.tabsView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
            EmojiBottomSheet.this.galleryButton.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
            EmojiBottomSheet.this.galleryButton.setTranslationY(-AndroidUtilities.navigationBarHeight);
            setMeasuredDimension(size, size2);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            this.backgroundPaint.setColor(Theme.getColor(Theme.key_dialogBackground, ((BottomSheet) EmojiBottomSheet.this).resourcesProvider));
            this.backgroundPaint.setAlpha((int) ((this.blurBitmap == null ? 0.95f : 0.85f) * 255.0f));
            View[] viewPages = EmojiBottomSheet.this.viewPager.getViewPages();
            EmojiBottomSheet.this.top = 0.0f;
            if (viewPages[0] instanceof Page) {
                EmojiBottomSheet.access$3616(EmojiBottomSheet.this, ((Page) viewPages[0]).top() * Utilities.clamp(1.0f - Math.abs(viewPages[0].getTranslationX() / viewPages[0].getMeasuredWidth()), 1.0f, 0.0f));
                if (viewPages[0].getVisibility() == 0) {
                    ((Page) viewPages[0]).updateTops();
                }
            }
            if (viewPages[1] instanceof Page) {
                EmojiBottomSheet.access$3616(EmojiBottomSheet.this, ((Page) viewPages[1]).top() * Utilities.clamp(1.0f - Math.abs(viewPages[1].getTranslationX() / viewPages[1].getMeasuredWidth()), 1.0f, 0.0f));
                if (viewPages[1].getVisibility() == 0) {
                    ((Page) viewPages[1]).updateTops();
                }
            }
            float f = this.isActionBarT.set(EmojiBottomSheet.this.top <= 0.0f ? 1.0f : 0.0f);
            float paddingTop = (EmojiBottomSheet.this.top + EmojiBottomSheet.this.viewPager.getPaddingTop()) - AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), EmojiBottomSheet.this.viewPager.getPaddingTop(), f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(((BottomSheet) EmojiBottomSheet.this).backgroundPaddingLeft, paddingTop, getWidth() - ((BottomSheet) EmojiBottomSheet.this).backgroundPaddingLeft, getHeight() + AndroidUtilities.dp(8.0f));
            if (this.blurBitmap != null) {
                this.blurBitmapMatrix.reset();
                this.blurBitmapMatrix.postScale(12.0f, 12.0f);
                this.blurBitmapMatrix.postTranslate(0.0f, -getY());
                this.blurBitmapShader.setLocalMatrix(this.blurBitmapMatrix);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.backgroundBlurPaint);
            }
            float f2 = 1.0f - f;
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f) * f2, AndroidUtilities.dp(14.0f) * f2, this.backgroundPaint);
            this.handleRect.set((getWidth() - AndroidUtilities.dp(36.0f)) / 2.0f, AndroidUtilities.dp(9.66f) + paddingTop, (getWidth() + AndroidUtilities.dp(36.0f)) / 2.0f, paddingTop + AndroidUtilities.dp(13.66f));
            this.handlePaint.setColor(1367573379);
            this.handlePaint.setAlpha((int) (f2 * 81.0f));
            canvas.drawRoundRect(this.handleRect, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.handlePaint);
            canvas.save();
            canvas.clipRect(rectF);
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < EmojiBottomSheet.this.top) {
                EmojiBottomSheet.this.dismiss();
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public int getContainerViewHeight() {
        if (this.containerView.getMeasuredHeight() <= 0) {
            return AndroidUtilities.displaySize.y;
        }
        return (int) (this.containerView.getMeasuredHeight() - this.viewPager.getY());
    }

    public EmojiBottomSheet whenSelected(Utilities.Callback<TLRPC$Document> callback) {
        this.onDocumentSelected = callback;
        return this;
    }

    @Override
    protected boolean canDismissWithSwipe() {
        return this.viewPager.getTranslationY() >= ((float) ((int) this.maxPadding));
    }

    public static class EmojiListView extends RecyclerListView {
        private float bottomBound;
        private final ArrayList<DrawingInBackgroundLine> lineDrawables;
        private final ArrayList<DrawingInBackgroundLine> lineDrawablesTmp;
        private RecyclerAnimationScrollHelper scrollHelper;
        public boolean smoothScrolling;
        private float topBound;
        private final ArrayList<ArrayList<EmojiImageView>> unusedArrays;
        private final ArrayList<DrawingInBackgroundLine> unusedLineDrawables;
        private final SparseArray<ArrayList<EmojiImageView>> viewsGroupedByLines;
        private final ColorFilter whiteFilter;

        public static class EmojiImageView extends View {
            boolean attached;
            public ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolder;
            private final ButtonBounce bounce;
            private final int currentAccount;
            private long documentId;
            public AnimatedEmojiDrawable drawable;
            public ImageReceiver imageReceiver;
            public ImageReceiver imageReceiverToDraw;
            private final EmojiListView listView;
            public boolean notDraw;

            public EmojiImageView(Context context, EmojiListView emojiListView) {
                super(context);
                this.currentAccount = UserConfig.selectedAccount;
                this.backgroundThreadDrawHolder = new ImageReceiver.BackgroundThreadDrawHolder[2];
                this.bounce = new ButtonBounce(this);
                setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                this.listView = emojiListView;
            }

            public void setEmoji(TLRPC$Document tLRPC$Document) {
                if (this.documentId == (tLRPC$Document == null ? 0L : tLRPC$Document.id)) {
                    return;
                }
                AnimatedEmojiDrawable animatedEmojiDrawable = this.drawable;
                if (animatedEmojiDrawable != null) {
                    animatedEmojiDrawable.removeView(this);
                }
                if (tLRPC$Document != null) {
                    this.documentId = tLRPC$Document.id;
                    AnimatedEmojiDrawable make = AnimatedEmojiDrawable.make(this.currentAccount, 3, tLRPC$Document);
                    this.drawable = make;
                    if (this.attached) {
                        make.addView(this);
                        return;
                    }
                    return;
                }
                this.documentId = 0L;
                this.drawable = null;
            }

            @Override
            public void invalidate() {
                this.listView.invalidate();
            }

            public void setEmojiId(long j) {
                if (this.documentId == j) {
                    return;
                }
                AnimatedEmojiDrawable animatedEmojiDrawable = this.drawable;
                if (animatedEmojiDrawable != null) {
                    animatedEmojiDrawable.removeView(this);
                }
                if (j != 0) {
                    this.documentId = j;
                    AnimatedEmojiDrawable make = AnimatedEmojiDrawable.make(this.currentAccount, 3, j);
                    this.drawable = make;
                    if (this.attached) {
                        make.addView(this);
                        return;
                    }
                    return;
                }
                this.documentId = 0L;
                this.drawable = null;
            }

            @Override
            public void setPressed(boolean z) {
                super.setPressed(z);
                this.bounce.setPressed(z);
            }

            public float getScale() {
                return this.bounce.getScale(0.15f);
            }

            public void setSticker(TLRPC$Document tLRPC$Document) {
                if (tLRPC$Document != null) {
                    long j = this.documentId;
                    long j2 = tLRPC$Document.id;
                    if (j == j2) {
                        return;
                    }
                    this.documentId = j2;
                    if (this.imageReceiver == null) {
                        ImageReceiver imageReceiver = new ImageReceiver();
                        this.imageReceiver = imageReceiver;
                        imageReceiver.setLayerNum(7);
                        this.imageReceiver.setAspectFit(true);
                        this.imageReceiver.setParentView(this.listView);
                        if (this.attached) {
                            this.imageReceiver.onAttachedToWindow();
                        }
                    }
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tLRPC$Document, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f);
                    TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, 90);
                    String str = "80_80";
                    if ("video/webm".equals(tLRPC$Document.mime_type)) {
                        str = "80_80_g";
                    }
                    String str2 = str;
                    if (svgThumb != null) {
                        svgThumb.overrideWidthAndHeight(LiteMode.FLAG_CALLS_ANIMATIONS, LiteMode.FLAG_CALLS_ANIMATIONS);
                    }
                    this.imageReceiver.setImage(ImageLocation.getForDocument(tLRPC$Document), str2, ImageLocation.getForDocument(closestPhotoSizeWithSize, tLRPC$Document), "80_80", svgThumb, 0L, null, tLRPC$Document, 0);
                    return;
                }
                ImageReceiver imageReceiver2 = this.imageReceiver;
                if (imageReceiver2 != null) {
                    this.documentId = 0L;
                    imageReceiver2.clearImage();
                }
            }

            @Override
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                this.attached = true;
                AnimatedEmojiDrawable animatedEmojiDrawable = this.drawable;
                if (animatedEmojiDrawable != null) {
                    animatedEmojiDrawable.addView(this.listView);
                }
                ImageReceiver imageReceiver = this.imageReceiver;
                if (imageReceiver != null) {
                    imageReceiver.onAttachedToWindow();
                }
            }

            @Override
            protected void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                this.attached = false;
                AnimatedEmojiDrawable animatedEmojiDrawable = this.drawable;
                if (animatedEmojiDrawable != null) {
                    animatedEmojiDrawable.removeView(this.listView);
                }
                ImageReceiver imageReceiver = this.imageReceiver;
                if (imageReceiver != null) {
                    imageReceiver.onDetachedFromWindow();
                }
            }

            @Override
            protected void onMeasure(int i, int i2) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
                super.onMeasure(makeMeasureSpec, makeMeasureSpec);
            }

            public void update(long j) {
                ImageReceiver imageReceiver = this.imageReceiverToDraw;
                if (imageReceiver != null) {
                    if (imageReceiver.getLottieAnimation() != null) {
                        this.imageReceiverToDraw.getLottieAnimation().updateCurrentFrame(j, true);
                    }
                    if (this.imageReceiverToDraw.getAnimation() != null) {
                        this.imageReceiverToDraw.getAnimation().updateCurrentFrame(j, true);
                    }
                }
            }

            @Override
            protected void onDraw(Canvas canvas) {
                ImageReceiver imageReceiver = this.imageReceiver;
                if (imageReceiver != null) {
                    imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                    this.imageReceiver.draw(canvas);
                    return;
                }
                AnimatedEmojiDrawable animatedEmojiDrawable = this.drawable;
                if (animatedEmojiDrawable != null) {
                    animatedEmojiDrawable.setBounds(0, 0, getWidth(), getHeight());
                    this.drawable.draw(canvas);
                }
            }
        }

        public EmojiListView(Context context) {
            super(context);
            this.smoothScrolling = false;
            this.viewsGroupedByLines = new SparseArray<>();
            this.unusedArrays = new ArrayList<>();
            this.unusedLineDrawables = new ArrayList<>();
            this.lineDrawables = new ArrayList<>();
            this.lineDrawablesTmp = new ArrayList<>();
            this.whiteFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }

        @Override
        public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
            super.setLayoutManager(layoutManager);
            this.scrollHelper = null;
            if (layoutManager instanceof LinearLayoutManager) {
                RecyclerAnimationScrollHelper recyclerAnimationScrollHelper = new RecyclerAnimationScrollHelper(this, (LinearLayoutManager) layoutManager);
                this.scrollHelper = recyclerAnimationScrollHelper;
                recyclerAnimationScrollHelper.setAnimationCallback(new RecyclerAnimationScrollHelper.AnimationCallback() {
                    @Override
                    public void onPreAnimation() {
                        EmojiListView.this.smoothScrolling = true;
                    }

                    @Override
                    public void onEndAnimation() {
                        EmojiListView.this.smoothScrolling = false;
                    }
                });
                this.scrollHelper.setScrollListener(new RecyclerAnimationScrollHelper.ScrollListener() {
                    @Override
                    public final void onScroll() {
                        EmojiBottomSheet.EmojiListView.this.invalidate();
                    }
                });
            }
        }

        public void scrollToPosition(int i, int i2) {
            if (this.scrollHelper == null || !(getLayoutManager() instanceof GridLayoutManager)) {
                return;
            }
            GridLayoutManager gridLayoutManager = (GridLayoutManager) getLayoutManager();
            View findViewByPosition = gridLayoutManager.findViewByPosition(i);
            int findFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition();
            if ((findViewByPosition == null && Math.abs(i - findFirstVisibleItemPosition) > gridLayoutManager.getSpanCount() * 9.0f) || !SharedConfig.animationsEnabled()) {
                this.scrollHelper.setScrollDirection(gridLayoutManager.findFirstVisibleItemPosition() < i ? 0 : 1);
                this.scrollHelper.scrollToPosition(i, i2, false, true);
                return;
            }
            LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(getContext(), 2) {
                @Override
                public void onEnd() {
                    EmojiListView.this.smoothScrolling = false;
                }

                @Override
                protected void onStart() {
                    EmojiListView.this.smoothScrolling = true;
                }
            };
            linearSmoothScrollerCustom.setTargetPosition(i);
            linearSmoothScrollerCustom.setOffset(i2);
            gridLayoutManager.startSmoothScroll(linearSmoothScrollerCustom);
        }

        public void setBounds(float f, float f2) {
            this.topBound = f;
            this.bottomBound = f2;
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            if (getVisibility() != 0) {
                return;
            }
            int saveCount = canvas.getSaveCount();
            canvas.save();
            canvas.clipRect(0.0f, this.topBound, getWidth(), this.bottomBound);
            if (!this.selectorRect.isEmpty()) {
                this.selectorDrawable.setBounds(this.selectorRect);
                canvas.save();
                Consumer<Canvas> consumer = this.selectorTransformer;
                if (consumer != null) {
                    consumer.accept(canvas);
                }
                this.selectorDrawable.draw(canvas);
                canvas.restore();
            }
            for (int i = 0; i < this.viewsGroupedByLines.size(); i++) {
                ArrayList<EmojiImageView> valueAt = this.viewsGroupedByLines.valueAt(i);
                valueAt.clear();
                this.unusedArrays.add(valueAt);
            }
            this.viewsGroupedByLines.clear();
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt instanceof EmojiImageView) {
                    EmojiImageView emojiImageView = (EmojiImageView) childAt;
                    if (emojiImageView.getY() < this.bottomBound && emojiImageView.getY() + emojiImageView.getHeight() > this.topBound) {
                        int y = this.smoothScrolling ? (int) emojiImageView.getY() : emojiImageView.getTop();
                        ArrayList<EmojiImageView> arrayList = this.viewsGroupedByLines.get(y);
                        if (arrayList == null) {
                            if (!this.unusedArrays.isEmpty()) {
                                ArrayList<ArrayList<EmojiImageView>> arrayList2 = this.unusedArrays;
                                arrayList = arrayList2.remove(arrayList2.size() - 1);
                            } else {
                                arrayList = new ArrayList<>();
                            }
                            this.viewsGroupedByLines.put(y, arrayList);
                        }
                        arrayList.add(emojiImageView);
                    }
                }
            }
            this.lineDrawablesTmp.clear();
            this.lineDrawablesTmp.addAll(this.lineDrawables);
            this.lineDrawables.clear();
            canvas.save();
            canvas.clipRect(0, getPaddingTop(), getWidth(), getHeight() - getPaddingBottom());
            long currentTimeMillis = System.currentTimeMillis();
            int i3 = 0;
            while (true) {
                DrawingInBackgroundLine drawingInBackgroundLine = null;
                if (i3 >= this.viewsGroupedByLines.size()) {
                    break;
                }
                ArrayList<EmojiImageView> valueAt2 = this.viewsGroupedByLines.valueAt(i3);
                EmojiImageView emojiImageView2 = valueAt2.get(0);
                int childAdapterPosition = getChildAdapterPosition(emojiImageView2);
                int i4 = 0;
                while (true) {
                    if (i4 >= this.lineDrawablesTmp.size()) {
                        break;
                    } else if (this.lineDrawablesTmp.get(i4).position == childAdapterPosition) {
                        drawingInBackgroundLine = this.lineDrawablesTmp.get(i4);
                        this.lineDrawablesTmp.remove(i4);
                        break;
                    } else {
                        i4++;
                    }
                }
                if (drawingInBackgroundLine == null) {
                    if (!this.unusedLineDrawables.isEmpty()) {
                        ArrayList<DrawingInBackgroundLine> arrayList3 = this.unusedLineDrawables;
                        drawingInBackgroundLine = arrayList3.remove(arrayList3.size() - 1);
                    } else {
                        drawingInBackgroundLine = new DrawingInBackgroundLine();
                        drawingInBackgroundLine.setLayerNum(7);
                    }
                    drawingInBackgroundLine.position = childAdapterPosition;
                    drawingInBackgroundLine.onAttachToWindow();
                }
                this.lineDrawables.add(drawingInBackgroundLine);
                drawingInBackgroundLine.imageViewEmojis = valueAt2;
                canvas.save();
                canvas.translate(emojiImageView2.getLeft(), emojiImageView2.getY());
                drawingInBackgroundLine.startOffset = emojiImageView2.getLeft();
                int measuredWidth = getMeasuredWidth() - (emojiImageView2.getLeft() * 2);
                int measuredHeight = emojiImageView2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    drawingInBackgroundLine.draw(canvas, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                }
                canvas.restore();
                i3++;
            }
            for (int i5 = 0; i5 < this.lineDrawablesTmp.size(); i5++) {
                if (this.unusedLineDrawables.size() < 3) {
                    this.unusedLineDrawables.add(this.lineDrawablesTmp.get(i5));
                    this.lineDrawablesTmp.get(i5).imageViewEmojis = null;
                    this.lineDrawablesTmp.get(i5).reset();
                } else {
                    this.lineDrawablesTmp.get(i5).onDetachFromWindow();
                }
            }
            this.lineDrawablesTmp.clear();
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt2 = getChildAt(i6);
                if (childAt2 != null && !(childAt2 instanceof EmojiImageView) && childAt2.getY() <= getHeight() - getPaddingBottom() && childAt2.getY() + childAt2.getHeight() >= getPaddingTop()) {
                    canvas.save();
                    canvas.translate((int) childAt2.getX(), (int) childAt2.getY());
                    childAt2.draw(canvas);
                    canvas.restore();
                }
            }
            canvas.restore();
            canvas.restoreToCount(saveCount);
        }

        public class DrawingInBackgroundLine extends DrawingInBackgroundThreadDrawable {
            ArrayList<EmojiImageView> imageViewEmojis;
            public int position;
            public int startOffset;
            ArrayList<EmojiImageView> drawInBackgroundViews = new ArrayList<>();
            boolean lite = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);

            public DrawingInBackgroundLine() {
            }

            @Override
            public void draw(Canvas canvas, long j, int i, int i2, float f) {
                if (this.imageViewEmojis == null) {
                    return;
                }
                boolean z = true;
                boolean z2 = EmojiListView.this.isAnimating() || this.imageViewEmojis.size() <= 4 || !this.lite;
                if (!z2) {
                    for (int i3 = 0; i3 < this.imageViewEmojis.size(); i3++) {
                        if (this.imageViewEmojis.get(i3).getScale() != 1.0f) {
                            break;
                        }
                    }
                }
                z = z2;
                if (z) {
                    prepareDraw(System.currentTimeMillis());
                    drawInUiThread(canvas, f);
                    reset();
                    return;
                }
                super.draw(canvas, j, i, i2, f);
            }

            @Override
            public void prepareDraw(long j) {
                this.drawInBackgroundViews.clear();
                for (int i = 0; i < this.imageViewEmojis.size(); i++) {
                    EmojiImageView emojiImageView = this.imageViewEmojis.get(i);
                    if (!emojiImageView.notDraw) {
                        AnimatedEmojiDrawable animatedEmojiDrawable = emojiImageView.drawable;
                        ImageReceiver imageReceiver = animatedEmojiDrawable != null ? animatedEmojiDrawable.getImageReceiver() : emojiImageView.imageReceiver;
                        if (imageReceiver != null) {
                            imageReceiver.setAlpha(emojiImageView.getAlpha());
                            AnimatedEmojiDrawable animatedEmojiDrawable2 = emojiImageView.drawable;
                            if (animatedEmojiDrawable2 != null) {
                                animatedEmojiDrawable2.setColorFilter(EmojiListView.this.whiteFilter);
                            }
                            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = emojiImageView.backgroundThreadDrawHolder;
                            int i2 = this.threadIndex;
                            backgroundThreadDrawHolderArr[i2] = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i2], i2);
                            emojiImageView.backgroundThreadDrawHolder[this.threadIndex].time = j;
                            emojiImageView.imageReceiverToDraw = imageReceiver;
                            emojiImageView.update(j);
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(emojiImageView.getPaddingLeft(), emojiImageView.getPaddingTop(), emojiImageView.getWidth() - emojiImageView.getPaddingRight(), emojiImageView.getHeight() - emojiImageView.getPaddingBottom());
                            float aspectRatio = getAspectRatio(imageReceiver);
                            if (aspectRatio < 0.0f) {
                                float height = (rect.height() * aspectRatio) / 2.0f;
                                rect.left = (int) (rect.centerX() - height);
                                rect.right = (int) (rect.centerX() + height);
                            } else if (aspectRatio > 1.0f) {
                                float width = (rect.width() / aspectRatio) / 2.0f;
                                rect.top = (int) (rect.centerY() - width);
                                rect.bottom = (int) (rect.centerY() + width);
                            }
                            rect.offset((emojiImageView.getLeft() + ((int) emojiImageView.getTranslationX())) - this.startOffset, 0);
                            emojiImageView.backgroundThreadDrawHolder[this.threadIndex].setBounds(rect);
                            this.drawInBackgroundViews.add(emojiImageView);
                        }
                    }
                }
            }

            private float getAspectRatio(ImageReceiver imageReceiver) {
                float width;
                int height;
                if (imageReceiver == null) {
                    return 1.0f;
                }
                RLottieDrawable lottieAnimation = imageReceiver.getLottieAnimation();
                if (lottieAnimation != null && lottieAnimation.getIntrinsicHeight() != 0) {
                    width = lottieAnimation.getIntrinsicWidth();
                    height = lottieAnimation.getIntrinsicHeight();
                } else {
                    AnimatedFileDrawable animation = imageReceiver.getAnimation();
                    if (animation != null && animation.getIntrinsicHeight() != 0) {
                        width = animation.getIntrinsicWidth();
                        height = animation.getIntrinsicHeight();
                    } else {
                        Bitmap bitmap = imageReceiver.getBitmap();
                        if (bitmap != null) {
                            width = bitmap.getWidth();
                            height = bitmap.getHeight();
                        } else {
                            Drawable staticThumb = imageReceiver.getStaticThumb();
                            if (staticThumb == null || staticThumb.getIntrinsicHeight() == 0) {
                                return 1.0f;
                            }
                            return staticThumb.getIntrinsicWidth() / staticThumb.getIntrinsicHeight();
                        }
                    }
                }
                return width / height;
            }

            @Override
            public void drawInBackground(Canvas canvas) {
                for (int i = 0; i < this.drawInBackgroundViews.size(); i++) {
                    EmojiImageView emojiImageView = this.drawInBackgroundViews.get(i);
                    if (!emojiImageView.notDraw) {
                        AnimatedEmojiDrawable animatedEmojiDrawable = emojiImageView.drawable;
                        if (animatedEmojiDrawable != null) {
                            animatedEmojiDrawable.setColorFilter(EmojiListView.this.whiteFilter);
                        }
                        emojiImageView.imageReceiverToDraw.draw(canvas, emojiImageView.backgroundThreadDrawHolder[this.threadIndex]);
                    }
                }
            }

            @Override
            protected void drawInUiThread(Canvas canvas, float f) {
                if (this.imageViewEmojis != null) {
                    canvas.save();
                    canvas.translate(-this.startOffset, 0.0f);
                    for (int i = 0; i < this.imageViewEmojis.size(); i++) {
                        EmojiImageView emojiImageView = this.imageViewEmojis.get(i);
                        if (!emojiImageView.notDraw) {
                            float scale = emojiImageView.getScale();
                            float alpha = emojiImageView.getAlpha() * f;
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(((int) emojiImageView.getX()) + emojiImageView.getPaddingLeft(), emojiImageView.getPaddingTop(), (((int) emojiImageView.getX()) + emojiImageView.getWidth()) - emojiImageView.getPaddingRight(), emojiImageView.getHeight() - emojiImageView.getPaddingBottom());
                            AnimatedEmojiDrawable animatedEmojiDrawable = emojiImageView.drawable;
                            if (animatedEmojiDrawable != null) {
                                animatedEmojiDrawable.setBounds(rect);
                            }
                            ImageReceiver imageReceiver = emojiImageView.imageReceiver;
                            if (imageReceiver != null) {
                                imageReceiver.setImageCoords(rect);
                            }
                            if (EmojiListView.this.whiteFilter != null) {
                                AnimatedEmojiDrawable animatedEmojiDrawable2 = emojiImageView.drawable;
                                if (animatedEmojiDrawable2 instanceof AnimatedEmojiDrawable) {
                                    animatedEmojiDrawable2.setColorFilter(EmojiListView.this.whiteFilter);
                                }
                            }
                            if (scale != 1.0f) {
                                canvas.save();
                                canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                                drawImage(canvas, animatedEmojiDrawable, emojiImageView, alpha);
                                canvas.restore();
                            } else {
                                drawImage(canvas, animatedEmojiDrawable, emojiImageView, alpha);
                            }
                        }
                    }
                    canvas.restore();
                }
            }

            private void drawImage(Canvas canvas, Drawable drawable, EmojiImageView emojiImageView, float f) {
                if (drawable != null) {
                    drawable.setAlpha((int) (f * 255.0f));
                    drawable.draw(canvas);
                } else if (emojiImageView.imageReceiver != null) {
                    canvas.save();
                    canvas.clipRect(emojiImageView.imageReceiver.getImageX(), emojiImageView.imageReceiver.getImageY(), emojiImageView.imageReceiver.getImageX2(), emojiImageView.imageReceiver.getImageY2());
                    emojiImageView.imageReceiver.setAlpha(f);
                    emojiImageView.imageReceiver.draw(canvas);
                    canvas.restore();
                }
            }

            @Override
            public void onFrameReady() {
                super.onFrameReady();
                for (int i = 0; i < this.drawInBackgroundViews.size(); i++) {
                    ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = this.drawInBackgroundViews.get(i).backgroundThreadDrawHolder;
                    int i2 = this.threadIndex;
                    if (backgroundThreadDrawHolderArr[i2] != null) {
                        backgroundThreadDrawHolderArr[i2].release();
                    }
                }
                EmojiListView.this.invalidate();
            }
        }
    }

    public static class SearchField extends FrameLayout {
        private final FrameLayout box;
        private final StickerCategoriesListView categoriesListView;
        private final EditTextBoldCursor editText;
        public boolean ignoreTextChange;
        private final FrameLayout inputBox;
        private boolean isprogress;
        private Utilities.Callback2<String, Integer> onSearchQuery;
        private final Theme.ResourcesProvider resourcesProvider;
        private final SearchStateDrawable searchImageDrawable;
        private final ImageView searchImageView;

        public SearchField(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            FrameLayout frameLayout = new FrameLayout(context);
            this.box = frameLayout;
            frameLayout.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(18.0f), Theme.getColor(Theme.key_chat_emojiSearchBackground, resourcesProvider)));
            if (Build.VERSION.SDK_INT >= 21) {
                frameLayout.setClipToOutline(true);
                frameLayout.setOutlineProvider(new ViewOutlineProvider(this) {
                    @Override
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(18.0f));
                    }
                });
            }
            addView(frameLayout, LayoutHelper.createFrame(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.inputBox = frameLayout2;
            frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.searchImageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            SearchStateDrawable searchStateDrawable = new SearchStateDrawable();
            this.searchImageDrawable = searchStateDrawable;
            searchStateDrawable.setIconState(0, false);
            int i = Theme.key_chat_emojiSearchIcon;
            searchStateDrawable.setColor(Theme.getColor(i, resourcesProvider));
            imageView.setImageDrawable(searchStateDrawable);
            frameLayout.addView(imageView, LayoutHelper.createFrame(36, 36, 51));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context) {
                @Override
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    if (!SearchField.this.editText.isEnabled()) {
                        return super.onTouchEvent(motionEvent);
                    }
                    if (motionEvent.getAction() == 0) {
                        SearchField.this.editText.requestFocus();
                        AndroidUtilities.showKeyboard(SearchField.this.editText);
                    }
                    return super.onTouchEvent(motionEvent);
                }
            };
            this.editText = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 16.0f);
            editTextBoldCursor.setHintTextColor(Theme.getColor(i, resourcesProvider));
            editTextBoldCursor.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            editTextBoldCursor.setBackgroundDrawable(null);
            editTextBoldCursor.setPadding(0, 0, 0, 0);
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(268435459);
            editTextBoldCursor.setHint(LocaleController.getString("Search", R.string.Search));
            int i2 = Theme.key_featuredStickers_addedIcon;
            editTextBoldCursor.setCursorColor(Theme.getColor(i2, resourcesProvider));
            editTextBoldCursor.setHandlesColor(Theme.getColor(i2, resourcesProvider));
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setTranslationY(AndroidUtilities.dp(-2.0f));
            frameLayout2.addView(editTextBoldCursor, LayoutHelper.createFrame(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
            editTextBoldCursor.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    SearchField searchField = SearchField.this;
                    if (searchField.ignoreTextChange) {
                        return;
                    }
                    searchField.updateButton();
                    String obj = SearchField.this.editText.getText().toString();
                    SearchField.this.search(TextUtils.isEmpty(obj) ? null : obj, -1);
                    if (SearchField.this.categoriesListView != null) {
                        SearchField.this.categoriesListView.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                        SearchField.this.categoriesListView.updateCategoriesShown(TextUtils.isEmpty(obj), true);
                    }
                    if (SearchField.this.editText != null) {
                        SearchField.this.editText.animate().cancel();
                        SearchField.this.editText.animate().translationX(0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                    }
                }
            });
            StickerCategoriesListView stickerCategoriesListView = new StickerCategoriesListView(context, null, 0, resourcesProvider) {
                @Override
                public void selectCategory(int i3) {
                    super.selectCategory(i3);
                    SearchField.this.updateButton();
                }

                @Override
                protected boolean isTabIconsAnimationEnabled(boolean z) {
                    return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                }
            };
            this.categoriesListView = stickerCategoriesListView;
            TextPaint paint = editTextBoldCursor.getPaint();
            stickerCategoriesListView.setDontOccupyWidth(((int) paint.measureText(((Object) editTextBoldCursor.getHint()) + BuildConfig.APP_CENTER_HASH)) + AndroidUtilities.dp(16.0f));
            stickerCategoriesListView.setOnScrollIntoOccupiedWidth(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    EmojiBottomSheet.SearchField.this.lambda$new$0((Integer) obj);
                }
            });
            stickerCategoriesListView.setOnCategoryClick(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    EmojiBottomSheet.SearchField.this.lambda$new$1((StickerCategoriesListView.EmojiCategory) obj);
                }
            });
            frameLayout.addView(stickerCategoriesListView, LayoutHelper.createFrame(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    EmojiBottomSheet.SearchField.this.lambda$new$2(view);
                }
            });
        }

        public void lambda$new$0(Integer num) {
            this.editText.animate().cancel();
            this.editText.setTranslationX(-Math.max(0, num.intValue()));
            updateButton();
        }

        public void lambda$new$1(StickerCategoriesListView.EmojiCategory emojiCategory) {
            if (this.categoriesListView.getSelectedCategory() == emojiCategory) {
                this.categoriesListView.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                search(null, -1);
                return;
            }
            this.categoriesListView.selectCategory(emojiCategory);
            search(emojiCategory.emojis, this.categoriesListView.getCategoryIndex());
        }

        public void lambda$new$2(View view) {
            if (this.searchImageDrawable.getIconState() == 1) {
                clear();
                this.categoriesListView.scrollToStart();
            } else if (this.searchImageDrawable.getIconState() == 0) {
                this.editText.requestFocus();
            }
        }

        public void updateButton() {
            updateButton(false);
        }

        public void showProgress(boolean z) {
            this.isprogress = z;
            if (z) {
                this.searchImageDrawable.setIconState(2);
            } else {
                updateButton(true);
            }
        }

        private void updateButton(boolean z) {
            StickerCategoriesListView stickerCategoriesListView;
            StickerCategoriesListView stickerCategoriesListView2;
            if (!this.isprogress || ((this.editText.length() == 0 && ((stickerCategoriesListView2 = this.categoriesListView) == null || stickerCategoriesListView2.getSelectedCategory() == null)) || z)) {
                this.searchImageDrawable.setIconState((this.editText.length() > 0 || ((stickerCategoriesListView = this.categoriesListView) != null && stickerCategoriesListView.isCategoriesShown() && (this.categoriesListView.isScrolledIntoOccupiedWidth() || this.categoriesListView.getSelectedCategory() != null))) ? 1 : 0);
                this.isprogress = false;
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        }

        public void setOnSearchQuery(Utilities.Callback2<String, Integer> callback2) {
            this.onSearchQuery = callback2;
        }

        public void search(String str, int i) {
            Utilities.Callback2<String, Integer> callback2 = this.onSearchQuery;
            if (callback2 != null) {
                callback2.run(str, Integer.valueOf(i));
            }
        }

        public void clear() {
            this.editText.setText(BuildConfig.APP_CENTER_HASH);
            search(null, -1);
            this.categoriesListView.selectCategory((StickerCategoriesListView.EmojiCategory) null);
        }
    }

    public static class TabsView extends View {
        private StaticLayout emojiLayout;
        private float emojiLayoutLeft;
        private float emojiLayoutWidth;
        private final RectF emojiRect;
        private int lastWidth;
        private StaticLayout masksLayout;
        private float masksLayoutLeft;
        private final RectF masksRect;
        private Utilities.Callback<Integer> onTypeSelected;
        private final Paint selectPaint;
        private final RectF selectRect;
        private StaticLayout stickersLayout;
        private float stickersLayoutLeft;
        private float stickersLayoutWidth;
        private final RectF stickersRect;
        private final TextPaint textPaint;
        private float type;

        public TabsView(Context context) {
            super(context);
            this.textPaint = new TextPaint(1);
            this.selectPaint = new Paint(1);
            this.emojiRect = new RectF();
            this.stickersRect = new RectF();
            this.masksRect = new RectF();
            this.selectRect = new RectF();
        }

        public void setType(float f) {
            this.type = f;
            invalidate();
        }

        public void setOnTypeSelected(Utilities.Callback<Integer> callback) {
            this.onTypeSelected = callback;
        }

        @Override
        protected void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(40.0f) + AndroidUtilities.navigationBarHeight);
            if (getMeasuredWidth() != this.lastWidth || this.emojiLayout == null) {
                updateLayouts();
            }
            this.lastWidth = getMeasuredWidth();
        }

        private void updateLayouts() {
            this.textPaint.setTextSize(AndroidUtilities.dp(14.0f));
            this.textPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            StaticLayout staticLayout = new StaticLayout(LocaleController.getString("Emoji"), this.textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.emojiLayout = staticLayout;
            this.emojiLayoutWidth = staticLayout.getLineCount() >= 1 ? this.emojiLayout.getLineWidth(0) : 0.0f;
            this.emojiLayoutLeft = this.emojiLayout.getLineCount() >= 1 ? this.emojiLayout.getLineLeft(0) : 0.0f;
            StaticLayout staticLayout2 = new StaticLayout(LocaleController.getString("AccDescrStickers"), this.textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.stickersLayout = staticLayout2;
            this.stickersLayoutWidth = staticLayout2.getLineCount() >= 1 ? this.stickersLayout.getLineWidth(0) : 0.0f;
            this.stickersLayoutLeft = this.stickersLayout.getLineCount() >= 1 ? this.stickersLayout.getLineLeft(0) : 0.0f;
            float dp = AndroidUtilities.dp(12.0f) + this.emojiLayoutWidth + AndroidUtilities.dp(36.0f) + this.stickersLayoutWidth + AndroidUtilities.dp(12.0f);
            float dp2 = AndroidUtilities.dp(14.0f) / 2.0f;
            float dp3 = AndroidUtilities.dp(66.0f) / 2.0f;
            float measuredWidth = (getMeasuredWidth() - dp) / 2.0f;
            this.emojiRect.set(measuredWidth, dp2, this.emojiLayoutWidth + measuredWidth + AndroidUtilities.dp(24.0f), dp3);
            float dp4 = measuredWidth + this.emojiLayoutWidth + AndroidUtilities.dp(36.0f);
            this.stickersRect.set(dp4, dp2, this.stickersLayoutWidth + dp4 + AndroidUtilities.dp(24.0f), dp3);
            AndroidUtilities.dp(36.0f);
        }

        private RectF getRect(int i) {
            if (i <= 0) {
                return this.emojiRect;
            }
            return this.stickersRect;
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            canvas.drawColor(-14737633);
            this.selectPaint.setColor(-13224394);
            RectF rect = getRect((int) this.type);
            RectF rect2 = getRect((int) Math.ceil(this.type));
            float f = this.type;
            AndroidUtilities.lerp(rect, rect2, f - ((int) f), this.selectRect);
            canvas.drawRoundRect(this.selectRect, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), this.selectPaint);
            if (this.emojiLayout != null) {
                canvas.save();
                float dp = (this.emojiRect.left + AndroidUtilities.dp(12.0f)) - this.emojiLayoutLeft;
                RectF rectF = this.emojiRect;
                canvas.translate(dp, rectF.top + ((rectF.height() - this.emojiLayout.getHeight()) / 2.0f));
                this.textPaint.setColor(ColorUtils.blendARGB(-8158333, -1, Utilities.clamp(1.0f - Math.abs(this.type - 0.0f), 1.0f, 0.0f)));
                this.emojiLayout.draw(canvas);
                canvas.restore();
            }
            if (this.stickersLayout != null) {
                canvas.save();
                float dp2 = (this.stickersRect.left + AndroidUtilities.dp(12.0f)) - this.stickersLayoutLeft;
                RectF rectF2 = this.stickersRect;
                canvas.translate(dp2, rectF2.top + ((rectF2.height() - this.stickersLayout.getHeight()) / 2.0f));
                this.textPaint.setColor(ColorUtils.blendARGB(-8158333, -1, Utilities.clamp(1.0f - Math.abs(this.type - 1.0f), 1.0f, 0.0f)));
                this.stickersLayout.draw(canvas);
                canvas.restore();
            }
            if (this.masksLayout != null) {
                canvas.save();
                float dp3 = (this.masksRect.left + AndroidUtilities.dp(12.0f)) - this.masksLayoutLeft;
                RectF rectF3 = this.masksRect;
                canvas.translate(dp3, rectF3.top + ((rectF3.height() - this.masksLayout.getHeight()) / 2.0f));
                this.textPaint.setColor(ColorUtils.blendARGB(-8158333, -1, Utilities.clamp(1.0f - Math.abs(this.type - 2.0f), 1.0f, 0.0f)));
                this.masksLayout.draw(canvas);
                canvas.restore();
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                return true;
            }
            if (motionEvent.getAction() == 1 && this.onTypeSelected != null) {
                if (this.emojiRect.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.onTypeSelected.run(0);
                } else if (this.stickersRect.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.onTypeSelected.run(1);
                }
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    private static class NoEmojiView extends FrameLayout {
        BackupImageView imageView;
        private int lastI;
        TextView textView;

        public NoEmojiView(Context context, boolean z) {
            super(context);
            int i;
            String str;
            this.lastI = -1;
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            addView(backupImageView, LayoutHelper.createFrame(36, 36, 17));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 14.0f);
            this.textView.setTextColor(-8553090);
            TextView textView2 = this.textView;
            if (z) {
                i = R.string.NoEmojiFound;
                str = "NoEmojiFound";
            } else {
                i = R.string.NoStickersFound;
                str = "NoStickersFound";
            }
            textView2.setText(LocaleController.getString(str, i));
            addView(this.textView, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
        }

        public void update(int i) {
            if (this.lastI != i) {
                this.lastI = i;
                update();
            }
        }

        public void update() {
            SelectAnimatedEmojiDialog.updateSearchEmptyViewImage(UserConfig.selectedAccount, this.imageView);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.max(AndroidUtilities.dp(170.0f), (AndroidUtilities.displaySize.y * 0.34999996f) - AndroidUtilities.dp(142.0f)), 1073741824));
        }
    }
}
